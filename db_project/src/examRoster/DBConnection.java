/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package examRoster;


/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import java.sql.*;

/**
 *
 * @author     Md. Khairullah Gaurab
 * @co-author  Md. Mamun Hossain
 */
public class DBConnection
{
    public static String dataBaseUrl = "jdbc:mysql://localhost:3306/ExamRoster";
    public static String dataBaseUserName = "tester";
    public static String dataBasePassWord = "test123";
    
    public DBConnection()
    {
    }

    public Connection dbConnect(String db_connect_string,String db_userid, String db_password){
        try{
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            Connection conn = DriverManager.getConnection(db_connect_string, db_userid, db_password);
            return conn;
        }
        catch (Exception e){
            return null;
        }
    }
}
