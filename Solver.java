public class Solver{

    private piece[] allPieces = new piece[36];

    public Solver(){
        allPieces[0] = new Piece(4, 5, 3, 2, 2);
        allPieces[1] = new Piece(3, 6, 1, 4, 1);
        allPieces[2] = new Piece(6, 2, 4, 5, 4);
        allPieces[3] = new Piece(5, 1, 2, 3, 3);
        allPieces[4] = new Piece(1, 4, 5, 6, 6);
        allPieces[5] = new Piece(2, 3, 6, 1, 5);
        allPieces[6] = new Piece(13, 14, 12, 11, 12);
        allPieces[7] = new Piece(12, 15, 11, 14, 11);
        allPieces[8] = new Piece(15, 16, 14, 13, 14);
        allPieces[9] = new Piece(14, 11, 13, 16, 13);
        allPieces[10] = new Piece(11, 12, 16, 15, 16);
        allPieces[11] = new Piece(16, 13, 15, 12, 15);
        allPieces[12] = new Piece(4, 5, 3, 2, 2);
        allPieces[13] = new Piece(3, 6, 1, 4, 1);
        allPieces[14] = new Piece(6, 2, 4, 5, 4);
        allPieces[15] = new Piece(5, 1, 2, 3, 3);
        allPieces[16] = new Piece(1, 4, 5, 6, 6);
        allPieces[17] = new Piece(2, 3, 6, 1, 5);
        allPieces[18] = new Piece(13, 14, 12, 11, 12);
        allPieces[19] = new Piece(12, 15, 11, 14, 11);
        allPieces[20] = new Piece(15, 16, 14, 13, 14);
        allPieces[21] = new Piece(14, 11, 13, 16, 13);
        allPieces[22] = new Piece(11, 12, 16, 15, 16);
        allPieces[23] = new Piece(16, 13, 15, 12, 15);
        allPieces[24] = new Piece(4, 5, 3, 2, 2);
        allPieces[25] = new Piece(3, 6, 1, 4, 1);
        allPieces[26] = new Piece(6, 2, 4, 5, 4);
        allPieces[27] = new Piece(5, 1, 2, 3, 3);
        allPieces[28] = new Piece(1, 4, 5, 6, 6);
        allPieces[29] = new Piece(2, 3, 6, 1, 5);
        allPieces[30] = new Piece(13, 14, 12, 11, 12);
        allPieces[31] = new Piece(12, 15, 11, 14, 11);
        allPieces[32] = new Piece(15, 16, 14, 13, 14);
        allPieces[33] = new Piece(14, 11, 13, 16, 13);
        allPieces[34] = new Piece(11, 12, 16, 15, 16);
        allPieces[35] = new Piece(16, 13, 15, 12, 15);
    }
    
    private double[][] board = new double[6][5];

    
    
}