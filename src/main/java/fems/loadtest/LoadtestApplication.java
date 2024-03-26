package fems.loadtest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableScheduling
@SpringBootApplication
public class LoadtestApplication {

    public static void main(String[] args) {
        SpringApplication.run(LoadtestApplication.class, args);
    }

}
