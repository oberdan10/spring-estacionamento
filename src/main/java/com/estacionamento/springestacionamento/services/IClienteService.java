package com.estacionamento.springestacionamento.services;

import com.estacionamento.springestacionamento.models.Cliente;

public interface IClienteService {

    Iterable<Cliente> buscarTodos();
    Cliente buscarPorCPF(String cpf);
    void inserir(Cliente cliente);
    void atualizar(String cpf, Cliente cliente);
    void deletar(String cpf);
}
