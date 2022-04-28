package br.com.tech4me.aulabd.model;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import br.com.tech4me.aulabd.view.model.AlunoDTO;

@Entity
@Table(name = "aluno" , schema = "aulas")
public class Aluno {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String nome;
    @Column(name = "data_nascimento")
    private LocalDateTime data_nascimento;

    private String cpf;

    @ManyToOne
    @JoinColumn(name = "turma_id")
    private Turma turma;

    public Aluno(){
    }

    public Aluno(String nome,LocalDateTime data_nascimento ,String cpf, Turma turma) {
        this.nome = nome;
        this.data_nascimento = data_nascimento;
        this.cpf = cpf;
        this.turma= turma;
    }
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
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
    public Turma getTurma() {
        return turma;
    }
    public void setTurma(Turma turma) {
        this.turma = turma;
    }
    
    public LocalDateTime getData_nascimento() {
        return data_nascimento;
    }
    
    public void setData_nascimento(LocalDateTime data_nascimento) {
        this.data_nascimento = data_nascimento;
    }

    public static Aluno from(AlunoDTO dto){
        Turma turma = new Turma();
        turma.setId(dto.getTurma_id());
        return new Aluno(dto.getNome(),dto.getData_nascimento(),dto.getCpf(), turma);
    }
    
}
