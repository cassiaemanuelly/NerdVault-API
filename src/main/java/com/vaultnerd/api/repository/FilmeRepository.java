package com.vaultnerd.api.repository;

import com.vaultnerd.api.filmes.Filme;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FilmeRepository extends JpaRepository<Filme, Long> {
}
