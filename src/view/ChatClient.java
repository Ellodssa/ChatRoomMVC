package view;

import Controller.CloseHandler;
import Controller.SendHandler;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ChatClient {
    public JTextArea output;
    public JTextField input;
    public JButton sendButton;
    public JButton quitButton;

    public ChatClient() {
        output = new JTextArea(10,50);
        input = new JTextField(50);
        sendButton = new JButton("Send");
        quitButton = new JButton("Quit");
    }

    public void launchFrame() {
        JFrame frame = new JFrame("Chat Room");

        // Use the Border Layout for the frame
        frame.setLayout(new BorderLayout());

        frame.add(output, BorderLayout.WEST);
        frame.add(input, BorderLayout.SOUTH);

        // Create the button panel
        JPanel p1 = new JPanel();
        p1.setLayout(new GridLayout(2,1));
        p1.add(sendButton);
        p1.add(quitButton);

        // Add the button panel to the center
        frame.add(p1, BorderLayout.CENTER);

        // Attach listener to the appropriate components
        sendButton.addActionListener(new SendHandler(this));
        input.addActionListener(new SendHandler(this));
        frame.addWindowListener(new CloseHandler());
        quitButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        frame.pack();
        frame.setVisible(true);
    }
}
