package hello;



public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String name;
		
		
		
		
		
		
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver"); //1
			
			String url = "http://127.0.0.1/maBase";
			String user="root";
			String password="mdp";
			Connection conn = DriverManager.getConnection(url, user, password); //2
			
			Statement stmt = conn.createStatement(); //3
			
			ResultSet res = stmt.executeQuery("Select * from maTable"); //4
			
			while(res.next())
				System.out.println(res.getString(2));
			
			
			
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
}
}
