package br.uninove;

public class Imc {
    
    //Atributos
    private float peso;
    private float altura;
    private float imc;
    private String classificacao;
    
    //Getters and Setters
    public float getPeso() {
        return peso;
    }
    public void setPeso(float peso) {
        this.peso = peso;
    }
   
    public float getAltura() {
        return altura;
    }
    public void setAltura(float altura) {
        this.altura = altura;
    }

    public float getImc() {
        return imc;
    }

    public String getClassificacao() {
        return classificacao;
    } 
    
    //Novo Método
    public float calculaImc(){
        imc = peso / (altura*altura);
        preparaClass();
        return imc;
    }
    
    //Tabela de Classificação
    public void preparaClass(){
        //de: https://arquivos.sbn.org.br/equacoes/eq5.htm
         if(imc < 16) {
            classificacao = "Magreza grau III";
        }else if(imc >= 16 && imc <= 16.9) {
            classificacao = "Magreza grau II";
        }else if(imc >= 17 && imc <= 18.4) {
            classificacao = "Magreza grau I";
        }else if(imc >= 18.5 && imc <= 24.9) {
            classificacao = "Adequado";
        }else if(imc >= 25 && imc <= 29.9) {
            classificacao = "Pré-obeso";
        }else if(imc >= 30 && imc <= 34.9) {
            classificacao = "Obesidade grau I";
        }else if(imc >= 35 && imc <= 39.9) {
            classificacao = "Obesidade grau II";
        }else if(imc >= 40) {
            classificacao = "Obesidade grau III";
        }
    }
}