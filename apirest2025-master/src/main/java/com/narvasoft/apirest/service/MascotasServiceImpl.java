package com.narvasoft.apirest.service;

import com.narvasoft.apirest.models.Mascotas;
import com.narvasoft.apirest.repository.MascotasRepository;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class MascotasServiceImpl implements MascotasService{

    @Autowired
    private MascotasRepository userRepository;//inyección de dependencias

    @Transactional(readOnly = true)
    public Iterable<Mascotas> findAll() {
        return userRepository.findAll();
    }

    @Override
    @Transactional(readOnly = true)
    public Page<Mascotas> findAll(Pageable pageable) {
        return userRepository.findAll(pageable);
    }

    @Override
    @Transactional(readOnly = true)
    public Optional<Mascotas> findById(Long id) {
        return userRepository.findById(id);
    }

    @Override
    @Transactional
    public Mascotas save(Mascotas user) {
        return userRepository.save(user);
    }

    @Override
    @Transactional
    public void deleteById(Long id) {
        userRepository.deleteById(id);
    }

}
