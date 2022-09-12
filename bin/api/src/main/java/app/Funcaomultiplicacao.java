package app;
 
import io.jooby.annotations.*;
import io.jooby.exception.BadRequestException;
 
 
@Path("/multiplicacao/{mult1}/{multi2}")
public class Funcaomultiplicacao {
 
  // Função divisão:
  @GET
  public double multiplicacao(@PathParam("mult1") String opStr, @PathParam("mult2") String opStr2){
 
    try{
        double op = Double.parseDouble(opStr);
        double op2 = Double.parseDouble(opStr2);
 
        // Resposta caso ocorra uma divisão por zero:
       
 
       //Realizando a operação:
        double mult = op*op2;
        return mult;    
    } catch (NumberFormatException nfe) {
        throw new BadRequestException("Operador inválido. Verifique se você digitou corretamente");
    }
 
  }
}
