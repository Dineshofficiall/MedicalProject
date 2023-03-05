package example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Scanner;

public class MedicalStocksUpdate {
    public static void main(String[] args) throws Exception{
        String url = "jdbc:mysql://localhost:52000/MedicalShop";
        String userName = "root";
        String passWord = "mysqlserver";
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the setColumnName :");
        String inputForTitle = sc.nextLine();
        System.out.print("Enter the WhereColumnName :");
        String inputForTitle2 = sc.nextLine();
        System.out.print("Enter the Set value :");
        String input1 = sc.nextLine();
        System.out.print("Enter the Where value: ");
        String input2 = sc.nextLine();
        String query = new StringBuilder ("update Medicines").append(" set ").append(inputForTitle)
                .append(" = \"").append(input1).append("\"").append(" where ")
                .append(inputForTitle2).append("= \"").append(input2).append("\"").toString();

        Connection connection = DriverManager.getConnection(url,userName,passWord);
        Statement statement = connection.createStatement();
        statement.executeUpdate(query);
    }
}
