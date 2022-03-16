package Pac;

public class PacMan {
    public int pacX;
    public int pacY;
    public int direction = 5;
    public int tryChange;
    public final int field = 15;
    public int counter;
    public int lives = 3;
    public int count = 0;

    public PacMan(int x, int y) {
        this.pacX = x;
        this.pacY = y;
    }

    public void movePacman() {
        if (direction == 5) {
            if (tryChange == 1) {
                direction = 1;
            }
            if (tryChange == 3) {
                direction = 3;
            }
        } else if (direction == 0) {
            if (Main.level[(pacY - 1) / field][pacX / field] == 1 ||
                    Main.level[(pacY - 1) / field][pacX / field] == 0) {
                pacY -= 1;
                count++;
                if (count < 5) {
                    counter = 1;
                }
                if (count >= 5 && count < 10) {
                    counter = 2;
                }
                if (count >= 10 && count <= 15) {
                    counter = 3;
                    if (count == 15) {
                        count = 0;
                        Main.isFoodReady++;
                    }
                }
            }
            if (tryChange == 1) {
                if (pacX % field == 0 && pacY % field == 0 &&
                        (Main.level[(pacY) / field][(pacX + field) / field] == 1 || Main.level[(pacY) / field][(pacX + field) / field] == 0)) {
                    direction = 1;
                }
            } else if (tryChange == 3) {
                if (pacX % field == 0 && pacY % field == 0 &&
                        (Main.level[(pacY) / field][(pacX - 1) / field] == 1 ||
                                Main.level[(pacY) / field][(pacX - 1) / field] == 0)) {
                    direction = 3;
                }
            } else if (tryChange == 2) {
                direction = 2;
            }
        } else if (direction == 1) {
            if (Main.level[(pacY) / field][(pacX + field) / field] == 1 ||
                    Main.level[(pacY) / field][(pacX + field) / field] == 0 ||
                    Main.level[(pacY) / field][(pacX + field) / field] == 6) {
                pacX += 1;
                count++;
                if (pacX == (18 * field)) {
                    if (Main.level[10][18] == 1) {
                        Main.level[10][18] = 0;
                        Main.score++;
                        Main.mapPointsCounter--;
                    }
                    pacX = 0;
                }
                if (count < 5) {
                    counter = 1;
                }
                if (count >= 5 && count < 10) {
                    counter = 2;
                }
                if (count >= 10 && count <= 15) {
                    counter = 3;
                    if (count == 15) {
                        count = 0;
                        Main.isFoodReady++;
                    }
                }
            }
            if (tryChange == 0) {
                if (pacX % field == 0 && pacY % field == 0 &&
                        (Main.level[(pacY - field) / field][(pacX) / field] == 1 ||
                                Main.level[(pacY - field) / field][(pacX) / field] == 0)) {
                    direction = 0;
                }
            } else if (tryChange == 2) {
                if (pacX % field == 0 && pacY % field == 0 &&
                        (Main.level[(pacY + field) / field][(pacX) / field] == 1 ||
                                Main.level[(pacY + field) / field][(pacX) / field] == 0)) {
                    direction = 2;
                }
            } else if (tryChange == 3) {
                direction = 3;
            }
        } else if (direction == 2) {
            if (Main.level[(pacY + field) / field][(pacX) / field] == 1 ||
                    Main.level[(pacY + field) / field][(pacX) / field] == 0) {
                pacY += 1;
                count++;
                if (count < 5) {
                    counter = 1;
                }
                if (count >= 5 && count < 10) {
                    counter = 2;
                }
                if (count >= 10 && count <= 15) {
                    counter = 3;
                    if (count == 15) {
                        count = 0;
                        Main.isFoodReady++;
                    }
                }
            }
            if (tryChange == 1) {
                if ((Main.level[(pacY + 14) / field][(pacX + field) / field] == 1 && Main.level[(pacY) / field][(pacX + field) / field] == 1) ||
                        (Main.level[(pacY + 14) / field][(pacX + field) / field] == 0 && Main.level[(pacY) / field][(pacX + field) / field] == 0)) {
                    direction = 1;
                }
            } else if (tryChange == 3) {
                if ((Main.level[(pacY) / field][(pacX - 1) / field] == 1 && Main.level[(pacY + 14) / field][(pacX - 1) / field] == 1) ||
                        (Main.level[(pacY) / field][(pacX - 1) / field] == 0 && Main.level[(pacY + 14) / field][(pacX - 1) / field] == 0)) {
                    direction = 3;
                }
            } else if (tryChange == 0) {
                direction = 0;
            }
        } else if (direction == 3) {
            if (Main.level[(pacY) / field][(pacX - 1) / field] == 1 ||
                    Main.level[(pacY) / field][(pacX - 1) / field] == 0 ||
                    Main.level[(pacY) / field][(pacX - 1) / field] == 6){
                pacX -= 1;
                count++;
                if (pacX == 0) {
                    pacX = 18 * field;
                }
                if (count < 5) {
                    counter = 1;
                }
                if (count >= 5 && count < 10) {
                    counter = 2;
                }
                if (count >= 10 && count <= 15) {
                    counter = 3;
                    if (count == 15) {
                        count = 0;
                        Main.isFoodReady++;
                    }
                }
            }
            if (tryChange == 0) {
                if (pacX % field == 0 && pacY % field == 0 &&
                        (Main.level[(pacY - field) / field][(pacX) / field] == 1 ||
                                Main.level[(pacY - field) / field][(pacX) / field] == 0)) {
                    direction = 0;
                }
            } else if (tryChange == 2) {
                if (pacX % field == 0 && pacY % field == 0 &&
                        (Main.level[(pacY + field) / field][(pacX) / field] == 1 ||
                                Main.level[(pacY + field) / field][(pacX) / field] == 0)) {
                    direction = 2;
                }
            } else if (tryChange == 1) {
                direction = 1;
            }
        }
    }
}
