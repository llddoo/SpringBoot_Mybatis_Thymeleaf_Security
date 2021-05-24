package com.iu.s1.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {
	
	@Override
	public void configure(WebSecurity web) throws Exception {
		// Security를 무시하는 경로 설정
		web.ignoring()
		   .antMatchers("/resources/**")	
		   .antMatchers("/images/**")
		   .antMatchers("/css/**")
		   .antMatchers("/js/**")
		   .antMatchers("/vendor/**")
		   .antMatchers("/favicon/**")
		   ;
	}
	
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		// TODO Auto-generated method stub
		http
			.authorizeRequests()
				.antMatchers("/")
				.permitAll()//누구나 허용
				.antMatchers("/notice/list", "/notice/select").permitAll()
				.antMatchers("/notice/**").hasRole("ADMIN")
				.anyRequest().authenticated()
//				.antMatchers("/member")
//				.authenticated()//로그인한 유저만 허용
//				.antMatchers("/admin")
//				.hasRole("ADMIN")//로그인한 유저중 ADMIN 만,,
				;
		
		
	}

}