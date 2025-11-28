package com.senai.infob.trabalhoin.configs;

import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;

@Configuration
@OpenAPIDefinition(
    info = @Info(
        title = "API TESTE",
        version = "1.0",
        description = "Api para aplicativo teste" 
    )
)

public class Swagger {
    
}
