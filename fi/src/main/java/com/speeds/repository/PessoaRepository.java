package com.speeds.repository;

import javax.persistence.EntityManager;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.speeds.model.Pessoa;


@Repository
public class PessoaRepository {
	private EntityManager em;
	
	public Pessoa findByID(long id) {
		return (Pessoa) em.createNativeQuery("select * from clientes where id_cliente = : pid", Pessoa.class).setParameter("id_cliente", id).getSingleResult();
		
		
	}
}
