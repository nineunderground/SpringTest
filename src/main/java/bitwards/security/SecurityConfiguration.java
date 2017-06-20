package bitwards.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.http.SessionCreationPolicy;

@Configuration
@EnableWebSecurity
public class SecurityConfiguration extends WebSecurityConfigurerAdapter {
	public static String REALM = "Weather_credentials";
    
    @Autowired
    /**
     * Authentication users allowed
     * @param auth Authentication Manager Builder
     * @throws Exception
     */
    public void configureGlobalSecurity(AuthenticationManagerBuilder auth) throws Exception {
        auth.inMemoryAuthentication().withUser("root").password("bitwards").roles("ADMIN");
    }
     
    /**
     * List of security policies added for each endpoint
     */
    @Override
    protected void configure(HttpSecurity http) throws Exception {
    	/*
    	 * Security policy added for path "bitwards" that refuses all connections 
    	 * from users that has not admin role.
    	 * At this point the authenticationEntryPoint expects the implementation
    	 * of an specific Security profile level (Basic Auth, Digest, Oauth, etc...)
    	*/
    	http.csrf().disable()
        .authorizeRequests()
        .antMatchers("/bitwards").hasRole("ADMIN")
        .and().httpBasic().realmName(REALM).authenticationEntryPoint(getBasicAuthEntryPoint())
        .and().sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS);
    }
     
    /**
     * Basic Authentication class for basic user & pass
     * requests that overrides the refused connection behaviour  
     * @return Customm Basic Authentication
     */
    @Bean
    public BitwardsBasicAuthentication getBasicAuthEntryPoint(){
        return new BitwardsBasicAuthentication();
    }
     
    /* To allow Pre-flight [OPTIONS] request from browser */
    @Override
    public void configure(WebSecurity web) throws Exception {
        web.ignoring().antMatchers(HttpMethod.OPTIONS, "/**");
    }
}
