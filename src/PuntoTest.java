/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Desarrollo
 */

public class PuntoTest{
    public static void main(String[] args){
        Punto objPto = new Punto(6, -8);
        System.out.println("Cordeenada X del objPto: " + objPto.getCordX());
        System.out.println("Cordeenada Y del objPto: " + objPto.getCordY());
        System.out.println("Distancia al origen: " + objPto.calcularDistancia());
        System.out.println("Cuadrante del punto: " + objPto.obtenerCuadrante());
        System.out.println("Distancia del punto HASTA el punto (-8, 5): " + objPto.distanciaHasta(-8, 5));
        
        objPto.setCordX(-7);
        System.out.println("Nueva coordenada x: " + objPto.getCordX());
        
               
        
        Punto objPto2 = new Punto(-6, 4);
                        
        System.out.println("Cordeenada X del objPto: " + objPto2.getCordX());
        System.out.println("Cordeenada Y del objPto: " + objPto2.getCordY());
        System.out.println("Distancia al origen: " + objPto2.calcularDistancia());
        System.out.println("Cuadrante del punto: " + objPto2.obtenerCuadrante());
        System.out.println("Distancia del punto HASTA el punto (4, -6): " + objPto.distanciaHasta(4, -6));
        
    }
}
class Punto {
    //Atributos
   private double cordX;
   private double cordY;
   
   
    //Constructor
    public Punto(double cordX, double cordY) {
        this.cordX = cordX;
        this.cordY = cordY;
    }
    // métodos getters o de consulta 
    public double getCordX() {
        return cordX;
    }

    public double getCordY() {
        return cordY;
    }
    // métodos setters o de modificación 
    public void setCordX(double cordX) {
        this.cordX = cordX;
    }

    public void setCordY(double cordY) {
        this.cordY = cordY;
    }
    // método toString que retorna el estado del objeto; es decir;
    // con los valores actuales de sus atributos
    
    @Override
    public String toString() {
        return "Punto= ( " + "cordX=" + cordX + ", cordY=" + cordY + ')';
    }
    
    
    
    
   
   
    
    //métodos:
    
    public double calcularDistancia(){
        double distancia;
        distancia = Math.sqrt(cordX * cordX + cordY*cordY);
        return distancia;
    } //fin de método calcular distancia
    
    public int obtenerCuadrante(){
        int cuadrante = 0;
        
        if(cordX > 0 && cordY > 0){
            cuadrante = 1;
        }
        else  if(cordX < 0 && cordY > 0){
            cuadrante = 2;
        }
        else if(cordX < 0 && cordY < 0){
            cuadrante = 3;
        }
        else if(cordX > 0 && cordY < 0){
            cuadrante = 4;
        }else{
            cuadrante = 0;
        }
                       
        return cuadrante;
                 
    } //fin de método obtener cuadrante;
    
    public double distanciaHasta(double cordXOtro, double cordYOtro){
        double deltaX, deltaY, distancia;
        deltaX = (cordX - cordXOtro);
        deltaY = (cordY - cordYOtro);
        distancia = Math.sqrt(deltaX*deltaX  + deltaY*deltaY);
        
        return distancia;
    } // fin de método distanciaHasta(...)
}

