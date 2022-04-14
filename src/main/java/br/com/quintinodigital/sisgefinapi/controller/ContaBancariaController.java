package br.com.quintinodigital.sisgefinapi.controller;

import java.io.Serializable;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.quintinodigital.sisgefinapi.entity.ContaBancariaEntity;
import br.com.quintinodigital.sisgefinapi.service.ContaBancariaService;

@RestController
@RequestMapping(name = "conta-bancaria")
@CrossOrigin
public class ContaBancariaController implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Autowired
	private ContaBancariaService contaBancariaService;
	
	@PostMapping
	public ContaBancariaEntity saveOne(@RequestBody ContaBancariaEntity contaBancariaEntity) {
		return this.contaBancariaService.saveOne(contaBancariaEntity);
	}

}
