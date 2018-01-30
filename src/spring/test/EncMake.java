package spring.test;

import org.jasypt.encryption.pbe.StandardPBEStringEncryptor;
import org.jasypt.encryption.pbe.config.EnvironmentStringPBEConfig;

public class EncMake {

	public static void main(String[] args) {
		
		// 일반문자열 암호화
		EnvironmentStringPBEConfig environmentStringPBEConfig = new EnvironmentStringPBEConfig();
		environmentStringPBEConfig.setAlgorithm("PBEWithMD5AndDES");
		environmentStringPBEConfig.setPasswordEnvName("APP_ENCRYPTION_PASSWORD");

		StandardPBEStringEncryptor standardPBEStringEncryptor = new StandardPBEStringEncryptor();  
		standardPBEStringEncryptor.setConfig(environmentStringPBEConfig);
		standardPBEStringEncryptor.setPassword("jasyptPass"); 
		
		String driverClassName1 = standardPBEStringEncryptor.encrypt("com.mysql.cj.jdbc.Driver");
		String driverClassName2 = standardPBEStringEncryptor.encrypt("net.sf.log4jdbc.sql.jdbcapi.DriverSpy");
		String url1 = standardPBEStringEncryptor.encrypt("jdbc:mysql://localhost:3306/ojs");
		String url2 = standardPBEStringEncryptor.encrypt("jdbc:log4jdbc:mysql://localhost:3306/ojs?useUnicode=true&characterEncoding=utf8&verifyServerCertificate=false&useSSL=false&serverTimezone=UTC");
		String userName = standardPBEStringEncryptor.encrypt("JUNSEOK");
		String password = standardPBEStringEncryptor.encrypt("2486");
		
		System.out.println("[driverClassName1]" + driverClassName1);
		System.out.println("[driverClassName2]" + driverClassName2);
		System.out.println("[url1]" + url1);
		System.out.println("[url2]" + url2);
		System.out.println("[userName]" + userName);
		System.out.println("[password]" + password);
		
	}
}
