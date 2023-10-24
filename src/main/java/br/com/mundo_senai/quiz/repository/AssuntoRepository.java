package br.com.mundo_senai.quiz.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.mundo_senai.quiz.model.AssuntoModel;

@Repository
public interface AssuntoRepository extends CrudRepository<AssuntoModel, Long> {
  
}
