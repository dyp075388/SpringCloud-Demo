package com.tedu.sp08;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

@SpringBootApplication

//启用断路器仪表盘
@EnableHystrixDashboard
//启用eureka客户端
@EnableDiscoveryClient
public class Sp08HystrixDashboardApplication {

	public static void main(String[] args) {
		SpringApplication.run(Sp08HystrixDashboardApplication.class, args);
	}

}
