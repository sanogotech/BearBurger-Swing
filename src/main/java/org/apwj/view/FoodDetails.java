/*
 * Created by JFormDesigner on Sun Jul 03 23:01:54 BDT 2022
 */

package org.apwj.view;

import com.formdev.flatlaf.intellijthemes.FlatOneDarkIJTheme;
import org.apwj.dao.foodDAO;
import org.apwj.domain.Food;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.GroupLayout;

import static org.apwj.view.LoginPanel.recoveryFrame;

/**
 * @author unknown
 */
public class FoodDetails {
    public FoodDetails(String selectedCategory,String selectedTitle) {
        initComponents();
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("application-context.xml");
        foodDAO foodDao = applicationContext.getBean("foodDao", foodDAO.class);
        Food food = foodDao.getFoodDetails(selectedCategory,selectedTitle);
        foodTitle.setText(food.getTitle());
        foodDetails.setText(food.getDescription());
        priceLabel.setText(String.valueOf(food.getPrice()));
        categoryLabel.setText(food.getCategory());
    }
    public FoodDetails(int foodId) {
        initComponents();
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("application-context.xml");
        foodDAO foodDao = applicationContext.getBean("foodDao", foodDAO.class);
        Food food = foodDao.getFoodDetails(foodId);
        foodTitle.setText(food.getTitle());
        foodDetails.setText(food.getDescription());
        priceLabel.setText(String.valueOf(food.getPrice()));
        categoryLabel.setText(food.getCategory());
    }
    public FoodDetails(){initComponents();}

    public static JFrame foodDetailsFrame = new JFrame(String.valueOf(FlatOneDarkIJTheme.setup()));

    private void close(ActionEvent e) {
        foodDetailsFrame.dispatchEvent(new WindowEvent(foodDetailsFrame, WindowEvent.WINDOW_CLOSING));
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        panel = new JPanel();
        foodTitle = new JLabel();
        scrollPane1 = new JScrollPane();
        foodDetails = new JTextPane();
        closeButton = new JButton();
        categoryLabel = new JLabel();
        priceLabel = new JLabel();

        //======== panel ========
        {

            //---- foodTitle ----
            foodTitle.setText("Food Name");
            foodTitle.setFont(new Font("Segoe UI", Font.BOLD, 45));
            foodTitle.setHorizontalAlignment(SwingConstants.CENTER);

            //======== scrollPane1 ========
            {

                //---- foodDetails ----
                foodDetails.setText("Prepared with beef patty, cheese, burger sauce, pickles & onion");
                foodDetails.setFont(new Font("Segoe UI", Font.PLAIN, 20));
                foodDetails.setBorder(null);
                foodDetails.setEditable(false);
                scrollPane1.setViewportView(foodDetails);
            }

            //---- closeButton ----
            closeButton.setText("Close");
            closeButton.setFont(new Font("Segoe UI", Font.BOLD, 20));
            closeButton.addActionListener(e -> close(e));

            //---- categoryLabel ----
            categoryLabel.setText("Category");

            //---- priceLabel ----
            priceLabel.setText("Price");

            GroupLayout panelLayout = new GroupLayout(panel);
            panel.setLayout(panelLayout);
            panelLayout.setHorizontalGroup(
                panelLayout.createParallelGroup()
                    .addGroup(GroupLayout.Alignment.TRAILING, panelLayout.createSequentialGroup()
                        .addComponent(foodTitle, GroupLayout.DEFAULT_SIZE, 352, Short.MAX_VALUE)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(categoryLabel)
                        .addGap(18, 18, 18)
                        .addComponent(priceLabel)
                        .addGap(20, 20, 20))
                    .addGroup(panelLayout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addComponent(scrollPane1, GroupLayout.PREFERRED_SIZE, 356, GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(57, Short.MAX_VALUE))
                    .addGroup(GroupLayout.Alignment.TRAILING, panelLayout.createSequentialGroup()
                        .addContainerGap(152, Short.MAX_VALUE)
                        .addComponent(closeButton, GroupLayout.PREFERRED_SIZE, 171, GroupLayout.PREFERRED_SIZE)
                        .addGap(147, 147, 147))
            );
            panelLayout.setVerticalGroup(
                panelLayout.createParallelGroup()
                    .addGroup(panelLayout.createSequentialGroup()
                        .addGap(0, 0, 0)
                        .addGroup(panelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(foodTitle)
                            .addComponent(categoryLabel)
                            .addComponent(priceLabel))
                        .addGap(18, 18, 18)
                        .addComponent(scrollPane1, GroupLayout.PREFERRED_SIZE, 147, GroupLayout.PREFERRED_SIZE)
                        .addGap(51, 51, 51)
                        .addComponent(closeButton, GroupLayout.PREFERRED_SIZE, 46, GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(72, Short.MAX_VALUE))
            );
        }
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    public JPanel panel;
    private JLabel foodTitle;
    private JScrollPane scrollPane1;
    private JTextPane foodDetails;
    private JButton closeButton;
    private JLabel categoryLabel;
    private JLabel priceLabel;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
