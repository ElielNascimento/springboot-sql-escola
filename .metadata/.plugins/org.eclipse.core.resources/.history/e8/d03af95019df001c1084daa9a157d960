package br.com.crud.backend.service;

import java.io.Serializable;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.com.crud.backend.dto.PessoaDTO;
import br.com.crud.backend.entities.Pessoa;
import br.com.crud.backend.enus.PessoaEnum;
import br.com.crud.backend.repository.PessoaRepository;

@Service
public class PessoaService implements Serializable {
	private static final long serialVersionUID = 1L;

	@Autowired
	public PessoaRepository pessoaRepository;

	@Transactional(readOnly = true)
	public List<PessoaDTO> findAll() {
		List<Pessoa> list = pessoaRepository.findAll();
		return list.stream().map(x -> new PessoaDTO(x)).collect(Collectors.toList());
	}

	public PessoaDTO insert(PessoaDTO dto) {
		Pessoa pessoa = new Pessoa(null, dto.getNome(), dto.getIdade(), dto.getCpf(), dto.getCpf(),
				PessoaEnum.PROIBIDA);
		return new PessoaDTO(pessoa);
	}

}
