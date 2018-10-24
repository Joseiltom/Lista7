/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista7;

/**
 *
 * @author danta
 */
public class Exercicio8 {

    public static int calcMult(int n,int c){
        if(c == 0){
            return 0;
        }
        return n + calcMult(n, c-1);
    }
    public static void main(String[] args) {
        System.out.println(calcMult(5, 5));
    }
    
}
