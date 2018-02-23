package com.adamzareba.spring.security.oauth2.config.cache;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

@Configuration
@ImportResource({"classpath:oauth2-ehcache.xml"})
public class OAuth2CacheConfig {

}
