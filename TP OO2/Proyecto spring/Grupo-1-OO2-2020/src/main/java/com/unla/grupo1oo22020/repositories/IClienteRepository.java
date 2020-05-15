package com.unla.grupo1oo22020.repositories;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.unla.grupo1oo22020.entities.Cliente;

@Repository("personRepository")
public interface IClienteRepository extends JpaRepository<Cliente, Serializable>{
	
	public abstract Cliente findById(long idPersona);
	
	public abstract Cliente findByNombre(String email);

}