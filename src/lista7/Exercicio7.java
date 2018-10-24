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
public class Exercicio7 {

    public static int quantidadeNum(String n,String b, int c){
        if(c < 0){
            return 0;
        }
        else if(b.charAt(0) == n.charAt(c)){
            return quantidadeNum(n,b, c-1) + 1;
        }
        return quantidadeNum(n,b, c-1);
    }
    public static void main(String[] args) {
        System.out.println(quantidadeNum("1212", "1", 3));
    }
    
}
