package br.com.fiap.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "tb_produto")
public class Produto {
	
	@Id
	@SequenceGenerator(name="produto",sequenceName="sq_tb_produto", allocationSize = 2)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "produto")
	private int id;

}
