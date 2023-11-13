package com.pggm.authlib.middlewares;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.client.WebClient;
import org.springframework.web.server.WebFilter;

@Configuration
@Slf4j
public class AuthMiddleware {
    private WebClient webclient;
    @Bean
    public WebFilter authMiddleware(WebClient.Builder build) {



        webclient = build.baseUrl("localhost").build();

        return ((exchange, chain) -> {
            final var request = exchange.getRequest();
            final var path = request.getPath();

           return  chain.filter(exchange);
        });
    }
}
