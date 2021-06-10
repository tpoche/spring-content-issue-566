package com.example.springcontentissue566;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.content.fs.config.EnableFilesystemStores;
import org.springframework.context.annotation.PropertySource;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication(scanBasePackages = "com.example.*")
@EnableScheduling
@EnableFilesystemStores("com.example.child.repository")
@EnableJpaRepositories("com.example.child.repository")
@EntityScan("com.example.child.repository")
@PropertySource("classpath:config/child.properties")
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
