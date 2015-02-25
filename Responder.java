import java.util.Random;
import java.util.ArrayList;
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
    }

    /**
     * Generate a response.
     * @return   A string that should be displayed as the response
     */
    public String generateResponse()
    {
        return respuesta.get(rnd.nextInt(5));
    }
}
