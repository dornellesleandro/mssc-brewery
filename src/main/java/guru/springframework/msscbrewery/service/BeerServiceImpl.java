package guru.springframework.msscbrewery.service;

import guru.springframework.msscbrewery.web.model.BeerDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.UUID;

/**
 * Created by jt on 2019-04-20.
 */
@Slf4j
@Service
public class BeerServiceImpl implements BeerService {
    @Override
    public BeerDto getBeerById(UUID beerId) {
        return BeerDto.builder().id(beerId)
                .beerName("Blauzent Beer")
                .beerStyle(BeerDto.BeerStyleEnum.LAGER)
                .upc(7)
                .build();
    }

    @Override
    public BeerDto addNewBeer(BeerDto beerDto) {
        return BeerDto.builder()
                .id(beerDto.getId())
                .upc(beerDto.getUpc())
                .beerName(beerDto.getBeerName())
                .beerStyle(beerDto.getBeerStyle())
                .build();
    }

    @Override
    public void updateById(UUID beerId, BeerDto beerDto) {
        log.debug("Updating a beer...");
        //todo add business logic here
    }

    @Override
    public void deleteById(UUID beerId) {
        log.debug("Deleting a beer...");
        //todo add business logic here
    }
}
