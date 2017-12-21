package test.connection;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * 2017-12-21
 * DB 연결 테스트 최초 작성
 * @author SHINJE KIM
 *
 */
public class ConnectionTest {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.jdbc.Driver"); // Driver 클래스 로딩
			
			// jdbc를 통해 MySQL과 연동
			Connection conn = DriverManager.getConnection
					("jdbc:mysql://erpdb.cuqzo4e3svi9.ap-northeast-2.rds.amazonaws.com:3306/ERP_Schema"
					, "usermaster"
					, "sist1234");
			
			System.out.println(conn);
		}catch(ClassNotFoundException | SQLException e){
			System.err.println("Connection Failed");
		}
	}
}
