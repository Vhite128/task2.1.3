package app.model;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import java.util.logging.Logger;

@Component
public class AnimalsCage {

    Logger logger = Logger.getLogger(getClass().getName());

    private final Animal animal;

    private final Timer timer;

    public AnimalsCage(@Qualifier("dog") Animal animal, Timer timer) {
        this.animal = animal;
        this.timer = timer;
    }

    public Timer getTimer() {
        return timer;
    }

    public void whatAnimalSay() {
        logger.info("Say:");
        logger.info(animal.toString());
        logger.info("At:");
        logger.info(String.valueOf(timer.getTime()));
        logger.info("________________________");
    }
}
