import models.ScheduledCooking;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Executor {
    public static void start(){
        ApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);
        ScheduledCooking porridge = context.getBean(ScheduledCooking.class);
        porridge.cookSpeltPorridge();
    }
}
