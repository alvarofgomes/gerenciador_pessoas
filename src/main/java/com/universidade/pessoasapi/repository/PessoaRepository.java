package com.universidade.pessoasapi.repository;

import com.universidade.pessoasapi.model.Pessoa;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PessoaRepository extends JpaRepository<Pessoa, Long> {
	
}