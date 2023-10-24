package br.com.mundo_senai.quiz.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.mundo_senai.quiz.model.PerguntaModel;
import br.com.mundo_senai.quiz.repository.PerguntaRepository;

@Service
public class PerguntaService {
  
  @Autowired
  private PerguntaRepository pr;

  //Método para listar todas as perguntas
  public Iterable<PerguntaModel> listar(){
    return pr.findAll();
  }
}
