package view;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ConsulterCompte implements ActionListener {


    private JPanel rootPanel;
    private JMenu JMenu1;
    private JMenu JMenu2;
    private JMenuItem Item11;
    private JMenuItem Item21;
    private JMenuItem Item22;
    private JLabel lnum;
    private JTextField textField1;
    private JButton bValid;
    private JButton button1;
    JMenuBar mb = new JMenuBar();

    public ConsulterCompte() {
        button1.disable();
    }

    public static void main(String[] args) {
        ConsulterCompte c = new ConsulterCompte();
    }

    public void actionPerformed(ActionEvent e) {

    }


}
