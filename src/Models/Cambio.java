
package Models;


public class Cambio 
{
    private double Dolar = 34.8763; // Cordoba respecto al dolar
    private double Euro = 42.36;  // cordoba respecto al euro
    
    private double retorno;
    
    public double Corvercion(String a , String b, double MontoDinero)
    {
        //String union = String.valueOf(a)+String.valueOf(b);
        String union = a+b;
        //Cordobas, 
        //Dolares, 
        //Euros
        
        switch(union)
        {
            case "CordobasDolares" ->
            {
                retorno = MontoDinero / Dolar;
                System.out.println("Cordoba a Dolar = "+retorno);
                return retorno;
            }
            case "CordobasEuros" ->
            {
                retorno = MontoDinero / Euro;
                System.out.println("Cordoba a Euro = "+retorno);
                return retorno;
            }
            case "DolaresCordobas" ->
            {
                retorno = MontoDinero * Dolar;
                System.out.println("Dolar-Cordoba");
                return retorno;
            }
            case "DolaresEuros" ->
            {
                retorno = MontoDinero * 0.825297;
                System.out.println("Dolar-Euro");
                return retorno;
            }
            case "EurosCordobas" ->
            {
                retorno = MontoDinero * Euro;
                System.out.println("Euro-Cordoba");
                return retorno;
            }
            case "EurosDolares" ->
            {
                retorno = MontoDinero * 1.21164;
                System.out.println("Euro-Dolar");
                return retorno;
            }

        }
        //-------------------------
        return 0.0;
    }
    
    
}
