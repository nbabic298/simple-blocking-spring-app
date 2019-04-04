package io.codifica.test.simple.blockingservice;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@Slf4j
@SpringBootApplication
public class BlockingServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(BlockingServiceApplication.class, args);
		log.info("Available processors: {}", Runtime.getRuntime().availableProcessors());
		log.info("Available memory: {}", Runtime.getRuntime().totalMemory());
	}

}
