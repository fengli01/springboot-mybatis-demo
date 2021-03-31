package cn.guizhou001.hr;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @Description:
 * @author: fengli
 * @date: 2021/3/31 9:54 下午
 */
@SpringBootApplication
@MapperScan("cn.guizhou001.hr.mapper")
public class App {

    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }
}