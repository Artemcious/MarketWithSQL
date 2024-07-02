package market;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import static manage.ManagementMarket.ID;

public class Stock {

    String name;
    BigDecimal startPrice;
    int changeProbability;
    int delta;

    LocalDateTime operDate;
    Stock share;
    BigDecimal rate;
    long id;

    public Stock(String name, BigDecimal startPrice, int changeProbability, int delta) {
        operDate = LocalDateTime.now();

        this.name = name;
        this.startPrice = startPrice;
        this.changeProbability = changeProbability;
        this.delta = delta;

        ID++;
        id = ID;



    }

    public BigDecimal getRate() {
        return rate;
    }

    public long getId() {
        return id;
    }

}
