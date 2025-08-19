
package torreifel;


public class TorreIfel {
    
    
    public static void main(String[] args) {
        //Recursividad
        
        bajarEscalones(10); 
    }
    
    public static void  bajarEscalones(int numeroEscalones){
        if(numeroEscalones == 0 ){ 
            // Caso base
            System.out.println("Problema resuelto");
            
        }else {
            //Caso recursivo
            while (numeroEscalones != 0){
            numeroEscalones -= 1;  
            System.out.println("Bajaste la escalera ");}
            
        }
       
    }
    
}
