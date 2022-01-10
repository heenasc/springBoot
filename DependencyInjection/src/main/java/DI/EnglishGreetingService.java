package DI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
//To change the scope of a bean, you need to make use of the @Scope annotation
//bydefault its singleton scope where every obj have same reference so here we change it using protptype scope so evrytime new obj created it have new reference
public class EnglishGreetingService implements GreetingService{

    //@Autowired
    //for field or property based injection place the @Autowired annotation over the property that you want to inject into the dependent class.
    private TimeService timeService;


    @Autowired
    //For the constructor-based injection, you need to place the @Autowired annotation over the constructor.
    public EnglishGreetingService(@Qualifier("timeService24HourFormat") TimeService timeService) {
        this.timeService = timeService;
    }

    @Override
    public void greet(String name){
        System.out.println("hello ,"+name);
    }
    public TimeService getTimeService() {
        return timeService;
    }
    //@Autowired
    //for the setter-based injection, you need to place the @Autowired annotation over the setter method.
    public void setTimeService(TimeService timeService) {
        this.timeService = timeService;
    }
}