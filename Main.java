import javax.swing.*;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;


public class Main {

    public static void main(String[] args) {
        JFrame frame = new JFrame("Scores Academy");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // menu stuff
        JMenuBar menuBar;
        JMenu menu, submenu;
        JMenuItem menuItem, menuItem1;

        menuBar = new JMenuBar();

        menu = new JMenu("Options");
        menu.setMnemonic(KeyEvent.VK_A);
        menu.getAccessibleContext().setAccessibleDescription("Go here!");
        menuBar.add(menu);

        menuItem = new JMenuItem("Add/remove student", KeyEvent.VK_T);
        menuItem.setAccelerator(KeyStroke.getKeyStroke
                (KeyEvent.VK_1, ActionEvent.SHIFT_MASK));

        submenu = new JMenu("Current roster");
        submenu.setMnemonic(KeyEvent.VK_S);

        menuItem = new JMenuItem("Attendance");
        menuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_2,
                ActionEvent.ALT_MASK));
        submenu.add(menuItem);

        menuItem = new JMenuItem("Input Scores");
        menuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_2,
                ActionEvent.ALT_MASK));
        submenu.add(menuItem);


    }
}

        // bring up display with following tabs:

        // add/remove student. displays roster, click name to remove. text box to type in to add

        // current roster
            // attendance, which brings up a list of names.
            // clicking the box next to the name indicates present

            // input scores, which brings up a dialogue box with a student
            // and a table of scores you can tab through
            // upon pressing enter this box closes; overall program window prints result
            // next student shows up

            // clicking a name in the current roster will bring to notes, info, pins

            // trends displays graphs of overall class scores, individual student trends


