package com.example.demo.algamoney.api.config;

import java.net.PasswordAuthentication;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.web.ProjectedPayload;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.http.SessionCreationPolicy;

@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter{
	
	@Override
	protected void configure(AuthenticationManagerBuilder aut) throws Exception {
		aut.inMemoryAuthentication()
		.withUser("admin").password("admin").roles("ROLE");
	}
	
	@Override
	protected void configure(HttpSecurity http)throws Exception{
		http.authorizeRequests()
			.antMatchers("/categorias").permitAll()
			.antMatchers().authenticated()
			.and()
		.httpBasic().and()
		.sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS).and()
		.csrf().disable();
	}
}	