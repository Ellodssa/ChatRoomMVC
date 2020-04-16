package Controller;

import Model.Model;
import view.ChatClient;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SendHandler implements ActionListener {
    ChatClient chatClient;
    Model model = new Model("C://work//data.txt");
    public void actionPerformed(ActionEvent e) {
        model.logger(chatClient.input.getText());
        chatClient.output.append(model.text + " " + model.hashCode() + "\n");
        //FileWriter.write(model.text);
        chatClient.input.setText("");

    }

    public SendHandler(ChatClient chatClient) {
        this.chatClient = chatClient;
    }
}