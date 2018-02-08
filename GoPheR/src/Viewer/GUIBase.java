package Viewer;

import javax.swing.*;

import java.awt.*;
import java.awt.event.KeyEvent;

public class GUIBase {
    private JFrame frame;
    private final String applicationName = "GoPheR";
    private final int PROGRAM_WIDTH = 600;
    private final int PROGRAM_HEIGHT = 300;
    private GridBagConstraints c;
    private Container contentPane;

    private JMenu menu;
    private JMenuBar menuBar;

    private JTabbedPane tabbedPane;

    public GUIBase() {

        frame = new JFrame();
        frame.setMinimumSize(new Dimension(PROGRAM_WIDTH, PROGRAM_HEIGHT));
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setLayout(new GridBagLayout());
        contentPane = frame.getContentPane();
        addMenu();
        addContentToPane(contentPane);

        frame.setVisible(true);
    }

    private void addContentToPane(Container pane) {
        c = new GridBagConstraints();
        tabbedPane = new JTabbedPane();

        c.fill = GridBagConstraints.HORIZONTAL;
        c.weightx = 0.5;
        c.weighty = 0.5;
        c.gridx = 0;
        c.gridy = 0;
        addToTabbedPane(tabbedPane);
        pane.add(tabbedPane, c);

        c.fill = GridBagConstraints.HORIZONTAL;
        c.weightx = 0.5;
        c.weighty = 0.5;
        c.gridx = 0;
        c.gridy = 1;

        JPanel settingsPanel = new JPanel();
        settingsPanel.setLayout(new FlowLayout());
        addToSettings(settingsPanel);
        pane.add(settingsPanel, c);

        c.fill = GridBagConstraints.HORIZONTAL;
        c.weightx = 0.5;
        c.weighty = 0.5;
        c.gridx = 0;
        c.gridy = 2;

        JPanel runPanel = new JPanel();
        runPanel.setBorder(BorderFactory.createLineBorder(Color.DARK_GRAY));
        pane.add(runPanel, c);
        runPanel.setLayout(new GridBagLayout());
        addToRunPanel(runPanel);

    }

    private void addToRunPanel(JPanel pane) {
        GridBagConstraints c = new GridBagConstraints();
        c.fill = GridBagConstraints.HORIZONTAL;
        c.weightx = 0.5;
        c.weighty = 0.5;
        c.gridx = 0;
        c.gridy = 0;
        c.gridwidth = 1;
        JButton runButton = new JButton("Run");
        pane.add(runButton,c);

        JTextField status = new JTextField(30);
        status.setText("Select an export folder to start");
        status.setEditable(false);
        c.gridx=1;
        c.gridwidth = 3;
        pane.add(status,c);

        JProgressBar progressBar = new JProgressBar(0,100);
        c.gridx = 4;
        c.gridwidth=5;
        pane.add(progressBar,c);
    }


    /*
    add the panels for each type spreadsheet.
     */
    private void addToTabbedPane(JTabbedPane pane) {
        JComponent defectPanel = makeTextPanel("Defects");
        pane.add(defectPanel);
        pane.setMnemonicAt(0, KeyEvent.VK_1);

        JComponent layerDepths = makeTextPanel("Layer Depths");
        pane.add(layerDepths);
        pane.setMnemonicAt(1, KeyEvent.VK_2);
    }

    private JComponent makeTextPanel(String text) {
        JPanel panel = new JPanel();
        panel.setName(text);
        JLabel filler = new JLabel(text);
        panel.setLayout(new GridLayout(1, 1));
        panel.add(filler);
        return panel;
    }

    private JComponent makeDefectPanel(){
        return null;
    }

    private JComponent makeLayerPanel(){
        return null;
    }

    private JComponent makeLaserPanel(){
        return null;
    }

    private void addToSettings(JPanel panel) {
        panel.setLayout(new GridBagLayout());
        GridBagConstraints c = new GridBagConstraints();
        panel.setBorder(BorderFactory.createLineBorder(Color.DARK_GRAY));
        c.fill = GridBagConstraints.HORIZONTAL;
        c.ipady = 0;
        c.ipadx = 0;
        c.weightx = 0.5;
        c.weighty = 0.5;
        c.gridx = 0;
        c.gridy = 0;
        JLabel label1 = new JLabel("Folder Select:");
        panel.add(label1, c);

        c.fill = GridBagConstraints.HORIZONTAL;
        c.weightx = 0.5;
        c.weighty = 0.5;
        c.gridx = 1;
        c.gridy = 0;
        c.gridwidth = 3;
        JTextField selectText = new JTextField(30);
        panel.add(selectText, c);

        c.fill = GridBagConstraints.HORIZONTAL;
        c.weightx = 0.5;
        c.weighty = 0.5;
        c.gridx = 4;
        c.gridy = 0;
        c.gridwidth = 1;
        JButton selectButton = new JButton("...");
        selectButton.setSize(50, 30);
        panel.add(selectButton, c);


        c.fill = GridBagConstraints.HORIZONTAL;
        c.weightx = 0.5;
        c.weighty = 0.5;
        c.gridx = 0;
        c.gridy = 1;
        JLabel label2 = new JLabel("Save Location:");
        panel.add(label2, c);


        c.fill = GridBagConstraints.HORIZONTAL;
        c.weightx = 0.5;
        c.weighty = 0.5;
        c.gridx = 1;
        c.gridy = 1;
        c.gridwidth = 3;
        JTextField saveText = new JTextField(30);
        panel.add(saveText, c);

        c.fill = GridBagConstraints.HORIZONTAL;
        c.weightx = 0.5;
        c.weighty = 0.5;
        c.gridx = 4;
        c.gridy = 1;
        c.gridwidth = 1;
        JButton saveButton = new JButton("...");
        saveButton.setSize(50, 30);
        panel.add(saveButton, c);

        addCheckBoxes(panel, c);

    }

    private void addCheckBoxes(JPanel panel, GridBagConstraints c) {
        c.fill = GridBagConstraints.HORIZONTAL;
        c.weightx = 0.5;
        c.weighty = 0.5;
        c.gridx = 0;
        c.gridy = 2;

        JLabel label = new JLabel("Include:");
        panel.add(label, c);

        JCheckBox defectTagsCheck = new JCheckBox("Defect Tags");
        c.gridx = 1;
        c.gridy = 2;
        panel.add(defectTagsCheck, c);

        JCheckBox layerDepthsCheck = new JCheckBox("Layer Depths");
        c.gridx = 2;
        c.gridy = 2;
        panel.add(layerDepthsCheck, c);

        JCheckBox laserStatsCheck = new JCheckBox("Laser Stats");
        c.gridx = 3;
        c.gridy = 2;
        panel.add(laserStatsCheck,c);
    }

    private void addMenu() {
        menuBar = new JMenuBar();
        menu = new JMenu("File");
        menu.setMnemonic(KeyEvent.VK_A);
        menu.getAccessibleContext().setAccessibleDescription("item");
        menuBar.add(menu);
        frame.setJMenuBar(menuBar);
    }

}
