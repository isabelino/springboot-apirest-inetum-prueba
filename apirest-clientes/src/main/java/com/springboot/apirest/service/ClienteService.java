package com.springboot.apirest.service;

import java.util.List;

import com.springboot.apirest.entity.Cliente;

public interface ClienteService {

	//metodo para buscar todos los clientes
	public List<Cliente> findClients();
	//metodo para buscar cliente por id
	public Cliente findClientById(Long id);
	//metodo para registrar un cliente
	public Cliente saveClient(Cliente cliente);
	//metodo para borrar un cliente
	public Cliente delete(Long id);
}
