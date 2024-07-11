import service.DataManager;
import service.LinkDB;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.Objects;

public class Main {

    public static void main(String[] args) throws SQLException {

        Connection connection = LinkDB.connecting();
        DataManager manager = new DataManager(connection);
        manager.createTable(manager.getStatement());
        manager.insertValues(manager.getStatement());
        LinkDB.closeConnecting(connection);
    }
}
