package com.resfull.core.service;

import com.resfull.core.repository.GestorUsuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service("usuarioservice")
public class UsuarioService implements UserDetailsService {

    @Autowired
    @Qualifier("gestorUsuario")
    private GestorUsuario repo;

    @Override
    public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException {
        repo.findByUsuario(userName);
        return null;
    }
}
