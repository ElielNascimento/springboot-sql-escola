package br.com.crud.backend.controller;

import java.io.Serializable;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.crud.backend.dto.PessoaDTO;
import br.com.crud.backend.service.PessoaService;

@RestController
@RequestMapping(value = "/pessoas")
public class PessoaController implements Serializable {
	private static final long serialVersionUID = 1L;

	@Autowired
	private PessoaService pessoaService;

	@GetMapping
	private ResponseEntity<List<PessoaDTO>> findAll() {
		List<PessoaDTO> list = pessoaService.findAll();
		return ResponseEntity.ok().body(list);

	}

	@PostMapping
	public ResponseEntity<PessoaDTO> inser(@RequestBody PessoaDTO dto) {
		dto = pessoaService.insert(dto);
		return ResponseEntity.created(null).body(dto);
	}

}
