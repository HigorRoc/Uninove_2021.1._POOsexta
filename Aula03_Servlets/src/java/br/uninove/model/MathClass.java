package br.uninove.model;

public class MathClass {
    
    public static double somar(double numberOne, double numberTwo){
        return numberOne + numberTwo;
    }
    
    public static double subtrair(double numberOne, double numberTwo){
        return numberOne - numberTwo;
    }
    
    public static double multiplicar(double numberOne, double numberTwo){
        return numberOne * numberTwo;
    }
    
    public static double dividir(double numberOne, double numberTwo){
        return numberOne / numberTwo;
    }
    
    public static double elevar(double numberOne, double numberTwo){
        return Math.pow(numberOne, numberTwo);
    }
}