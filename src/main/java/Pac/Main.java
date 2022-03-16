package Pac;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;

public class Main extends JPanel implements ActionListener {

    public static int score;
    private boolean isRunning = false;
    public static boolean isAlive = true;
    private boolean is2Alive = false;
    private final int field = 15;
    public static int mapPointsCounter = 190;
    public static int space = 0;
    public boolean isFoodAlive = false;
    public int wf;
    public static int isFoodReady = 0;

    public static PacMan pacman;
    public Ghost redGhost;
    public Ghost greenGhost;
    public Ghost yellowGhost;
    public Ghost blueGhost;
    public Food food;
    public Dimension getPreferredSize() {
        return new Dimension(285, 360);
    }

    public Main(PacMan pacman) {
        Main.pacman = pacman;
        this.redGhost = new Ghost(9 * field, 10 * field);
        this.greenGhost = new Ghost(8 * field, 10 * field);
        this.yellowGhost = new Ghost(9 * field, 10 * field);
        this.blueGhost = new Ghost(10 * field, 10 * field);

        this.food = new Food(135, 180);
    }
    public static int[][] level = new int[][]{
            {11,20, 20,20, 20,20,20, 20, 20, 7 , 20, 20, 20, 20, 20, 20, 20,  20,12},
            {19, 1, 1 , 1, 1, 1 , 1, 1 , 1 ,19 , 1 , 1 , 1 , 1 ,  1, 1 , 1 ,  1 ,19},
            {19, 1, 11,12, 1, 11, 7,12 , 1 , 19, 1 , 11, 7 , 12,  1, 11, 12,  1 ,19},
            {19, 1, 14,13, 1, 14, 9,13 , 1 , 18, 1 , 14, 9 , 13,  1, 14, 13,  1 ,19},
            {19, 1, 1 , 1, 1, 1 , 1, 1 , 1 , 1 , 1 , 1 , 1 , 1 ,  1, 1 , 1 ,  1 ,19},
            {19, 1, 15,17, 1, 16, 1, 15, 20, 7 , 20, 17, 1 , 16,  1, 15, 17,  1 ,19},
            {19, 1, 1 , 1, 1, 19, 1, 1 , 1 ,19 , 1 , 1 , 1 , 19,  1, 1 , 1 ,  1 ,19},
            {10, 7, 7 ,12, 1, 10,20, 17, 1 ,18 , 1 , 15, 20, 8 ,  1, 11, 7 ,  7 , 8},
            {10, 2, 2 , 8, 1, 19, 1, 1 , 1 , 1 , 1 , 1 , 1 , 19,  1, 10, 2 ,  2 , 8},
            {14, 9, 9 ,13, 1, 18, 1, 11,17 , 4 ,15 ,12 , 1 , 18,  1, 14, 9 ,  9 ,13},
            {1 , 1, 1 , 1, 1, 1,  1, 19, 4 , 4 , 4 ,19 , 1 , 1 ,  1, 1 , 1 ,  1 , 1},
            {11, 7, 7 ,12, 1, 16, 1, 14, 20, 20, 20,13 , 1 ,16 ,  1, 11, 7 ,  7 ,12},
            {10, 2, 2 , 8, 1, 19, 1, 1 , 1 , 6 , 1 , 1 , 1 ,19 ,  1, 10, 2 ,  2 , 8},
            {10, 9, 9 ,13, 1, 18, 1,15 ,20 , 7 ,20 ,17 , 1 ,18 ,  1, 14, 9 ,  9 , 8},
            {19, 1, 1 , 1, 1, 1 , 1, 1 , 1 ,19 , 1 , 1 , 1 , 1 ,  1, 1 , 1 ,  1 ,19},
            {19, 1,15 ,12, 1, 15,20, 17, 1 , 18, 1 ,15 , 20,17 ,  1, 11,17 ,  1 ,19},
            {19, 1, 1 ,19, 1, 1 , 1, 1 , 1 , 1 , 1 , 1 , 1 , 1 ,  1, 19, 1 ,  1 ,19},
            {10, 17,1 ,18, 1,16 , 1, 15, 20, 7 , 20,17 , 1 ,16 ,  1, 18, 1 ,  15, 8},
            {19, 1, 1 , 1, 1,19 , 1, 1 , 1 ,19 , 1 , 1 , 1 ,19 ,  1, 1 , 1 ,  1 ,19},
            {19, 1,15 ,20,20, 9 ,20, 17, 1 ,18 , 1 ,15 ,20 , 9 , 20, 20,17 ,  1 ,19},
            {19, 1, 1 , 1, 1, 1 , 1, 1 , 1 , 1 , 1 , 1 , 1 , 1 ,  1, 1 , 1 ,  1 ,19},
            {14,20, 20,20,20,20 ,20,20 ,20 , 20, 20,20 ,20 ,20 , 20,20 ,20 , 20 ,13}
};

    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        drawMaze(g);
        drawPacman(g);
        drawGhosts(g);
        drawScoreAndLives(g);
        if (mapPointsCounter == 0) {
            winner(g);
        }
        if (pacman.lives == 0) {
            looser(g);
        }
        if (isFoodAlive) {
            if (wf == 0) {
                drawFood(g);
            }
        }
    }

    private void drawScoreAndLives(Graphics g) {
        g.setFont(new Font("Arial", Font.BOLD, 12));
        g.setColor(Color.white);
        String printScore = "Score: " + score;
        String secondPlay = "Press q to play!";
        for (int i = 0; i < pacman.lives; i++) {
            try {
                g.drawImage(ImageIO.read(new File("src/main/resources/heart.png")), (i * 15), 22 * field, this);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        if (!is2Alive) {
            g.drawString(secondPlay, 1, (24 * field) - 6);
        }
        g.drawString(printScore, (13 * field) + 7, (23 * field) - 4);

    }
    private void winner(Graphics g) {
        g.setFont(new Font("Arial" , Font.BOLD, 30));
        g.setColor(Color.yellow);
        String winScore1 = "Wygrałeś!!";
        String winScore2 = "Twój wynik: " + score;
        g.drawString(winScore1, 4, 5 * field);
        g.drawString(winScore2, 4, 7 * field);
    }
    private void looser(Graphics g) {
        g.setFont(new Font("Arial" , Font.BOLD, 30));
        g.setColor(Color.yellow);
        String winScore1 = "Przegrałeś!!";
        String winScore2 = "Twój wynik: " + score;
        g.drawString(winScore1, 4, 5 * field);
        g.drawString(winScore2, 4, 7 * field);
    }

    private void drawMaze(Graphics g) {

        for (int i = 0; i < 22; i++) {
            for (int j = 0; j < 19; j++) {
                if (level[i][j] == 2) {
                    g.setColor(Color.BLUE);
                    g.fillRect(j * field, i * field, field, field);
                }
                if (level[i][j] == 7) {
                    g.setColor(new Color(214, 0, 186));
                    g.fillRect(j * field, i * field, field, field);
                    g.setColor(Color.BLUE);
                    g.fillRect(j * field, i * field + 1, field , field - 1);
                }
                if (level[i][j] == 8) {
                    g.setColor(new Color(214, 0, 186));
                    g.fillRect(j * field, i * field, field, field);
                    g.setColor(Color.BLUE);
                    g.fillRect(j * field, i * field, field - 1, field);
                }
                if (level[i][j] == 9) {
                    g.setColor(new Color(214, 0, 186));
                    g.fillRect(j * field, i * field, field, field);
                    g.setColor(Color.BLUE);
                    g.fillRect(j * field, i * field, field, field - 1);
                }
                if (level[i][j] == 10) {
                    g.setColor(new Color(214, 0, 186));
                    g.fillRect(j * field, i * field, field, field);
                    g.setColor(Color.BLUE);
                    g.fillRect(j * field + 1, i * field, field - 1, field);

                }
                if (level[i][j] == 11) {
                    g.setColor(new Color(214, 0, 186));
                    g.fillRect(j * field, i * field, field, field);
                    g.setColor(Color.BLUE);
                    g.fillRect(j * field + 1, i * field + 1, field - 1, field - 1);

                }
                if (level[i][j] == 12) {
                    g.setColor(new Color(214, 0, 186));
                    g.fillRect(j * field, i * field, field, field);
                    g.setColor(Color.BLUE);
                    g.fillRect(j * field, i * field + 1, field - 1, field - 1);

                }
                if (level[i][j] == 13) {
                    g.setColor(new Color(214, 0, 186));
                    g.fillRect(j * field, i * field, field, field);
                    g.setColor(Color.BLUE);
                    g.fillRect(j * field, i * field, field - 1, field - 1);

                }
                if (level[i][j] == 14) {
                    g.setColor(new Color(214, 0, 186));
                    g.fillRect(j * field, i * field, field, field);
                    g.setColor(Color.BLUE);
                    g.fillRect(j * field + 1, i * field, field - 1, field - 1);

                }
                if (level[i][j] == 15) {
                    g.setColor(new Color(214, 0, 186));
                    g.fillRect(j * field, i * field, field, field);
                    g.setColor(Color.BLUE);
                    g.fillRect(j * field + 1, i * field + 1, field - 1, field - 2);

                }
                if (level[i][j] == 16) {
                    g.setColor(new Color(214, 0, 186));
                    g.fillRect(j * field, i * field, field, field);
                    g.setColor(Color.BLUE);
                    g.fillRect(j * field + 1, i * field + 1, field - 2, field - 1);

                }
                if (level[i][j] == 17) {
                    g.setColor(new Color(214, 0, 186));
                    g.fillRect(j * field, i * field, field, field);
                    g.setColor(Color.BLUE);
                    g.fillRect(j * field, i * field + 1, field - 1, field - 2);

                }
                if (level[i][j] == 18) {
                    g.setColor(new Color(214, 0, 186));
                    g.fillRect(j * field, i * field, field, field);
                    g.setColor(Color.BLUE);
                    g.fillRect(j * field + 1, i * field, field - 2, field - 1);

                }
                if (level[i][j] == 19) {
                    g.setColor(new Color(214, 0, 186));
                    g.fillRect(j * field, i * field, field, field);
                    g.setColor(Color.BLUE);
                    g.fillRect(j * field + 1, i * field, field - 2, field);

                }
                if (level[i][j] == 20) {
                    g.setColor(new Color(214, 0, 186));
                    g.fillRect(j * field, i * field, field, field);
                    g.setColor(Color.BLUE);
                    g.fillRect(j * field, i * field + 1, field, field - 2);

                }
                if (level[i][j] == 5) {
                    g.setColor(Color.BLUE);
                    g.fillRect(j * field, i * field, field, field);
                }
                if (level[i][j] == 1) {
                    g.setColor(Color.white);
                    g.fillRect(j * field + 7, i * field + 7, 1, 1);
                }
            }
        }
    }

    private void drawGhosts(Graphics g) {
        drawRedGhost(g);
        drawGreenGhost(g);
        drawBlueGhost(g);
        drawYellowGhost(g);
    }

    private void drawFood(Graphics g) {
        int rand = (int) (Math.random() * 5);
        try {
            if (rand == 0) {
                wf = 1;
                g.drawImage(ImageIO.read(new File("src/main/resources/burger.png")), 135, 180, field, field, null);
            } else if (rand == 1) {
                wf = 2;
                g.drawImage(ImageIO.read(new File("src/main/resources/ciastko.png")), 135, 180, field, field, null);
            } else if (rand == 2) {
                wf = 3;
                g.drawImage(ImageIO.read(new File("src/main/resources/papryczka.png")), 135, 180, field, field, null);
            } else if (rand == 3) {
                wf = 4;
                g.drawImage(ImageIO.read(new File("src/main/resources/sernik.png")), 135, 180, field, field, null);
            } else if (rand == 4) {
                wf = 5;
                g.drawImage(ImageIO.read(new File("src/main/resources/wisnia.png")), 135, 180, field, field, null);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    private void drawPacman(Graphics g) {

        try {
            if (pacman.direction == 0) {
                if (pacman.counter == 1) {
                    g.drawImage(ImageIO.read(new File("src/main/resources/u1.png")), pacman.pacX, pacman.pacY, field, field, null);
//                    repaint();
                }
                if (pacman.counter == 2) {

                    g.drawImage(ImageIO.read(new File("src/main/resources/u2.png")), pacman.pacX, pacman.pacY, field, field, null);
//                    repaint();

                }
                if (pacman.counter == 3) {
                    g.drawImage(ImageIO.read(new File("src/main/resources/u3.png")), pacman.pacX, pacman.pacY, field, field, null);
//                    repaint();
                }
            }
            if (pacman.direction == 1) {
                if (pacman.counter == 1) {
                    g.drawImage(ImageIO.read(new File("src/main/resources/r1.png")), pacman.pacX, pacman.pacY, field, field, null);
//                    repaint();
                }
                if (pacman.counter == 2) {

                    g.drawImage(ImageIO.read(new File("src/main/resources/r2.png")), pacman.pacX, pacman.pacY, field, field, null);
//                    repaint();

                }
                if (pacman.counter == 3) {

                    g.drawImage(ImageIO.read(new File("src/main/resources/r3.png")), pacman.pacX, pacman.pacY, field, field, null);
//                    repaint();
                }
            }
            if (pacman.direction == 2) {
                if (pacman.counter == 1) {
                    g.drawImage(ImageIO.read(new File("src/main/resources/d1.png")), pacman.pacX, pacman.pacY, field, field, null);
//                    repaint();
                }
                if (pacman.counter == 2) {

                    g.drawImage(ImageIO.read(new File("src/main/resources/d2.png")), pacman.pacX, pacman.pacY, field, field, null);
//                    repaint();

                }
                if (pacman.counter == 3) {

                    g.drawImage(ImageIO.read(new File("src/main/resources/d3.png")), pacman.pacX, pacman.pacY, field, field, null);
//                    repaint();
                }
            }
            if (pacman.direction == 3) {
                if (pacman.counter == 1) {
                    g.drawImage(ImageIO.read(new File("src/main/resources/l1.png")), pacman.pacX, pacman.pacY, field, field, null);
//                    repaint();
                }
                if (pacman.counter == 2) {

                    g.drawImage(ImageIO.read(new File("src/main/resources/l2.png")), pacman.pacX, pacman.pacY, field, field, null);
//                    repaint();

                }
                if (pacman.counter == 3) {

                    g.drawImage(ImageIO.read(new File("src/main/resources/l3.png")), pacman.pacX, pacman.pacY, field, field, null);
//                    repaint();
                }
            }
            if (pacman.direction == 5) {
                g.drawImage(ImageIO.read(new File("src/main/resources/l1.png")), pacman.pacX, pacman.pacY, field, field, null);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void drawRedGhost(Graphics g) {
        try {
            if (redGhost.dir == 0) {
                g.drawImage(ImageIO.read(new File("src/main/resources/ru2.png")), redGhost.ghostX, redGhost.ghostY, field, field, null);
            } else if (redGhost.dir == 3) {
                g.drawImage(ImageIO.read(new File("src/main/resources/rl2.png")), redGhost.ghostX, redGhost.ghostY, field, field, null);
            } else if (redGhost.dir == 2) {
                g.drawImage(ImageIO.read(new File("src/main/resources/rd2.png")), redGhost.ghostX, redGhost.ghostY, field, field, null);
            } else if (redGhost.dir == 1) {
                g.drawImage(ImageIO.read(new File("src/main/resources/rr2.png")), redGhost.ghostX, redGhost.ghostY, field, field, null);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
    private void drawGreenGhost(Graphics g) {
        try {
            if (greenGhost.dir == 0) {
                g.drawImage(ImageIO.read(new File("src/main/resources/gu2.png")), greenGhost.ghostX, greenGhost.ghostY, field, field, null);
            } else if (greenGhost.dir == 3) {
                g.drawImage(ImageIO.read(new File("src/main/resources/gl2.png")), greenGhost.ghostX, greenGhost.ghostY, field, field, null);
            } else if (greenGhost.dir == 2) {
                g.drawImage(ImageIO.read(new File("src/main/resources/gd2.png")), greenGhost.ghostX, greenGhost.ghostY, field, field, null);
            } else if (greenGhost.dir == 1) {
                g.drawImage(ImageIO.read(new File("src/main/resources/gr2.png")), greenGhost.ghostX, greenGhost.ghostY, field, field, null);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    private void drawBlueGhost(Graphics g) {
        try {
            if (blueGhost.dir == 0) {
                g.drawImage(ImageIO.read(new File("src/main/resources/bu2.png")), blueGhost.ghostX, blueGhost.ghostY, field, field, null);
            } else if (blueGhost.dir == 3) {
                g.drawImage(ImageIO.read(new File("src/main/resources/bl2.png")), blueGhost.ghostX, blueGhost.ghostY, field, field, null);
            } else if (blueGhost.dir == 2) {
                g.drawImage(ImageIO.read(new File("src/main/resources/bd2.png")), blueGhost.ghostX, blueGhost.ghostY, field, field, null);
            } else if (blueGhost.dir == 1) {
                g.drawImage(ImageIO.read(new File("src/main/resources/br2.png")), blueGhost.ghostX, blueGhost.ghostY, field, field, null);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    private void drawYellowGhost(Graphics g) {
        try {
            if (yellowGhost.dir == 0) {
                g.drawImage(ImageIO.read(new File("src/main/resources/yu2.png")), yellowGhost.ghostX, yellowGhost.ghostY, field, field, null);
            } else if (yellowGhost.dir == 3) {
                g.drawImage(ImageIO.read(new File("src/main/resources/yl2.png")), yellowGhost.ghostX, yellowGhost.ghostY, field, field, null);
            } else if (yellowGhost.dir == 2) {
                g.drawImage(ImageIO.read(new File("src/main/resources/yd2.png")), yellowGhost.ghostX, yellowGhost.ghostY, field, field, null);
            } else if (yellowGhost.dir == 1) {
                g.drawImage(ImageIO.read(new File("src/main/resources/yr2.png")), yellowGhost.ghostX, yellowGhost.ghostY, field, field, null);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void moveAll() {
        greenGhost.moveGreenGhost();
        redGhost.moveRedGhost();
        blueGhost.moveBlueGhost();
        yellowGhost.moveYellowGhost();
    }
    public void redraw() {
        pacman.pacX = 135;
        pacman.pacY = 180;
        redGhost.ghostX = 9 * field;
        redGhost.ghostY = 10 * field;
        redGhost.counter = 0;
        blueGhost.ghostX = 10 * field;
        blueGhost.ghostY = 10 * field;
        blueGhost.counter = 0;
        greenGhost.ghostX = 8 * field;
        greenGhost.ghostY = 10 * field;
        greenGhost.counter = 0;
        yellowGhost.ghostY = 10 * field;
        yellowGhost.ghostX = 9 * field;
        yellowGhost.counter = 0;
    }

    public void play() {

        while(isAlive) {
            repaint();
            moveAll();
            pacman.movePacman();
            if (level[pacman.pacY / field][pacman.pacX / field] == 1) {
                level[pacman.pacY / field][pacman.pacX / field] = 0;
                score++;
                mapPointsCounter--;
            }
            if (mapPointsCounter == 0 || pacman.lives == 0) {
                isAlive = false;
            }
            if (!isFoodAlive) {
                if (isFoodReady == 10) {
                    isFoodAlive = true;
                    isFoodReady = 0;
                }
            } else {
                if (isFoodReady == 10) {
                    isFoodAlive = false;
                }
                if (pacman.pacX == food.foodX && pacman.pacY == food.foodY) {
                    isFoodAlive = false;
                    if (wf == 1) {
                        score += 50;
                        wf = 0;
                    } else if (wf == 5) {
                        score += 15;
                        wf = 0;
                    } else if (wf == 2) {
                        score += 10;
                        wf = 0;
                    } else if (wf == 3) {
                        score += 20;
                        wf = 0;
                    } else if ( wf == 4) {
                        score += 5;
                        wf = 0;
                    }
                    isFoodReady = 0;
                }
            }
//      todo
            if ((pacman.pacX == redGhost.ghostX && pacman.pacY == redGhost.ghostY) ||
                    (pacman.pacX == blueGhost.ghostX && pacman.pacY == blueGhost.ghostY) ||
                    (pacman.pacX == yellowGhost.ghostX && pacman.pacY == yellowGhost.ghostY) ||
                    (pacman.pacX == greenGhost.ghostX && pacman.pacY == greenGhost.ghostY) ||
                    (pacman.pacX + 14 == blueGhost.ghostX && pacman.pacY == blueGhost.ghostY) ||
                    (pacman.pacX + 14 == yellowGhost.ghostX && pacman.pacY == yellowGhost.ghostY) ||
                    (pacman.pacX + 14 == greenGhost.ghostX && pacman.pacY == blueGhost.ghostY) ||
                    (pacman.pacX + 14 == redGhost.ghostX && pacman.pacY == blueGhost.ghostY) ||
                    (pacman.pacX + 14 == blueGhost.ghostX && pacman.pacY == blueGhost.ghostY + 14) ||
                    (pacman.pacX + 14 == yellowGhost.ghostX && pacman.pacY == yellowGhost.ghostY + 14) ||
                    (pacman.pacX + 14 == greenGhost.ghostX && pacman.pacY == blueGhost.ghostY + 14) ||
                    (pacman.pacX + 14 == redGhost.ghostX && pacman.pacY == blueGhost.ghostY + 14) ||
                    (pacman.pacX == redGhost.ghostX && pacman.pacY == redGhost.ghostY + 14) ||
                    (pacman.pacX == blueGhost.ghostX && pacman.pacY == blueGhost.ghostY + 14) ||
                    (pacman.pacX == yellowGhost.ghostX && pacman.pacY == yellowGhost.ghostY + 14) ||
                    (pacman.pacX == greenGhost.ghostX && pacman.pacY == greenGhost.ghostY + 14)
            ) {
                pacman.lives--;
                redraw();
            }
            for (int i = 0; i < level.length; i++) {
                System.out.println();
            }
            try {
                Thread.sleep(14);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        while (!isAlive) {
            if (space == 1) {
                play();
                redraw();
                pacman.lives = 3;
                isAlive = true;
                score = 0;
                space = 0;
            }
        }
    }

    public static void main(String[] args) {
        PacMan pacman = new PacMan(135, 180);
        MyFrame window = new MyFrame(pacman);
        Main okno = new Main(pacman);
        okno.setBackground(new Color(0, 0, 0));
        window.add(okno);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setVisible(true);
        window.pack();
        okno.play();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        repaint();
    }
}
