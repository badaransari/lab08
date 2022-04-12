/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.lab8;

/**
 *
 * @author badaransari
 */
public class lab08 {
    



public static void main(String[] args){
 int i,primeNum=1,sumPrime=0,a=0; 
while (primeNum<1000000){
 int factors=0; 
 for(i=1;i<=primeNum;i++){
 if((primeNum%10)==3){
  factors++;
   }
             }
 	if(factors==2){
      if(primeNum<1000000){
 sumPrime=primeNum+a;
 a=sumPrime; 
  }
 System.out.println(primeNum); 
                  } 
primeNum++; 
     } 	
System.out.println(sumPrime); 
}

}
