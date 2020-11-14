package app;

import app.config.AppConfig;
import app.model.AnimalsCage;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {

    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        for (int i = 0; i < 5; i++) {
            AnimalsCage bean1 =
                    applicationContext.getBean(AnimalsCage.class);
            bean1.whatAnimalSay();
        }

        AnimalsCage bean2 =
                applicationContext.getBean(AnimalsCage.class);
        bean2.whatAnimalSay();
    }

}
