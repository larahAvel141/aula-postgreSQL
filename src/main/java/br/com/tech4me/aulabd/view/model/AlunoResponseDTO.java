package br.com.tech4me.aulabd.view.model;

import java.time.LocalDateTime;

import br.com.tech4me.aulabd.model.Aluno;

public class AlunoResponseDTO {
    private String nome;
    private LocalDateTime data_nascimemto;
    private String cpf;
    private TurmaDTO turma;

    public AlunoResponseDTO(String nome, LocalDateTime data_nascimemto, String cpf, TurmaDTO turma) {
        this.nome = nome;
        this.data_nascimemto = data_nascimemto;
        this.cpf = cpf;
        this.turma = turma;
    }

    public static AlunoResponseDTO from(Aluno aluno) {
        TurmaDTO dto = new TurmaDTO(aluno.getTurma().getNumero(), aluno.getTurma().getData_inicio());
        return new AlunoResponseDTO(aluno.getNome(),aluno.getData_nascimento(),aluno.getCpf(),dto);
        
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDateTime getData_nascimemto() {
        return data_nascimemto;
    }

    public void setData_nascimemto(LocalDateTime data_nascimemto) {
        this.data_nascimemto = data_nascimemto;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public TurmaDTO getTurma() {
        return turma;
    }

    public void setTurma(TurmaDTO turma) {
        this.turma = turma;
    }
}
