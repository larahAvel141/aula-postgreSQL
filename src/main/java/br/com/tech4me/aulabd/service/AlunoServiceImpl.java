package br.com.tech4me.aulabd.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.tech4me.aulabd.model.Aluno;
import br.com.tech4me.aulabd.repository.AlunoRepository;

@Service
public class AlunoServiceImpl implements  AlunoService{

    @Autowired
    private AlunoRepository rep;

    @Override
    public Aluno salvarAluno(Aluno aluno) {
        return rep.save(aluno);
    }

    @Override
    public List<Aluno> obterAlunos() {
        return rep.findAll();
    }
    
}
