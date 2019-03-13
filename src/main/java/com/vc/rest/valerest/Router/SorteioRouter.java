package com.vc.rest.valerest.Router;

import com.vc.rest.valerest.Handler.SorteioHandler;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.MediaType;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.RouterFunctions;
import org.springframework.web.reactive.function.server.ServerResponse;

import static org.springframework.web.reactive.function.server.RequestPredicates.*;

@Configuration
public class SorteioRouter {

    @Bean
    public RouterFunction<ServerResponse> route(SorteioHandler sorteioHandler){
        return RouterFunctions
                .route(GET("/sorteio").and(accept(MediaType.APPLICATION_JSON)), sorteioHandler::achaTodosSorteios)
                        .andRoute(GET("/sorteio/{id}").and(accept(MediaType.APPLICATION_JSON)), sorteioHandler::achaSorteio)
                .andRoute(POST("/sorteio").and(accept(MediaType.APPLICATION_JSON)), sorteioHandler::salvaSorteio);
    }
}
