package Viewer;

import javax.swing.*;
import java.awt.event.KeyEvent;

public class GUIMenu {
    private JMenuBar menuBar;
    private JMenu menu;

    public GUIMenu() {
        menuBar = new JMenuBar();
        addToMenuBar("File");
        addToMenuBar("Settings");
    }


    private void addToMenuBar (String name){
        menuBar.add(new JMenu(name));
    }

    public void addMenu (JFrame frame){
        frame.add(this.menuBar);
    }

    public void addMenu (JPanel panel){
        panel.add(menuBar);
    }
}
