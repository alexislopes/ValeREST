package com.vc.rest.valerest.Handler;


import com.vc.rest.valerest.Document.Dia;
import com.vc.rest.valerest.Document.Sorteio;
import com.vc.rest.valerest.Service.api.DiaService;
import com.vc.rest.valerest.Service.api.SorteioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.BodyInserters;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;
import reactor.core.publisher.Mono;

import static org.springframework.web.reactive.function.server.ServerResponse.ok;

@Component
public class DiaHandler {

    @Autowired
    DiaService diaService;

    public Mono<ServerResponse> achaTodosDia(ServerRequest serverRequest){
        return ok()
                .contentType(MediaType.APPLICATION_JSON)
                .body(diaService.achaTodosDia(), Dia.class);
    }

    public Mono<ServerResponse> achaDia(ServerRequest serverRequest){
        String id = serverRequest.pathVariable("_id");
        return ok()
                .contentType(MediaType.APPLICATION_JSON)
                .body(diaService.achaDia(id), Dia.class);
    }

    public Mono<ServerResponse> salvaDia(ServerRequest serverRequest){
        final Mono<Dia> dia = serverRequest.bodyToMono(Dia.class);
        return ok()
                .contentType(MediaType.APPLICATION_JSON)
                .body(BodyInserters.fromPublisher(dia.flatMap(diaService::salvaDia), Dia.class));
    }
}
