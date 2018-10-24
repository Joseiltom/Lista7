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
public class Exercicio5 {

    public static int calcSoma(int n){
        if(n <= 0){
            return 0;
        }
        return calcSoma(n-1) + n;
    }
    
    public static void main(String[] args) {
        System.out.println(calcSoma(3));
    }
    
}
