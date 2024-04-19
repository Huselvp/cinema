package com.cinema.repository;

import com.cinema.entity.Customers;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

@Repository
@RepositoryRestResource(collectionResourceRel = "client", path = "client")
public interface CustomersRepository extends JpaRepository<Customers, Long> {

}
