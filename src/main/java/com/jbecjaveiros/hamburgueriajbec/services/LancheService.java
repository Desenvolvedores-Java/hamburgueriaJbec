package com.jbecjaveiros.hamburgueriajbec.services;

import com.jbecjaveiros.hamburgueriajbec.dto.LancheRequest;
import com.jbecjaveiros.hamburgueriajbec.dto.LancheResponse;
import com.jbecjaveiros.hamburgueriajbec.mappers.LancheToLancheResponseMapper;
import com.jbecjaveiros.hamburgueriajbec.mappers.LancheResquestToLancheMapper;
import com.jbecjaveiros.hamburgueriajbec.repositories.LancheRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class LancheService {

    @Autowired
    private LancheRepository lancheRepository;

    @Autowired
    private LancheToLancheResponseMapper lancheToLancheResponseMapper;

    @Autowired
    private LancheResquestToLancheMapper lancheResquestToLancheMapper;

    public LancheResponse create(LancheRequest lancheRequest) {
        return Optional.of(lancheResquestToLancheMapper.toModel(lancheRequest))
                .map(lancheRepository::save)
                .map(lancheToLancheResponseMapper::toDto)
                .orElseThrow(()-> new RuntimeException("Falha ao criar o lanche"));
    }
}
