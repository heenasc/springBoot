package service;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class WhatsAppService implements MessageService{
    @Override
    public void send(String msg) {
        System.out.println("whatsapp is sending msg ,"+msg);
    }
}
