package com.jbecjaveiros.hamburgueriajbec.repositories;

import com.jbecjaveiros.hamburgueriajbec.model.Lanche;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LancheRepository extends JpaRepository<Lanche, Long> {


}
