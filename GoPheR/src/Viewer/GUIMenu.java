package Viewer;

import javax.swing.*;
import java.awt.event.KeyEvent;

public class GUIMenu {
    private JMenuBar menuBar;
    private JMenu menu;

    public GUIMenu() {


    }

    private JMenu createMenu(String name){
        JMenu menu = new JMenu(name);
        menu.setMnemonic(KeyEvent.VK_A);
        menu.getAccessibleContext().setAccessibleDescription("The only menu");
        return menu;
    }

    private void addToMenuBar (JMenu menu){
        menuBar.add(menu);
    }
}
