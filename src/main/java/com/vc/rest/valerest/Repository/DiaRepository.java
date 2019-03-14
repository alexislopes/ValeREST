package com.vc.rest.valerest.Repository;

import com.vc.rest.valerest.Document.Dia;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface DiaRepository extends ReactiveMongoRepository<Dia, String> {
}
