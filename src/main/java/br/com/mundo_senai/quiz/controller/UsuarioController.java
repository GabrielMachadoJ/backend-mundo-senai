package br.com.mundo_senai.quiz.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.mundo_senai.quiz.model.UsuarioModel;
import br.com.mundo_senai.quiz.service.UsuarioService;

@RestController
@CrossOrigin(origins = "*")
public class UsuarioController {
  
  @Autowired
  private UsuarioService us;

  @PostMapping("/cadastrar/usuario")
  public ResponseEntity<?> cadastrar(@RequestBody UsuarioModel um) {
    return us.cadastrar(um);
  }

  @GetMapping("/usuario/listar")
  public Iterable<UsuarioModel> listar() {
    return us.listar();
  }
}
