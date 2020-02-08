package com.tedu.sp11;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

//添加zuul代理
@EnableZuulProxy

//添加eureka注册
@EnableDiscoveryClient

@SpringBootApplication
public class Sp11ZuulApplication {

	public static void main(String[] args) {
		SpringApplication.run(Sp11ZuulApplication.class, args);
	}

}
