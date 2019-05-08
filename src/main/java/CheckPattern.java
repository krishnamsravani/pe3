public class CheckPattern
{
    public static void main(String args[]) {
        String[][] ChessArray = new String[8][8];
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                //checking for even place
                if ((i + j) % 2 == 0) {
                    ChessArray[i][j] = "WW";
                    System.out.print(ChessArray[i][j] + " | ");
                } else {
                    //checking for odd place
                    ChessArray[i][j] = "BB";
                    System.out.print(ChessArray[i][j] + " | ");
                }
            }
            System.out.println();
        }
    }
}
