package pizzeria;

import java.sql.Connection;
import java.sql.DriverManager;

public class conecta {
    public static Connection Conectando(){
        Connection c = null;
        try{
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            c = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;"
                +"databaseName=Pizzeria","sa","sasa");
            return c;
        } catch(Exception e){
            return null;
        }
    }
    
}
