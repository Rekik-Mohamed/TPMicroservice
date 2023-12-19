package com.example.msbanque2;

import com.example.msbanque2.web.CompteRestJaxRSAPI;
import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyConfig {
    @Bean
    public ResourceConfig resourceConfig(){
        ResourceConfig jersey = new ResourceConfig();
        jersey.register(CompteRestJaxRSAPI.class);
        return jersey;
    }
}
