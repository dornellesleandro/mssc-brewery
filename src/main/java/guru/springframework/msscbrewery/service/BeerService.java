package guru.springframework.msscbrewery.service;

import guru.springframework.msscbrewery.web.model.BeerDto;

import java.util.UUID;

/**
 * Created by jt on 2019-04-20.
 */
public interface BeerService {
    BeerDto getBeerById(UUID beerId);
    BeerDto addNewBeer(BeerDto beerDto);
    void updateById(UUID beerId, BeerDto beerDto);
    void deleteById(UUID beerId);
}
