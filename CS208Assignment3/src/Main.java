/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Peter Belsley
 */
import java.util.Scanner;

public class Main {

    /**
     * A method to get the input from the user and check for invalid input
     * @author Peter Belsley
     * @return a string that is an odd number of binary digits, "q" to exit, or "x" if the input is invalid
     */
    public String getInput(){
        Scanner s = new Scanner(System.in);
        String aString = s.nextLine(), output = "";
        if (aString.startsWith("q")||aString.startsWith("Q"))
            return "q";
        for (int i = 0; i < aString.length(); i++){
            if (!(aString.charAt(i) != '1' && aString.charAt(i) != '0')){
                output += aString.charAt(i);
            }
        }
        //System.out.println(output);
        if ((output.length()%2) == 0)
            return "x";
        return output;
    }
    /**
     * The main UI loop for the program
     * @author Peter Belsley
     * 
     */
    
    public void startUI() {
        String input;
        do {
            System.out.println("Enter an odd number of binary digits or q to exit:");
            input = getInput();
            if (!"q".equals(input) && !"x".equals(input)){
                //call recursive method/class here
            }
            
        } while (!input.equals("q"));
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Main m = new Main();
        m.startUI();
    }
    
}
