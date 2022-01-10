package service;


public class MessengerService implements MessageService{
    @Override
    public void send(String msg) {
        System.out.println("Messenger is sending msg ,"+msg);
    }
}
