import connectDB.StockExchangeDB;

public class Main {

    public static void main(String[] args) {
        StockExchangeDB connect = new StockExchangeDB();
        connect.connecting();
    }
}
