package br.com.mundo_senai.quiz.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.mundo_senai.quiz.model.AssuntoModel;
import br.com.mundo_senai.quiz.repository.AssuntoRepository;

@Service
public class AssuntoSerivce {

  @Autowired
  private AssuntoRepository ar;

  public Iterable<AssuntoModel> listar(){
    return ar.findAll();
  }
  
}
