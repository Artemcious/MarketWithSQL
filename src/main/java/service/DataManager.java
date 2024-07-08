package service;

import repository.TableOperations;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class DataManager implements TableOperations {

    String sqlRequest =
            "DROP TABLE \"Market\"" +
            "CREATE TABLE \"Market\"" +
                    " \"name\" varchar(255)," +
                    "  \"startPrice\" decimal," +
                    "  \"changeProbality\" integer," +
                    "  \"delta\" integer," +
                    "  \"operDate\" timestamp," +
                    "  \"share\" varchar(255)," +
                    "  \"rate\" decimal," +
                    "  \"id\" bigint"
            ;


    public Statement createStatement(Connection connection) throws SQLException {
        return connection.createStatement();

    }


    @Override
    public void createTable(Statement statement) throws SQLException {
        statement.execute(sqlRequest);

    }

    @Override
    public void createForeignKeys() throws SQLException {

    }

    @Override
    public void createExtraConstraints() throws SQLException {

    }
}
