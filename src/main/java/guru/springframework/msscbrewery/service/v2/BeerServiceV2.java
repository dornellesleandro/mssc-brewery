package guru.springframework.msscbrewery.service.v2;

import guru.springframework.msscbrewery.web.model.v2.BeerDtoV2;

import java.util.UUID;

public interface BeerServiceV2 {

    BeerDtoV2 getBeerById(UUID beerId);
    BeerDtoV2 addNewBeer(BeerDtoV2 beerDto);
    void updateById(UUID beerId, BeerDtoV2 beerDto);
    void deleteById(UUID beerId);
}
