package com.tedu.sp06;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.http.client.SimpleClientHttpRequestFactory;
import org.springframework.web.client.RestTemplate;
@EnableDiscoveryClient
@SpringBootApplication
public class Sp06RibbonApplication {


	//创建 RestTemplate 实例，并存入 spring 容器
	@LoadBalanced//此注解是为了配合controller中的服务id实现负载均衡
	@Bean
	public RestTemplate getRestTemplate() {
		//		return new RestTemplate();

		//为了添加ribbon重试添加的超时时间的设置

		SimpleClientHttpRequestFactory f = new SimpleClientHttpRequestFactory();
		//连接超时
		f.setConnectTimeout(1000);
		//??
		f.setReadTimeout(1000);
		return new RestTemplate(f);
	}



	public static void main(String[] args) {
		SpringApplication.run(Sp06RibbonApplication.class, args);
	}



}
