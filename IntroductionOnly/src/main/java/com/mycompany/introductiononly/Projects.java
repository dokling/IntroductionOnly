/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.introductiononly;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.awt.event.ActionListener;
import static java.awt.Color.*;

/**
 *
 * @author carre
 */

public class Projects extends JFrame {
    
    private JPanel contentPane;
    private JLabel header, blackBground, whiteBground, title, pBarTitle,pBarImage1, pBarImage2, pBarImage3, back, uploadTitle,uploadImage2,uploadImage3, uploadImage1;
    private ImageIcon pbar1, pbar2, pbar3, upload1, upload2, upload3, headerBackground, bodyBackground, titleBackground;
        public Projects(){

        setTitle("Profile");
        Dimension preferredSize = new Dimension(700, 750);
        setPreferredSize(preferredSize);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        JLayeredPane layeredPane = new JLayeredPane();
        getContentPane().add(layeredPane);
        
        contentPane = new JPanel();
        contentPane.setLayout(null);
        contentPane.setVisible(true);
        layeredPane.add(contentPane, new Integer(0)); 
        
        headerBackground = new ImageIcon(Projects.class.getResource("header.PNG"));
        
        header = new JLabel(headerBackground);
        header.setSize(700,30);
        header.setLocation(0,0);
        layeredPane.add(header, new Integer(1));
        
        bodyBackground = new ImageIcon(Projects.class.getResource("black.PNG"));
        
        blackBground = new JLabel(bodyBackground);
        blackBground.setSize(700,800);
        blackBground.setLocation(1,100);
        layeredPane.add(blackBground, new Integer(1));
        
        titleBackground = new ImageIcon(Projects.class.getResource("geometric.PNG"));
        
        whiteBground = new JLabel(titleBackground);
        whiteBground.setSize(700,70);
        whiteBground.setLocation(-6,30);
        layeredPane.add(whiteBground, new Integer(2));
        
        title = new JLabel("<html><u>PROJECTS</u></html>");
        title.setSize(200,25);
        title.setLocation(255,110);
        title.setForeground(WHITE);
        layeredPane.add(title, new Integer(3));
        
        Font titleFont = new Font("Times New Roman", Font.BOLD, 30);
        title.setFont(titleFont);

        back = new JLabel("<html><u>Back</u></html>");
        back.setSize(60,30);
        back.setLocation(310,1);
        back.setForeground(WHITE);
        
        
        back.addMouseListener(new MouseAdapter() {
            @Override
             public void mouseEntered(MouseEvent e) {
                back.setForeground(Color.GRAY); // Change background color on hover
            }

            @Override
            public void mouseExited(MouseEvent e) {
                back.setForeground(Color.WHITE); // Reset background color when mouse exits
            }
            public void mouseClicked(MouseEvent e) {
                 dispose();
                 SwingUtilities.invokeLater(Home::new);
             }
        });
        Font headerFont = new Font("Times New Roman", Font.PLAIN, 15);
        
        back.setFont(headerFont);
        layeredPane.add(back, new Integer(4));
        
        upload1 = new ImageIcon(Projects.class.getResource("uploader1.PNG"));
        upload2 = new ImageIcon(Projects.class.getResource("uploader2.PNG"));
        upload3 = new ImageIcon(Projects.class.getResource("uploader3.PNG"));
        
        uploadImage1 = new JLabel(upload1);
        uploadImage1.setSize(200,200);
        uploadImage1.setLocation(20,160);
        layeredPane.add(uploadImage1, new Integer(3));
        
        uploadImage2 = new JLabel(upload2);
        uploadImage2.setSize(200,200);
        uploadImage2.setLocation(240,160);
        layeredPane.add(uploadImage2, new Integer(3));
        
        uploadImage3 = new JLabel(upload3);
        uploadImage3.setSize(200,200);
        uploadImage3.setLocation(460,160);
        layeredPane.add(uploadImage3, new Integer(3));
        
        uploadTitle = new JLabel("UPLOADER");
        uploadTitle.setSize(120,40);
        uploadTitle.setLocation(20,120);
        uploadTitle.setForeground(WHITE);
        layeredPane.add(uploadTitle, new Integer(3));        
        
        pbar1 = new ImageIcon(Projects.class.getResource("pbar1.PNG"));
        pbar2 = new ImageIcon(Projects.class.getResource("pbar2.PNG"));
        pbar3 = new ImageIcon(Projects.class.getResource("pbar3.PNG"));        
        pBarImage1 = new JLabel(pbar1);
        pBarImage1.setSize(250,200);
        pBarImage1.setLocation(40,400);
        layeredPane.add(pBarImage1, new Integer(3));
        
        pBarImage2 = new JLabel(pbar2);
        pBarImage2.setSize(239,200);
        pBarImage2.setLocation(220,470);
        layeredPane.add(pBarImage2, new Integer(4));
        
        pBarImage3 = new JLabel(pbar3);
        pBarImage3.setSize(250,200);
        pBarImage3.setLocation(370,400);
        layeredPane.add(pBarImage3, new Integer(3));

        pBarTitle = new JLabel("PROGRESS BAR");
        pBarTitle.setSize(240,40);
        pBarTitle.setLocation(20,365);
        pBarTitle.setForeground(WHITE);
        layeredPane.add(pBarTitle, new Integer(3)); 
        Font miniHeadFont = new Font("Times New Roman", Font.BOLD, 20);
        pBarTitle.setFont(miniHeadFont);
        uploadTitle.setFont(miniHeadFont);
        
        
        pack();
        setLocationRelativeTo(null);
        setVisible(true);
}
         public static void main(String[] args) {
            SwingUtilities.invokeLater(Projects::new);

    }
}
