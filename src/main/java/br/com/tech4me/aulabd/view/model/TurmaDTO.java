package br.com.tech4me.aulabd.view.model;

import java.time.LocalDateTime;

import br.com.tech4me.aulabd.model.Turma;

public class TurmaDTO {
    private Integer numero;
    private LocalDateTime data_inicio;

    public TurmaDTO(Integer numero, LocalDateTime data_inicio) {
        this.numero = numero;
        this.data_inicio = data_inicio;
    }
    
    public Integer getNumero() {
        return numero;
    }
    public void setNumero(Integer numero) {
        this.numero = numero;
    }
    public LocalDateTime getData_inicio() {
        return data_inicio;
    }
    public void setData_inicio(LocalDateTime data_inicio) {
        this.data_inicio = data_inicio;
    }

    public static TurmaDTO from(Turma turma){
        return new TurmaDTO(turma.getNumero(), turma.getData_inicio());
    }

    
}
