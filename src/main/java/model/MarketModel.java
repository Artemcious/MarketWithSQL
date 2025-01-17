package model;

import java.util.Objects;

public class MarketModel {
    protected static long id;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public MarketModel() {
        id++;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MarketModel baseModel = (MarketModel) o;
        return id == baseModel.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }


}
