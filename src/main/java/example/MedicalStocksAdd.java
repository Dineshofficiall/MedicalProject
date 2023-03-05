package example;

import org.example.bean.Medicines;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MedicalStocksAdd {
    public static void main(String[] args)throws Exception{
        String url = "jdbc:mysql://localhost:52000/MedicalShop";
        String userName = "root";
        String passWord = "mysqlserver";
        List<Medicines> medicinesList = new ArrayList<>();
        System.out.print("Enter the number of rows: ");
        Scanner sc = new Scanner(System.in);
        int count = Integer.parseInt(sc.nextLine());
        while(count-->0) {
            Medicines medicines = new Medicines();
            System.out.print("Product Name: " );
            medicines.setProductName(sc.nextLine());
            System.out.print("ProductPerUnit (MG) : ");
            medicines.setProductPerUnitInMG(Float.valueOf(sc.nextLine()));
            System.out.print("Available Unit : ");
            medicines.setAvailableUnit(Integer.valueOf(sc.nextLine()));
            System.out.print("Unit Price");
            medicines.setPerUnitPrice(Float.valueOf(sc.nextLine()));
            medicinesList.add(medicines);
        }

        Connection connection = DriverManager.getConnection(url,userName,passWord);
        Statement statement = connection.createStatement();
        for(Medicines medicines : medicinesList) {
            String query = new StringBuilder("INSERT INTO Medicines VALUES(\"")
                    .append(medicines.getProductName()).append("\", ").append(medicines.getProductPerUnitInMG())
                    .append(", ").append(medicines.getAvailableUnit())
                    .append(", ").append(medicines.getPerUnitPrice()).append(")").toString();
            statement.execute(query);
        }
        connection.close();
    }
}
