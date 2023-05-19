/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.introductiononly;

/**
 *
 * @author carre
 */

import javax.swing.*;
import java.awt.*;
import static java.awt.Color.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class splash extends JFrame {
    private JPanel contentPane;
    private JProgressBar progressBar;
    private JLabel loading, bGround;
    private int xCoordinate = 0; // Initial x-coordinate of the loading JLabel
    private Timer timer; // Declare timer as a field
    
    public splash() {
        setTitle("Profile");
        Dimension preferredSize = new Dimension(400, 300);
        setPreferredSize(preferredSize);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        JLayeredPane layeredPane = new JLayeredPane();
        getContentPane().add(layeredPane);
        

        
        contentPane = new JPanel();
        contentPane.setLayout(null);
        contentPane.setVisible(true);
        layeredPane.add(contentPane, new Integer(0)); 
        
        ImageIcon image = new ImageIcon("C:\\temp\\splashbg.JPG");
        
        bGround = new JLabel(image);
        bGround.setSize(400,500);
        bGround.setLocation(0,-150);
        layeredPane.add(bGround, new Integer(1)); 
        ImageIcon gifIcon = new ImageIcon("C:\\temp\\lastlast.gif");

        loading = new JLabel(gifIcon);
        loading.setSize(150,200);
        loading.setLocation(-20,100);
        layeredPane.add(loading, new Integer(3)); 
        
        
         progressBar = new JProgressBar();
         progressBar.setBounds(100, 150, 150, 20);
        progressBar.setForeground(WHITE); 
        progressBar.setBackground(GRAY); 
        layeredPane.add(progressBar, new Integer(2)); 

        
         timer = new Timer(10, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                xCoordinate += 1; // Increment the x-coordinate
                int frameWidth = getWidth();
                int loadingWidth = loading.getWidth();
                if (xCoordinate >= frameWidth) {
                    xCoordinate = -loadingWidth; // Reset the x-coordinate to the left side
                }
                loading.setLocation(xCoordinate, getHeight() - loading.getHeight()); // Update the location
            }
        });
        // Simulate progress
        SwingWorker<Void, Integer> worker = new SwingWorker<Void, Integer>() {
            @Override
            protected Void doInBackground() throws Exception {
                for (int i = 0; i <= 100; i++) {
                    Thread.sleep(50); // Simulate some work being done
                    publish(i); // Publish the progress
                }
                return null;
            }

            @Override
            protected void process(java.util.List<Integer> chunks) {
                int latestProgress = chunks.get(chunks.size() - 1);
                progressBar.setValue(latestProgress);
            }

            @Override
            protected void done() {
            dispose();
            Home aboutMe = new Home();
        Projects projects = new Projects();

        // Display the frames
        aboutMe.display();
        projects.display();
            }
        };

        // Execute the SwingWorker
        worker.execute();
        timer.start();

        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }
    

    public static void main(String[] args) {
        SwingUtilities.invokeLater(splash::new);
    }

    
}