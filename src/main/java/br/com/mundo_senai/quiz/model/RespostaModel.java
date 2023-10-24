package br.com.mundo_senai.quiz.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "respostas")
@Getter
@Setter
public class RespostaModel {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long codigo;
  private String resposta;


  private int idPergunta;
  private String alternativaCorreta; //Recebe "Correta" ou "Errada"
}
