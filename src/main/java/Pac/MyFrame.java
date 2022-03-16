package Pac;

import javax.swing.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class MyFrame extends JFrame implements KeyListener {

    private final PacMan pacman;

    public MyFrame(PacMan pacman) {
        super("Pacman");
        this.pacman = pacman;
        addKeyListener(this);
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_UP) {
            pacman.tryChange = 0;
        }
        if (e.getKeyCode() == KeyEvent.VK_DOWN) {
            pacman.tryChange = 2;
        }
        if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
            pacman.tryChange = 1;
        }
        if (e.getKeyCode() == KeyEvent.VK_LEFT) {
            pacman.tryChange = 3;
        }
        if (!Main.isAlive) {
            if (e.getKeyCode() == KeyEvent.VK_SPACE) {
                Main.space = 1;
            }
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
}
