package com.tedu.sp04;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
//添加eureka注册中心客户端启动
//@EnableDiscoveryClient
//添加启动hystrix
//@EnableCircuitBreaker
//@SpringBootApplication

//以上三个注释用下面代替
@SpringCloudApplication
//添加启动feign
@EnableFeignClients
public class Sp04OrderserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(Sp04OrderserviceApplication.class, args);
	}

}
