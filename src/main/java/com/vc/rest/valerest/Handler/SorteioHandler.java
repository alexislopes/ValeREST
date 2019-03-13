package com.vc.rest.valerest.Handler;

import com.vc.rest.valerest.Document.Sorteio;
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
public class SorteioHandler {

    @Autowired
    SorteioService sorteioService;

    public Mono<ServerResponse> achaTodosSorteios(ServerRequest serverRequest){
        return ok()
                .contentType(MediaType.APPLICATION_JSON)
                .body(sorteioService.achaTodosSorteios(), Sorteio.class);
    }

    public Mono<ServerResponse> achaSorteio(ServerRequest serverRequest){
        String id = serverRequest.pathVariable("_id");
        return ok()
                .contentType(MediaType.APPLICATION_JSON)
                .body(sorteioService.achaSorteio(id), Sorteio.class);
    }

    public Mono<ServerResponse> salvaSorteio(ServerRequest serverRequest){
        final Mono<Sorteio> sorteio = serverRequest.bodyToMono(Sorteio.class);
        return ok()
                .contentType(MediaType.APPLICATION_JSON)
                .body(BodyInserters.fromPublisher(sorteio.flatMap(sorteioService::salvaSorteio), Sorteio.class));
    }
}
