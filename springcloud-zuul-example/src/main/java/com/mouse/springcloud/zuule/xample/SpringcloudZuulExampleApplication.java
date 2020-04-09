package com.mouse.springcloud.zuule.xample;

import com.mouse.springcloud.zuule.xample.error.ErrorFilter;
import com.mouse.springcloud.zuule.xample.post.PostFilter;
import com.mouse.springcloud.zuule.xample.pre.PreFilter;
import com.mouse.springcloud.zuule.xample.route.RouteFilter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;

@EnableZuulProxy
@SpringBootApplication
public class SpringcloudZuulExampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringcloudZuulExampleApplication.class, args);
	}

	@Bean
	public PreFilter preFilter() {
		return new PreFilter();
	}

	@Bean
	public RouteFilter routeFilter() {
		return new RouteFilter();
	}

	@Bean
	public PostFilter postFilter() {
		return new PostFilter();
	}

	@Bean
	public ErrorFilter errorFilter() {
		return new ErrorFilter();
	}

}
