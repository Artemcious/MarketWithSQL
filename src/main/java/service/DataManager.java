package service;

import market.Stock;
import repository.TableOperations;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class DataManager implements TableOperations {

    String sqlRequestCreateTable =
            "DROP TABLE \"Market\"" +
            "CREATE TABLE \"Market\"" +
                    " \"name\" varchar(255)," +
                    "  \"startPrice\" decimal," +
                    "  \"changeProbality\" integer," +
                    "  \"delta\" integer," +
                    "  \"operDate\" timestamp," +
                    "  \"rate\" decimal," +
                    "  \"id\" bigint"
            ;

    String sqlRequestInsertValues;


    public Statement createStatement(Connection connection) throws SQLException {
        return connection.createStatement();

    }


    @Override
    public void createTable(Statement statement) throws SQLException {
        statement.execute(sqlRequestCreateTable);

    }

    @Override
    public void createForeignKeys() throws SQLException {

    }

    @Override
    public void createExtraConstraints() throws SQLException {

    }
}
