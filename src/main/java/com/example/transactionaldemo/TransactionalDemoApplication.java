package com.example.transactionaldemo;

import com.example.transactionaldemo.controller.UserController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
public class TransactionalDemoApplication {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(TransactionalDemoApplication.class, args);
    }

}
