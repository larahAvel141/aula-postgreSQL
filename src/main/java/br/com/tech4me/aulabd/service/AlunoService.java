package br.com.tech4me.aulabd.service;

import java.util.List;

import org.springframework.stereotype.Service;

import br.com.tech4me.aulabd.model.Aluno;

@Service
public interface AlunoService {
    
    Aluno salvarAluno(Aluno aluno) ;

    List<Aluno> obterAlunos();
}
