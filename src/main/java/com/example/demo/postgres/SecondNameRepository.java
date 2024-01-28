package com.example.demo.postgres;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface SecondNameRepository extends JpaRepository<SecondName, Long> {
}
