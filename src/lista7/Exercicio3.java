/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista7;

import javax.swing.JOptionPane;

/**
 *
 * @author danta
 */
public class Exercicio3 {
    String inverso = "";
    public String inverteNumero(String n){
       
        if(n.length() == 1){
            return n;
        } else {
            inverso += n.charAt(n.length()-1)
                    +inverteNumero(n.substring(0,n.length()-1));
            return inverso;
        }
    }
    public static void main(String[]args){
        Exercicio3 teste = new Exercicio3();
        System.out.println(teste.inverteNumero(JOptionPane.showInputDialog("insira o valor a ser invvertido")));
    }

}
