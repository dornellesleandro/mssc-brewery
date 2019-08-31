package guru.springframework.msscbrewery.web.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class BeerDto {

    private UUID id;
    private String beerName;
    private BeerStyleEnum beerStyle;
    private long upc;


    public static enum BeerStyleEnum{
        PILSNER, LAGER, WEISS, IPA, APA, STOUT
    }
}
