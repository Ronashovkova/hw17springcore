import models.SpeltPorridge;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Executor {
    public static void start(){
        ApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);
        SpeltPorridge porridge = context.getBean(SpeltPorridge.class);
        porridge.cookSpeltPorridge();
    }
}
