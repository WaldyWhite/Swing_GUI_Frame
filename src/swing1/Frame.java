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
        JMenu urls = new JMenu("Urls");
        JMenuItem gitHub = new JMenuItem("SkilFactory");
        gitHub.addActionListener(new ActionListener() {
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

        menu.add(urls);
        urls.add(gitHub);
        setJMenuBar(menu);
    }
}
