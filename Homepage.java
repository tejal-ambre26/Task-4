package myapp;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Homepage extends JFrame {
    public Homepage(String username) {
        setTitle("Homepage");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JLabel titleLabel = new JLabel("Welcome to the Homepage", SwingConstants.CENTER);
        titleLabel.setFont(new Font("Arial", Font.BOLD, 20));

        JLabel greetingLabel = new JLabel("Hello, " + username + "!", SwingConstants.CENTER);

        JButton viewProfileButton = new JButton("View Profile");
        JButton settingsButton = new JButton("Settings");
        JButton logoutButton = new JButton("Logout");

        JPanel buttonPanel = new JPanel();
        buttonPanel.add(viewProfileButton);
        buttonPanel.add(settingsButton);
        buttonPanel.add(logoutButton);

        setLayout(new BorderLayout());
        add(titleLabel, BorderLayout.NORTH);
        add(greetingLabel, BorderLayout.CENTER);
        add(buttonPanel, BorderLayout.SOUTH);

        logoutButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                dispose();
                new LoginForm().setVisible(true);
            }
        });
    }
}
