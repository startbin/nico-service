package com.asknico.demo.api.utils;

import org.codehaus.jackson.jaxrs.JacksonJsonProvider;
import org.glassfish.jersey.filter.LoggingFilter;
import org.glassfish.jersey.jackson.JacksonFeature;
import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.web.filter.RequestContextFilter;
/**
 * Registers the components to be used by the JAX-RS application  
 */
public class RestApplication extends ResourceConfig {
	// 注册JAX-RS应用组件
	public RestApplication(){
		//服务类所在的包路径  
		packages("com.asknico.demo.api.service");
		register(RequestContextFilter.class);	// System
		register(JacksonFeature.class);			// System
		register(JacksonJsonProvider.class);	// System
		register(LoggingFilter.class);			// Log

		// 已经实现自动扫描，不需要手动注册
		/*register(AccountService.class);
		register(UserService.class);
		register(DoctorService.class); 
		register(HospitalService.class);
		register(HospitalAuditService.class);
		register(SiteContentService.class);*/
	}
}
