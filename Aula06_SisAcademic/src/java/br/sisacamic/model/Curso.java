package br.sisacamic.model;

public class Curso {
    
    //Propriedades/Atributos
    private int idCurso;
    private String nomeCurso;
    private String tipoCurso;
    
    //Construtores
    public Curso() {
    }

    public Curso(int idCurso, String nomeCurso, String tipoCurso) {
        this.idCurso = idCurso;
        this.nomeCurso = nomeCurso;
        this.tipoCurso = tipoCurso;
    }
    
    //Getters e Setters
    public int getIdCurso() {
        return idCurso;
    }

    public void setIdCurso(int idCurso) {
        this.idCurso = idCurso;
    }

    public String getNomeCurso() {
        return nomeCurso;
    }

    public void setNomeCurso(String nomeCurso) {
        this.nomeCurso = nomeCurso;
    }

    public String getTipoCurso() {
        return tipoCurso;
    }

    public void setTipoCurso(String tipoCurso) {
        this.tipoCurso = tipoCurso;
    }
    
}
