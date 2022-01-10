package loosecoupling;

public class SpanishGreetingService implements GreetingService{
    @Override
    public void greet(String name){
        System.out.println("hola"+name);
    }
}
