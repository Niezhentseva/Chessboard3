/* 1.	Шахматная доска
Вывести шахматную доску с заданными размерами высоты и ширины, по принципу:
*  *  *  *  *  *
  *  *  *  *  *  *
*  *  *  *  *  *
  *  *  *  *  *  *
Программа запускается через вызов главного класса с параметрами.
 */

package softserve.academy;

import java.util.Scanner;

public class Chessboard3 {
    private int boardLength; // chessboard length
    private int boardHeight; // chessboard Height

    // constructor creates a chessboard with a length and a Height
    private Chessboard3() {
        int number;
        boolean err;
        do {
            err = false;
            System.out.print("Enter a chessboard length: ");
            Scanner scan = new Scanner(System.in);
            if (scan.hasNextInt()) {
                number = scan.nextInt();
                if (number > 0) {
                    boardLength = number;
                } else {
                    System.out.println("You entered a negative number, " +
                            "zero or not an integer number, try again");
                    err = true;
                }
            } else {
                System.out.println("You entered not a number, try again");
                err = true;
            }
        } while (err);
        do {
            err = false;
            System.out.print("Enter a chessboard height: ");
            Scanner scan = new Scanner(System.in);
            if (scan.hasNextInt()) {
                number = scan.nextInt();
                if (number > 0) {
                    boardHeight = number;
                } else {
                    System.out.println("You entered a negative number, " +
                            "zero or not an integer number, try again");
                    err = true;
                }
            } else {
                System.out.println("You entered not a number, try again");
                err = true;
            }
        } while (err);
    }

    public static void main(String[] args) {
        Chessboard3 board = new Chessboard3();
        System.out.println(board.drawChessboard());
    }

    // the method draws a chessboard
    public String drawChessboard() {
        StringBuilder vertical = new StringBuilder();
        for (int i = 0; i < boardHeight ; i++) {
            for (int j = 0; j < boardLength; j++) {
                if ((i + j) % 2 == 1) {
                    vertical.append(' ');
                } else {
                    vertical.append('*');
                }
            }
            vertical.append('\n');
        }
        return vertical.toString();
    }
}
