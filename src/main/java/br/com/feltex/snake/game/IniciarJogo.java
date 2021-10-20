package br.com.feltex.snake.game;

import javax.swing.*;

public class IniciarJogo extends JFrame {

    public static void main(String[] args) {
        new IniciarJogo();
    }

    IniciarJogo() {
        add(new TelaJogo());
        setTitle("Jogo da Cobrinha - Snake game");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);
        pack();
        setVisible(true);
        setLocationRelativeTo(null);
    }
}
