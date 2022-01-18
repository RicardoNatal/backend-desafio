package br.com.anime.service;

import br.com.anime.entity.Anime;
import br.com.anime.repository.AnimeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class AnimeService {

    @Autowired
    private AnimeRepository repo;

    public Anime addAnime(Anime anime) {
        return repo.save(anime);
    }

    public Anime findById(Long id) {
        return repo.findAnimeById(id);
    }

    public List<Anime> findAll() {
        return repo.findAll();
    }

    public Anime updateAnime(Anime anime) {
        return repo.save(anime);
    }

    public void deleteAnime(Long id) {
        repo.deleteById(id);
    }
}
