package com.kafka;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;

@org.springframework.boot.autoconfigure.SpringBootApplication
public class SpringBootApplication implements CommandLineRunner {
    public static void main(String[] args) {
        SpringApplication.run(SpringBootApplication.class);
    }

    @Autowired
    private MediaProducer mediaProducer;

    @Override
    public void run(String... args) throws Exception {
        mediaProducer.sendMessage();
    }
}
