package service;

import java.sql.*;

public class LinkDB {

    public static final String DB_URL = "jdbc:postgresql://localhost:5432/postgres";
    public static final String DB_Driver = "org.postgresql.Driver";

        public static Connection connecting() {
        try {
            Class.forName(DB_Driver); //Проверяем наличие JDBC драйвера для работы с БД
            Connection connection = DriverManager.getConnection(DB_URL, "postgres","2984" ); //соединениесБД
            System.out.println("Соединение с СУБД выполнено.");
            return connection;

        } catch (ClassNotFoundException e) {
            e.printStackTrace(); // обработка ошибки  Class.forName
            System.out.println("JDBC драйвер для СУБД не найден!");
        } catch (SQLException e) {
            e.printStackTrace(); // обработка ошибок  DriverManager.getConnection
            System.out.println("Ошибка SQL !");
        }
            return null;
        }

        public static void closeConnecting(Connection connection) throws SQLException {
        connection.close();
        System.out.println("Отключение от СУБД выполнено.");
    }

}
