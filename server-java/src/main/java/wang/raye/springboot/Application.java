package wang.raye.springboot;

import org.apache.tomcat.jni.OS;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.MultipartConfigFactory;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Bean;

import javax.servlet.MultipartConfigElement;
import java.io.*;
import java.util.Properties;

@MapperScan("wang.raye.springboot.model.mapper")
@SpringBootApplication
@ServletComponentScan
public class Application extends SpringBootServletInitializer {

//	private final static String proPath = "/home/coin/config/application.yml"; // linux配置文件路径
//	private final static String winProPath = "F:\\ww\\config\\application1.properties";
	@Bean
	public MultipartConfigElement multipartConfigElement() {
		MultipartConfigFactory factory = new MultipartConfigFactory();
		factory.setMaxFileSize("5MB");
		factory.setMaxRequestSize("5MB");
		return factory.createMultipartConfig();
	}

//	public static void main(String[] args) {
//		SpringApplication.run(Application.class);
//	}

//	@Override
//	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
//		if (OS.IS_LINUX) {
//			// 如果是linux系统
//			// 读取系统路径的配置文件
//			Properties properties = new Properties();
//			InputStream inputStream = null;
//			try {
//				inputStream = new FileInputStream(new File(proPath));
//				properties.load(inputStream);
//			} catch (FileNotFoundException e) {
//				e.printStackTrace();
//			} catch (IOException e) {
//				e.printStackTrace();
//			}
//			builder.addCommandLineProperties(false);
//			builder.application().setAddCommandLineProperties(false);
//			builder.application().setDefaultProperties(properties);
//		}
//		return builder.sources(Application.class);
//	}

	//
	//
//	@Bean
//	public DataSource dataSource() {
//		DruidDataSource dataSource = new DruidDataSource();
//		dataSource.setDriverClassName("com.mysql.jdbc.Driver");
//		dataSource.setUrl("jdbc:mysql://192.168.157.131:3306/springboot");
//		dataSource.setUsername("code");
//		dataSource.setMaxActive(30);
//		dataSource.setPassword("123456");
//		DatabaseDriver databaseDriver = DatabaseDriver.fromJdbcUrl("jdbc:mysql://192.168.157.131:3306/springboot");
//		String validationQuery = databaseDriver.getValidationQuery();
//		try {
//			dataSource.setFilters("stat, wall");
//			if (validationQuery != null) {
//				dataSource.setTestOnBorrow(true);
//				dataSource.setValidationQuery(validationQuery);
//			}
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//		return dataSource;
//	}
//
//	@Bean
//	public SqlSessionFactory sqlSessionFactory() throws Exception {
//		SqlSessionFactoryBean bean = new SqlSessionFactoryBean();
//		bean.setDataSource(dataSource());
//		return bean.getObject();
//
//	}

}
