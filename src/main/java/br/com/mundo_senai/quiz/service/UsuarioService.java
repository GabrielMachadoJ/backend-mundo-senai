package br.com.mundo_senai.quiz.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import br.com.mundo_senai.quiz.model.UsuarioModel;
import br.com.mundo_senai.quiz.repository.UsuarioRepository;

@Service
public class UsuarioService {
  
  @Autowired
  private UsuarioRepository ur;


  public Iterable<UsuarioModel> listar() {
    return ur.findAll();
  }

  public ResponseEntity<?> cadastrar(UsuarioModel um) {

    return new ResponseEntity<UsuarioModel>(ur.save(um), HttpStatus.CREATED);

  }
}
