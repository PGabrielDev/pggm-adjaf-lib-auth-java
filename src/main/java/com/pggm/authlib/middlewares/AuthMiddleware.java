package com.pggm.authlib.middlewares;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.client.WebClient;
import org.springframework.web.server.WebFilter;

import java.util.ArrayList;
import java.util.Map;

@Configuration
@Slf4j
public class AuthMiddleware {

    private WebClient webclient;

    @Bean
    public AuthenticatedRequestPath authenticatedRequestPath(){
        return new AuthenticatedRequestPath(new ArrayList<>());
    }
    @Bean
    public WebFilter AuthMiddleware(WebClient.Builder build, AuthenticatedRequestPath authenticatedRequestPath) {
        Map<String, String> envs = System.getenv();
        String authURL = envs.get("AUTH_URL");
        this.webclient = build.baseUrl(authURL).build();

        return ((exchange, chain) -> {
            final var request = exchange.getRequest();
            final var path = request.getPath().toString();
            final var method = request.getMethod().name();
            if (authenticatedRequestPath.verifyAuthenticatedRequest(path,method)) {
                return chain.filter(exchange);
            }else {

                return chain.filter(exchange);
            }
        });
    }
}
