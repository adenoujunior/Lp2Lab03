/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab03;

public class AnimalEstimacao {
    public static void main(String[] args) {
     Animal a1 = new Animal();
     Animal a2 = new Animal();
    
    Gato g1 = new Gato();
    Cachorro c1 = new Cachorro();
    Leao l1 = new Leao();
    
    g1.setNomeDoGato("Mimi");
    c1.setNomeDoCachorro("Rex");
    
    a1.setRaca("Egyptian Mau");
    a2.setRaca("Pit Bull");
    
        System.out.println("Nome do gato: " + g1.getNomeDoGato());
        System.out.println("Come: ");
        a1.come();
        a1.caminha();
        System.out.println("RaÃ§a: " + a1.getRaca());
        
        System.out.println("Nome do cachorro: " + c1.getNomeDoCachorro());
        a2.come();
        a2.caminha();
        System.out.println("RaÃ§a: " + a2.getRaca());
        
    
    
    }
    public void brincar(){
        
    }
    
    
}

