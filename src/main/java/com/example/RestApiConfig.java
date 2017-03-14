package com.example;

import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.builders.ResponseMessageBuilder;
import springfox.documentation.schema.ModelRef;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.ResponseMessage;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;


//@EnableWebMvc  
//@ComponentScan(basePackages = {"com.example"})  
@EnableSwagger2  
@Configuration  
public class RestApiConfig{  
 
   @Bean  
   public Docket createRestApi() {  
       return new Docket(DocumentationType.SWAGGER_2)  
               .apiInfo(apiInfo())  
               .select()  
               .apis(RequestHandlerSelectors.basePackage("com.example.Controller"))  
               .paths(PathSelectors.any())  
               .build();  
   }  
 
   private ApiInfo apiInfo() {  
       return new ApiInfoBuilder()  
               .title("Spring 中使用Swagger2构建RESTful APIs")
               .description("This is to show api description")
               .license("Apache 2.0")
               .termsOfServiceUrl("")  
               .contact("尹德")  
               .version("1.1")  
               .build();  
   }  
}  
