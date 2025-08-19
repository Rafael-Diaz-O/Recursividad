
package torreifel;


public class TorreIfel {
    
    
    public static void main(String[] args) {
        //Recursividad
        
        bajarEscalones(10); 
    }

    // Secuencial 
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
//Recursivo
    public static void  bajarEscalones(int numeroEscalones){
        if(numeroEscalones == 0 ){ 
            // Caso base
            System.out.println("Se han bajado todas las escaleras ");
            
        }else {
            //Caso recursivo
            System.out.println("Faltan" + numeroEscaleras + "escaleras por bajar");
            numeroEscalones -= 1;
            void (numeroEscalones); // recursividad es volver a llamar al metodo dentro del metodo 
            
        }
       
    }
    
}

