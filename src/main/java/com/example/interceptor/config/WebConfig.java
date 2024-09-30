package com.example.interceptor.config;

import com.example.interceptor.interceptor.HeaderValidationInterceptor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration // Indica que esta classe contém configurações Spring
public class WebConfig implements WebMvcConfigurer {

    private final HeaderValidationInterceptor headerValidationInterceptor;

    // A injeção de dependência (padrão)
    public WebConfig(HeaderValidationInterceptor headerValidationInterceptor) {
        this.headerValidationInterceptor = headerValidationInterceptor;
    }

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        // Registra o interceptor para qualquer requisição que comece com /api/
        registry.addInterceptor(headerValidationInterceptor)
                .addPathPatterns("/api/**");
    }
}