package br.com.quintinodigital.sisgefinapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.quintinodigital.sisgefinapi.entity.PessoaEntity;

public interface PessoaRepository extends JpaRepository<PessoaEntity, Long> { }
