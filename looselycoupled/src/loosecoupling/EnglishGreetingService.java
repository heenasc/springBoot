package loosecoupling;

public class EnglishGreetingService implements GreetingService {
    @Override
    public void greet(String name){
        System.out.println("hello"+name);
    }


}
