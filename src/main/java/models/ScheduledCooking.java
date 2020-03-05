package models;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

@Service
public class ScheduledCooking {
    @Autowired
    public SpeltPorridge speltPorridge;

    @Scheduled(cron = "1 0 * * * *")
    public void cookSpeltPorridge() {
        System.out.println("Good morning!");
        speltPorridge.getWater();
        speltPorridge.getSpelt();
        speltPorridge.getHoney();
        speltPorridge.getWalnut();
        System.out.println("Your favourite porridge is ready, mam.");
    }
}
