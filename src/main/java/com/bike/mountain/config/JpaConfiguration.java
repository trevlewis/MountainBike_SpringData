package com.bike.mountain.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@EnableJpaRepositories(basePackages= {"com.bike.mountain.repository"})
public class JpaConfiguration {

}
