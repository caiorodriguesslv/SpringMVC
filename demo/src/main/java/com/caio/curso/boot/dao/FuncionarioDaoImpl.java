package com.caio.curso.boot.dao;

import org.springframework.stereotype.Repository;

import com.caio.curso.boot.domain.Funcionario;

@Repository
public class FuncionarioDaoImpl extends AbstractDao<Funcionario, Long> implements FuncionarioDao {

}
