package br.com.mundo_senai.quiz.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.mundo_senai.quiz.model.RespostaModel;
import br.com.mundo_senai.quiz.service.RespostaService;

@RestController
@CrossOrigin(origins = "*")
public class RespostaController {

  @Autowired
  private RespostaService rs;

  @GetMapping("/resposta/listar")
  public Iterable<RespostaModel> listar(){
    return rs.listar();
  }
  
}
