package swing1;

import java.awt.*;

public class Run {
    public static void main (String[] args) {
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                Frame frame = new Frame();
                frame.setVisible(true);
            }
        });
    }
}
