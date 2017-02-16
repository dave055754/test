package com.youkeshu.ht;

import java.io.IOException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ImportResource;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableAutoConfiguration
@ImportResource("classpath:spring.xml")
@EnableAsync
@EnableScheduling
public class Application {
	private static final Logger LOGGER = LoggerFactory.getLogger(Application.class);
	public static void main(String[] args) throws IOException {
		System.out.println("Application");
		SpringApplication.run(Application.class, args);
		System.out.println("测试流程");
		
		System.out.println("测试同步");			
}
}
