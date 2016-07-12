package com.fire.jpa.auto;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class TestEM {

	public static void main(String[] args) {
		EntityManagerFactory fact =
	Persistence.createEntityManagerFactory("CiaoJPA");
		EntityManager manager =
				fact.createEntityManager();
		Campo campo = new Campo();
		campo.setCoperto(new BigDecimal(1));
		campo.setDataRifacimento(new Date());
		campo.setNome("CAMPO 2");
		campo.setStato("DISASTROSO");
		
		manager.getTransaction().begin();
		manager.persist(campo);
		manager.getTransaction().commit();
		
		
		manager.close();
		fact.close();

	}

}
