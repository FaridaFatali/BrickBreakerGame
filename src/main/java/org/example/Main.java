package org.example;

import javax.swing.*;

/**
 * Practice: <a href="https://www.youtube.com/watch?v=K9qMm3JbOH0&list=PLwiuaDJVNC9Cmiw-i9pO668GII1FNuoUP&index=6">...</a>
 * @author Farida Fatali
 * Creating Brick Breaker Game (click left or right to start)
 */

public class Main {
    public static void main(String[] args) {
        JFrame obj = new JFrame();
        GamePlay gamePlay = new GamePlay();
        obj.setBounds(10, 10, 700, 600);
        obj.setTitle("Breakout Ball");
        obj.setResizable(false);
        obj.setVisible(true);
        obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        obj.add(gamePlay);
    }
}