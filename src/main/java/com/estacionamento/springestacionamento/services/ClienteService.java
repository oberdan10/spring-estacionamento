package com.estacionamento.springestacionamento.services;

import com.estacionamento.springestacionamento.models.Automovel;
import com.estacionamento.springestacionamento.models.Cliente;
import com.estacionamento.springestacionamento.repository.IAutomovelRepository;
import com.estacionamento.springestacionamento.repository.IClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ClienteService implements IClienteService{

    @Autowired
    private IClienteRepository clienteRepository;
    @Autowired
    private IAutomovelRepository automovelRepository;

    @Override
    public Iterable<Cliente> buscarTodos() {
        // Buscar todos os Clientes.
        return clienteRepository.findAll();
    }

    @Override
    public Cliente buscarPorCPF(String cpf) {
        // Buscar Cliente por CPF.
        Optional<Cliente> cliente = clienteRepository.findById(cpf);
        return cliente.get();
    }

    @Override
    public void inserir(Cliente cliente) {
        Automovel auto = automovelRepository.save(cliente.getAutomovel());
        cliente.setAutomovel(auto);
        clienteRepository.save(cliente);
    }

    @Override
    public void atualizar(String cpf, Cliente cliente) {
        // Buscar Cliente por CPF, caso exista:

        Optional<Cliente> clienteBd = clienteRepository.findById(cpf);
        if (clienteBd.isPresent()) {
            Automovel auto = automovelRepository.save(cliente.getAutomovel());
            cliente.setAutomovel(auto);
            clienteRepository.save(cliente);
        }
    }

    @Override
    public void deletar(String cpf) {
        // Deletar Cliente por CPF.
        clienteRepository.deleteById(cpf);
    }
}
