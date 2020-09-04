package br.com.wagnerlima85.unittest.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.com.wagnerlima85.unittest.models.Complex;
import br.com.wagnerlima85.unittest.repositories.complex.ComplexRepository;

@Service
@Transactional
public class ComplexService {

	@Autowired
	public ComplexRepository repository;
	
	public Complex create(Complex complex) {
		return repository.save(complex);
	}
}
