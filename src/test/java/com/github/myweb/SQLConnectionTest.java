/**
 * 
 */
package com.github.myweb;

import java.sql.Connection;
import java.sql.DriverManager;

import org.junit.Test;

/**
 * <pre>
 * com.ex.mytest
 * SQLConnectionTest.java
 * </pre>
 * 
 * @Author : soo
 * @Date : 2018. 10. 30.
 * @Version : 1.0
 *
 */
public class SQLConnectionTest {

	private static final String DRIVER = "oracle.jdbc.driver.OracleDriver";

	private static final String URL = "jdbc:oracle:thin:@127.0.0.1:1521:XE";

	private static final String USER = "user01";

	private static final String PW = "zon89";

	@Test
	public void testConnection() throws Exception {

		Class.forName(DRIVER);

		try (Connection con = DriverManager.getConnection(URL, USER, PW)) {
			System.out.println(con);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
