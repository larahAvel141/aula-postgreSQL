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

import br.com.tech4me.aulabd.model.Aluno;
import br.com.tech4me.aulabd.service.AlunoService;
import br.com.tech4me.aulabd.view.model.AlunoDTO;
import br.com.tech4me.aulabd.view.model.AlunoResponseDTO;

@RestController
@RequestMapping("api/alunos")
public class AlunoController {

    @Autowired
    private AlunoService ser;

    @GetMapping
    public ResponseEntity<List<AlunoResponseDTO>> obterTurmas(){
        List<Aluno> alunos = ser.obterAlunos();
        
        List<AlunoResponseDTO> dtos = alunos.stream()
        .map(aluno -> AlunoResponseDTO.from(aluno))
        .collect(Collectors.toList());
        return new ResponseEntity<>(dtos,HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<AlunoDTO> salvarAluno(@RequestBody AlunoDTO dto ){
        Aluno aluno = Aluno.from(dto);
        aluno = ser.salvarAluno(aluno);
        return new ResponseEntity<>(dto, HttpStatus.CREATED);
    }
    
}
