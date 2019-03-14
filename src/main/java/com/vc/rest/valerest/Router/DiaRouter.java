package com.vc.rest.valerest.Router;

import com.vc.rest.valerest.Handler.DiaHandler;
import com.vc.rest.valerest.Handler.SorteioHandler;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.MediaType;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.RouterFunctions;
import org.springframework.web.reactive.function.server.ServerResponse;

import static org.springframework.web.reactive.function.server.RequestPredicates.*;
import static org.springframework.web.reactive.function.server.RequestPredicates.accept;

@Configuration
public class DiaRouter {

    @Bean
    public RouterFunction<ServerResponse> route(DiaHandler diaHandler){
        return RouterFunctions
                .route(GET("/dia").and(accept(MediaType.APPLICATION_JSON)), diaHandler::achaTodosDia)
                .andRoute(GET("/dia/{id}").and(accept(MediaType.APPLICATION_JSON)), diaHandler::achaDia)
                .andRoute(POST("/dia").and(accept(MediaType.APPLICATION_JSON)), diaHandler::salvaDia);
    }
}
