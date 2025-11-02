package dip;

public class Main {
    public static void main(String[] args) {
        Database mysql = new MySQL();
        UserService userService1 = new UserService(mysql);
        userService1.registerUser("Audy");

        System.out.println("-----------------------------------------");

        Database postgreSQL = new PostgreSQL();
        UserService userService2 = new UserService(postgreSQL);
        userService2.registerUser("Evi");

    }
    
}
