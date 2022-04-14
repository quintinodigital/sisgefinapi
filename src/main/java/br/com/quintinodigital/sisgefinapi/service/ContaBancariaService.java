package br.com.quintinodigital.sisgefinapi.service;

import java.io.Serializable;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.quintinodigital.sisgefinapi.entity.ContaBancariaEntity;
import br.com.quintinodigital.sisgefinapi.repository.ContaBancariaRepository;

@Service
public class ContaBancariaService implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Autowired
	private ContaBancariaRepository contaBancariaRepository;
	
	public ContaBancariaEntity saveOne(ContaBancariaEntity contaBancariaEntity) {
		return this.contaBancariaRepository.save(contaBancariaEntity);
	}

}
