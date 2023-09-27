package br.com.Tcc.TccBusLanes.repository.projections;

import java.time.LocalTime;

public class ResumoHorarios {
    private Integer idhorarios;
    private LocalTime horarios;
    private String linhas;
    private String semana;

    public ResumoHorarios( Integer idhorarios, LocalTime horarios, String linhas, String semana) {
        this.idhorarios = idhorarios;
        this.horarios = horarios;
        this.linhas = linhas;
        this.semana= semana;
    }

    public Integer getIdhorarios() {
        return idhorarios;
    }

    public void setIdhorarios(Integer idhorarios) {
        this.idhorarios = idhorarios;
    }

    public LocalTime getHorarios() {
        return horarios;
    }

    public void setHorarios(LocalTime horarios) {
        this.horarios = horarios;
    }

    public String getLinhas() {
        return linhas;
    }

    public void setLinhas(String linhas) {
        this.linhas = linhas;
    }

    public String getSemana() {
        return semana;
    }

    public void setSemana(String semana) {
        this.semana = semana;
    }
}
