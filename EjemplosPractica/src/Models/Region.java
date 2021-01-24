

package Models;

public class Region 
{
    private char a;
    public String getRegion(String cedula)
    {
        a = cedula.charAt(0);
        switch(a)
        {
            case '0' ->{return "REGION MANAGUA";}
            case '1' -> {return "REGION LAS SEGOVIAS";}
            case '2' -> {return "REGION OCCIDENTAL";}
            case '3' -> {return "REGION MANAGUA";}
            case '4' -> {return "REGION SUR";}
            case '5' -> {return "REGION CENTRAL";}
            case '6' -> {return "REGION NORTE";}
            case '7' -> {return "REGION AUTONOMA ATLANTICO NORTE";}
            case '8' -> {return "REGION AUTONOMA ATLANTICO SUR";}
            case '9' -> {return "REGION RIO SAN JUAN";}
        }
        return "";
    }
    public String getDepartamento(String cedula)
    {
        String subCadena = cedula.substring(0,3);
        switch(subCadena)
        {
            case "101" -> {return "Nueva Segovia".toLowerCase();}
            case "102" -> {return "Madriz".toUpperCase();}
            case "103" -> {return "Estelí";}
            case "201" -> {return "Chinandega";}
            case "202" -> {return "León";}
            case "301" -> {return "Managua";}
            case "401" -> {return "Masaya";}
            case "402" -> {return "Carazo";}
            case "403" -> {return "Granada";}
            case "404" -> {return "Rivas";}
            case "501" -> {return "Boaco";}
            case "502" -> {return "Chontales";}
            case "601" -> {return "Jinotega";}
            case "602" -> {return "Matagalpa";}
            
        }
        return "";
    }
}
