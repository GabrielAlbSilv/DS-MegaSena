
package Model;

import java.util.Random;  //chamando biblioteca da função Radom
import javax.swing.JOptionPane;

public class Operacoes {
    public static String x = " "; //tornando String x publica em toda classe Operações
    
    public static void SorteMega(){
    
        Random Gera = new Random(); //iniciando função ramdom
        int i = 0;
        int [] vet =  new int[6];
        
       
        for(i=0; i<6; i++){
        
        vet [i] = Gera.nextInt(60); //jogando valores da ramdom no vet[i]
        x = x + vet[i] + "  "; //colocando espaço entre os números
        }
      
 
    }
    
    public static void SorteLoto(){
        Random Gera = new Random(); //iniciando função ramdom
        int i = 0;
        int [] vet =  new int[6];
        
       
        for(i=0; i<6; i++){
        
        vet [i] = Gera.nextInt(99); //jogando valores da ramdom no vet[i]
        x = x + vet[i] + "  "; //colocando espaço entre os números
        }
    
    }
    public static void SorteQuina(){
        Random Gera = new Random(); //iniciando função ramdom
        int i = 0;
        int [] vet =  new int[5];
        
       
        for(i=0; i<5; i++){
        
        vet [i] = Gera.nextInt(80); //jogando valores da ramdom no vet[i]
        x = x + vet[i] + "  "; //colocando espaço entre os números
        }
    
    }
    public static void SorteDupla(){
        Random Gera = new Random(); //iniciando função ramdom
        int i = 0;
        int [] vet =  new int[6];
        
       
        for(i=0; i<6; i++){
        
        vet [i] = Gera.nextInt(50); //jogando valores da ramdom no vet[i]
        x = x + vet[i] + "  "; //colocando espaço entre os números
        }
    
    }
    public static void SorteFacil(){
        Random Gera = new Random(); //iniciando função ramdom
        int i = 0;
        int [] vet =  new int[5];
        
       
        for(i=0; i<5; i++){
        
        vet [i] = Gera.nextInt(25); //jogando valores da ramdom no vet[i]
        x = x + vet[i] + "  "; //colocando espaço entre os números
        }
    
    }
    public static void SorteTime(){
        Random Gera = new Random(); //iniciando função ramdom
        int i = 0;
        int [] vet =  new int[7];
        
       
        for(i=0; i<7; i++){
        
        vet [i] = Gera.nextInt(80); //jogando valores da ramdom no vet[i]
        x = x + vet[i] + "  "; //colocando espaço entre os números
        }
    
    }
}
