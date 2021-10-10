package one.digitalinnovation.unitTestsBeerStock.mapper;

import one.digitalinnovation.unitTestsBeerStock.dto.BeerDTO;
import one.digitalinnovation.unitTestsBeerStock.entity.Beer;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface BeerMapper {

    BeerMapper INSTANCE = Mappers.getMapper(BeerMapper.class);

    Beer toModel(BeerDTO beerDTO);

    BeerDTO toDTO(Beer beer);
}
