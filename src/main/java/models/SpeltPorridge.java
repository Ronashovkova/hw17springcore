package models;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;
@Data
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
}
