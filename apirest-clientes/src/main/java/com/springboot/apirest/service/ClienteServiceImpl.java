package com.springboot.apirest.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.springboot.apirest.dao.ClienteDao;
import com.springboot.apirest.entity.Cliente;

@Service
public class ClienteServiceImpl implements ClienteService{
	
	//hacemos ID desde ClienteDao para utilizar 
	//los metodos de CrudRepository
	@Autowired
	private ClienteDao clienteDao;

	@Override
	@Transactional(readOnly = true)
	public List<Cliente> findClients() {
		return (List<Cliente>) clienteDao.findAll();
	}

	@Override
	@Transactional(readOnly = true)
	public Cliente findClientById(Long id) {
		return clienteDao.findById(id).orElse(null);
	}

	@Override
	@Transactional
	public Cliente saveClient(Cliente cliente) {
		return clienteDao.save(cliente);
	}

	@Override
	@Transactional
	public Cliente delete(Long id) {
		Cliente clienteDelete= clienteDao.findById(id).orElse(null);
		clienteDao.deleteById(id);
		return clienteDelete;
	}

	

}
