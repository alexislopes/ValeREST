package com.vc.rest.valerest.Service;

import com.vc.rest.valerest.Document.Dia;
import com.vc.rest.valerest.Repository.DiaRepository;
import com.vc.rest.valerest.Service.api.DiaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service("diaService")
public class DiaServiceImpl implements DiaService {

    @Autowired
    private DiaRepository diaRepository;

    public void setDiaRepository(DiaRepository diaRepository) {
        this.diaRepository = diaRepository;
    }

    @Override
    public Mono<Dia> salvaDia(Dia dia) {
        return diaRepository.save(dia);
    }

    @Override
    public Mono<Dia> achaDia(String id) {
        return diaRepository.findById(id);
    }

    @Override
    public Mono<Dia> achaDia(Dia dia) {
        return diaRepository.findById(dia.get_id());
    }

    @Override
    public void deletaDia(Dia dia) {
        diaRepository.delete(dia);
    }

    @Override
    public void deletaDia(String id) {
        diaRepository.deleteById(id);
    }

    @Override
    public Flux<Dia> achaTodosDia() {
        return diaRepository.findAll();
    }
}
