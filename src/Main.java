import java.sql.Connection;
import java.sql.DriverManager;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");
        getConnection();
    }

    public static Connection getConnection(){
        try{
            String driver = "com.mysql.cj.jdbc.Driver";
            String databaseUrl = "jdbc:mysql://localhost:3306/college";
            String userName = "root";
            String password = "11907294";
            Class.forName(driver);
            Connection conn = DriverManager.getConnection(databaseUrl,userName,password);
            System.out.println("Connection done database connected");
            return conn;

        }
        catch (Exception e){
            System.out.println("Sone error" + e);
        }
        return null;
    }
}