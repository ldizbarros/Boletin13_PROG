package boletin13_1;

public class Boletin13_1 {

    public static void main(String[] args) {
        ConversorTemperaturas ct1 = new ConversorTemperaturas();
        
        try{
             System.out.println("º Fharenheir = "+ct1.centigradosAFharenheit((float)98.0));
        }
        catch(TemperaturaErradaExcepcion e1){
            System.out.println(e1.getMessage());
        }
        
        
        float rea =ct1.centígradosAReamur((float)58.2);
        if (rea!=0){
            System.out.println("º Reamur = "+rea);
        }
        
    }
    
}
