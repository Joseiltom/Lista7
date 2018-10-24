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
public class Exercicio4 {
    
    public static int calcVetor(int vetor[], int n){
        if(n <= 0){
            return 0;
        }
        return calcVetor(vetor, n-1) + vetor[n-1];
    }
    public static void main(String[] args) {
        int vetor[] = {0,1,2,3,4,5};
        System.out.println(calcVetor(vetor, vetor.length));
    }
    
}
