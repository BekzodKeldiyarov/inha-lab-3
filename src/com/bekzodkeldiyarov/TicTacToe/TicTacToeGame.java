package com.bekzodkeldiyarov.TicTacToe;


import java.util.Scanner;

public class TicTacToeGame {
    private final int WIDTH = 3;
    private final int HEIGHT = 3;
    private final Scanner scanner = new Scanner(System.in);

    TicTacToeList[][] board = new TicTacToeList[WIDTH][HEIGHT];

    public TicTacToeList[][] initBoard() {
        for (int i = 0; i < WIDTH; i++) {
            for (int j = 0; j < HEIGHT; j++) {
                board[i][j] = TicTacToeList.EMPTY;
            }
        }
        return board;
    }

    public TicTacToeList[][] drawBoard() {
        System.out.print("  ");
        for (int i = 0; i < board.length; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i = 0; i < board.length; i++) {
            System.out.print(i + " ");
            for (int j = 0; j < board.length; j++) {
                switch (board[i][j]) {
                    case EMPTY:
                        System.out.print("* ");
                        break;
                    case X:
                        System.out.print("X ");
                        break;
                    case O:
                        System.out.print("O ");
                        break;
                }
            }
            System.out.println();
        }
        return board;
    }

    public TicTacToeList[][] humanTurn() {
        System.out.println("The 'human' turn");
        System.out.println("Enter please the cell coordinates you chosen(first x coordinate, then y one)");
        int x = scanner.nextInt();
        int y = scanner.nextInt();

        boolean changedToX = false;

        while (!changedToX) {
            if (board[x][y] == TicTacToeList.EMPTY) {
                board[x][y] = TicTacToeList.X;
                changedToX = true;
            } else {
                System.out.println("Choose empty cell");
                x = scanner.nextInt();
                y = scanner.nextInt();
            }
        }
        return board;
    }

    public TicTacToeList[][] computerTurn() {
        System.out.println("The computer turn");
        int x = (int) Math.random() * 2;
        int y = (int) Math.random() * 2;
        boolean changedToO = false;
        while (!changedToO) {
            if (board[x][y] == TicTacToeList.EMPTY) {
                board[x][y] = TicTacToeList.O;
                changedToO = true;
            } else {
                System.out.println("Choose empty cell");
                x = (int) (Math.random() * 3);
                y = (int) (Math.random() * 3);
            }
        }
        return board;
    }

    public boolean isWin() {
        for (int i = 0; i < WIDTH; i++) {
            boolean flag = false;
            for (int j = 1; j < HEIGHT; j++) {
                if (board[i][j] == board[i][0] && board[i][0] != TicTacToeList.EMPTY) {
                    flag = true;
                } else {
                    flag = false;
                }
            }
            if (flag) {
                System.out.println("You win");

                return true;
            }
        }

        for (int j = 0; j < WIDTH; j++) {
            boolean flag = false;
            for (int i = 1; i < HEIGHT; i++) {
                if (board[i][j] == board[0][j] && board[0][j] != TicTacToeList.EMPTY) {
                    flag = true;
                } else {
                    flag = false;
                }
            }
            if (flag) {
                System.out.println("You win");

                return true;
            }
        }

        return false;
    }

}
