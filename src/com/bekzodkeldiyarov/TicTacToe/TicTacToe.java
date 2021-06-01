package com.bekzodkeldiyarov.TicTacToe;

public class TicTacToe {

    public void start() {
        TicTacToeGame ticTacToeGame = new TicTacToeGame();
        TicTacToeList list;

        boolean isWin = false;

        ticTacToeGame.initBoard();
        while (!isWin) {
            ticTacToeGame.drawBoard();
            ticTacToeGame.humanTurn();
            ticTacToeGame.drawBoard();
            isWin = ticTacToeGame.isWin();
            if (isWin) {
                break;
            }
            ticTacToeGame.computerTurn();
            ticTacToeGame.drawBoard();
            isWin = ticTacToeGame.isWin();
            if (isWin) {
                break;
            }
        }


    }

}
