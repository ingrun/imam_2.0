package cn.ingrun.imam;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("cn.ingrun.imam.mapper")
@SpringBootApplication
public class ImamApplication {

    public static void main(String[] args) {
        SpringApplication.run(ImamApplication.class, args);
    }

}
