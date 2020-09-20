package br.itau.justificativa.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table (name = "itmn232_atividade")
public class Atividade {

    @Column (name = "id_atividade")
    public int id_atividade;

    @Column (name = "nome_atividade", length = 100, nullable = false)
    public String nome_atividade;

    public int getId_atividade() {
        return id_atividade;
    }

    public void setId_atividade(int id_atividade) {
        this.id_atividade = id_atividade;
    }

    public String getNome_atividade() {
        return nome_atividade;
    }

    public void setNome_atividade(String nome_atividade) {
        this.nome_atividade = nome_atividade;
    }

       
}
