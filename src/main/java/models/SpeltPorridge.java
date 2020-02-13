package models;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;

import org.springframework.stereotype.Service;

@Service
public class SpeltPorridge {

    private Water water;
    private Spelt spelt;
    private Honey honey;
    private Walnut walnut;

    @Autowired
    public SpeltPorridge(Water water, Spelt spelt, Honey honey, Walnut walnut) {
        this.water = water;
        this.spelt = spelt;
        this.honey = honey;
        this.walnut = walnut;
    }
    @Scheduled(cron = "1 0 * * * *")
    public void cookSpeltPorridge(){
        System.out.println("Good morning!");
        water.getWater();
        spelt.getSpelt();
        honey.getHoney();
        walnut.getWalnuts();
        System.out.println("Your favourite porridge is ready, mam.");
    }
}
