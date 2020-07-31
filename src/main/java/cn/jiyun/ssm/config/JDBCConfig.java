package cn.jiyun.ssm.config;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import javax.sql.DataSource;

@Configuration
@PropertySource("classpath:jdbc.properties")
public class JDBCConfig {
    @Value("${jdbc.driverClassName}")
    private  String  driverClassName;
    @Value("${jdbc.url}")
    private  String  url;
    @Value("${jdbc.username}")
    private  String  username;
    @Value("${jdbc.password}")
    private  String  password;
    @Bean
    public DataSource dataDouse(){
        DruidDataSource dataSource = new DruidDataSource();
        dataSource.setUrl(this.url);
        dataSource.setPassword(this.password);
        dataSource.setDriverClassName(this.driverClassName);
        dataSource.setUsername(this.username);
        System.out.println(this.password);
        return  dataSource;
    }
}
