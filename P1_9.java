import java.io.*;
import java.util.*;
public class P1_9{
        static int N = 9;
        // Function to check if all elements of the board[][] array store value in the range[1, 9]
        static boolean isinRange(int[][] board)
        {
            for(int i = 0; i < N; i++)        // Traverse board[][] array
            {
                for(int j = 0; j < N; j++)
                {
                    // Check if board[i][j] lies in the range
                    if (board[i][j] <= 0 || board[i][j] > 9)
                    {
                        return false;
                    }
                }
            }
            return true;
        }

        // Function to check if the solution of sudoku puzzle is valid or not
        static boolean isValidSudoku(int board[][])
        {

            if (isinRange(board) == false)   // Check if all elements of board[][] stores value in the range[1, 9]
            {
                return false;
            }
            boolean[] unique = new boolean[N + 1];    // Stores unique value from 1 to N
            for(int i = 0; i < N; i++)                // Traverse each row of the given array
            {
                Arrays.fill(unique, false);       // Initialize unique[] array to false
                for(int j = 0; j < N; j++)            // Traverse each column of current row
                {
                    int Z = board[i][j];              // Stores the value of board[i][j]
                    if (unique[Z])                    // Check if current row stores duplicate value
                    {
                        return false;
                    }
                    unique[Z] = true;
                }
            }
            for(int i = 0; i < N; i++)               // Traverse each column of the given array
            {
                Arrays.fill(unique, false);      // Initialize unique[] array to false
                for(int j = 0; j < N; j++)           // Traverse each row of current column
                {
                    int Z = board[j][i];             // Stores the value of board[j][i]
                    if (unique[Z])                   // Check if current column stores duplicate value
                    {
                        return false;
                    }
                    unique[Z] = true;
                }
            }
            for(int i = 0; i < N - 2; i += 3)            // Traverse each block of size 3 * 3 in board[][] array
            {
                for(int j = 0; j < N - 2; j += 3)        // j stores first column of each 3 * 3 block
                {
                    Arrays.fill(unique, false);      // Initialize unique[] array to false
                    for(int k = 0; k < 3; k++)            // Traverse current block
                    {
                        for(int l = 0; l < 3; l++)
                        {
                            int X = i + k;          // Stores row number of current block
                            int Y = j + l;          // Stores column number of current block
                            int Z = board[X][Y];    // Stores the value of board[X][Y]
                            if (unique[Z])          // Check if current block stores duplicate value
                            {
                                return false;
                            }
                            unique[Z] = true;
                        }
                    }
                }
            }
            // If all conditions satisfied
            return true;
        }

        public static void main(String[] args)
        {
            int[][] board = { { 5, 3, 4, 6, 7, 8, 9, 1, 2 },
                    { 6, 7, 2, 1, 9, 5, 3, 4, 8 },
                    { 1, 9, 8, 3, 4, 2, 5, 6, 7 },
                    { 8, 5, 9, 7, 6, 1, 4, 2, 3 },
                    { 4, 2, 6, 8, 5, 3, 7, 9, 1 },
                    { 7, 1, 3, 9, 2, 4, 8, 5, 6 },
                    { 9, 6, 1, 5, 3, 7, 2, 8, 4 },
                    { 2, 8, 7, 4, 1, 9, 6, 3, 5 },
                    { 3, 4, 5, 2, 8, 6, 1, 7, 9 } };

            if (isValidSudoku(board))
            {
                System.out.println("Valid");
            }
            else
            {
                System.out.println("Not Valid");
            }
            System.out.println("This program is made by 21CE143 Jay");
        }
    }

