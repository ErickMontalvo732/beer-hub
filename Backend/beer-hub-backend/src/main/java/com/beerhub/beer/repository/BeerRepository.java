package com.beerhub.beer.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.beerhub.beer.model.Beer;

public interface BeerRepository extends JpaRepository<Beer, Long> {
}