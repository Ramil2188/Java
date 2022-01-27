/**
Java 1. HomeWork 4
@author Ramil'
@version 27.01.2022
*/

import java.util.Random;
import java.util.Scanner;

class TicTacToe {
    
    final char CHAR_O ='o';
    Random random;
    Scanner scaner;
    char[][] table;
    
    public static void main(String[] args) {
        new TicTacToe().game();
    }
    
    TicTacToe() {
         table = new char[3][3];
         random = new Random();
         scaner = new Scanner(System.in);
    }
    
    void game() {
        initTable();
        printTable();
        while (true) {
            turnHuman();
            if (checkWin('x')) {
                System.out.println("YOU WON");
                break;
                }
            if (isTableFull()) {
                System.out.println("Sorry, DRAW...");
                break;
            }
            turnAI();
            printTable();
            if (checkWin(CHAR_O)) {
                System.out.println("AI WON");
                break;
                }
            if (isTableFull()) {
                System.out.println("Sorry, DRAW...");
                break;
            }
        }
        System.out.println("GAME OVER");
        printTable();
    }

    void initTable() {
        for (int x = 0; x < 3; x++) {
            for (int y = 0; y < 3; y++) {
                table[x][y] = '.';
            }
        }
    }
    
    void printTable() {
        for (int x = 0; x < 3; x++){
            for (int y = 0; y < 3; y++) {
                System.out.print(table[x][y] + " ");
            }
            System.out.println();
        }
    }

    void turnHuman() {
        int x, y;
        do {
            System.out.print("Enter x y [1..3]: ");
            x = scaner.nextInt() - 1;
            y = scaner.nextInt() - 1;
        } while (!isCellValid(x, y));
        table[x][y] = 'x';
    }
    
    void turnAI() {
        int x, y;
        do {
            x = random.nextInt(3);
            y = random.nextInt(3);
        } while (!isCellValid(x, y));
        table [x][y] = CHAR_O;
    }
    
    boolean isCellValid(int x, int y) {
        if (x < 0 || y < 0 || x > 2 || y > 2) {
            return false;
        } 
        return table [x][y] == '.';
    }
    
    boolean checkWin(char ch) {
        //
        for (int i = 0; i < 3; i++) {
            if ((table[i][0] == ch && table[i][1] == ch && table [i][2] ==ch) ||
                (table[0][i] == ch && table[1][i] == ch && table [2][i] ==ch)) {
                return true;
            }
        }
        //
        if ((table[0][0] == ch && table[1][0] == ch && table [2][0] ==ch) ||
            (table[2][0] == ch && table[1][0] == ch && table [0][2] ==ch))  {
            return true;
        }
        //
        return false;
    }
    
    boolean isTableFull() {
        for (int x = 0; x < 3; x++){
            for (int y = 0; y < 3; y++) {
                if (table[x][y] == '.') {
                    return false;
                }
            }
        }
        return true;
    }
}

