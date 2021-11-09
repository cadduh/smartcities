package br.com.fiap.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@Entity
public class Produto {
	
	@Id
	private int id;

}
