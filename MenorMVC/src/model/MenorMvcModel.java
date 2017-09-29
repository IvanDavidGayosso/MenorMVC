/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Ivan David
 */
public class MenorMvcModel {
    int n1;
    int n2;
    int n3;
    int mn;
    
    public int getN1(){
        return n1;
    }
    public void setN1(int n1){
        this.n1 = n1;
    }
     public int getN2(){
        return n2;
    }
    public void setN2(int n2){
        this.n2 = n2;
    }
     public int getN3(){
        return n3;
    }
    public void setN3(int n3){
        this.n3 = n3;   
    } 
    public int getMN(){
        return mn;
    }
    public void setMN(int mn){
        this.mn = mn;
    }
    
    public void Menor(){
        
        mn = n1;
        if(mn > n2) {
            mn = n2;
        }
        if (mn > n3) {
            mn = n3;
        }
        
}

}