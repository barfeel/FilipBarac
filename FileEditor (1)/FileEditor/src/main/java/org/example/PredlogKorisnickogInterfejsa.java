package org.example;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class PredlogKorisnickogInterfejsa extends JDialog {
        private JPanel contentPane;
        private JButton buttonClose;

        private JButton buttonSaveNew;

        private JButton buttonOpenTop;

        private JButton buttonOpenBottom;

        private JButton buttonTopToNew;

        private JButton buttonBottomToNew;

        private JTextArea textAreaTop;
        private JTextArea textAreaBottom;
        private JTextArea textAreaNew;

        String directory;
        String selection;

    public PredlogKorisnickogInterfejsa() {
        setContentPane(contentPane);
        setModal(true);


        

        //    getRootPane().setDefaultButton(buttonOpen);
        buttonBottomToNew.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                onButtonBottomToNew();
            }
        });




        buttonTopToNew.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                onButtonTopToNew();
            }
        });




        buttonOpenBottom.addActionListener(new ActionListener() {
           public void actionPerformed(ActionEvent e) {
               onButtonOpenBottom();
           }
       });



        buttonOpenTop.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            onButtonOpenTop();
            }
        });

        buttonSaveNew.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                onButtonSaveNew();
            }
        });

        buttonClose.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                onButtonClose();
            }
        });
        



        // call onCancel() when cross is clicked
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                onButtonClose();
            }
        });
        setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);


    }

    private void onButtonBottomToNew() {
        selection = textAreaBottom.getSelectedText();
        textAreaNew.append(selection);
    }

    private void onButtonTopToNew() {
        selection = textAreaTop.getSelectedText();
        textAreaNew.append(selection);
    }

    private void onButtonOpenBottom() {FileDialog f = new FileDialog(this, "Open file", FileDialog.LOAD);
        f.setDirectory(directory);
        f.setVisible(true);
        directory = f.getDirectory();
        loadAndDisplayFile(directory, f.getFile(), textAreaBottom);
        f.dispose();
    };
    private void onButtonOpenTop() {
        FileDialog f = new FileDialog(this, "Open file", FileDialog.LOAD);
        f.setDirectory(directory);
        f.setVisible(true);
        directory = f.getDirectory();
        loadAndDisplayFile(directory, f.getFile(), textAreaTop);
        f.dispose();
    }

    private void loadAndDisplayFile(String directory, String file, JTextArea textAreaTop) {
    }

    private void setTextAreaNew(JTextArea textAreaNew) {
    }

    private void setTextAreaBottom(JTextArea textAreaBottom) {
    }

    private void setTextAreaTop(JTextArea textAreaTop) {
    }


    private void onButtonSaveNew() {
        FileDialog f = new FileDialog(this, "Open file", FileDialog.SAVE);
        f.setDirectory(directory);
        f.setVisible(true);
        directory = f.getDirectory();
        saveFile(directory, f.getFile());
        f.dispose();
    }

    private void saveFile(String directory, String file) {
    }


    private void onButtonClose() {
        // add your code here if necessary
        dispose();
    }





    public static void main(String[] args) {
        PredlogKorisnickogInterfejsa dialog = new PredlogKorisnickogInterfejsa();
        dialog.pack();
        dialog.setVisible(true);
        System.exit(0);
    }
}
