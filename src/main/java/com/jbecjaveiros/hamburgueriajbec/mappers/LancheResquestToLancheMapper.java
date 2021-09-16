package com.jbecjaveiros.hamburgueriajbec.mappers;

import com.jbecjaveiros.hamburgueriajbec.dto.LancheRequest;
import com.jbecjaveiros.hamburgueriajbec.model.Lanche;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface LancheResquestToLancheMapper {

    Lanche toModel(LancheRequest lancheRequest);
}
