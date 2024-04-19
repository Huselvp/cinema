package com.cinema.repository;

import com.cinema.entity.Media;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;


@CrossOrigin("http://localhost:4200")
@Repository
public interface MediaRepository extends JpaRepository<Media, Long> {

}
