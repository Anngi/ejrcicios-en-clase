
package pkg104.pkg6.candidatoestudiantil;
import java.util.Scanner;


public class CandidatoEstudiantil {

    public static void main(String[] args) {
        
    int i, p, n, candidatoA = 0, candidatoB = 0, candidatoC = 0, candidatoD = 0, candidatoE = 0, totalvot;
    float porcA, porcB, porcC, porcD, porcE; 
    
    
    Scanner teclado = new Scanner(System.in);
    
    System.out.println("Cuantos sufragantes votaron?"); 
    p = teclado.nextInt();
   
      
     
      
     for (i = 0; i < p; i++) { 
         
        System.out.println("Digite una opcion"); 
      
        System.out.println(" ");
        System.out.println("1. Candidato A");
        System.out.println("2. Candidato B");
        System.out.println("3. Candidato C");
        System.out.println("4. Candidato D");
        System.out.println("5. Candidato E");
        n = teclado.nextInt(); 
        
      
        if (n == 1){
            
            candidatoA = candidatoA + 1;
           
        }
        if (n == 2){
           
            candidatoB = candidatoB + 1;
            
            
        }
        if (n == 3){
            
            candidatoC = candidatoC + 1;
           
        }  
         if (n == 4){
           
            candidatoD = candidatoD + 1;
         }     
        if (n == 5){
            
            candidatoE = candidatoE + 1;
        } 
           
    }
     totalvot = candidatoA + candidatoB + candidatoC + candidatoD + candidatoE;
     
     
     porcA = (float) (candidatoA * 100 / totalvot);
     porcB = (float) (candidatoB * 100 / totalvot);
     porcC = (float) (candidatoC * 100 / totalvot);
     porcD = (float) (candidatoD * 100 / totalvot);
     porcE = (float) (candidatoE * 100 / totalvot);
             
             
             
             
             
     
       System.out.println ("El candidato A tiene "+candidatoA+" votos."); 
       System.out.println ("El candidato B tiene "+candidatoB+" votos.");
       System.out.println ("El candidato C tiene "+candidatoC+" votos.");
       System.out.println ("El candidato D tiene "+candidatoD+" votos.");
       System.out.println ("El candidato E tiene "+candidatoE+" votos.");
       System.out.println (" "); 
       System.out.println (" "); 
       
       System.out.println ("El candidato A tuvo una intencion de votos de "+porcA+" %"); 
       System.out.println ("El candidato B tuvo una intencion de votos de "+porcB+" %");
       System.out.println ("El candidato A tuvo una intencion de votos de "+porcC+" %");
       System.out.println ("El candidato A tuvo una intencion de votos de "+porcD+" %");
       System.out.println ("El candidato A tuvo una intencion de votos de "+porcE+" %");
  
  
    }
}

    
     

    
    

