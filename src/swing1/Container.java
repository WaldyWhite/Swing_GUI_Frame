package swing1;

import javax.swing.*;

public class Container extends JFrame{
    public Container (){
        Container pane = (Container) getContentPane();
        GroupLayout gl = new GroupLayout(pane);
        pane.setLayout(gl);
    }

}
