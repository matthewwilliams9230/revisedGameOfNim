import java.lang.Math;

public class Board {
    public static void populate(){
        getNumPieces();
    }
        public static int getNumPieces(){
            int max = 50;
            int min = 10;
            int range = max - min + 1;
            int rand = (int)(Math.random() * range) + min;
            return rand;
        }
        public static int removePieces(int pieces, int totalPieces){
            if ((pieces >= 1) && (pieces <= (totalPieces/2))){
                int newTotalPieces;
                newTotalPieces = totalPieces - pieces;
                return newTotalPieces;
            }
            else {
                System.out.println("Please enter a valid number, repeat your turn");
                return totalPieces;
            }

        }
}
