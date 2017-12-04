package boletin13_1;

public class ConversorTemperaturas {
    private final int TEMPERATURA=80;
    
    public float centigradosAFharenheit(float tem) throws TemperaturaErradaExcepcion{
        if (tem<TEMPERATURA){
            throw new TemperaturaErradaExcepcion("A TEMPERATURA INTRODUCIDA E MENOR DE 80 ºC");
        }
        float far = (float)(9.0/5.0*tem+32.4);
        return  far;
    }
    
    public float centígradosAReamur(float tem){
        try{
            if (tem<TEMPERATURA){
                throw new TemperaturaErradaExcepcion("A TEMPERATURA INTRODUCIDA E MENOR DE 80 ºC");
            }
            float rea = (float)(4.0/5.0*tem);
            return  rea;
        }catch(TemperaturaErradaExcepcion e1){
            System.out.println(e1.getMessage());
            return 0;
        }
    }
}
