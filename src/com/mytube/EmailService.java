package com.mytube;

public class EmailService implements CanSendMessage {
    public void sendMessageTo(User user) {
        System.out.println("Notifying " + user.getEmail() + "...");
        System.out.println("Done!\n");
    }
}
