package Controller;

import Viewer.GUIBase;
import Model.Model;

import java.awt.event.ActionEvent;

public class Controller implements java.awt.event.ActionListener{

    GUIBase guiBase;
    Model model;

    public Controller(GUIBase guiBase, Model model) {
        this.guiBase = guiBase;
        this.model = model;
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }

}
