package br.com.mundo_senai.quiz.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.mundo_senai.quiz.model.PontuacaoModel;

@Repository
public interface PontuacaoRepository extends CrudRepository<PontuacaoModel, Long> {
  
}
