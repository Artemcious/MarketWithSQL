package market;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class Stock {

    String name;
    BigDecimal startPrice;
    int changeProbability;
    int delta;

    LocalDateTime operDate;
    Stock share;
    BigDecimal rate;
    public long idPrep = 0;
    public long idNow = idPrep;

    public Stock(String name, BigDecimal startPrice, int changeProbability, int delta) {
        operDate = LocalDateTime.now();

        this.name = name;
        this.startPrice = startPrice;
        this.changeProbability = changeProbability;
        this.delta = delta;

        idPrep++;
        idNow = idPrep;

    }

    public BigDecimal getRate() {
        return rate;
    }
}
