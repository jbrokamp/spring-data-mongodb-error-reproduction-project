package com.example.springdatamongodberror;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.config.EnableMongoAuditing;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

//@EntityScan("com.example.entity") // Uncomment this line to fix the error
@EnableMongoRepositories(value = {"com.example"})
@EnableMongoAuditing  // Commenting this line fixes the exception
@SpringBootApplication
public class SpringDataMongodbErrorApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringDataMongodbErrorApplication.class, args);
    }

}
