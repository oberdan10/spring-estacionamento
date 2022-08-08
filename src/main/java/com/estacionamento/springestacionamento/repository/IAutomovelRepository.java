package com.estacionamento.springestacionamento.repository;

import com.estacionamento.springestacionamento.models.Automovel;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IAutomovelRepository extends CrudRepository<Automovel, String> {

}
