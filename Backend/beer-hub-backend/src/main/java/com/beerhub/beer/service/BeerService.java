package com.beerhub.beer.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.beerhub.beer.model.Beer;
import com.beerhub.beer.repository.BeerRepository;

import java.util.List;
import java.util.Optional;

@Service
public class BeerService {

    private final BeerRepository beerRepository;

    @Autowired
    public BeerService(BeerRepository beerRepository) {
        this.beerRepository = beerRepository;
    }

    public List<Beer> getAllBeers() {
        return beerRepository.findAll();
    }

    public Optional<Beer> getBeerById(Long id) {
        return beerRepository.findById(id);
    }

    public Beer createBeer(Beer beer) {
        return beerRepository.save(beer);
    }

    public Beer updateBeer(Long id, Beer updatedBeer) {
        if (beerRepository.existsById(id)) {
            updatedBeer.setId(id);
            return beerRepository.save(updatedBeer);
        }
        return null; 
    }

    public boolean deleteBeer(Long id) {
        if (beerRepository.existsById(id)) {
            beerRepository.deleteById(id);
            return true;
        }
        return false;
    }
}
