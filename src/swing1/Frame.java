package swing1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.net.URL;

public class Frame extends JFrame {
    public Frame() {
        ImageIcon icon = new ImageIcon("D:\\Java Kurs\\Java_с_нуля_YouTube\\Lesson-Swing\\Swing\\src\\icons\\server-28522.png");
        setIconImage(icon.getImage());
        setTitle("User GUI");
        setSize(600, 400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // Layout
        Container pane = (Container) getContentPane();
        GroupLayout gl = new GroupLayout(pane);
        pane.setLayout(gl);

        // new Button
        Button button = new Button();
        gl.setVerticalGroup(gl.createSequentialGroup().addComponent(button));
        gl.setHorizontalGroup(gl.createSequentialGroup().addComponent(button));
        gl.setAutoCreateContainerGaps(true);

        //Menu
        JMenuBar menu = new JMenuBar();
        JMenu datei = new JMenu("Datei");
        JMenu submenu  = new JMenu("Urls");

        JMenuItem skilFactory = new JMenuItem("SkilFactory");
        skilFactory.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Desktop desktop = Desktop.getDesktop();
                URL url = null;
                try {
                    url = new URL("https://apps.skillfactory.ru/learning/dashboard");
                } catch (MalformedURLException ex) {
                    throw new RuntimeException(ex);
                }
                try {
                    desktop.browse(url.toURI());
                } catch (IOException ex) {
                    throw new RuntimeException(ex);
                } catch (URISyntaxException ex) {
                    throw new RuntimeException(ex);
                }
            }
        });
        JMenuItem gitHub = new JMenuItem("GitHub");
        gitHub.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Desktop desktop = Desktop.getDesktop();
                URL url = null;
                try {
                    url = new URL("https://github.com/WaldyWhite/");
                } catch (MalformedURLException ex) {
                    throw new RuntimeException(ex);
                }
                try {
                    desktop.browse(url.toURI());
                } catch (IOException ex) {
                    throw new RuntimeException(ex);
                } catch (URISyntaxException ex) {
                    throw new RuntimeException(ex);
                }
            }
        });

        submenu.add(skilFactory);
        submenu.addSeparator();
        submenu.add(gitHub);
        menu.add(datei);
        datei.add(submenu);
        setJMenuBar(menu);
    }
}
