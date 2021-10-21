/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calcjenkins;

/**
 *
 * @author rthiebaut
 */
public class CalcJenkins {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int plus = plus(1,2);
        int minus = minus(10,5);
        int multiply = multiply(5,5);
        int divideNotZero = divide(5,6);
        //int divideZero = divide(5,0);
        
        
        
    }
    
    static public int plus(int number1, int number2){
        return number1 + number2;
    }
    
    static public int minus(int number1, int number2){
        return number1 - number2;
    }
    
    static public int multiply(int number1, int number2){
        return number1 * number2;
    }
    
    static public int divide(int number1, int number2){
        
       if(number2 != 0){
           return number1 / number2;
        } else {
            throw new IllegalArgumentException("Argument 'divisor' must not be 0");
        }
        
    }
    
}
