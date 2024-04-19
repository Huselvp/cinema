package com.cinema.dto;

import java.util.Date;

import com.cinema.entity.Nationalite;
import com.cinema.entity.Personne;
import org.springframework.data.rest.core.config.Projection;





@Projection(name = "inlinePersonne", types = { Personne.class })
public interface InlinePersonne {
    Long getId();
    String getNom();
    String getPrenom();
    String getPhoto();
    Date getDateNaissance();
    Personne.TypePersonne getTypePersonne();
    Date getAddedDate();
    Nationalite getNationalite();
}