package com.vaultnerd.api.repository;

import com.vaultnerd.api.filmes.Filme;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface FilmeRepository extends JpaRepository<Filme, Long> {
    List<Filme> findByFranquiaIgnoreCase(String franquia);
}
