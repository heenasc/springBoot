package loosecoupling;

public class Main {
    public static void main(String[] args) {
        /*
        normally when we use interface we create main class like this only but here we use factory pattern
        so here we create instance for GreetingServiceFactory class
        EnglishGreetingService englishGreetingService=new EnglishGreetingService();
        englishGreetingService.greet("heena");
        FrenchGreetingService frenchGreetingService=new FrenchGreetingService();
        frenchGreetingService.greet("bharat");*/

        GreetingServiceFactory greetingServiceFactory=new GreetingServiceFactory();
        GreetingService greetingService= greetingServiceFactory.getGreetingService("english");
        //we can easily add new class or method easily using factory pattern so if i want to call french methode just replace english with french
        greetingService.greet("heena");


        }
    }

