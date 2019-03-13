package com.vc.rest.valerest.Repository;

import com.vc.rest.valerest.Document.Sorteio;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface SorteioRepository extends ReactiveMongoRepository<Sorteio, String> {

}
