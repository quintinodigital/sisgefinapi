package br.com.quintinodigital.sisgefinapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.quintinodigital.sisgefinapi.entity.ContaBancariaEntity;

public interface ContaBancariaRepository extends JpaRepository<ContaBancariaEntity, Long> { }
