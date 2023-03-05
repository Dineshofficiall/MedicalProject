package example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class MedicalStocksCreate {
    public static void main(String[] args)throws Exception{
        String url = "jdbc:mysql://localhost:52000/MedicalShop";
        String userName = "root";
        String passWord = "mysqlserver";
        String query = "create table Medicines(ProductName varchar(35) Primary Key, ProductPerUnitInMG float, AvailableUnit int, PerUnitPrice float)";

        Connection connection = DriverManager.getConnection(url,userName,passWord);
        Statement statement = connection.createStatement();
        statement.execute(query);
    }
}
