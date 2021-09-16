package com.jbecjaveiros.hamburgueriajbec.mappers;

import com.jbecjaveiros.hamburgueriajbec.dto.LancheResponse;
import com.jbecjaveiros.hamburgueriajbec.model.Lanche;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface LancheToLancheResponseMapper {
    LancheResponse toDto(Lanche lanche);
}
