package com.yeg.zi.ziservicecli;

import org.springframework.web.client.RestTemplate;

import com.yeg.test.model.User;

public class TestRestTemplate {

	public static void main(String[] args) {

		RestTemplate rest = new RestTemplate();
		String url = "http://localhost:8080/ziservice/user/test1/{id}";
		int id = 1;
		User user = rest.getForObject(url, User.class, id);
		

		System.out.println(user);

	}
}
