package service.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import service.MessageService;

@Component
public class MessageController {

    private MessageService messageService;
    @Autowired
    public MessageController(@Qualifier("whatsAppService") MessageService messageService){
        this.messageService = messageService;
    }
    public void sendMessage(String message){
        this.messageService.send(message);
    }

}
