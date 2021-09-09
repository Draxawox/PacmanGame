package Pac;

public class Ghost {
    public int ghostX;
    public int ghostY;
    public int field = 15;
    public int dir;
    public int counter = 0;
    int direction = 1;

    public Ghost(int x, int y) {
        this.ghostX = x;
        this.ghostY = y;
    }
    public void moveRedGhost() {
        int randThree = (int) (Math.random() * 3);
        int randTwo = (int) (Math.random() * 2);
        if (counter > 45) {
            if (dir == 1) {
                ghostX += direction;
                if (ghostX == 18 * field) {
                    ghostX = 0;
                }
                if (ghostX % field == 0 && ghostY % field == 0 &&
                        (Main.level[(ghostY + field) / field][ghostX / field] == 1 ||
                                Main.level[(ghostY + field) / field][ghostX / field] == 0) &&
                        (Main.level[(ghostY - 1) / field][ghostX / field] == 1 ||
                                Main.level[(ghostY - 1) / field][ghostX / field] == 0) &&
                        (Main.level[ghostY / field][(ghostX + field) / field] != 1 &&
                                Main.level[ghostY / field][(ghostX + field) / field] != 0)) {
                    if (randTwo == 0) {
                        dir = 2;
                    } else {
                        dir = 0;
                    }
                } else if (ghostX % field == 0 && ghostY % field == 0 &&
                        (Main.level[(ghostY + field) / field][ghostX / field] == 1 ||
                                Main.level[(ghostY + field) / field][ghostX / field] == 0) &&
                        (Main.level[(ghostY - 1) / field][ghostX / field] == 1 ||
                                Main.level[(ghostY - 1) / field][ghostX / field] == 0) &&
                        (Main.level[ghostY / field][(ghostX + field) / field] == 1 ||
                                Main.level[ghostY / field][(ghostX + field) / field] == 0)) {
                    if (randThree == 0) {
                        dir = 1;
                    } else if (randThree == 1) {
                        dir = 2;
                    } else if (randThree == 2) {
                        dir = 0;
                    }
                } else if (ghostX % field == 0 && ghostY % field == 0 &&
                        (Main.level[(ghostY + field) / field][ghostX / field] == 1 ||
                                Main.level[(ghostY + field) / field][ghostX / field] == 0) &&
                        Main.level[(ghostY - 1) / field][ghostX / field] != 1 &&
                                Main.level[(ghostY - 1) / field][ghostX / field] != 0 &&
                        (Main.level[ghostY / field][(ghostX + field) / field] == 1 ||
                                Main.level[ghostY / field][(ghostX + field) / field] == 0)) {
                    if (randTwo == 0) {
                        dir = 1;
                    } else {
                        dir = 2;
                    }
                } else if (ghostX % field == 0 && ghostY % field == 0 &&
                        (Main.level[(ghostY + field) / field][ghostX / field] != 1 &&
                                Main.level[(ghostY + field) / field][ghostX / field] != 0) &&
                        (Main.level[(ghostY - 1) / field][ghostX / field] == 1 ||
                                Main.level[(ghostY - 1) / field][ghostX / field] == 0) &&
                        (Main.level[ghostY / field][(ghostX + field) / field] == 1 ||
                                Main.level[ghostY / field][(ghostX + field) / field] == 0)) {

                    if (randTwo == 1) {
                        dir = 1;
                    } else {
                        dir = 0;
                    }
                } else if (ghostX % field == 0 && ghostY % field == 0 &&
                        (Main.level[(ghostY + field) / field][ghostX / field] != 1 &&
                                Main.level[(ghostY + field) / field][ghostX / field] != 0) &&
                        (Main.level[(ghostY - 1) / field][ghostX / field] == 1 ||
                                Main.level[(ghostY - 1) / field][ghostX / field] == 0) &&
                        (Main.level[ghostY / field][(ghostX + field) / field] != 1 &&
                                Main.level[ghostY / field][(ghostX + field) / field] != 0)) {
                    dir = 0;
                } else if (ghostX % field == 0 && ghostY % field == 0 &&
                        (Main.level[(ghostY + field) / field][ghostX / field] == 1 ||
                                Main.level[(ghostY + field) / field][ghostX / field] == 0) &&
                        (Main.level[(ghostY - 1) / field][ghostX / field] != 1 &&
                                Main.level[(ghostY - 1) / field][ghostX / field] != 0) &&
                        (Main.level[ghostY / field][(ghostX + field) / field] != 1 &&
                                Main.level[ghostY / field][(ghostX + field) / field] != 0)) {
                    dir = 2;
                }
            }
            if (dir == 0) {
                ghostY -= direction;
                if (ghostX % field == 0 && ghostY % field == 0 &&
                        (Main.level[(ghostY) / field][(ghostX - 1) / field] == 1 ||
                                Main.level[(ghostY) / field][(ghostX - 1) / field] == 0) &&
                        (Main.level[(ghostY - 1) / field][ghostX / field] == 1 ||
                                Main.level[(ghostY - 1) / field][ghostX / field] == 0) &&
                        (Main.level[ghostY / field][(ghostX + field) / field] != 1 &&
                        Main.level[ghostY / field][(ghostX + field) / field] != 0)) {
                    if (randTwo == 0) {
                        dir = 0;
                    } else {
                        dir = 3;
                    }
                } else if (ghostX % field == 0 && ghostY % field == 0 &&
                        (Main.level[(ghostY) / field][(ghostX - 1) / field] == 1 ||
                                Main.level[(ghostY) / field][(ghostX - 1) / field] == 0) &&
                        (Main.level[(ghostY - 1) / field][ghostX / field] == 1 ||
                                Main.level[(ghostY - 1) / field][ghostX / field] == 0) &&
                        (Main.level[ghostY / field][(ghostX + field) / field] == 1 ||
                                Main.level[ghostY / field][(ghostX + field) / field] == 0)) {
                    if (randThree == 0) {
                        dir = 1;
                    } else if (randThree == 1) {
                        dir = 0;
                    } else if (randThree == 2) {
                        dir = 3;
                    }
                } else if (ghostX % field == 0 && ghostY % field == 0 &&
                        (Main.level[(ghostY) / field][(ghostX - 1) / field] == 1 ||
                                Main.level[(ghostY) / field][(ghostX - 1) / field] == 0) &&
                        Main.level[(ghostY - 1) / field][ghostX / field] != 1 &&
                        Main.level[(ghostY - 1) / field][ghostX / field] != 0 &&
                        (Main.level[ghostY / field][(ghostX + field) / field] == 1 ||
                                Main.level[ghostY / field][(ghostX + field) / field] == 0)) {
                    if (randTwo == 0) {
                        dir = 1;
                    } else {
                        dir = 3;
                    }
                } else if (ghostX % field == 0 && ghostY % field == 0 &&
                        (Main.level[(ghostY) / field][(ghostX - 1) / field] != 1 &&
                                Main.level[(ghostY) / field][(ghostX - 1) / field] != 0) &&
                        (Main.level[(ghostY - 1) / field][ghostX / field] == 1 ||
                                Main.level[(ghostY - 1) / field][ghostX / field] == 0) &&
                        (Main.level[ghostY / field][(ghostX + field) / field] == 1 ||
                                Main.level[ghostY / field][(ghostX + field) / field] == 0)) {
                    if (randTwo == 1) {
                        dir = 1;
                    } else {
                        dir = 0;
                    }
                } else if (ghostX % field == 0 && ghostY % field == 0 &&
                        (Main.level[(ghostY) / field][(ghostX - 1) / field] != 1 &&
                                Main.level[(ghostY) / field][(ghostX - 1) / field] != 0) &&
                        (Main.level[(ghostY - 1) / field][ghostX / field] == 1 ||
                                Main.level[(ghostY - 1) / field][ghostX / field] == 0) &&
                        (Main.level[ghostY / field][(ghostX + field) / field] != 1 &&
                                Main.level[ghostY / field][(ghostX + field) / field] != 0)) {
                    dir = 0;
                } else if (ghostX % field == 0 && ghostY % field == 0 &&
                        (Main.level[(ghostY) / field][(ghostX - 1) / field] == 1 ||
                                Main.level[(ghostY) / field][(ghostX - 1) / field] == 0) &&
                        (Main.level[(ghostY - 1) / field][ghostX / field] != 1 &&
                                Main.level[(ghostY - 1) / field][ghostX / field] != 0) &&
                        (Main.level[ghostY / field][(ghostX + field) / field] != 1 &&
                                Main.level[ghostY / field][(ghostX + field) / field] != 0)) {
                    dir = 3;
                } else if (ghostX % field == 0 && ghostY % field == 0 &&
                        (Main.level[(ghostY) / field][(ghostX - 1) / field] != 1 &&
                                Main.level[(ghostY) / field][(ghostX - 1) / field] != 0) &&
                        (Main.level[(ghostY - 1) / field][ghostX / field] != 1 &&
                                Main.level[(ghostY - 1) / field][ghostX / field] != 0) &&
                        (Main.level[ghostY / field][(ghostX + field) / field] == 1 ||
                                Main.level[ghostY / field][(ghostX + field) / field] == 0)) {
                    dir = 1;
                }
            }
            if (dir == 2) {
                ghostY += direction;
                if (ghostX % field == 0 && ghostY % field == 0 &&
                        (Main.level[(ghostY + field) / field][ghostX / field] == 1 ||
                                Main.level[(ghostY + field) / field][ghostX / field] == 0) &&
                        (Main.level[(ghostY) / field][(ghostX - 1) / field] == 1 ||
                                Main.level[(ghostY) / field][(ghostX - 1) / field] == 0) &&
                        Main.level[ghostY / field][(ghostX + field) / field] != 1 &&
                        Main.level[ghostY / field][(ghostX + field) / field] != 0) {
                    if (randTwo == 0) {
                        dir = 2;
                    } else {
                        dir = 3;
                    }
                } else if (ghostX % field == 0 && ghostY % field == 0 &&
                        (Main.level[(ghostY + field) / field][ghostX / field] == 1 ||
                                Main.level[(ghostY + field) / field][ghostX / field] == 0) &&
                        (Main.level[(ghostY) / field][(ghostX - 1) / field] == 1 ||
                                Main.level[(ghostY) / field][(ghostX - 1) / field] == 0) &&
                        (Main.level[ghostY / field][(ghostX + field) / field] == 1 ||
                                Main.level[ghostY / field][(ghostX + field) / field] == 0)) {
                    if (randThree == 0) {
                        dir = 1;
                    } else if (randThree == 1) {
                        dir = 2;
                    } else if (randThree == 2) {
                        dir = 3;
                    }
                } else if (ghostX % field == 0 && ghostY % field == 0 &&
                        (Main.level[(ghostY + field) / field][ghostX / field] == 1 ||
                                Main.level[(ghostY + field) / field][ghostX / field] == 0) &&
                        Main.level[(ghostY) / field][(ghostX - 1) / field] != 1 &&
                        Main.level[(ghostY) / field][(ghostX - 1) / field] != 0 &&
                        (Main.level[ghostY / field][(ghostX + field) / field] == 1 ||
                                Main.level[ghostY / field][(ghostX + field) / field] == 0)) {
                    if (randTwo == 0) {
                        dir = 1;
                    } else {
                        dir = 2;
                    }
                } else if (ghostX % field == 0 && ghostY % field == 0 &&
                        (Main.level[(ghostY + field) / field][ghostX / field] != 1 &&
                                Main.level[(ghostY + field) / field][ghostX / field] != 0) &&
                        (Main.level[(ghostY) / field][(ghostX - 1) / field] == 1 ||
                                Main.level[(ghostY) / field][(ghostX - 1) / field] == 0) &&
                        (Main.level[ghostY / field][(ghostX + field) / field] == 1 ||
                                Main.level[ghostY / field][(ghostX + field) / field] == 0)) {
                    if (randTwo == 1) {
                        dir = 1;
                    } else {
                        dir = 3;
                    }
                } else if (ghostX % field == 0 && ghostY % field == 0 &&
                        (Main.level[(ghostY + field) / field][ghostX / field] != 1 &&
                                Main.level[(ghostY + field) / field][ghostX / field] != 0) &&
                        (Main.level[(ghostY) / field][(ghostX - 1) / field] == 1 ||
                                Main.level[(ghostY) / field][(ghostX - 1) / field] == 0) &&
                        (Main.level[ghostY / field][(ghostX + field) / field] != 1 &&
                                Main.level[ghostY / field][(ghostX + field) / field] != 0)) {
                    dir = 3;
                } else if (ghostX % field == 0 && ghostY % field == 0 &&
                        (Main.level[(ghostY + field) / field][ghostX / field] == 1 ||
                                Main.level[(ghostY + field) / field][ghostX / field] == 0) &&
                        (Main.level[(ghostY) / field][(ghostX - 1) / field] != 1 &&
                                Main.level[(ghostY) / field][(ghostX - 1) / field] != 0) &&
                        (Main.level[ghostY / field][(ghostX + field) / field] != 1 &&
                                Main.level[ghostY / field][(ghostX + field) / field] != 0)) {
                    dir = 2;
                } else if (ghostX % field == 0 && ghostY % field == 0 &&
                        (Main.level[(ghostY + field) / field][ghostX / field] != 1 &&
                                Main.level[(ghostY + field) / field][ghostX / field] != 0) &&
                        (Main.level[(ghostY) / field][(ghostX - 1) / field] != 1 &&
                                Main.level[(ghostY) / field][(ghostX - 1) / field] != 0) &&
                        (Main.level[ghostY / field][(ghostX + field) / field] == 1 ||
                                Main.level[ghostY / field][(ghostX + field) / field] == 0)) {
                    dir = 1;
                }
            }
            if (dir == 3) {
                ghostX -= direction;
                if (ghostX % field == 0 && ghostY % field == 0 &&
                        (Main.level[(ghostY + field) / field][ghostX / field] == 1 ||
                                Main.level[(ghostY + field) / field][ghostX / field] == 0) &&
                        (Main.level[(ghostY - 1) / field][ghostX / field] == 1 ||
                                Main.level[(ghostY - 1) / field][ghostX / field] == 0) &&
                        Main.level[ghostY / field][(ghostX - 1) / field] != 1 &&
                        Main.level[ghostY / field][(ghostX - 1) / field] != 0) {
                    if (randTwo == 0) {
                        dir = 2;
                    } else {
                        dir = 0;
                    }
                } else if (ghostX % field == 0 && ghostY % field == 0 &&
                        (Main.level[(ghostY + field) / field][ghostX / field] == 1 ||
                                Main.level[(ghostY + field) / field][ghostX / field] == 0) &&
                        (Main.level[(ghostY - 1) / field][ghostX / field] == 1 ||
                                Main.level[(ghostY - 1) / field][ghostX / field] == 0) &&
                        (Main.level[ghostY / field][(ghostX - 1) / field] == 1 ||
                                Main.level[ghostY / field][(ghostX - 1) / field] == 0)) {
                    if (randThree == 0) {
                        dir = 0;
                    } else if (randThree == 1) {
                        dir = 2;
                    } else if (randThree == 2) {
                        dir = 3;
                    }
                } else if (ghostX % field == 0 && ghostY % field == 0 &&
                        (Main.level[(ghostY + field) / field][ghostX / field] == 1 ||
                                Main.level[(ghostY + field) / field][ghostX / field] == 0) &&
                        Main.level[(ghostY - 1) / field][ghostX / field] != 1 &&
                        Main.level[(ghostY - 1) / field][ghostX / field] != 0 &&
                        (Main.level[ghostY / field][(ghostX - 1) / field] == 1 ||
                                Main.level[ghostY / field][(ghostX - 1) / field] == 0)) {
                    if (randTwo == 0) {
                        dir = 3;
                    } else {
                        dir = 2;
                    }
                } else if (ghostX % field == 0 && ghostY % field == 0 &&
                        (Main.level[(ghostY + field) / field][ghostX / field] != 1 &&
                                Main.level[(ghostY + field) / field][ghostX / field] != 0) &&
                        (Main.level[(ghostY - 1) / field][ghostX / field] == 1 ||
                                Main.level[(ghostY - 1) / field][ghostX / field] == 0) &&
                        (Main.level[ghostY / field][(ghostX - 1) / field] == 1 ||
                                Main.level[ghostY / field][(ghostX - 1) / field] == 0)) {
                    if (randTwo == 1) {
                        dir = 3;
                    } else {
                        dir = 0;
                    }
                } else if (ghostX % field == 0 && ghostY % field == 0 &&
                        (Main.level[(ghostY + field) / field][ghostX / field] != 1 &&
                                Main.level[(ghostY + field) / field][ghostX / field] != 0) &&
                        (Main.level[(ghostY - 1) / field][ghostX / field] == 1 ||
                                Main.level[(ghostY - 1) / field][ghostX / field] == 0) &&
                        (Main.level[ghostY / field][(ghostX - 1) / field] != 1 &&
                                Main.level[ghostY / field][(ghostX - 1) / field] != 0)) {
                    dir = 0;
                } else if (ghostX % field == 0 && ghostY % field == 0 &&
                        (Main.level[(ghostY + field) / field][ghostX / field] == 1 ||
                                Main.level[(ghostY + field) / field][ghostX / field] == 0) &&
                        (Main.level[(ghostY - 1) / field][ghostX / field] != 1 &&
                                Main.level[(ghostY - 1) / field][ghostX / field] != 0) &&
                        (Main.level[ghostY / field][(ghostX - 1) / field] != 1 &&
                                Main.level[ghostY / field][(ghostX - 1) / field] != 0)) {
                    dir = 2;
                } else if (ghostX == 0) {
                    ghostX = 18 * field;
                }
            }
        } else if (counter >= 30) {
            ghostX += direction;
            dir = 1;
            counter++;
        } else {

            ghostY -= direction;
            dir = 0;
            counter++;
        }
    }
    public void moveGreenGhost() {
        int randThree = (int) (Math.random() * 3);
        int randTwo = (int) (Math.random() * 2);
        if (counter < 15) {
            ghostX += direction;
            counter ++;
        } else if (counter >= 15 && counter < 45) {
            ghostY -= direction;
            counter++;
        } else if (counter >= 45 && counter < 60) {
            ghostX -= direction;
            counter++;
        } else {
            if (dir == 1) {
                ghostX += direction;
                if (ghostX == 18 * field) {
                    ghostX = 0;
                }
                if (ghostX % field == 0 && ghostY % field == 0 &&
                        (Main.level[(ghostY + field) / field][ghostX / field] == 1 ||
                                Main.level[(ghostY + field) / field][ghostX / field] == 0) &&
                        (Main.level[(ghostY - 1) / field][ghostX / field] == 1 ||
                                Main.level[(ghostY - 1) / field][ghostX / field] == 0) &&
                        (Main.level[ghostY / field][(ghostX + field) / field] != 1 &&
                                Main.level[ghostY / field][(ghostX + field) / field] != 0)) {
                    if (randTwo == 0) {
                        dir = 2;
                    } else {
                        dir = 0;
                    }
                } else if (ghostX % field == 0 && ghostY % field == 0 &&
                        (Main.level[(ghostY + field) / field][ghostX / field] == 1 ||
                                Main.level[(ghostY + field) / field][ghostX / field] == 0) &&
                        (Main.level[(ghostY - 1) / field][ghostX / field] == 1 ||
                                Main.level[(ghostY - 1) / field][ghostX / field] == 0) &&
                        (Main.level[ghostY / field][(ghostX + field) / field] == 1 ||
                                Main.level[ghostY / field][(ghostX + field) / field] == 0)) {
                    if (randThree == 0) {
                        dir = 1;
                    } else if (randThree == 1) {
                        dir = 2;
                    } else if (randThree == 2) {
                        dir = 0;
                    }
                } else if (ghostX % field == 0 && ghostY % field == 0 &&
                        (Main.level[(ghostY + field) / field][ghostX / field] == 1 ||
                                Main.level[(ghostY + field) / field][ghostX / field] == 0) &&
                        Main.level[(ghostY - 1) / field][ghostX / field] != 1 &&
                        Main.level[(ghostY - 1) / field][ghostX / field] != 0 &&
                        (Main.level[ghostY / field][(ghostX + field) / field] == 1 ||
                                Main.level[ghostY / field][(ghostX + field) / field] == 0)) {
                    if (randTwo == 0) {
                        dir = 1;
                    } else {
                        dir = 2;
                    }
                } else if (ghostX % field == 0 && ghostY % field == 0 &&
                        (Main.level[(ghostY + field) / field][ghostX / field] != 1 &&
                                Main.level[(ghostY + field) / field][ghostX / field] != 0) &&
                        (Main.level[(ghostY - 1) / field][ghostX / field] == 1 ||
                                Main.level[(ghostY - 1) / field][ghostX / field] == 0) &&
                        (Main.level[ghostY / field][(ghostX + field) / field] == 1 ||
                                Main.level[ghostY / field][(ghostX + field) / field] == 0)) {
                    if (randTwo == 1) {
                        dir = 1;
                    } else {
                        dir = 0;
                    }
                } else if (ghostX % field == 0 && ghostY % field == 0 &&
                        (Main.level[(ghostY + field) / field][ghostX / field] != 1 &&
                                Main.level[(ghostY + field) / field][ghostX / field] != 0) &&
                        (Main.level[(ghostY - 1) / field][ghostX / field] == 1 ||
                                Main.level[(ghostY - 1) / field][ghostX / field] == 0) &&
                        (Main.level[ghostY / field][(ghostX + field) / field] != 1 &&
                                Main.level[ghostY / field][(ghostX + field) / field] != 0)) {
                    dir = 0;
                } else if (ghostX % field == 0 && ghostY % field == 0 &&
                        (Main.level[(ghostY + field) / field][ghostX / field] == 1 ||
                                Main.level[(ghostY + field) / field][ghostX / field] == 0) &&
                        (Main.level[(ghostY - 1) / field][ghostX / field] != 1 &&
                                Main.level[(ghostY - 1) / field][ghostX / field] != 0) &&
                        (Main.level[ghostY / field][(ghostX + field) / field] != 1 &&
                                Main.level[ghostY / field][(ghostX + field) / field] != 0)) {
                    dir = 2;
                }
            }
            if (dir == 0) {
                ghostY -= direction;
                if (ghostX % field == 0 && ghostY % field == 0 &&
                        (Main.level[(ghostY) / field][(ghostX - field) / field] == 1 ||
                                Main.level[(ghostY + field) / field][(ghostX - field) / field] == 0) &&
                        (Main.level[(ghostY - 1) / field][ghostX / field] == 1 ||
                                Main.level[(ghostY - 1) / field][ghostX / field] == 0) &&
                        (Main.level[ghostY / field][(ghostX + field) / field] != 1 &&
                                Main.level[ghostY / field][(ghostX + field) / field] != 0)) {
                    if (randTwo == 0) {
                        dir = 0;
                    } else {
                        dir = 3;
                    }
                } else if (ghostX % field == 0 && ghostY % field == 0 &&
                        (Main.level[(ghostY + field) / field][(ghostX - 1) / field] == 1 ||
                                Main.level[(ghostY) / field][(ghostX - 1) / field] == 0) &&
                        (Main.level[(ghostY - 1) / field][ghostX / field] == 1 ||
                                Main.level[(ghostY - 1) / field][ghostX / field] == 0) &&
                        (Main.level[ghostY / field][(ghostX + field) / field] == 1 ||
                                Main.level[ghostY / field][(ghostX + field) / field] == 0)) {
                    if (randThree == 0) {
                        dir = 1;
                    } else if (randThree == 1) {
                        dir = 0;
                    } else if (randThree == 2) {
                        dir = 3;
                    }
                } else if (ghostX % field == 0 && ghostY % field == 0 &&
                        (Main.level[(ghostY) / field][(ghostX - 1) / field] == 1 ||
                                Main.level[(ghostY) / field][(ghostX - 1) / field] == 0) &&
                        Main.level[(ghostY - 1) / field][ghostX / field] != 1 &&
                        Main.level[(ghostY - 1) / field][ghostX / field] != 0 &&
                        (Main.level[ghostY / field][(ghostX + field) / field] == 1 ||
                                Main.level[ghostY / field][(ghostX + field) / field] == 0)) {
                    if (randTwo == 0) {
                        dir = 1;
                    } else {
                        dir = 3;
                    }
                } else if (ghostX % field == 0 && ghostY % field == 0 &&
                        (Main.level[(ghostY) / field][(ghostX - 1) / field] != 1 &&
                                Main.level[(ghostY) / field][(ghostX - 1) / field] != 0) &&
                        (Main.level[(ghostY - 1) / field][ghostX / field] == 1 ||
                                Main.level[(ghostY - 1) / field][ghostX / field] == 0) &&
                        (Main.level[ghostY / field][(ghostX + field) / field] == 1 ||
                                Main.level[ghostY / field][(ghostX + field) / field] == 0)) {
                    if (randTwo == 1) {
                        dir = 1;
                    } else {
                        dir = 0;
                    }
                } else if (ghostX % field == 0 && ghostY % field == 0 &&
                        (Main.level[(ghostY) / field][(ghostX - 1) / field] != 1 &&
                                Main.level[(ghostY) / field][(ghostX - 1) / field] != 0) &&
                        (Main.level[(ghostY - 1) / field][ghostX / field] == 1 ||
                                Main.level[(ghostY - 1) / field][ghostX / field] == 0) &&
                        (Main.level[ghostY / field][(ghostX + field) / field] != 1 &&
                                Main.level[ghostY / field][(ghostX + field) / field] != 0)) {
                    dir = 0;
                } else if (ghostX % field == 0 && ghostY % field == 0 &&
                        (Main.level[(ghostY) / field][(ghostX - 1) / field] == 1 ||
                                Main.level[(ghostY) / field][(ghostX - 1) / field] == 0) &&
                        (Main.level[(ghostY - 1) / field][ghostX / field] != 1 &&
                                Main.level[(ghostY - 1) / field][ghostX / field] != 0) &&
                        (Main.level[ghostY / field][(ghostX + field) / field] != 1 &&
                                Main.level[ghostY / field][(ghostX + field) / field] != 0)) {
                    dir = 3;
                } else if (ghostX % field == 0 && ghostY % field == 0 &&
                        (Main.level[(ghostY) / field][(ghostX - 1) / field] != 1 &&
                                Main.level[(ghostY) / field][(ghostX - 1) / field] != 0) &&
                        (Main.level[(ghostY - 1) / field][ghostX / field] != 1 &&
                                Main.level[(ghostY - 1) / field][ghostX / field] != 0) &&
                        (Main.level[ghostY / field][(ghostX + field) / field] == 1 ||
                                Main.level[ghostY / field][(ghostX + field) / field] == 0)) {
                    dir = 1;
                }
            }
            if (dir == 2) {
                ghostY += direction;
                if (ghostX % field == 0 && ghostY % field == 0 &&
                        (Main.level[(ghostY + field) / field][ghostX / field] == 1 ||
                                Main.level[(ghostY + field) / field][ghostX / field] == 0) &&
                        (Main.level[(ghostY) / field][(ghostX - 1) / field] == 1 ||
                                Main.level[(ghostY) / field][(ghostX - 1) / field] == 0) &&
                        Main.level[ghostY / field][(ghostX + field) / field] != 1 &&
                        Main.level[ghostY / field][(ghostX + field) / field] != 0) {
                    if (randTwo == 0) {
                        dir = 2;
                    } else {
                        dir = 3;
                    }
                } else if (ghostX % field == 0 && ghostY % field == 0 &&
                        (Main.level[(ghostY + field) / field][ghostX / field] == 1 ||
                                Main.level[(ghostY + field) / field][ghostX / field] == 0) &&
                        (Main.level[(ghostY) / field][(ghostX - 1) / field] == 1 ||
                                Main.level[(ghostY) / field][(ghostX - 1) / field] == 0) &&
                        (Main.level[ghostY / field][(ghostX + field) / field] == 1 ||
                                Main.level[ghostY / field][(ghostX + field) / field] == 0)) {
                    if (randThree == 0) {
                        dir = 1;
                    } else if (randThree == 1) {
                        dir = 2;
                    } else if (randThree == 2) {
                        dir = 3;
                    }
                } else if (ghostX % field == 0 && ghostY % field == 0 &&
                        (Main.level[(ghostY + field) / field][ghostX / field] == 1 ||
                                Main.level[(ghostY + field) / field][ghostX / field] == 0) &&
                        Main.level[(ghostY) / field][(ghostX - 1) / field] != 1 &&
                        Main.level[(ghostY) / field][(ghostX - 1) / field] != 0 &&
                        (Main.level[ghostY / field][(ghostX + field) / field] == 1 ||
                                Main.level[ghostY / field][(ghostX + field) / field] == 0)) {
                    if (randTwo == 0) {
                        dir = 1;
                    } else {
                        dir = 2;
                    }
                } else if (ghostX % field == 0 && ghostY % field == 0 &&
                        (Main.level[(ghostY + field) / field][ghostX / field] != 1 &&
                                Main.level[(ghostY + field) / field][ghostX / field] != 0) &&
                        (Main.level[(ghostY) / field][(ghostX - 1) / field] == 1 ||
                                Main.level[(ghostY) / field][(ghostX - 1) / field] == 0) &&
                        (Main.level[ghostY / field][(ghostX + field) / field] == 1 ||
                                Main.level[ghostY / field][(ghostX + field) / field] == 0)) {
                    if (randTwo == 1) {
                        dir = 1;
                    } else {
                        dir = 3;
                    }
                } else if (ghostX % field == 0 && ghostY % field == 0 &&
                        (Main.level[(ghostY + field) / field][ghostX / field] != 1 &&
                                Main.level[(ghostY + field) / field][ghostX / field] != 0) &&
                        (Main.level[(ghostY) / field][(ghostX - 1) / field] == 1 ||
                                Main.level[(ghostY) / field][(ghostX - 1) / field] == 0) &&
                        (Main.level[ghostY / field][(ghostX + field) / field] != 1 &&
                                Main.level[ghostY / field][(ghostX + field) / field] != 0)) {
                    dir = 3;
                } else if (ghostX % field == 0 && ghostY % field == 0 &&
                        (Main.level[(ghostY + field) / field][ghostX / field] == 1 ||
                                Main.level[(ghostY + field) / field][ghostX / field] == 0) &&
                        (Main.level[(ghostY) / field][(ghostX - 1) / field] != 1 &&
                                Main.level[(ghostY) / field][(ghostX - 1) / field] != 0) &&
                        (Main.level[ghostY / field][(ghostX + field) / field] != 1 &&
                                Main.level[ghostY / field][(ghostX + field) / field] != 0)) {
                    dir = 2;
                } else if (ghostX % field == 0 && ghostY % field == 0 &&
                        (Main.level[(ghostY + field) / field][ghostX / field] != 1 &&
                                Main.level[(ghostY + field) / field][ghostX / field] != 0) &&
                        (Main.level[(ghostY) / field][(ghostX - 1) / field] != 1 &&
                                Main.level[(ghostY) / field][(ghostX - 1) / field] != 0) &&
                        (Main.level[ghostY / field][(ghostX + field) / field] == 1 ||
                                Main.level[ghostY / field][(ghostX + field) / field] == 0)) {
                    dir = 1;
                }
            }
            if (dir == 3) {
                ghostX -= direction;
                if (ghostX % field == 0 && ghostY % field == 0 &&
                        (Main.level[(ghostY + field) / field][ghostX / field] == 1 ||
                                Main.level[(ghostY + field) / field][ghostX / field] == 0) &&
                        (Main.level[(ghostY - 1) / field][ghostX / field] == 1 ||
                                Main.level[(ghostY - 1) / field][ghostX / field] == 0) &&
                        Main.level[ghostY / field][(ghostX - 1) / field] != 1 &&
                        Main.level[ghostY / field][(ghostX - 1) / field] != 0) {
                    if (randTwo == 0) {
                        dir = 2;
                    } else {
                        dir = 0;
                    }
                } else if (ghostX % field == 0 && ghostY % field == 0 &&
                        (Main.level[(ghostY + field) / field][ghostX / field] == 1 ||
                                Main.level[(ghostY + field) / field][ghostX / field] == 0) &&
                        (Main.level[(ghostY - 1) / field][ghostX / field] == 1 ||
                                Main.level[(ghostY - 1) / field][ghostX / field] == 0) &&
                        (Main.level[ghostY / field][(ghostX - 1) / field] == 1 ||
                                Main.level[ghostY / field][(ghostX - 1) / field] == 0)) {
                    if (randThree == 0) {
                        dir = 0;
                    } else if (randThree == 1) {
                        dir = 2;
                    } else if (randThree == 2) {
                        dir = 3;
                    }
                } else if (ghostX % field == 0 && ghostY % field == 0 &&
                        (Main.level[(ghostY + field) / field][ghostX / field] == 1 ||
                                Main.level[(ghostY + field) / field][ghostX / field] == 0) &&
                        Main.level[(ghostY - 1) / field][ghostX / field] != 1 &&
                        Main.level[(ghostY - 1) / field][ghostX / field] != 0 &&
                        (Main.level[ghostY / field][(ghostX - 1) / field] == 1 ||
                                Main.level[ghostY / field][(ghostX - 1) / field] == 0)) {
                    if (randTwo == 0) {
                        dir = 3;
                    } else {
                        dir = 2;
                    }
                } else if (ghostX % field == 0 && ghostY % field == 0 &&
                        (Main.level[(ghostY + field) / field][ghostX / field] != 1 &&
                                Main.level[(ghostY + field) / field][ghostX / field] != 0) &&
                        (Main.level[(ghostY - 1) / field][ghostX / field] == 1 ||
                                Main.level[(ghostY - 1) / field][ghostX / field] == 0) &&
                        (Main.level[ghostY / field][(ghostX - 1) / field] == 1 ||
                                Main.level[ghostY / field][(ghostX - 1) / field] == 0)) {
                    if (randTwo == 1) {
                        dir = 3;
                    } else {
                        dir = 0;
                    }
                } else if (ghostX % field == 0 && ghostY % field == 0 &&
                        (Main.level[(ghostY + field) / field][ghostX / field] != 1 &&
                                Main.level[(ghostY + field) / field][ghostX / field] != 0) &&
                        (Main.level[(ghostY - 1) / field][ghostX / field] == 1 ||
                                Main.level[(ghostY - 1) / field][ghostX / field] == 0) &&
                        (Main.level[ghostY / field][(ghostX - 1) / field] != 1 &&
                                Main.level[ghostY / field][(ghostX - 1) / field] != 0)) {
                    dir = 0;
                } else if (ghostX % field == 0 && ghostY % field == 0 &&
                        (Main.level[(ghostY + field) / field][ghostX / field] == 1 ||
                                Main.level[(ghostY + field) / field][ghostX / field] == 0) &&
                        (Main.level[(ghostY - 1) / field][ghostX / field] != 1 &&
                                Main.level[(ghostY - 1) / field][ghostX / field] != 0) &&
                        (Main.level[ghostY / field][(ghostX - 1) / field] != 1 &&
                                Main.level[ghostY / field][(ghostX - 1) / field] != 0)) {
                    dir = 2;
                } else if (ghostX == 0) {
                    ghostX = 18 * field;
                }
            }
        }

    }
    public void moveBlueGhost() {
        int randThree = (int) (Math.random() * 3);
        int randTwo = (int) (Math.random() * 2);
        if (counter < 15) {
            ghostX -= direction;
            counter++;
        } else if (counter >= 15 && counter < 45) {
            ghostY -= direction;
            counter++;
        } else if (counter >= 45 && counter < 90) {
            ghostX += direction;
            counter++;
        } else if (counter >= 90 && counter < 90 + (6 * field)) {
            ghostY += direction;
            counter++;
        } else {
            if (dir == 1) {
                ghostX += direction;
                if (ghostX == 18 * field) {
                    ghostX = 0;
                }
                if (ghostX % field == 0 && ghostY % field == 0 &&
                        (Main.level[(ghostY + field) / field][ghostX / field] == 1 ||
                                Main.level[(ghostY + field) / field][ghostX / field] == 0) &&
                        (Main.level[(ghostY - 1) / field][ghostX / field] == 1 ||
                                Main.level[(ghostY - 1) / field][ghostX / field] == 0) &&
                        (Main.level[ghostY / field][(ghostX + field) / field] != 1 &&
                                Main.level[ghostY / field][(ghostX + field) / field] != 0)) {
                    if (randTwo == 0) {
                        dir = 2;
                    } else {
                        dir = 0;
                    }
                } else if (ghostX % field == 0 && ghostY % field == 0 &&
                        (Main.level[(ghostY + field) / field][ghostX / field] == 1 ||
                                Main.level[(ghostY + field) / field][ghostX / field] == 0) &&
                        (Main.level[(ghostY - 1) / field][ghostX / field] == 1 ||
                                Main.level[(ghostY - 1) / field][ghostX / field] == 0) &&
                        (Main.level[ghostY / field][(ghostX + field) / field] == 1 ||
                                Main.level[ghostY / field][(ghostX + field) / field] == 0)) {
                    if (randThree == 0) {
                        dir = 1;
                    } else if (randThree == 1) {
                        dir = 2;
                    } else if (randThree == 2) {
                        dir = 0;
                    }
                } else if (ghostX % field == 0 && ghostY % field == 0 &&
                        (Main.level[(ghostY + field) / field][ghostX / field] == 1 ||
                                Main.level[(ghostY + field) / field][ghostX / field] == 0) &&
                        Main.level[(ghostY - 1) / field][ghostX / field] != 1 &&
                        Main.level[(ghostY - 1) / field][ghostX / field] != 0 &&
                        (Main.level[ghostY / field][(ghostX + field) / field] == 1 ||
                                Main.level[ghostY / field][(ghostX + field) / field] == 0)) {
                    if (randTwo == 0) {
                        dir = 1;
                    } else {
                        dir = 2;
                    }
                } else if (ghostX % field == 0 && ghostY % field == 0 &&
                        (Main.level[(ghostY + field) / field][ghostX / field] != 1 &&
                                Main.level[(ghostY + field) / field][ghostX / field] != 0) &&
                        (Main.level[(ghostY - 1) / field][ghostX / field] == 1 ||
                                Main.level[(ghostY - 1) / field][ghostX / field] == 0) &&
                        (Main.level[ghostY / field][(ghostX + field) / field] == 1 ||
                                Main.level[ghostY / field][(ghostX + field) / field] == 0)) {
                    if (randTwo == 1) {
                        dir = 1;
                    } else {
                        dir = 0;
                    }
                } else if (ghostX % field == 0 && ghostY % field == 0 &&
                        (Main.level[(ghostY + field) / field][ghostX / field] != 1 &&
                                Main.level[(ghostY + field) / field][ghostX / field] != 0) &&
                        (Main.level[(ghostY - 1) / field][ghostX / field] == 1 ||
                                Main.level[(ghostY - 1) / field][ghostX / field] == 0) &&
                        (Main.level[ghostY / field][(ghostX + field) / field] != 1 &&
                                Main.level[ghostY / field][(ghostX + field) / field] != 0)) {
                    dir = 0;
                } else if (ghostX % field == 0 && ghostY % field == 0 &&
                        (Main.level[(ghostY + field) / field][ghostX / field] == 1 ||
                                Main.level[(ghostY + field) / field][ghostX / field] == 0) &&
                        (Main.level[(ghostY - 1) / field][ghostX / field] != 1 &&
                                Main.level[(ghostY - 1) / field][ghostX / field] != 0) &&
                        (Main.level[ghostY / field][(ghostX + field) / field] != 1 &&
                                Main.level[ghostY / field][(ghostX + field) / field] != 0)) {
                    dir = 2;
                }
            }
            if (dir == 0) {
                ghostY -= direction;
                if (ghostX % field == 0 && ghostY % field == 0 &&
                        (Main.level[(ghostY) / field][(ghostX - 1) / field] == 1 ||
                                Main.level[(ghostY) / field][(ghostX - 1) / field] == 0) &&
                        (Main.level[(ghostY - 1) / field][ghostX / field] == 1 ||
                                Main.level[(ghostY - 1) / field][ghostX / field] == 0) &&
                        (Main.level[ghostY / field][(ghostX + field) / field] != 1 &&
                                Main.level[ghostY / field][(ghostX + field) / field] != 0)) {
                    if (randTwo == 0) {
                        dir = 0;
                    } else {
                        dir = 3;
                    }
                } else if (ghostX % field == 0 && ghostY % field == 0 &&
                        (Main.level[(ghostY) / field][(ghostX - 1) / field] == 1 ||
                                Main.level[(ghostY) / field][(ghostX - 1) / field] == 0) &&
                        (Main.level[(ghostY - 1) / field][ghostX / field] == 1 ||
                                Main.level[(ghostY - 1) / field][ghostX / field] == 0) &&
                        (Main.level[ghostY / field][(ghostX + field) / field] == 1 ||
                                Main.level[ghostY / field][(ghostX + field) / field] == 0)) {
                    if (randThree == 0) {
                        dir = 1;
                    } else if (randThree == 1) {
                        dir = 0;
                    } else if (randThree == 2) {
                        dir = 3;
                    }
                } else if (ghostX % field == 0 && ghostY % field == 0 &&
                        (Main.level[(ghostY) / field][(ghostX - 1) / field] == 1 ||
                                Main.level[(ghostY) / field][(ghostX - 1) / field] == 0) &&
                        Main.level[(ghostY - 1) / field][ghostX / field] != 1 &&
                        Main.level[(ghostY - 1) / field][ghostX / field] != 0 &&
                        (Main.level[ghostY / field][(ghostX + field) / field] == 1 ||
                                Main.level[ghostY / field][(ghostX + field) / field] == 0)) {
                    if (randTwo == 0) {
                        dir = 1;
                    } else {
                        dir = 3;
                    }
                } else if (ghostX % field == 0 && ghostY % field == 0 &&
                        (Main.level[(ghostY) / field][(ghostX - 1) / field] != 1 &&
                                Main.level[(ghostY) / field][(ghostX - 1) / field] != 0) &&
                        (Main.level[(ghostY - 1) / field][ghostX / field] == 1 ||
                                Main.level[(ghostY - 1) / field][ghostX / field] == 0) &&
                        (Main.level[ghostY / field][(ghostX + field) / field] == 1 ||
                                Main.level[ghostY / field][(ghostX + field) / field] == 0)) {
                    if (randTwo == 1) {
                        dir = 1;
                    } else {
                        dir = 0;
                    }
                } else if (ghostX % field == 0 && ghostY % field == 0 &&
                        (Main.level[(ghostY) / field][(ghostX - 1) / field] != 1 &&
                                Main.level[(ghostY) / field][(ghostX - 1) / field] != 0) &&
                        (Main.level[(ghostY - 1) / field][ghostX / field] == 1 ||
                                Main.level[(ghostY - 1) / field][ghostX / field] == 0) &&
                        (Main.level[ghostY / field][(ghostX + field) / field] != 1 &&
                                Main.level[ghostY / field][(ghostX + field) / field] != 0)) {
                    dir = 0;
                } else if (ghostX % field == 0 && ghostY % field == 0 &&
                        (Main.level[(ghostY) / field][(ghostX - 1) / field] == 1 ||
                                Main.level[(ghostY) / field][(ghostX - 1) / field] == 0) &&
                        (Main.level[(ghostY - 1) / field][ghostX / field] != 1 &&
                                Main.level[(ghostY - 1) / field][ghostX / field] != 0) &&
                        (Main.level[ghostY / field][(ghostX + field) / field] != 1 &&
                                Main.level[ghostY / field][(ghostX + field) / field] != 0)) {
                    dir = 3;
                } else if (ghostX % field == 0 && ghostY % field == 0 &&
                        (Main.level[(ghostY) / field][(ghostX - 1) / field] != 1 &&
                                Main.level[(ghostY) / field][(ghostX - 1) / field] != 0) &&
                        (Main.level[(ghostY - 1) / field][ghostX / field] != 1 &&
                                Main.level[(ghostY - 1) / field][ghostX / field] != 0) &&
                        (Main.level[ghostY / field][(ghostX + field) / field] == 1 ||
                                Main.level[ghostY / field][(ghostX + field) / field] == 0)) {
                    dir = 1;
                }
            }
            if (dir == 2) {
                ghostY += direction;
                if (ghostX % field == 0 && ghostY % field == 0 &&
                        (Main.level[(ghostY + field) / field][ghostX / field] == 1 ||
                                Main.level[(ghostY + field) / field][ghostX / field] == 0) &&
                        (Main.level[(ghostY) / field][(ghostX - 1) / field] == 1 ||
                                Main.level[(ghostY) / field][(ghostX - 1) / field] == 0) &&
                        Main.level[ghostY / field][(ghostX + field) / field] != 1 &&
                        Main.level[ghostY / field][(ghostX + field) / field] != 0) {
                    if (randTwo == 0) {
                        dir = 2;
                    } else {
                        dir = 3;
                    }
                } else if (ghostX % field == 0 && ghostY % field == 0 &&
                        (Main.level[(ghostY + field) / field][ghostX / field] == 1 ||
                                Main.level[(ghostY + field) / field][ghostX / field] == 0) &&
                        (Main.level[(ghostY) / field][(ghostX - 1) / field] == 1 ||
                                Main.level[(ghostY) / field][(ghostX - 1) / field] == 0) &&
                        (Main.level[ghostY / field][(ghostX + field) / field] == 1 ||
                                Main.level[ghostY / field][(ghostX + field) / field] == 0)) {
                    if (randThree == 0) {
                        dir = 1;
                    } else if (randThree == 1) {
                        dir = 2;
                    } else if (randThree == 2) {
                        dir = 3;
                    }
                } else if (ghostX % field == 0 && ghostY % field == 0 &&
                        (Main.level[(ghostY + field) / field][ghostX / field] == 1 ||
                                Main.level[(ghostY + field) / field][ghostX / field] == 0) &&
                        Main.level[(ghostY) / field][(ghostX - 1) / field] != 1 &&
                        Main.level[(ghostY) / field][(ghostX - 1) / field] != 0 &&
                        (Main.level[ghostY / field][(ghostX + field) / field] == 1 ||
                                Main.level[ghostY / field][(ghostX + field) / field] == 0)) {
                    if (randTwo == 0) {
                        dir = 1;
                    } else {
                        dir = 2;
                    }
                } else if (ghostX % field == 0 && ghostY % field == 0 &&
                        (Main.level[(ghostY + field) / field][ghostX / field] != 1 &&
                                Main.level[(ghostY + field) / field][ghostX / field] != 0) &&
                        (Main.level[(ghostY) / field][(ghostX - 1) / field] == 1 ||
                                Main.level[(ghostY) / field][(ghostX - 1) / field] == 0) &&
                        (Main.level[ghostY / field][(ghostX + field) / field] == 1 ||
                                Main.level[ghostY / field][(ghostX + field) / field] == 0)) {
                    if (randTwo == 1) {
                        dir = 1;
                    } else {
                        dir = 3;
                    }
                } else if (ghostX % field == 0 && ghostY % field == 0 &&
                        (Main.level[(ghostY + field) / field][ghostX / field] != 1 &&
                                Main.level[(ghostY + field) / field][ghostX / field] != 0) &&
                        (Main.level[(ghostY) / field][(ghostX - 1) / field] == 1 ||
                                Main.level[(ghostY) / field][(ghostX - 1) / field] == 0) &&
                        (Main.level[ghostY / field][(ghostX + field) / field] != 1 &&
                                Main.level[ghostY / field][(ghostX + field) / field] != 0)) {
                    dir = 3;
                } else if (ghostX % field == 0 && ghostY % field == 0 &&
                        (Main.level[(ghostY + field) / field][ghostX / field] == 1 ||
                                Main.level[(ghostY + field) / field][ghostX / field] == 0) &&
                        (Main.level[(ghostY) / field][(ghostX - 1) / field] != 1 &&
                                Main.level[(ghostY) / field][(ghostX - 1) / field] != 0) &&
                        (Main.level[ghostY / field][(ghostX + field) / field] != 1 &&
                                Main.level[ghostY / field][(ghostX + field) / field] != 0)) {
                    dir = 2;
                } else if (ghostX % field == 0 && ghostY % field == 0 &&
                        (Main.level[(ghostY + field) / field][ghostX / field] != 1 &&
                                Main.level[(ghostY + field) / field][ghostX / field] != 0) &&
                        (Main.level[(ghostY) / field][(ghostX - 1) / field] != 1 &&
                                Main.level[(ghostY) / field][(ghostX - 1) / field] != 0) &&
                        (Main.level[ghostY / field][(ghostX + field) / field] == 1 ||
                                Main.level[ghostY / field][(ghostX + field) / field] == 0)) {
                    dir = 1;
                }
            }
            if (dir == 3) {
                ghostX -= direction;
                if (ghostX % field == 0 && ghostY % field == 0 &&
                        (Main.level[(ghostY + field) / field][ghostX / field] == 1 ||
                                Main.level[(ghostY + field) / field][ghostX / field] == 0) &&
                        (Main.level[(ghostY - 1) / field][ghostX / field] == 1 ||
                                Main.level[(ghostY - 1) / field][ghostX / field] == 0) &&
                        Main.level[ghostY / field][(ghostX - 1) / field] != 1 &&
                        Main.level[ghostY / field][(ghostX - 1) / field] != 0) {
                    if (randTwo == 0) {
                        dir = 2;
                    } else {
                        dir = 0;
                    }
                } else if (ghostX % field == 0 && ghostY % field == 0 &&
                        (Main.level[(ghostY + field) / field][ghostX / field] == 1 ||
                                Main.level[(ghostY + field) / field][ghostX / field] == 0) &&
                        (Main.level[(ghostY - 1) / field][ghostX / field] == 1 ||
                                Main.level[(ghostY - 1) / field][ghostX / field] == 0) &&
                        (Main.level[ghostY / field][(ghostX - 1) / field] == 1 ||
                                Main.level[ghostY / field][(ghostX - 1) / field] == 0)) {
                    if (randThree == 0) {
                        dir = 0;
                    } else if (randThree == 1) {
                        dir = 2;
                    } else if (randThree == 2) {
                        dir = 3;
                    }
                } else if (ghostX % field == 0 && ghostY % field == 0 &&
                        (Main.level[(ghostY + field) / field][ghostX / field] == 1 ||
                                Main.level[(ghostY + field) / field][ghostX / field] == 0) &&
                        Main.level[(ghostY - 1) / field][ghostX / field] != 1 &&
                        Main.level[(ghostY - 1) / field][ghostX / field] != 0 &&
                        (Main.level[ghostY / field][(ghostX - 1) / field] == 1 ||
                                Main.level[ghostY / field][(ghostX - 1) / field] == 0)) {
                    if (randTwo == 0) {
                        dir = 3;
                    } else {
                        dir = 2;
                    }
                } else if (ghostX % field == 0 && ghostY % field == 0 &&
                        (Main.level[(ghostY + field) / field][ghostX / field] != 1 &&
                                Main.level[(ghostY + field) / field][ghostX / field] != 0) &&
                        (Main.level[(ghostY - 1) / field][ghostX / field] == 1 ||
                                Main.level[(ghostY - 1) / field][ghostX / field] == 0) &&
                        (Main.level[ghostY / field][(ghostX - 1) / field] == 1 ||
                                Main.level[ghostY / field][(ghostX - 1) / field] == 0)) {
                    if (randTwo == 1) {
                        dir = 3;
                    } else {
                        dir = 0;
                    }
                } else if (ghostX % field == 0 && ghostY % field == 0 &&
                        (Main.level[(ghostY + field) / field][ghostX / field] != 1 &&
                                Main.level[(ghostY + field) / field][ghostX / field] != 0) &&
                        (Main.level[(ghostY - 1) / field][ghostX / field] == 1 ||
                                Main.level[(ghostY - 1) / field][ghostX / field] == 0) &&
                        (Main.level[ghostY / field][(ghostX - 1) / field] != 1 &&
                                Main.level[ghostY / field][(ghostX - 1) / field] != 0)) {
                    dir = 0;
                } else if (ghostX % field == 0 && ghostY % field == 0 &&
                        (Main.level[(ghostY + field) / field][ghostX / field] == 1 ||
                                Main.level[(ghostY + field) / field][ghostX / field] == 0) &&
                        (Main.level[(ghostY - 1) / field][ghostX / field] != 1 &&
                                Main.level[(ghostY - 1) / field][ghostX / field] != 0) &&
                        (Main.level[ghostY / field][(ghostX - 1) / field] != 1 &&
                                Main.level[ghostY / field][(ghostX - 1) / field] != 0)) {
                    dir = 2;
                } else if (ghostX == 0) {
                    ghostX = 18 * field;
                }
            }
        }
    }
    public void moveYellowGhost() {
        int randThree = (int) (Math.random() * 3);
        int randTwo = (int) (Math.random() * 2);
        if (counter < 30) {
            ghostY -= direction;
            counter++;
        } else if (counter >= 30 && counter < 75) {
            ghostX -= direction;
            counter++;
        } else if (counter >= 75 && counter < 75 + (6 * field)) {
            ghostY += direction;
            counter++;
        } else {
            if (dir == 1) {
                ghostX += direction;
                if (ghostX == 18 * field) {
                    ghostX = 0;
                }
                if (ghostX % field == 0 && ghostY % field == 0 &&
                        (Main.level[(ghostY + field) / field][ghostX / field] == 1 ||
                                Main.level[(ghostY + field) / field][ghostX / field] == 0) &&
                        (Main.level[(ghostY - 1) / field][ghostX / field] == 1 ||
                                Main.level[(ghostY - 1) / field][ghostX / field] == 0) &&
                        (Main.level[ghostY / field][(ghostX + field) / field] != 1 &&
                                Main.level[ghostY / field][(ghostX + field) / field] != 0)) {
                    if (randTwo == 0) {
                        dir = 2;
                    } else {
                        dir = 0;
                    }
                } else if (ghostX % field == 0 && ghostY % field == 0 &&
                        (Main.level[(ghostY + field) / field][ghostX / field] == 1 ||
                                Main.level[(ghostY + field) / field][ghostX / field] == 0) &&
                        (Main.level[(ghostY - 1) / field][ghostX / field] == 1 ||
                                Main.level[(ghostY - 1) / field][ghostX / field] == 0) &&
                        (Main.level[ghostY / field][(ghostX + field) / field] == 1 ||
                                Main.level[ghostY / field][(ghostX + field) / field] == 0)) {
                    if (randThree == 0) {
                        dir = 1;
                    } else if (randThree == 1) {
                        dir = 2;
                    } else if (randThree == 2) {
                        dir = 0;
                    }
                } else if (ghostX % field == 0 && ghostY % field == 0 &&
                        (Main.level[(ghostY + field) / field][ghostX / field] == 1 ||
                                Main.level[(ghostY + field) / field][ghostX / field] == 0) &&
                        Main.level[(ghostY - 1) / field][ghostX / field] != 1 &&
                        Main.level[(ghostY - 1) / field][ghostX / field] != 0 &&
                        (Main.level[ghostY / field][(ghostX + field) / field] == 1 ||
                                Main.level[ghostY / field][(ghostX + field) / field] == 0)) {
                    if (randTwo == 0) {
                        dir = 1;
                    } else {
                        dir = 2;
                    }
                } else if (ghostX % field == 0 && ghostY % field == 0 &&
                        (Main.level[(ghostY + field) / field][ghostX / field] != 1 &&
                                Main.level[(ghostY + field) / field][ghostX / field] != 0) &&
                        (Main.level[(ghostY - 1) / field][ghostX / field] == 1 ||
                                Main.level[(ghostY - 1) / field][ghostX / field] == 0) &&
                        (Main.level[ghostY / field][(ghostX + field) / field] == 1 ||
                                Main.level[ghostY / field][(ghostX + field) / field] == 0)) {
                    if (randTwo == 1) {
                        dir = 1;
                    } else {
                        dir = 0;
                    }
                } else if (ghostX % field == 0 && ghostY % field == 0 &&
                        (Main.level[(ghostY + field) / field][ghostX / field] != 1 &&
                                Main.level[(ghostY + field) / field][ghostX / field] != 0) &&
                        (Main.level[(ghostY - 1) / field][ghostX / field] == 1 ||
                                Main.level[(ghostY - 1) / field][ghostX / field] == 0) &&
                        (Main.level[ghostY / field][(ghostX + field) / field] != 1 &&
                                Main.level[ghostY / field][(ghostX + field) / field] != 0)) {
                    dir = 0;
                } else if (ghostX % field == 0 && ghostY % field == 0 &&
                        (Main.level[(ghostY + field) / field][ghostX / field] == 1 ||
                                Main.level[(ghostY + field) / field][ghostX / field] == 0) &&
                        (Main.level[(ghostY - 1) / field][ghostX / field] != 1 &&
                                Main.level[(ghostY - 1) / field][ghostX / field] != 0) &&
                        (Main.level[ghostY / field][(ghostX + field) / field] != 1 &&
                                Main.level[ghostY / field][(ghostX + field) / field] != 0)) {
                    dir = 2;
                }
            }
            if (dir == 0) {
                ghostY -= direction;
                if (ghostX % field == 0 && ghostY % field == 0 &&
                        (Main.level[(ghostY) / field][(ghostX - field) / field] == 1 ||
                                Main.level[(ghostY) / field][(ghostX - field) / field] == 0) &&
                        (Main.level[(ghostY - 1) / field][ghostX / field] == 1 ||
                                Main.level[(ghostY - 1) / field][ghostX / field] == 0) &&
                        (Main.level[ghostY / field][(ghostX + field) / field] != 1 &&
                                Main.level[ghostY / field][(ghostX + field) / field] != 0)) {
                    if (randTwo == 0) {
                        dir = 0;
                    } else {
                        dir = 3;
                    }
                } else if (ghostX % field == 0 && ghostY % field == 0 &&
                        (Main.level[(ghostY) / field][(ghostX - 1) / field] == 1 ||
                                Main.level[(ghostY) / field][(ghostX - 1) / field] == 0) &&
                        (Main.level[(ghostY - 1) / field][ghostX / field] == 1 ||
                                Main.level[(ghostY - 1) / field][ghostX / field] == 0) &&
                        (Main.level[ghostY / field][(ghostX + field) / field] == 1 ||
                                Main.level[ghostY / field][(ghostX + field) / field] == 0)) {
                    if (randThree == 0) {
                        dir = 1;
                    } else if (randThree == 1) {
                        dir = 0;
                    } else if (randThree == 2) {
                        dir = 3;
                    }
                } else if (ghostX % field == 0 && ghostY % field == 0 &&
                        (Main.level[(ghostY) / field][(ghostX - 1) / field] == 1 ||
                                Main.level[(ghostY) / field][(ghostX - 1) / field] == 0) &&
                        Main.level[(ghostY - 1) / field][ghostX / field] != 1 &&
                        Main.level[(ghostY - 1) / field][ghostX / field] != 0 &&
                        (Main.level[ghostY / field][(ghostX + field) / field] == 1 ||
                                Main.level[ghostY / field][(ghostX + field) / field] == 0)) {
                    if (randTwo == 0) {
                        dir = 1;
                    } else {
                        dir = 3;
                    }
                } else if (ghostX % field == 0 && ghostY % field == 0 &&
                        (Main.level[(ghostY) / field][(ghostX - 1) / field] != 1 &&
                                Main.level[(ghostY) / field][(ghostX - 1) / field] != 0) &&
                        (Main.level[(ghostY - 1) / field][ghostX / field] == 1 ||
                                Main.level[(ghostY - 1) / field][ghostX / field] == 0) &&
                        (Main.level[ghostY / field][(ghostX + field) / field] == 1 ||
                                Main.level[ghostY / field][(ghostX + field) / field] == 0)) {
                    if (randTwo == 1) {
                        dir = 1;
                    } else {
                        dir = 0;
                    }
                } else if (ghostX % field == 0 && ghostY % field == 0 &&
                        (Main.level[(ghostY) / field][(ghostX - 1) / field] != 1 &&
                                Main.level[(ghostY) / field][(ghostX - 1) / field] != 0) &&
                        (Main.level[(ghostY - 1) / field][ghostX / field] == 1 ||
                                Main.level[(ghostY - 1) / field][ghostX / field] == 0) &&
                        (Main.level[ghostY / field][(ghostX + field) / field] != 1 &&
                                Main.level[ghostY / field][(ghostX + field) / field] != 0)) {
                    dir = 0;
                } else if (ghostX % field == 0 && ghostY % field == 0 &&
                        (Main.level[(ghostY) / field][(ghostX - 1) / field] == 1 ||
                                Main.level[(ghostY) / field][(ghostX - 1) / field] == 0) &&
                        (Main.level[(ghostY - 1) / field][ghostX / field] != 1 &&
                                Main.level[(ghostY - 1) / field][ghostX / field] != 0) &&
                        (Main.level[ghostY / field][(ghostX + field) / field] != 1 &&
                                Main.level[ghostY / field][(ghostX + field) / field] != 0)) {
                    dir = 3;
                } else if (ghostX % field == 0 && ghostY % field == 0 &&
                        (Main.level[(ghostY) / field][(ghostX - 1) / field] != 1 &&
                                Main.level[(ghostY) / field][(ghostX - 1) / field] != 0) &&
                        (Main.level[(ghostY - 1) / field][ghostX / field] != 1 &&
                                Main.level[(ghostY - 1) / field][ghostX / field] != 0) &&
                        (Main.level[ghostY / field][(ghostX + field) / field] == 1 ||
                                Main.level[ghostY / field][(ghostX + field) / field] == 0)) {
                    dir = 1;
                }
            }
            if (dir == 2) {
                ghostY += direction;
                if (ghostX % field == 0 && ghostY % field == 0 &&
                        (Main.level[(ghostY + field) / field][ghostX / field] == 1 ||
                                Main.level[(ghostY + field) / field][ghostX / field] == 0) &&
                        (Main.level[(ghostY) / field][(ghostX - 1) / field] == 1 ||
                                Main.level[(ghostY) / field][(ghostX - 1) / field] == 0) &&
                        Main.level[ghostY / field][(ghostX + field) / field] != 1 &&
                        Main.level[ghostY / field][(ghostX + field) / field] != 0) {
                    if (randTwo == 0) {
                        dir = 2;
                    } else {
                        dir = 3;
                    }
                } else if (ghostX % field == 0 && ghostY % field == 0 &&
                        (Main.level[(ghostY + field) / field][ghostX / field] == 1 ||
                                Main.level[(ghostY + field) / field][ghostX / field] == 0) &&
                        (Main.level[(ghostY) / field][(ghostX - 1) / field] == 1 ||
                                Main.level[(ghostY) / field][(ghostX - 1) / field] == 0) &&
                        (Main.level[ghostY / field][(ghostX + field) / field] == 1 ||
                                Main.level[ghostY / field][(ghostX + field) / field] == 0)) {
                    if (randThree == 0) {
                        dir = 1;
                    } else if (randThree == 1) {
                        dir = 2;
                    } else if (randThree == 2) {
                        dir = 3;
                    }
                } else if (ghostX % field == 0 && ghostY % field == 0 &&
                        (Main.level[(ghostY + field) / field][ghostX / field] == 1 ||
                                Main.level[(ghostY + field) / field][ghostX / field] == 0) &&
                        Main.level[(ghostY) / field][(ghostX - 1) / field] != 1 &&
                        Main.level[(ghostY) / field][(ghostX - 1) / field] != 0 &&
                        (Main.level[ghostY / field][(ghostX + field) / field] == 1 ||
                                Main.level[ghostY / field][(ghostX + field) / field] == 0)) {
                    if (randTwo == 0) {
                        dir = 1;
                    } else {
                        dir = 2;
                    }
                } else if (ghostX % field == 0 && ghostY % field == 0 &&
                        (Main.level[(ghostY + field) / field][ghostX / field] != 1 &&
                                Main.level[(ghostY + field) / field][ghostX / field] != 0) &&
                        (Main.level[(ghostY) / field][(ghostX - 1) / field] == 1 ||
                                Main.level[(ghostY) / field][(ghostX - 1) / field] == 0) &&
                        (Main.level[ghostY / field][(ghostX + field) / field] == 1 ||
                                Main.level[ghostY / field][(ghostX + field) / field] == 0)) {
                    if (randTwo == 1) {
                        dir = 1;
                    } else {
                        dir = 3;
                    }
                } else if (ghostX % field == 0 && ghostY % field == 0 &&
                        (Main.level[(ghostY + field) / field][ghostX / field] != 1 &&
                                Main.level[(ghostY + field) / field][ghostX / field] != 0) &&
                        (Main.level[(ghostY) / field][(ghostX - 1) / field] == 1 ||
                                Main.level[(ghostY) / field][(ghostX - 1) / field] == 0) &&
                        (Main.level[ghostY / field][(ghostX + field) / field] != 1 &&
                                Main.level[ghostY / field][(ghostX + field) / field] != 0)) {
                    dir = 3;
                } else if (ghostX % field == 0 && ghostY % field == 0 &&
                        (Main.level[(ghostY + field) / field][ghostX / field] == 1 ||
                                Main.level[(ghostY + field) / field][ghostX / field] == 0) &&
                        (Main.level[(ghostY) / field][(ghostX - 1) / field] != 1 &&
                                Main.level[(ghostY) / field][(ghostX - 1) / field] != 0) &&
                        (Main.level[ghostY / field][(ghostX + field) / field] != 1 &&
                                Main.level[ghostY / field][(ghostX + field) / field] != 0)) {
                    dir = 2;
                } else if (ghostX % field == 0 && ghostY % field == 0 &&
                        (Main.level[(ghostY + field) / field][ghostX / field] != 1 &&
                                Main.level[(ghostY + field) / field][ghostX / field] != 0) &&
                        (Main.level[(ghostY) / field][(ghostX - 1) / field] != 1 &&
                                Main.level[(ghostY) / field][(ghostX - 1) / field] != 0) &&
                        (Main.level[ghostY / field][(ghostX + field) / field] == 1 ||
                                Main.level[ghostY / field][(ghostX + field) / field] == 0)) {
                    dir = 1;
                }
            }
            if (dir == 3) {
                ghostX -= direction;
                if (ghostX % field == 0 && ghostY % field == 0 &&
                        (Main.level[(ghostY + field) / field][ghostX / field] == 1 ||
                                Main.level[(ghostY + field) / field][ghostX / field] == 0) &&
                        (Main.level[(ghostY - 1) / field][ghostX / field] == 1 ||
                                Main.level[(ghostY - 1) / field][ghostX / field] == 0) &&
                        Main.level[ghostY / field][(ghostX - 1) / field] != 1 &&
                        Main.level[ghostY / field][(ghostX - 1) / field] != 0) {
                    if (randTwo == 0) {
                        dir = 2;
                    } else {
                        dir = 0;
                    }
                } else if (ghostX % field == 0 && ghostY % field == 0 &&
                        (Main.level[(ghostY + field) / field][ghostX / field] == 1 ||
                                Main.level[(ghostY + field) / field][ghostX / field] == 0) &&
                        (Main.level[(ghostY - 1) / field][ghostX / field] == 1 ||
                                Main.level[(ghostY - 1) / field][ghostX / field] == 0) &&
                        (Main.level[ghostY / field][(ghostX - 1) / field] == 1 ||
                                Main.level[ghostY / field][(ghostX - 1) / field] == 0)) {
                    if (randThree == 0) {
                        dir = 0;
                    } else if (randThree == 1) {
                        dir = 2;
                    } else if (randThree == 2) {
                        dir = 3;
                    }
                } else if (ghostX % field == 0 && ghostY % field == 0 &&
                        (Main.level[(ghostY + field) / field][ghostX / field] == 1 ||
                                Main.level[(ghostY + field) / field][ghostX / field] == 0) &&
                        Main.level[(ghostY - 1) / field][ghostX / field] != 1 &&
                        Main.level[(ghostY - 1) / field][ghostX / field] != 0 &&
                        (Main.level[ghostY / field][(ghostX - 1) / field] == 1 ||
                                Main.level[ghostY / field][(ghostX - 1) / field] == 0)) {
                    if (randTwo == 0) {
                        dir = 3;
                    } else {
                        dir = 2;
                    }
                } else if (ghostX % field == 0 && ghostY % field == 0 &&
                        (Main.level[(ghostY + field) / field][ghostX / field] != 1 &&
                                Main.level[(ghostY + field) / field][ghostX / field] != 0) &&
                        (Main.level[(ghostY - 1) / field][ghostX / field] == 1 ||
                                Main.level[(ghostY - 1) / field][ghostX / field] == 0) &&
                        (Main.level[ghostY / field][(ghostX - 1) / field] == 1 ||
                                Main.level[ghostY / field][(ghostX - 1) / field] == 0)) {
                    if (randTwo == 1) {
                        dir = 3;
                    } else {
                        dir = 0;
                    }
                } else if (ghostX % field == 0 && ghostY % field == 0 &&
                        (Main.level[(ghostY + field) / field][ghostX / field] != 1 &&
                                Main.level[(ghostY + field) / field][ghostX / field] != 0) &&
                        (Main.level[(ghostY - 1) / field][ghostX / field] == 1 ||
                                Main.level[(ghostY - 1) / field][ghostX / field] == 0) &&
                        (Main.level[ghostY / field][(ghostX - 1) / field] != 1 &&
                                Main.level[ghostY / field][(ghostX - 1) / field] != 0)) {
                    dir = 0;
                } else if (ghostX % field == 0 && ghostY % field == 0 &&
                        (Main.level[(ghostY + field) / field][ghostX / field] == 1 ||
                                Main.level[(ghostY + field) / field][ghostX / field] == 0) &&
                        (Main.level[(ghostY - 1) / field][ghostX / field] != 1 &&
                                Main.level[(ghostY - 1) / field][ghostX / field] != 0) &&
                        (Main.level[ghostY / field][(ghostX - 1) / field] != 1 &&
                                Main.level[ghostY / field][(ghostX - 1) / field] != 0)) {
                    dir = 2;
                } else if (ghostX == 0) {
                    ghostX = 18 * field;
                }
            }
        }
    }
}
