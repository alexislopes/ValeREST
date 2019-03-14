package com.vc.rest.valerest.Service.api;

import com.vc.rest.valerest.Document.Dia;
import com.vc.rest.valerest.Document.Sorteio;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.List;

public interface DiaService {

    Mono<Dia> salvaDia(Dia dia);

    Mono<Dia> achaDia(String id);

    Mono<Dia> achaDia(Dia dia);

    void deletaDia(Dia dia);

    void deletaDia(String id);

    Flux<Dia> achaTodosDia();
}
