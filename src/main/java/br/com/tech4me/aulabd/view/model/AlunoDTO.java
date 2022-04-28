package br.com.tech4me.aulabd.view.model;

import java.time.LocalDateTime;

import br.com.tech4me.aulabd.model.Aluno;
import br.com.tech4me.aulabd.model.Turma;

public class AlunoDTO {
    private String nome;
    private LocalDateTime data_nascimento;
    private String cpf;
    private Integer turma_id;
    
    public AlunoDTO(String nome, LocalDateTime data_nascimento,String cpf , Integer turma_id) {
        this.nome = nome;
        this.data_nascimento = data_nascimento;
        this.cpf = cpf;
        this.turma_id = turma_id;
    }

    public AlunoDTO(String nome, LocalDateTime data_nascimento, String cpf, Turma turma, Integer id) {
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Integer getTurma_id() {
        return turma_id;
    }

    public void setTurma_id(Integer turma_id) {
        this.turma_id = turma_id;
    }

    public LocalDateTime getData_nascimento() {
        return data_nascimento;
    }

    public void setData_nascimento(LocalDateTime data_nascimento) {
        this.data_nascimento = data_nascimento;
    }

    public static AlunoDTO from(Aluno aluno) {
        return new AlunoDTO(aluno.getNome(), aluno.getData_nascimento() ,aluno.getCpf(), aluno.getTurma(),aluno.getId());
    }
    
}
