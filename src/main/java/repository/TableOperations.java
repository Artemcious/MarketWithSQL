package repository;

import java.sql.SQLException;
import java.sql.Statement;

public interface TableOperations {
    void createTable(Statement statement) throws SQLException; // создание таблицы
    void createForeignKeys() throws SQLException; // создание связей между таблицами
    void createExtraConstraints() throws SQLException; // создание дополнительных правил для значений полей таблиц
}