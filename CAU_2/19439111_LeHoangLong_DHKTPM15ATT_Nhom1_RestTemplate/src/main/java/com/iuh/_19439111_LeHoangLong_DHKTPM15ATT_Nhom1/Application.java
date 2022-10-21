package com.iuh._19439111_LeHoangLong_DHKTPM15ATT_Nhom1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class Application {
	private static final String URL_SUBJECT = "http://localhost:8083/subject/";
	public static void main(String[] args) {
		RestTemplate restTemplate = new RestTemplate();
//		SpringApplication.run(Application.class, args);
		String result = restTemplate.getForObject(URL_SUBJECT,String.class);
		System.out.println(result);
	}

}
