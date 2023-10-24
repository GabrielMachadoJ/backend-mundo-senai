package br.com.mundo_senai.quiz.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "pontuacoes")
@Getter
@Setter
public class PontuacaoModel {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private long codigo;
  private int id_usuario;
  private int pontuacao;
}
