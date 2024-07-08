package market;

import model.MarketModel;

import java.math.BigDecimal;

public class Trader extends MarketModel {

    Stock name;
    int sfreqTick;
    BigDecimal cash;
    int tradingMethod;
    int changeProbability;
    String about;
    int operation;

    Trader trader;
    BigDecimal shareRate;
    long amount;
    long id;

    public Trader() {

    }

    public void setShareRate(BigDecimal shareRate) {
        this.shareRate = shareRate;
    }
}
