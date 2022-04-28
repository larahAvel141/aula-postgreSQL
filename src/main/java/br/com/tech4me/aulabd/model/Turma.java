package br.com.tech4me.aulabd.model;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import br.com.tech4me.aulabd.view.model.TurmaDTO;


@Entity
@Table(name = "turma", schema = "aulas")
public class Turma {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY )
    private Integer id;
    private Integer numero;

    @Column(name = "data_inicio")
    private LocalDateTime data_inicio;

    public Turma(Integer numero, LocalDateTime data_inicio) {
        this.numero = numero;
        this.data_inicio = data_inicio;
    }
    public Turma(){
        
    }
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
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

    public static Turma from(TurmaDTO dto){
        return new Turma(dto.getNumero(),dto.getData_inicio());
    }
    
    
}
