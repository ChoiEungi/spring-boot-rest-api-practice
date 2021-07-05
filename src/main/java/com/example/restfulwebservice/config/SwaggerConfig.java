package com.example.restfulwebservice.config;


import com.sun.xml.bind.v2.schemagen.xmlschema.Appinfo;
import io.swagger.models.Contact;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfig {
    private static final Contact DEFAULT_CONTACT = new Contact();


    @Bean
    public Docket api() {
        return new Docket(DocumentationType.SWAGGER_2);
    }
}
