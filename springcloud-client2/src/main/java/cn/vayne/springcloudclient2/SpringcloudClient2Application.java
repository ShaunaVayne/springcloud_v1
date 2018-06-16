package cn.vayne.springcloudclient2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class SpringcloudClient2Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringcloudClient2Application.class, args);
	}
}
