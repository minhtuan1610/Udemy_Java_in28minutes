package com.testspring.game;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary // A bean should be given preference when multiple candidates are qualified
public class MarioGame implements GamingConsole {
    @Override
    public void up() {
        System.out.println("Mario go up");
    }

    @Override
    public void down() {
        System.out.println("Mario go down");
    }

    @Override
    public void left() {
        System.out.println("Mario go left");
    }

    @Override
    public void right() {
        System.out.println("Mario go right");
    }
}
