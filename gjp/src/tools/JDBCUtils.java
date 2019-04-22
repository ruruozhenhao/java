package tools;

import javax.sql.DataSource;

import org.apache.commons.dbcp.BasicDataSource;

public class JDBCUtils {
	private static BasicDataSource dataSource = new BasicDataSource();

	static {
		dataSource.setDriverClassName("com.mysql.jdbc.Driver");
		dataSource.setUrl("jdbc:mysql://localhost:3306/gjp");
		dataSource.setUsername("root");
		dataSource.setPassword("028110");

		dataSource.setInitialSize(10);
		dataSource.setMaxIdle(5);
		dataSource.setMaxActive(8);
		dataSource.setMinIdle(1);
	}
	
	public static DataSource getDataSource() {
		return dataSource;
	}

}
