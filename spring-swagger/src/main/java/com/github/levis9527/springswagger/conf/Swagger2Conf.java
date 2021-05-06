package com.github.levis9527.springswagger.conf;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

@Configuration
public class Swagger2Conf {

    @Bean
    public Docket createRestApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.github.levis9527.springswagger"))
                .paths(PathSelectors.any())
                .build();
    }

    @Bean
    public ApiInfo apiInfo() {
//        Contact contact=new Contact("作者名",
//                "http://www.jianshu.com/u/f192766abeab","email地址");
        return new ApiInfoBuilder()
                .title("Api文档")
                .description("XXX项目文档")
                .termsOfServiceUrl("http://www.baidu.com")
//                .contact(contact)
                .version("1.0.0")
                .build();
    }
}
