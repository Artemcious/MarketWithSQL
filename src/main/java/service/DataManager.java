package service;

import market.Stock;
import repository.TableOperations;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class DataManager implements TableOperations {

    Statement statement;

    public DataManager(Connection connection) throws SQLException {
        createStatement(connection);
    }

    public void createStatement(Connection connection) throws SQLException {
        statement = connection.createStatement();

    }


    @Override
    public void createTable(Statement statement) throws SQLException {
        String sqlRequestCreateTable = """
                        DROP TABLE IF EXISTS Market; 
                        CREATE TABLE Market 
                        (name varchar(255), 
                        startPrice decimal, 
                        changeProbability integer,
                        delta integer,
                        operDate timestamp,
                        rate decimal,
                        id bigint);
                        """;
        statement.execute(sqlRequestCreateTable);

    }

    @Override
    public void insertValues(Statement statement) throws SQLException {
        Stock stock = new Stock();
        String sqlRequestInsertValuesStock =
                        "INSERT INTO Market (name, startPrice, changeProbability, delta, operDate, rate, id)" +
                        "VALUES ('" + stock.getName() + "','" + stock.getStartPrice() + "','" + stock.getChangeProbability() + "','" +
                        stock.getDelta() + "','" + stock.getOperDate() + "','" + stock.getRate() + "','" + stock.getId() + "')";
        statement.execute(sqlRequestInsertValuesStock);
    }

    @Override
    public void createForeignKeys() throws SQLException {

    }

    @Override
    public void createExtraConstraints() throws SQLException {

    }

    public Statement getStatement() {
        return statement;
    }
}
