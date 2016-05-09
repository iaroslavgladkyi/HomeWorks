/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ticktacktoe;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author gaffs
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        final char x = 'x';
        final char o = 'o';
        char [] input = new char [9];
        char [][] output = new char [3][3];
        boolean [] indicatorIsEmpty = {false, false, false,
                                       false, false, false,
                                       false, false, false};
        char indicatorPreviousValue = o;
        
        
        Scanner scanner = new Scanner(System.in);
//        System.out.println("Please, choose nought (o) or cross (x)!");
//        System.out.println("If you want to choose o, please press o, else press x!");
//        char buffer = scanner.next().charAt(0);
        
        //System.out.println(buffer);
        System.out.println(" 0 | 1 | 2 ");
            System.out.println(" - | - | - ");
            System.out.println(" 3 | 4 | 5 ");
            System.out.println(" - | - | - ");
            System.out.println(" 6 | 7 | 8 ");
        for (int i = 0; i < 9; i++){
            System.out.println("please, choose your position ");
            //System.out.println(" 0 | 1 | 2 ");
            //System.out.println(" - | - | - ");
            //System.out.println(" 3 | 4 | 5 ");
            //System.out.println(" - | - | - ");
            //System.out.println(" 6 | 7 | 8 ");
            
            int positionNumber = scanner.nextInt();
            //boolean indicator = true;
            if (indicatorIsEmpty[positionNumber] == false){
                if (indicatorPreviousValue == o) {
                    input[positionNumber] = x;
                    indicatorPreviousValue = x;}
                else {input[positionNumber] = o;
                      indicatorPreviousValue = o;}
                indicatorIsEmpty[positionNumber] = true;
            } 
            else { System.out.println ("Sorry, you have chosen the filled position!");
                  break;
            }
            }
            //System.out.println(Arrays.toString(input));
            
            output [0][0] = input [0];
            output [0][1] = input [1];
            output [0][2] = input [2];
            output [1][0] = input [3];
            output [1][1] = input [4];
            output [1][2] = input [5];
            output [2][0] = input [6];
            output [2][1] = input [7];
            output [2][2] = input [8];
            
            //System.out.println(Arrays.deepToString(output));
            for (int i = 0; i < output.length; i++) {     
                System.out.println(Arrays.toString(output[i]));
                }
                
            }
                
                
                
//            switch (positionNumber){
//                case 1: if (indicator [positionNumber] = true) 
//                        input[0] = x;
//                        //else {System.out.prin} 
//                        //indicator = false;
//                        break;
//                case 2: if (buffer == x) 
//                        input[1] = x;
//                        else {input [0] = o;} 
//                        indicator = false;
//                        break;
//                case 3: if (buffer == x) 
//                        input[2] = x;
//                        else {input [0] = o;} 
//                        indicator = false;
//                        break;
//                default: System.out.println("You chosen the filled position!");
//            }
            
        }
        
//        switch (buffer){
//            case 1: 
//        }

    


