import java.sql.Connection;
import java.sql.DriverManager;

public class CarVerse {
    public static void main(String[] args) throws Exception {
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/carrental","root","");
        System.out.println((con!=null)?"success":"fail");
    }
}
class Car{

}
class User{

}
class Buyer extends User{

}
class Admin extends User{

}
class Rental{

}