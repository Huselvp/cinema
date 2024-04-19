package com.cinema.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Film {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Date addedDate;
    private int annee;
    private int duree;
    private String titre;
    @ManyToMany(mappedBy = "films")
    private Set<Personne> artistes = new HashSet<>();

    @ManyToOne
    private Personne directeur;

    public Film(Date addedDate, int annee, int duree, String titre) {
        this.addedDate = addedDate;
        this.annee = annee;
        this.duree = duree;
        this.titre = titre;
    }
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getAddedDate() {
        return addedDate;
    }

    public void setAddedDate(Date addedDate) {
        this.addedDate = addedDate;
    }

    public int getAnnee() {
        return annee;
    }

    public void setAnnee(int annee) {
        this.annee = annee;
    }

    public int getDuree() {
        return duree;
    }

    public void setDuree(int duree) {
        this.duree = duree;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }
    public Set<Personne> getArtistes() {
        return artistes;
    }

    public void setArtistes(Set<Personne> artistes) {
        this.artistes = artistes;
    }

    public Personne getDirecteur() {
        return directeur;
    }

    public void setDirecteur(Personne directeur) {
        this.directeur = directeur;
    }



    @Override
    public String toString() {
        return "Film{" +
                "id=" + id +
                ", addedDate=" + addedDate +
                ", annee=" + annee +
                ", duree=" + duree +
                ", titre='" + titre + '\'' +
                '}';
    }
}
