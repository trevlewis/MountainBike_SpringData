package com.bike.mountain.config;

import org.springframework.context.annotation.Configuration;
//import org.springframework.context.annotation.Import;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
//import org.springframework.data.rest.webmvc.RepositoryRestMvcConfiguration;

@Configuration
//@Import(RepositoryRestMvConfiguration.class)
@EnableJpaRepositories(basePackages= {"com.bike.mountain.repository"})
public class JpaConfiguration {

}
