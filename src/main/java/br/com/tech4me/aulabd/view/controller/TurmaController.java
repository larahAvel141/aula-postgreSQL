package br.com.tech4me.aulabd.view.controller;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.tech4me.aulabd.model.Turma;
import br.com.tech4me.aulabd.service.TurmaService;
import br.com.tech4me.aulabd.view.model.TurmaDTO;

@RestController
@RequestMapping("api/turma")
public class TurmaController {
    
    @Autowired
    private TurmaService service;

    @GetMapping
    public ResponseEntity<List<TurmaDTO>> obterTurmas(){
        List<Turma> turmas = service.obterTurmas();
        
        List<TurmaDTO> dtos = turmas.stream()
        .map(turma -> TurmaDTO.from(turma))
        .collect(Collectors.toList());
        return new ResponseEntity<>(dtos,HttpStatus.OK);
    }
    
    @PostMapping
    public ResponseEntity<TurmaDTO> salvarTurma(@RequestBody TurmaDTO dto){
        Turma turma = Turma.from(dto);
        turma = service.salvar(turma);
        return new ResponseEntity<>(dto, HttpStatus.CREATED);
       
    }
}
