package com.example.urlshortner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.redis.connection.jedis.JedisConnectionFactory;

@SpringBootApplication
public class UrlShortnerApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(UrlShortnerApplication.class, args);
	}

}

