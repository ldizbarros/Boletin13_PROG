package boletin13_2;

public class TemperaturaErradaExcepcion extends Exception{
    public TemperaturaErradaExcepcion(){
        super("A temperatura non pode ser menor de  80 ºC");
    }
    public TemperaturaErradaExcepcion(String message) {
        super(message);
    }
}
