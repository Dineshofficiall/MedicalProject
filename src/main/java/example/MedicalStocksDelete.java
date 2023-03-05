package example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Scanner;

public class MedicalStocksDelete {
    public static void main(String[] args)throws Exception{
        String url = "jdbc:mysql://localhost:52000/MedicalShop";
        String userName = "root";
        String passWord = "mysqlserver";
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the whereColumn: ");
        String inputForWhere = sc.nextLine();
        System.out.print("Enter the WhereValue: ");
        String input = sc.nextLine();
        String query = new StringBuilder("delete from Medicines ").append("where ").append(inputForWhere)
                .append("=\"").append(input).append("\"").toString();

        Connection connection = DriverManager.getConnection(url,userName,passWord);
        Statement statement = connection.createStatement();
        statement.executeUpdate(query);
    }
}
