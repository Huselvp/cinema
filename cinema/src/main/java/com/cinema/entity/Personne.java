package com.cinema.entity;

import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Personne {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private LocalDateTime addedDate;
    private LocalDateTime dateDeNaissance;
    private String nom;
    private String prenom;
    private String photo;

    @Enumerated(EnumType.STRING)
    private TypePersonne typePersonne;
    @ManyToMany
    @JoinTable(
            name = "film_personne",
            joinColumns = @JoinColumn(name = "personne_id"),
            inverseJoinColumns = @JoinColumn(name = "film_id")
    )
    private Set<Film> films = new HashSet<>();

    public enum TypePersonne {
        DIRECTOR,
        ARTIST
    }

    // Constructors, getters, and setters

    public Personne() {
    }

    public Personne(LocalDateTime addedDate, LocalDateTime dateDeNaissance, String nom, String prenom, String photo, TypePersonne typePersonne) {
        this.addedDate = addedDate;
        this.dateDeNaissance = dateDeNaissance;
        this.nom = nom;
        this.prenom = prenom;
        this.photo = photo;
        this.typePersonne = typePersonne;
    }

    // Getters and setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDateTime getAddedDate() {
        return addedDate;
    }

    public void setAddedDate(LocalDateTime addedDate) {
        this.addedDate = addedDate;
    }

    public LocalDateTime getDateDeNaissance() {
        return dateDeNaissance;
    }

    public void setDateDeNaissance(LocalDateTime dateDeNaissance) {
        this.dateDeNaissance = dateDeNaissance;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public TypePersonne getTypePersonne() {
        return typePersonne;
    }

    public void setTypePersonne(TypePersonne typePersonne) {
        this.typePersonne = typePersonne;
    }

    public Set<Film> getFilms() {
        return films;
    }

    public void setFilms(Set<Film> films) {
        this.films = films;
    }

    @Override
    public String toString() {
        return "Personne{" +
                "id=" + id +
                ", addedDate=" + addedDate +
                ", dateDeNaissance=" + dateDeNaissance +
                ", nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", photo='" + photo + '\'' +
                ", typePersonne=" + typePersonne +
                '}';
    }
}
