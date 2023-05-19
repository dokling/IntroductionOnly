/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.introductiononly;

/**
 *
 * @author carre
 */
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.awt.event.ActionListener;
import static java.awt.Color.*;

public class Home extends JFrame /*implements Displayable*/{
    private JPanel contentPane;
    private JLabel bGround, profile, FBlogo, about, bGround2, header, inside, homeHead, aboutMeHead, projectsHead;
    private ImageIcon bGimage, pFimage, FBimage, bG2Image, headerImg; 
    public Home(){
            
        setTitle("Profile");
        Dimension preferredSize = new Dimension(700, 550);
        setPreferredSize(preferredSize);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocation(0,0);
        
        JLayeredPane layeredPane = new JLayeredPane();
        getContentPane().add(layeredPane);
        
        contentPane = new JPanel();
        contentPane.setLayout(null);
        contentPane.setVisible(true);
        layeredPane.add(contentPane, new Integer(0)); 
        
        bGimage = new ImageIcon(Home.class.getResource("geometric.PNG"));
        
        bGround = new JLabel(bGimage);
        bGround.setSize(700,200);
        bGround.setLocation(-0,5);
        layeredPane.add(bGround, new Integer(1)); 
        
        headerImg = new ImageIcon(Home.class.getResource("header.PNG"));

        header = new JLabel(headerImg);
        header.setSize(700,30);
        header.setLocation(-0,-0);
        
        layeredPane.add(header, new Integer(2));
        
        pFimage = new ImageIcon(Home.class.getResource("prof.PNG"));

        profile = new JLabel(pFimage);
        profile.setSize(700,500);
        profile.setLocation(-0,-80);
        layeredPane.add(profile, new Integer(3)); 
        
        FBimage = new ImageIcon(Home.class.getResource("fbLogo.PNG"));

        FBlogo = new JLabel(FBimage);
        FBlogo.setSize(700,500);
        FBlogo.setLocation(250,150);
        FBlogo.setVisible(false);
        layeredPane.add(FBlogo, new Integer(2));
        
        bG2Image = new ImageIcon(Home.class.getResource("black.png"));
        
        bGround2 = new JLabel(bG2Image);
        bGround2.setSize(700,350);
        bGround2.setLocation(0,200);
        layeredPane.add(bGround2, new Integer(2));
        
        about = new JLabel("Who am I? ");
        about.setSize(200,100);
        about.setLocation(10,200);  
        about.setForeground(GRAY);
        
        Font head = new Font("Times New Roman", Font.BOLD, 35);
        
        about.setFont(head);
        layeredPane.add(about, new Integer(3)); // Add the progress bar to the top layer
        
        inside = new JLabel("<html>I am James Carrel A. Golosinda, currently attending"
                + "National University Manila, taking BSIT<br> focused on, Mobile"
                + " and Web Application.</html>");
        inside.setSize(700,100);
        inside.setLocation(50,250);  
        inside.setForeground(GRAY);
        
        homeHead = new JLabel("<html><u>About Me</u></html>");
        homeHead.setSize(100,20);
        homeHead.setLocation(290,5);  
        homeHead.setForeground(WHITE);
        
        homeHead.addMouseListener(new MouseAdapter() {
            @Override
             public void mouseEntered(MouseEvent e) {
                homeHead.setForeground(Color.GRAY); // Change background color on hover
            }

            @Override
            public void mouseExited(MouseEvent e) {
                homeHead.setForeground(Color.WHITE); // Reset background color when mouse exits
            }
             public void mouseClicked(MouseEvent e) {
                 dispose();
             }
        });
        
        projectsHead = new JLabel("<html><u>Projects</u></html>");
        projectsHead.setSize(50,20);
        projectsHead.setLocation(370,5);  
        projectsHead.setForeground(WHITE);
        
        projectsHead.addMouseListener(new MouseAdapter() {
            @Override
             public void mouseEntered(MouseEvent e) {
                projectsHead.setForeground(Color.GRAY); // Change background color on hover
            }

            @Override
            public void mouseExited(MouseEvent e) {
                projectsHead.setForeground(Color.WHITE); // Reset background color when mouse exits
            }
        });
            
                
        Font body = new Font("Times New Roman", Font.PLAIN, 15);
        
        homeHead.setFont(body);
        inside.setFont(body);
        projectsHead.setFont(body);
        layeredPane.add(projectsHead, new Integer(3));
        layeredPane.add(homeHead, new Integer(3)); 
        layeredPane.add(inside, new Integer(3));     
        
        
        JScrollPane scrollPane = new JScrollPane(contentPane);
        scrollPane.setBounds(665, 0, 20, 511);
        
        scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        
        layeredPane.add(scrollPane, new Integer(3));

        pack();
        setLocationRelativeTo(null);
        setVisible(true);
        }
    public static void main(String[] args) {
            SwingUtilities.invokeLater(Home::new);

    }
}