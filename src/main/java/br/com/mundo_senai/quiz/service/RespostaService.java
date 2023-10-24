package br.com.mundo_senai.quiz.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.mundo_senai.quiz.model.RespostaModel;
import br.com.mundo_senai.quiz.repository.RespostaRepository;

@Service
public class RespostaService {

  @Autowired
  private RespostaRepository rr;

  public Iterable<RespostaModel> listar(){
    return rr.findAll();
  }
  
}
