package br.com.mundo_senai.quiz.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.mundo_senai.quiz.model.PontuacaoModel;
import br.com.mundo_senai.quiz.repository.PontuacaoRepository;

@Service
public class PontuacaoService {


  @Autowired
  private PontuacaoRepository pr;

  public Iterable<PontuacaoModel> listar() {
    return pr.findAll();
  }
  
}
