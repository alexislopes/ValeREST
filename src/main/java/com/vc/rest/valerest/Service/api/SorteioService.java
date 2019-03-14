package com.vc.rest.valerest.Service.api;

import com.vc.rest.valerest.Document.Sorteio;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.List;

public interface SorteioService {

    Mono<Sorteio> salvaSorteio(Sorteio sorteio);

    void deletaSorteio(Sorteio sorteio);

    Flux<Sorteio> achaTodosSorteios();

    List<Integer> juntaDezenas(List<Sorteio> sorteios);


}
