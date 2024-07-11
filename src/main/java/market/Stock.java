package market;

import model.MarketModel;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class Stock extends MarketModel  {

    String name;
    BigDecimal startPrice;
    int changeProbability;
    int delta;

    LocalDateTime operDate;
    BigDecimal rate;


    public Stock() {
        super();
        operDate = LocalDateTime.now();

        name = "default promo";
        startPrice = BigDecimal.valueOf(10.0);
        changeProbability = 0;
        delta = 1;
        rate = BigDecimal.valueOf(1.0);

    }

    public Stock(String name, BigDecimal startPrice, int changeProbability, int delta) {
        super();
        operDate = LocalDateTime.now();

        this.name = name;
        this.startPrice = startPrice;
        this.changeProbability = changeProbability;
        this.delta = delta;





    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getStartPrice() {
        return startPrice;
    }

    public void setStartPrice(BigDecimal startPrice) {
        this.startPrice = startPrice;
    }

    public int getChangeProbability() {
        return changeProbability;
    }

    public void setChangeProbability(int changeProbability) {
        this.changeProbability = changeProbability;
    }

    public int getDelta() {
        return delta;
    }

    public void setDelta(int delta) {
        this.delta = delta;
    }

    public LocalDateTime getOperDate() {
        return operDate;
    }

    public void setOperDate(LocalDateTime operDate) {
        this.operDate = operDate;
    }

    public BigDecimal getRate() {
        return rate;
    }

    public void setRate(BigDecimal rate) {
        this.rate = rate;
    }

}
