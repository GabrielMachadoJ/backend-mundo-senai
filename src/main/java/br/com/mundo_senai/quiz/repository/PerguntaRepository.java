package br.com.mundo_senai.quiz.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.mundo_senai.quiz.model.PerguntaModel;

@Repository
public interface PerguntaRepository extends CrudRepository<PerguntaModel, Long> {

  
}
