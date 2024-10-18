/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Usuario
 */
public class LISTA {
    private Nodo inicio;
    
    public Lista(){
        inicio = null; // La lista está vacia
        
    }
    
    public void gragarNodo(int valor){
        //PONER EL VALOR EN UN NODO
        Nodo nuevo= new Nodo (valor);
        //MOVERNOS HATA EL ULTIMO NODO
        if(inicio==null)
            inicio=nuevo;
        else{
            //MOVERNOS HASTA EL ULTIMO NODO
            Nodo temp = inicio;
            while(temp.getSiguiene() !=null){
                System.out.print("(" + temp.getValor() + ")");
            temp = temp.getSiguiente();
        }
            // CONECTAMOS
            temp.setSiguiente(nuevo);
            
        }
        
    }
    
    public void imprimir(){
        
    }
}
