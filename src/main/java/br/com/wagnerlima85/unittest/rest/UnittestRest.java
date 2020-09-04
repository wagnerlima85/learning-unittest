package br.com.wagnerlima85.unittest.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import br.com.wagnerlima85.unittest.models.Complex;
import br.com.wagnerlima85.unittest.service.ComplexService;

@RestController
@RequestMapping("/complex")
public class UnittestRest {

	@Autowired
	private ComplexService service;
	
	@PostMapping(value = "/create" )
    @ResponseStatus(HttpStatus.CREATED)
    public void create(@RequestBody Complex e) {
        service.create(e);
    }
	
	@GetMapping(value = "/test" )
    @ResponseStatus(HttpStatus.ACCEPTED)
    public void test() {
		System.err.println("Cheguei");
    }
	
	
}
