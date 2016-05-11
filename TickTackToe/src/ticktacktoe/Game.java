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
public class Game {

    private char[] input = new char[9];
    private char[][] output = new char[3][3];
    private boolean[] indicatorIsEmpty = new boolean[9];
    private char indicatorPreviousValue = 'o';

    public Game() {
    }

    public void resultGame() {

        Scanner scanner = new Scanner(System.in);
        System.out.println(" 0 | 1 | 2 ");
        System.out.println(" - | - | - ");
        System.out.println(" 3 | 4 | 5 ");
        System.out.println(" - | - | - ");
        System.out.println(" 6 | 7 | 8 ");

        for (int i = 0; i < 9; i++) {

            //the first player always is X
            if (i % 2 == 0) {
                System.out.println("X : please, choose your position ");
            } else {
                System.out.println("O : please, choose your position ");
            }

            int positionNumber = scanner.nextInt();

            // checking of correct input position
            if (positionNumber < 0 || positionNumber > 9) {
                System.out.println("Stop Game! Please, take care, you are out of range!");
                break;
            }

            //input the positions and checking that positions will be the different 
            if (indicatorIsEmpty[positionNumber] == false) {
                if (indicatorPreviousValue == 'o') {
                    input[positionNumber] = 'x';
                    indicatorPreviousValue = 'x';
                } else {
                    input[positionNumber] = 'o';
                    indicatorPreviousValue = 'o';
                }
                indicatorIsEmpty[positionNumber] = true;
            } else {
                System.out.println("Sorry, you have chosen the filled position, please, choose another one!");
                i--;
                continue;
            }

            //check the result of game (when we need to stop)
            //Sorry for manual checking!!!
            if ((i > 4) && ((input[0] == input[1] && input[0] == input[2] && input[0] != '\u0000')
                    || (input[3] == input[4] && input[3] == input[5] && input[3] != '\u0000')
                    || (input[6] == input[7] && input[6] == input[8] && input[6] != '\u0000')
                    || (input[0] == input[3] && input[0] == input[6] && input[0] != '\u0000')
                    || (input[1] == input[4] && input[1] == input[7] && input[1] != '\u0000')
                    || (input[2] == input[5] && input[2] == input[8] && input[2] != '\u0000')
                    || (input[0] == input[4] && input[0] == input[8] && input[0] != '\u0000')
                    || (input[2] == input[4] && input[2] == input[6] && input[2] != '\u0000'))) {

                System.out.println("we have a winner!");
                break;
            } else if (i == 8) {
                System.out.println("No winner!!!");
            }

        }
        // put one-dimensional array to two-dimensional array in order to output nice result
        output[0][0] = input[0];
        output[0][1] = input[1];
        output[0][2] = input[2];
        output[1][0] = input[3];
        output[1][1] = input[4];
        output[1][2] = input[5];
        output[2][0] = input[6];
        output[2][1] = input[7];
        output[2][2] = input[8];

        //System.out.println(Arrays.deepToString(output));
        //output of our game's result
        for (int i = 0; i < output.length; i++) {
            System.out.println(Arrays.toString(output[i]));
        }

    }
}
