package br.com.anime.service;

import br.com.anime.entity.Fact;
import br.com.anime.repository.FactRpository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class FactService {

    @Autowired
    private FactRpository repo;

    public Fact addFact(Fact fact) {
        return repo.save(fact);
    }

    public Fact updateFact(Fact fact) {
        return repo.save(fact);
    }

    public List<Fact> findById(Long id) {
        return repo.findFactById(id);
    }

    public List<Fact> findAll() {
        return repo.findAll();
    }

    public void deleteFact(Long id) {
        repo.deleteById(id);
    }
}
