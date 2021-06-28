/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testaheater;
import java.util.Scanner;

/**
 *
 * @author klebe
 */
public class TestaHeater {

    public static void main(String[] args) {
        Heater temp;
        Scanner entrada = new Scanner(System.in);
        
        temp= new Heater(5,25);
        
        int num = -1;
        
        while(num!=0){
            num = entrada.nextInt();
            switch(num){
                case 1:  //
                    temp.warmer();
                    System.out.println(temp.temperature());
                    break;
                case 2:
                    temp.cooler();
                    System.out.println(temp.temperature());
                    break;
                case 3:
                    int x = entrada.nextInt();
                    temp.setIncrement(x);
                    break;
                case 0:
                    break;
                default:
                    System.out.println(temp.temperature());
        }
        }
        
    }
}
