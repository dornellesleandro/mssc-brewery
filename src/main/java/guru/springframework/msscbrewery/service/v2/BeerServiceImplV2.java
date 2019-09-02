package guru.springframework.msscbrewery.service.v2;

import guru.springframework.msscbrewery.web.model.v2.BeerDtoV2;
import guru.springframework.msscbrewery.web.model.v2.BeerStyleEnum;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.UUID;

/**
 * Created by jt on 2019-04-20.
 */
@Slf4j
@Service
public class BeerServiceImplV2 implements BeerServiceV2 {
    @Override
    public BeerDtoV2 getBeerById(UUID beerId) {
        return BeerDtoV2.builder().id(beerId)
                .beerName("Blauzent Beer")
                .beerStyle(BeerStyleEnum.LAGER)
                .upc(7)
                .build();
    }

    @Override
    public BeerDtoV2 addNewBeer(BeerDtoV2 beerDto) {
        return BeerDtoV2.builder()
                .id(beerDto.getId())
                .upc(beerDto.getUpc())
                .beerName(beerDto.getBeerName())
                .beerStyle(beerDto.getBeerStyle())
                .build();
    }

    @Override
    public void updateById(UUID beerId, BeerDtoV2 beerDto) {
        log.debug("Updating a beer...");
        //todo add business logic here
    }

    @Override
    public void deleteById(UUID beerId) {
        log.debug("Deleting a beer...");
        //todo add business logic here
    }
}
