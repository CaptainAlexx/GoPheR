package Viewer;

import javax.swing.*;
import java.awt.*;

public class GUIBase {
    private JFrame frame;
    private final String applicationName = "GoPheR";
    private JPanel menuPanel;
    private JPanel tabbedPanel;


    public GUIBase() {

        createFrame();
        createPanels();

        new GUIMenu().addMenu(this.menuPanel);
        frame.setVisible(true);
    }

    private void createFrame(){
        frame = new JFrame(applicationName);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400,400);
        frame.setLocation(300,100);

    }

    private void createPanels(){
        menuPanel = new JPanel(new BorderLayout());
        menuPanel.setSize(400,20);
        tabbedPanel = new JPanel(new BorderLayout());
        tabbedPanel.setSize(400,300);
        tabbedPanel.setBackground(Color.BLACK);
        frame.add(menuPanel);
        frame.add(tabbedPanel);

    }


}
