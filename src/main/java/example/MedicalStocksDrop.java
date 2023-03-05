package example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Scanner;

public class MedicalStocksDrop {
    public static void main(String[] args) throws Exception{
        String url = "jdbc:mysql://localhost:52000/MedicalShop";
        String userName = "root";
        String passWord = "mysqlserver";
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the input for delete the table :");
        String input = sc.nextLine();
        String query = new StringBuilder("drop table if exists ").append(input).toString();

        Connection connection = DriverManager.getConnection(url,userName,passWord);
        Statement statement = connection.createStatement();
        statement.executeUpdate(query);
    }
}
