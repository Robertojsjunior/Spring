package com.speed.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.speeds.model.Pessoa;
import com.speeds.repository.PessoaRepository;

@RestController("/pessoa")
public class PessoaController {
	
	@Autowired
	PessoaRepository pessoaRepository;
	
	@PostMapping
	public Pessoa salvarPessoa(@RequestBody Pessoa pessoa) {
		return pessoaRepository.save(pessoa);
	}
	
	@GetMapping
	public List<Pessoa> buscarTodas() {
		return pessoaRepository.findAll();
	}
}
 