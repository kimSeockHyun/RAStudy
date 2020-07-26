package com.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

import com.security.UserAuthenticationProvider;

import lombok.AllArgsConstructor;

@Configuration
@EnableWebSecurity
@AllArgsConstructor
public class SecurityConfig extends WebSecurityConfigurerAdapter {
		
	@Autowired
	private UserAuthenticationProvider authenticationProvider;
	
    @Override
    public void configure(WebSecurity web) throws Exception
    {
        // static 디렉터리의 하위 파일 목록은 인증 무시 ( = 항상통과 )
        web.ignoring().antMatchers("/css/**", "/js/**", "/img/**", "/lib/**");
    }
	
	@Override
	protected void configure(HttpSecurity http) throws Exception {
	
		http.authorizeRequests()
		        .antMatchers("/admin/**").hasRole("ADMIN")
				.antMatchers("/user/myinfo").hasRole("MEMBER")
				.antMatchers("/**").permitAll()
//				.antMatchers("/css/**", "/js/**", "/image/**").permitAll()
//				.antMatchers("/user/**").hasRole("USER")
//				.antMatchers("/admin/**").hasRole("ADMIN")					
		//로그인 
		.and()
			.formLogin()
				.loginPage("/user/login")
				.usernameParameter("userId")
				.passwordParameter("userPassword")
//				.loginProcessingUrl("/loginRequest")
				.successForwardUrl("/home")
				.failureUrl("/user/login?error")
				.permitAll()
		//로그아웃
		.and()
			.logout()
				.logoutUrl("/logout")
				.logoutSuccessUrl("/login")
				.invalidateHttpSession(true)
				.permitAll();
	}
	
    @Override
    protected void configure(AuthenticationManagerBuilder auth) {
        auth.authenticationProvider(authenticationProvider);
    }
    
    
}
