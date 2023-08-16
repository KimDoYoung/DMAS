package kr.co.kalpa.dmas;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackageClasses = DmasApplication.class)
public class DmasApplication {

    public static void main(String[] args) {
        SpringApplication.run(DmasApplication.class, args);
    }

}
