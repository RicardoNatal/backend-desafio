package br.com.anime.entity;

import com.sun.istack.NotNull;

import javax.persistence.*;
import java.util.List;

@Entity
@Table
public class Anime {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column
    private Long id;

    @Column
    @NotNull
    private String name;

    @Column
    @NotNull
    private String imageUrl;

    @Column
    @NotNull
    private String category;

    @Column
    @NotNull
    private String description;

    @OneToMany(mappedBy = "anime", cascade = CascadeType.PERSIST)
    private List<Fact> facts;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public List<Fact> getFacts() {
        return facts;
    }

    public void setFacts(List<Fact> facts) {
        this.facts = facts;
    }
}
