import java.util.Random;
import java.util.ArrayList;
import java.util.HashMap;
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
    public String generateResponse(String clave)
    {
        String contestacion;
        if(otrasRespuestas.containsKey(clave))    //se comprueba si el parametro introducido corresponde con alguna key del mapa
        {
            contestacion = otrasRespuestas.get(clave);       //se almacena en la variable el valor asociado a esa key
        }
        else
        {
            contestacion = respuesta.get(rnd.nextInt(5));    //se genera una respuesta aleatoria de la lista existente
        }
        return contestacion;
    }
}
