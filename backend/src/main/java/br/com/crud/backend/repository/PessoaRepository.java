package br.com.crud.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.crud.backend.entities.Pessoa;
@Repository
public interface PessoaRepository extends JpaRepository<Pessoa, Long> {

}
