package com.estacionamento.springestacionamento.repository;

import com.estacionamento.springestacionamento.models.Cliente;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IClienteRepository extends CrudRepository<Cliente, String> {

}
