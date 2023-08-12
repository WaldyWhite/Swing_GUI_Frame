package swing1;

import javax.swing.*;

public class Frame extends JFrame {
    public Frame() {
        ImageIcon icon = new ImageIcon("D:\\Java Kurs\\Java_с_нуля_YouTube\\Lesson-Swing\\Swing\\src\\icons\\server-28522.png");
        setIconImage(icon.getImage());
        setTitle("User GUI");
        setSize(600, 400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
    }
}
