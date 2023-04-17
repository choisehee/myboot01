package com.myboot01;

import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

public class ServletInitializer extends SpringBootServletInitializer { // ServletInitializer의 역할은 스프링 부트 애플리케이션을 web.xml없이 톰캐쇼에서 실행하게 해주는 것

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(Myboot01Application.class);
	}

}
