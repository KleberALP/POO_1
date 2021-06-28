package testaheater;

//Classe
public class Heater {
    
    //Atributos
    private int temperature;
    private int min;
    private int max;
    private int increment;
    
    //Contrutor
    public Heater(int x,int y){
    this.temperature = 15;
    this.min = x;
    this.max = y;
    this.increment = 5;
    }
    
    //Metodos
    public void warmer(){
        if(this.temperature<this.max && this.temperature+this.increment <= this.max){
            this.temperature+=this.increment;
        }
    
    }
    
    public void cooler(){
        if(this.temperature>this.min && this.temperature-this.increment >= this.min){
            this.temperature-=this.increment;
        }
    
    }
    public void setIncrement(int x){
        if(x>-1){
            this.increment=x;
        }
    }
    
    public int temperature(){
        return this.temperature;
    }
}
