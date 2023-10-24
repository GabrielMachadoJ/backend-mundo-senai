package br.com.mundo_senai.quiz.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.mundo_senai.quiz.model.PontuacaoModel;
import br.com.mundo_senai.quiz.service.PontuacaoService;

@RestController
public class PontuacaoController {
  
  @Autowired
  private PontuacaoService ps;

  @GetMapping("/pontuacao/listar")
  public Iterable<PontuacaoModel> listar(){
    return ps.listar();
  }

}
