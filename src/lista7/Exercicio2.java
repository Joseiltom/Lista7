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
public class Exercicio2 {

    public static int fibonacci(int n)  {
        if(n == 0){
            return 0;}
        else if(n == 1){
            return 1;}
        else{
            return fibonacci(n - 1) + fibonacci(n - 2);}
    }
    public static void main(String[] args) {
        System.out.println(fibonacci(6));
    }
    
}
