package loosecoupling;

public class FrenchGreetingService implements GreetingService {
    @Override
    public void greet(String name){
        System.out.println("banjour"+name);
    }
}
