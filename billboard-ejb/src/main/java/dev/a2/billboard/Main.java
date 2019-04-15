package dev.a2.billboard;

import dev.a2.billboard.service.MessageReceiver;
import dev.a2.billboard.service.MessageSender;

public class Main {
    public static void main (String[] args) throws Exception {
        final MessageSender sender = new MessageSender();

        final MessageReceiver receiver = new MessageReceiver();
        receiver.startListener();

        for (int i = 1; i <= 5; i++) {
            String m = "Hello world! " + i;
            sender.sendMessage(m);
            Thread.sleep(300);
        }

        sender.destroy();
        receiver.destroy();
    }
}
