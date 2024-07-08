import service.DataManager;
import service.LinkDB;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.Objects;

public class Main {

    public static void main(String[] args) throws SQLException {

        DataManager manager = new DataManager();
        Connection connection = Objects.requireNonNull(LinkDB.connecting());
        manager.createStatement(connection);
        LinkDB.closeConnecting(connection);
    }
}
