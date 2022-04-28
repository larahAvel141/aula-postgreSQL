package br.com.tech4me.aulabd.service;

import java.util.List;

import org.springframework.stereotype.Service;

import br.com.tech4me.aulabd.model.Turma;

@Service
public interface TurmaService {
    
   Turma salvar(Turma turma);

   List<Turma> obterTurmas();
   
   

}
