package br.com.anime.repository;

import br.com.anime.entity.Anime;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AnimeRepository extends JpaRepository<Anime, Long> {

    Anime findAnimeById(Long id);
}
