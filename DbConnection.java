import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;

class DbConnection{
    public static void main(String[] args)
        throws Exception
    {
        String url = "jdbc:oracle:thin:@localhost:1524:xe";
        String user = "Nomesh";
        String password = "Nomesh123";

        Class.forName("oracle.jdbc.driver.oracleDriver");

        Connection con = DriverManager.getConnection(url, user, password);

        Statement st = con.createStatement();

        String query = "SELECT * FROM STUDENTS";
        ResultSet rs = st.executeQuery(query);
        rs.next();

        String name = rs.getString("name");
        System.out.println(name);

        st.close();
        con.close();

        System.out.println("Connection Close...!");
    }
}