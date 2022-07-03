/*
 * Created by JFormDesigner on Sat Jul 02 12:10:34 BDT 2022
 */

package org.apwj.view;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.GroupLayout;

import static org.apwj.App.mainFrame;

public class RegistrationPanel extends JPanel {
    public RegistrationPanel() {
        initComponents();
    }

    private void registerMouseClicked(MouseEvent e) {

    }

    private void loginLabelMouseClicked(MouseEvent e) {
        LoginPanel loginPanel = new LoginPanel();
        mainFrame.setContentPane(loginPanel.panel);
        mainFrame.pack();
        mainFrame.setVisible(true);
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        panel = new JPanel();
        label1 = new JLabel();
        label2 = new JLabel();
        textField1 = new JTextField();
        label3 = new JLabel();
        passwordField1 = new JPasswordField();
        registerButton = new JButton();
        label5 = new JLabel();
        loginLabel = new JLabel();
        label4 = new JLabel();
        label6 = new JLabel();
        label7 = new JLabel();
        textField2 = new JTextField();
        passwordField2 = new JPasswordField();
        radioButton1 = new JRadioButton();
        radioButton2 = new JRadioButton();
        radioButton3 = new JRadioButton();
        label8 = new JLabel();

        //======== panel ========
        {
            panel.setMaximumSize(new Dimension(1025, 575));
            panel.setPreferredSize(new Dimension(1025, 575));
            panel.setMinimumSize(new Dimension(1025, 575));

            //---- label1 ----
            label1.setText("Create an Account");
            label1.setFont(new Font("Segoe UI", Font.BOLD, 45));

            //---- label2 ----
            label2.setText("Username");
            label2.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 20));

            //---- textField1 ----
            textField1.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 20));

            //---- label3 ----
            label3.setText("Password");
            label3.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 20));

            //---- passwordField1 ----
            passwordField1.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 20));

            //---- registerButton ----
            registerButton.setText("Register");
            registerButton.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 17));
            registerButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));

            //---- label5 ----
            label5.setText("Already have an account?");
            label5.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 15));

            //---- loginLabel ----
            loginLabel.setText("Login");
            loginLabel.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 15));
            loginLabel.setForeground(new Color(56, 117, 237));
            loginLabel.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
            loginLabel.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    registerMouseClicked(e);
                    loginLabelMouseClicked(e);
                }
            });

            //---- label4 ----
            label4.setText("Email");
            label4.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 20));

            //---- label6 ----
            label6.setText("Confirm Password");
            label6.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 20));

            //---- label7 ----
            label7.setText("Gender");
            label7.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 20));

            //---- textField2 ----
            textField2.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 20));

            //---- passwordField2 ----
            passwordField2.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 20));

            //---- radioButton1 ----
            radioButton1.setText("Male");
            radioButton1.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 20));

            //---- radioButton2 ----
            radioButton2.setText("Female");
            radioButton2.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 20));

            //---- radioButton3 ----
            radioButton3.setText("Other");
            radioButton3.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 20));

            //---- label8 ----
            label8.setIcon(new ImageIcon("src/main/java/org/apwj/view/resources/logo-2.png"));

            GroupLayout panelLayout = new GroupLayout(panel);
            panel.setLayout(panelLayout);
            panelLayout.setHorizontalGroup(
                panelLayout.createParallelGroup()
                    .addGroup(GroupLayout.Alignment.TRAILING, panelLayout.createSequentialGroup()
                        .addContainerGap(93, Short.MAX_VALUE)
                        .addComponent(label8, GroupLayout.PREFERRED_SIZE, 393, GroupLayout.PREFERRED_SIZE)
                        .addGap(38, 38, 38)
                        .addGroup(panelLayout.createParallelGroup()
                            .addGroup(panelLayout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addGroup(panelLayout.createParallelGroup()
                                    .addComponent(label2)
                                    .addComponent(label4)
                                    .addComponent(label3)))
                            .addGroup(panelLayout.createSequentialGroup()
                                .addGroup(panelLayout.createParallelGroup()
                                    .addGroup(panelLayout.createSequentialGroup()
                                        .addComponent(label7)
                                        .addGap(83, 83, 83))
                                    .addComponent(label6, GroupLayout.Alignment.TRAILING))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(panelLayout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                    .addGroup(panelLayout.createSequentialGroup()
                                        .addComponent(radioButton1)
                                        .addGap(12, 12, 12)
                                        .addComponent(radioButton2)
                                        .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(radioButton3))
                                    .addComponent(passwordField2)
                                    .addComponent(passwordField1)
                                    .addComponent(textField2)
                                    .addComponent(textField1, GroupLayout.PREFERRED_SIZE, 254, GroupLayout.PREFERRED_SIZE)))
                            .addComponent(registerButton, GroupLayout.PREFERRED_SIZE, 431, GroupLayout.PREFERRED_SIZE)
                            .addGroup(GroupLayout.Alignment.TRAILING, panelLayout.createSequentialGroup()
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 22, GroupLayout.PREFERRED_SIZE)
                                .addGroup(panelLayout.createParallelGroup()
                                    .addGroup(GroupLayout.Alignment.TRAILING, panelLayout.createSequentialGroup()
                                        .addComponent(label5)
                                        .addGap(6, 6, 6)
                                        .addComponent(loginLabel)
                                        .addGap(95, 95, 95))
                                    .addGroup(GroupLayout.Alignment.TRAILING, panelLayout.createSequentialGroup()
                                        .addComponent(label1)
                                        .addGap(22, 22, 22)))))
                        .addGap(70, 70, 70))
            );
            panelLayout.setVerticalGroup(
                panelLayout.createParallelGroup()
                    .addGroup(panelLayout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addComponent(label1)
                        .addGap(18, 18, Short.MAX_VALUE)
                        .addGroup(panelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(label2)
                            .addComponent(textField1, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE))
                        .addGap(6, 6, 6)
                        .addGroup(panelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(label4)
                            .addComponent(textField2, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(label3)
                            .addComponent(passwordField1, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(label6)
                            .addComponent(passwordField2, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(label7)
                            .addComponent(radioButton3)
                            .addComponent(radioButton1)
                            .addComponent(radioButton2))
                        .addGap(34, 34, 34)
                        .addComponent(registerButton, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelLayout.createParallelGroup()
                            .addComponent(label5)
                            .addComponent(loginLabel))
                        .addGap(112, 112, 112))
                    .addGroup(panelLayout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(label8, GroupLayout.PREFERRED_SIZE, 507, GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            );
        }
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    public JPanel panel;
    private JLabel label1;
    private JLabel label2;
    private JTextField textField1;
    private JLabel label3;
    private JPasswordField passwordField1;
    private JButton registerButton;
    private JLabel label5;
    private JLabel loginLabel;
    private JLabel label4;
    private JLabel label6;
    private JLabel label7;
    private JTextField textField2;
    private JPasswordField passwordField2;
    private JRadioButton radioButton1;
    private JRadioButton radioButton2;
    private JRadioButton radioButton3;
    private JLabel label8;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
