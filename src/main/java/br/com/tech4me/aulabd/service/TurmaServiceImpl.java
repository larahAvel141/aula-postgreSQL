package br.com.tech4me.aulabd.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.tech4me.aulabd.model.Turma;
import br.com.tech4me.aulabd.repository.TurmaRepository;

@Service
public class TurmaServiceImpl implements TurmaService{

    @Autowired
    private TurmaRepository repository;

    @Override
    public Turma salvar(Turma turma) {
        return repository.save(turma);
    }

    @Override
    public List<Turma> obterTurmas() {
        return repository.findAll();
    }
    
}
