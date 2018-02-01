package Viewer;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;

public class GUIBase {
    private JFrame frame;
    private final String applicationName = "GoPheR";
    private JMenuBar menuBar;
    private JMenu menu;

    public GUIBase() {

        createFrame();
        menuBar = new JMenuBar();

        frame.setVisible(true);
    }

    private void createFrame(){
        frame = new JFrame(applicationName);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400,400);

    }


}
