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
public class Exercicio1 {

    public static int calcFatorial(int n){
        if(n < 2){
            return n;
        }else{
            return n * calcFatorial(n - 1);
        }
        
    }    
    
    public static void main(String[] args) {
        // TODO code application logic here
        int n = Integer.parseInt(JOptionPane.showInputDialog("digite o fatorial: "));
        JOptionPane.showMessageDialog(null, calcFatorial(n));
    }
}
