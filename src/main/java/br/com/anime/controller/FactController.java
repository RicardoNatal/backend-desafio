package br.com.anime.controller;

import br.com.anime.entity.Anime;
import br.com.anime.entity.Fact;
import br.com.anime.service.AnimeService;
import br.com.anime.service.FactService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/fact")
public class FactController {

    @Autowired
    private FactService servo;

    @Autowired
    private AnimeService animeService;

    @PostMapping
    public ResponseEntity<Fact> addFact(@RequestBody Fact fact) {

        Fact newFact = servo.addFact(fact);

        return new ResponseEntity<>(newFact, HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List<Fact>> getAll() {
        List<Fact> newFact = servo.findAll();
        return new ResponseEntity<>(newFact, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<List<Fact>> getById(@PathVariable Long id) {
        List<Fact> newFact = servo.findById(id);
        return new ResponseEntity<>(newFact, HttpStatus.OK);
    }

    @PutMapping
    public ResponseEntity<Fact> updateFact(@RequestBody Fact fact) {
        Fact newFact = servo.updateFact(fact);
        return new ResponseEntity<>(newFact, HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public void deleteFact(@PathVariable Long id) {
        servo.deleteFact(id);
    }
}
