/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab03;



public class Animal {
    
    private int patas;
    private String raca;
    
    
    public void caminha(){
        System.out.println("Animalzinho passando");
        
    }
    
    public void come(){
        System.out.println("Carne");
        
    }
    
    public void fala(){
        
    
    }
    
    
    public int getPatas() {
        return patas;
    }

    public void setPatas(int patas) {
        this.patas = patas;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }
    
    
    
}