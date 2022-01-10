package service;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import service.Controller.MessageController;

public class App {
    public static void main(String[] args) {
        ApplicationContext context =new AnnotationConfigApplicationContext("service");
        MessageController messageController=(MessageController) context.getBean("messageController");
        messageController.sendMessage("Hello guys");

    }
}
