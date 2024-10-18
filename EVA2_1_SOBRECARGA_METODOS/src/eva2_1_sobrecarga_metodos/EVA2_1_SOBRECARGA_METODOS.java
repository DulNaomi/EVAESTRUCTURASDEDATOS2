/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_1_sobrecarga_metodos;

/**
 *
 * @author 
 */
public class EVA2_1_SOBRECARGA_METODOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("La suma de 5 + 4 = " + sumar(5,4));
        System.out.println("La suma de 3.1 + 2.5 = " + sumar(3.1,2.5));
        System.out.println("La suma de hola + mundo = " + sumar("Hola","Mundo"));
        sumar();
     //SUMAR: MÉTODO SOBRECARGADO, MISMO NOMBRE PARA
     //3 DIFERENTES MÉTODOS
     
    }
    public static int sumar(int num1, int num2){
        return num1 + num2;
    }
    public static double sumar(double num1, double num2){
        return num1 + num2;
    }    
    public static String sumar(String num1, String num2){
        return num1 + num2;
    }   
    
     public static void sumar(){
        System.out.println("Método que no hace nada!!");
    }
      public static int sumar(int num1, int num2, int num3){
        return num1 + num2;
    }
}
