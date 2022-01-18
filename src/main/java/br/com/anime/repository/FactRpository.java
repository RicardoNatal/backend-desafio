package br.com.anime.repository;

import br.com.anime.entity.Fact;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FactRpository extends JpaRepository<Fact, Long> {

    List<Fact> findFactById(Long id);
}
