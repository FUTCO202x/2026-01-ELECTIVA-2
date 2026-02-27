package com.example.demo.service;

import java.util.Optional;

import org.springframework.stereotype.Service;
import com.example.demo.model.Usuario;
import com.example.demo.repository.UsuarioRespository;

@Service
public class UsuarioService implements IUsuarioService {

    private final UsuarioRespository usuarioRepository;

    public UsuarioService(UsuarioRespository usuarioRepository) {
        this.usuarioRepository = usuarioRepository;
    }

    @Override
    public Optional<Usuario> create(Usuario usuario) {
        Usuario savedUsuario = usuarioRepository.save(usuario);
        return Optional.of(savedUsuario);
    }

}
