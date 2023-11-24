package com.yourui.redis;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import redis.clients.jedis.Jedis;

@SpringBootApplication
public class SpringBootEnableApplication {
    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(SpringBootEnableApplication.class, args);
        Jedis jedis = (Jedis) context.getBean("jedis");
        System.out.println("jedis: "+jedis);
    }
}