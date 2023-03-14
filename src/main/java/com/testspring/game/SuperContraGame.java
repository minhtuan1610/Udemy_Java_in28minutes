package com.testspring.game;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("SuperContraGameQualifier") // A specific bean should be auto-wired
public class SuperContraGame implements GamingConsole {
    @Override
    public void up() {
        System.out.println("Super contra go up");
    }

    @Override
    public void down() {
        System.out.println("Super contra go down");
    }

    @Override
    public void left() {
        System.out.println("Super contra go left");
    }

    @Override
    public void right() {
        System.out.println("Super contra go right");
    }
}
