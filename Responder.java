import java.util.Random;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
/**
 * The responder class represents a response generator object.
 * It is used to generate an automatic response to an input string.
 * 
 * @author     Michael Kölling and David J. Barnes
 * @version    0.1 (2011.07.31)
 */
public class Responder
{
    //permite obtener un numero de forma aleatorio
    private Random rnd;
    //arrayList que almacena las respuestas
    private ArrayList<String> respuesta;
    //mapa que almacena unas respuestas en funcion de una palabra clave
    private HashMap<String,String> otrasRespuestas;
    
    /**
     * Construct a Responder - nothing to do
     */
    public Responder()
    {
        rnd= new Random();
        respuesta = new ArrayList<>();
        respuesta.add("Ha probado a apagar y encender el pc");
        respuesta.add("Eso suena interesante,digame mas");
        respuesta.add("No se que decirle");
        respuesta.add("Le paso con otro departamento");
        respuesta.add("Comprese un aparato nuevo");
        
        otrasRespuestas = new HashMap<>();
        otrasRespuestas.put("hola","En que puedo servirle");
        otrasRespuestas.put("azul","que sale en su pantalla");
        otrasRespuestas.put("mac","tiene que ponerse en contacto con Apple");
        otrasRespuestas.put("congelado","pruebe a reiniciar su pc");
    }

    /**
     * Generate a response.
     * @return   A string that should be displayed as the response
     */
    public String generateResponse(HashSet<String> clave)
    {
        String contestacion;
        Iterator<String> it= clave.iterator();
        String palabra = "";          //variable que almacena los valores String del HanhSet
        while(it.hasNext())      //recorremos la coleccion
        {
             palabra = it.next();   //almacenamos en la variable un valor de la coleccion
            
        }
        if(otrasRespuestas.containsKey(palabra))   //si esa variable coincide con una key del HashMap
            {
                contestacion = otrasRespuestas.get(palabra);    //almacenamos el valor correspondiente a esa key
            }
            else
            {
                contestacion = respuesta.get(rnd.nextInt(5));   //guarda una respuesta aleatoria de las disponibles
            }
        
        return contestacion;
    }
}
