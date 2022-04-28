package br.com.tech4me.aulabd.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.tech4me.aulabd.model.Aluno;

public interface AlunoRepository extends JpaRepository<Aluno , Integer> {
    
}
