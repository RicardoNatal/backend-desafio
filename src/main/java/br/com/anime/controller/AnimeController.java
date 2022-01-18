package br.com.anime.controller;

import br.com.anime.entity.Anime;
import br.com.anime.service.AnimeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/anime")
public class AnimeController {

    @Autowired
    private AnimeService servo;

    @PostMapping
    public ResponseEntity<Anime> addAnime(@RequestBody Anime anime) {
        Anime newAnime = servo.addAnime(anime);
        return new ResponseEntity<>(newAnime, HttpStatus.CREATED);
    }

    @PutMapping
    public ResponseEntity<Anime> updateAnime(@RequestBody Anime anime) {
        Anime newAnime = servo.updateAnime(anime);
        return new ResponseEntity<>(newAnime, HttpStatus.OK);
    }

    @GetMapping
    public ResponseEntity<List<Anime>> getall() {
        List<Anime> newAnimes = servo.findAll();
        return new ResponseEntity<>(newAnimes, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Anime> findId(@PathVariable Long id) {
        Anime newAnimes = servo.findById(id);
        return new ResponseEntity<>(newAnimes, HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public void deleteAnime(@PathVariable Long id) {
        servo.deleteAnime(id);
    }
}
