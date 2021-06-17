package com.example.algamoney.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.algamoney.model.Pessoa;
import com.example.algamoney.repository.PessoaRepository;

@RestController
@RequestMapping("/pessoas")
public class PessoaResource {
	
	@Autowired
	private PessoaRepository pessoaRepository;	
	
	@GetMapping
	public List<Pessoa> listar() {
		return pessoaRepository.findAll(); 
	}
	
	//TODO: Método Post para cadastrar Pessoa 
	
	//TODO: Método Buscar Pessoa pelo ID 
	
	//TODO: Adicionar validações e exceções em todos os métodos

}
