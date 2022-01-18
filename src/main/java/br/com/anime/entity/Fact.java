package br.com.anime.entity;

import com.sun.istack.NotNull;

import javax.persistence.*;

@Entity
@Table
public class Fact {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column
    private Long id;

    @Column
    @NotNull
    private String fact;

    @ManyToOne(cascade = CascadeType.PERSIST)
    @NotNull
    private Anime anime;

    @Column
    @NotNull
    private int surpriseLevel;

    public Fact() {
    }

    public Fact(Long id, String fact, Anime anime, int surpriseLevel) {
        this.id = id;
        this.fact = fact;
        this.anime = anime;
        this.surpriseLevel = surpriseLevel;
    }

    public Long getId() {
        return id;
    }

    public Anime getAnime() {
        return anime;
    }

    public void setAnime(Anime anime) {
        this.anime = anime;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFact() {
        return fact;
    }

    public void setFact(String fact) {
        this.fact = fact;
    }

    public int getSurpriseLevel() {
        return surpriseLevel;
    }

    public void setSurpriseLevel(int surpriseLevel) {
        this.surpriseLevel = surpriseLevel;
    }
}
