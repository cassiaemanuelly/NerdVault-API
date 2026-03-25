package com.vaultnerd.api.controller;

import com.vaultnerd.api.filmes.Filme;
import com.vaultnerd.api.repository.FilmeRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/filmes")
public class FilmeController {
    private  final FilmeRepository repo;

    public FilmeController(FilmeRepository repo) {
        this.repo = repo;
    }

    @GetMapping
    public List<Filme> listar() {
        return repo.findAll();
    }

    @PostMapping
    public Filme salvar(@RequestBody Filme f) {
        return repo.save(f);
    }

    @GetMapping("/busca")
    public List<Filme> buscar(@RequestParam String franquia) {
        return repo.findByFranquiaIgnoreCase(franquia);
    }

    @DeleteMapping("/{id}")
    public void excluir(@PathVariable Long id) {
        repo.deleteById(id);
    }
}
