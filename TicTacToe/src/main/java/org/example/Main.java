/*
TicTacToe
UC1 initializes and displays an empty Tic-Tac-Toe board in a proper grid format. THis use case introduces 2d arrays, nested loops and formatted console output.
*/

package org.example;

public class Main {
    static char[][] board = new char[3][3];

    static void initBoard(){
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                board[i][j] = '-';
            }
        }
    }

    static void printBoard(){
        System.out.println("-------------");
        for(int i = 0; i < 3; i++) {
            System.out.print("| ");
            for(int j = 0; j < 3; j++) {
                System.out.print(board[i][j] + " | ");
            }
            System.out.println();
            System.out.println("-------------");
        }
    }

    /*
     * Entry point of the programe. It initializes the board and prints the empty grid on the console.
     */

    public static void main(String[] args){
        initBoard();
        printBoard();
    }
}