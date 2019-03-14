package com.vc.rest.valerest.Service;

import com.vc.rest.valerest.Document.Sorteio;
import com.vc.rest.valerest.Repository.SorteioRepository;
import com.vc.rest.valerest.Service.api.SorteioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.ArrayList;
import java.util.List;

@Service("sorteioService")
public class SorteioServiceImpl implements SorteioService {

    @Autowired
    private SorteioRepository sorteioRepository;

    public void setSorteioRepository(SorteioRepository sorteioRepository) {
        this.sorteioRepository = sorteioRepository;
    }

    @Override
    @Transactional
    public Mono<Sorteio> salvaSorteio(Sorteio sorteio) {
        return sorteioRepository.save(sorteio);
    }

    @Override
    @Transactional
    public void deletaSorteio(Sorteio sorteio) {
        sorteioRepository.delete(sorteio);

    }

    @Override
    @Transactional
    public Flux<Sorteio> achaTodosSorteios() {
        return sorteioRepository.findAll();
    }

    @Override
    public List<Integer> juntaDezenas(List<Sorteio> sorteios) {
        List<Integer> dezenas = new ArrayList<>();
        for(Sorteio s : sorteios){
            dezenas.addAll(s.getDezenas());
        }
        return dezenas;
    }
}
