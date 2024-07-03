package market;

import model.MarketModel;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class Stock extends MarketModel {

    String name;
    BigDecimal startPrice;
    int changeProbability;
    int delta;

    LocalDateTime operDate;
    Stock share;
    BigDecimal rate;


    public Stock(String name, BigDecimal startPrice, int changeProbability, int delta) {
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

    public Stock getShare() {
        return share;
    }

    public void setShare(Stock share) {
        this.share = share;
    }

    public BigDecimal getRate() {
        return rate;
    }

    public void setRate(BigDecimal rate) {
        this.rate = rate;
    }
}
