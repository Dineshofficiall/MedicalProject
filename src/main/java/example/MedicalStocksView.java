package example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class MedicalStocksView {
    public static void main(String[] args) throws Exception{
        String url = "jdbc:mysql://localhost:52000/MedicalShop";
        String userName = "root";
        String passWord = "mysqlserver";
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the columnName :");
        String input = sc.nextLine();
        System.out.print("Enter the Name :");
        String input1 = sc.nextLine();
        System.out.println();
        String query = new StringBuilder("Select * from Medicines where ").append(input)
                .append("= \"").append(input1).append("\"").toString();

        Connection connection = DriverManager.getConnection(url,userName,passWord);
        Statement statement = connection.createStatement();
        ResultSet resl_set1 = statement.executeQuery(query);

        while (resl_set1.next()){
            System.out.println("ProductName: "+ resl_set1.getString(1));
            System.out.println("ProductPerUnit_MG: "+ resl_set1.getBigDecimal(2));
            System.out.println("AvailableUnit: "+ resl_set1.getInt(3));
            System.out.println("PerUnitPrice: "+ resl_set1.getFloat(4));
            System.out.println();
        }
    }
}