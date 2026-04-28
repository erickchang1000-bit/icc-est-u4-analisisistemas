import java.util.concurrent.Callable;

import models.Results;

public class BenchMarking {
    public static Results medirTiempos(Callable <Void>funcion ){
       

        try {
             //Calcular tiempo inicio
        long inicio=System.nanoTime();
        //Ejecutar la funcion
        funcion.call();
        //Calcular el fin
        long fin =System.nanoTime();
        //calcular tiempo ejecucion
        double duracion= (fin -inicio) / 1_000_000_000.0;
        Results results = new Results(duracion);
        return results;
            
        } catch (Exception e) {
            throw new RuntimeException("Errror en la funcion");
            // System.out.println("Error en la funcion");
            // return null;


        }

    }
}
