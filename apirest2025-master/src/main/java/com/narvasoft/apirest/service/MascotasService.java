package com.narvasoft.apirest.service;

import com.narvasoft.apirest.models.Mascotas;
import com.narvasoft.apirest.models.Usuarios;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.Optional;

public interface MascotasService {
    public Iterable<Mascotas> findAll();

    public Page<Mascotas> findAll(Pageable pageable);

    public Optional<Mascotas> findById(Long id);

    public Mascotas save(Mascotas mascotas);

    public void deleteById(Long id);
}