package com.testspring.game;

import org.springframework.stereotype.Component;

@Component
public class PacmanGame implements GamingConsole {
    @Override
    public void up() {
        System.out.println("Pacman go up");
    }

    @Override
    public void down() {
        System.out.println("Pacman go down");
    }

    @Override
    public void left() {
        System.out.println("Pacman go left");
    }

    @Override
    public void right() {
        System.out.println("Pacman go right");
    }
}
