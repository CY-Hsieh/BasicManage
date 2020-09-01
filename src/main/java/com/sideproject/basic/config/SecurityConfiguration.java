package com.sideproject.basic.config;

import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@EnableWebSecurity
public class SecurityConfiguration extends WebSecurityConfigurerAdapter {
	
    @Override
    protected void configure(HttpSecurity http) throws Exception {
//    			http.headers().frameOptions().disable();
    			http.headers().frameOptions().sameOrigin();
                http
                .authorizeRequests()
                .antMatchers("/**","/h2-console/**").permitAll()
                .anyRequest()
                .authenticated()
                .and().formLogin()
                .and().httpBasic()
                .and().csrf().disable(); 

    }

}
