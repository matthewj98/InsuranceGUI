import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Database {

	private Statement stmt;
	private ResultSet rs;
	private Connection conn;
	private boolean loggedIn;
		
		public Database(String username, String password)  throws ClassNotFoundException {
			 this.stmt = null;
			 this.rs = null;
			 this.loggedIn = false;
			
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				this.conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/insurance",username,password);
				System.out.println("Connected Successfully");
				this.loggedIn = true;
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

		public void selectAllCustomers() throws SQLException {
			this.stmt = this.conn.createStatement();
			this.rs = this.stmt.executeQuery("SELECT * FROM customer;");
			
			while(this.rs.next()) {
				System.out.println(this.rs.getString("title") + " " + this.rs.getString("first_name") + " " + this.rs.getString("surname") );
		}
		}
		public void selectAlLProducts() throws SQLException {
			this.stmt = this.conn.createStatement();
			this.rs = this.stmt.executeQuery("SELECT * FROM policies;");
			
			while(this.rs.next()) {
				System.out.println(this.rs.getString("policy_name") + " " + this.rs.getString("description") + " " + this.rs.getString("base_price"));
		}
			
}
		public List<List<Object>> selectCustom() throws SQLException {
			this.stmt = this.conn.createStatement();
			this.rs = this.stmt.executeQuery("SELECT * FROM customer");
			ResultSetMetaData rsmd = rs.getMetaData();
			int totalColumns = rsmd.getColumnCount();
			List<List<Object>> data = new ArrayList<List<Object>>();
			int j = 0;
			while(this.rs.next()) {
				
				//String[] arr = new String[totalColumns-1];
				List<Object> arra = new ArrayList<Object>(totalColumns-1);
				for(int i =1; i<= totalColumns; i++) {
				System.out.print(this.rs.getString(rsmd.getColumnName(i)) + " ");
				//arr[i-1] = this.rs.getString(rsmd.getColumnName(i));
				arra.add(this.rs.getString(rsmd.getColumnName(i)));
				}
				data.add(arra);
				System.out.println("\n");
		}
			return data;
		}
		
		public List<List<Object>> selectPolicy() throws SQLException {
			this.stmt = this.conn.createStatement();
			this.rs = this.stmt.executeQuery("SELECT * FROM policies");
			ResultSetMetaData rsmd = rs.getMetaData();
			int totalColumns = rsmd.getColumnCount();
			List<List<Object>> data = new ArrayList<List<Object>>();
			int j = 0;
			while(this.rs.next()) {
				
				//String[] arr = new String[totalColumns-1];
				List<Object> arra = new ArrayList<Object>(totalColumns-1);
				for(int i =1; i<= totalColumns; i++) {
				System.out.print(this.rs.getString(rsmd.getColumnName(i)) + " ");
				//arr[i-1] = this.rs.getString(rsmd.getColumnName(i));
				arra.add(this.rs.getString(rsmd.getColumnName(i)));
				}
				data.add(arra);
				System.out.println("\n");
		}
			return data;
		}
		
		public List<List<Object>> selectPurchases() throws SQLException {
			this.stmt = this.conn.createStatement();
			this.rs = this.stmt.executeQuery("SELECT c.first_name, c.surname, p.policy_name, purchase_date, expiration_date, premium from purchases\r\n"
					+ "		JOIN customer c ON c.customer_id=purchases.cust_id\r\n"
					+ "		JOIN policies p ON p.policy_id=purchases.pol_id;");
			ResultSetMetaData rsmd = rs.getMetaData();
			int totalColumns = rsmd.getColumnCount();
			List<List<Object>> data = new ArrayList<List<Object>>();
			int j = 0;
			while(this.rs.next()) {
				
				//String[] arr = new String[totalColumns-1];
				List<Object> arra = new ArrayList<Object>(totalColumns-1);
				for(int i =1; i<= totalColumns; i++) {
				System.out.print(this.rs.getString(rsmd.getColumnName(i)) + " ");
				//arr[i-1] = this.rs.getString(rsmd.getColumnName(i));
				arra.add(this.rs.getString(rsmd.getColumnName(i)));
				}
				data.add(arra);
				System.out.println("\n");
		}
			return data;
		}
		
		public void insertCustomer(String[] c) throws SQLException {
			this.stmt = this.conn.createStatement();
			int age = Integer.parseInt(c[3]);
			stmt.executeUpdate("INSERT INTO customer(title, first_name, surname, age, gender, address_1, city, country, postcode, phone_number) VALUES(\" "+ c[0] +"\",\""+ c[1] +"\",\""+ c[2] +"\", "+ age +", \""+ c[4] +"\", \""+ c[5] +"\", \""+ c[6] +"\", \""+ c[7] +"\", \""+ c[8] +"\", \""+ c[9] +"\");");
			
}
}
