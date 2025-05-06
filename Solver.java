public class Solver{

    public piece[] allPieces = new piece[36];

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
    
    private double[][] board = new double[6][6];

    public piece findMatch(double a){
        int orig = (int)(a);
        for(piece match: allPieces){
            if(((a - orig) == 0.4) && orig == (int)(match.getFish(1)) && match.getFish(1) == 0.6)
                return match;
            if(((a - orig) == 0.6) && orig == (int)(match.getFish(1)) && match.getFish(1) == 0.4)
                return match;
            if(((a - orig) == 0.1) && orig == (int)(match.getFish(2)) && match.getFish(2) == 0.9)
                return match;
            if(((a - orig) == 0.9) && orig == (int)(match.getFish(2)) && match.getFish(2) == 0.1)
                return match;
        }
        return null;  
    }

    private int z;
    private int curX;
    private int curY;
    private boolean leftB, rightB, topB, botB;

    public void initialize(){
        z = 0;
        curX = 3;
        curY = 3;
        leftB = false;
        rightB = false;
        topB = false;
        botB = false;

    }
    //To add --> check for if the center is the same before adding it
    // maybe should be in find match method
    public void runIt(piece x){
        // 0 - left
        // 1 - right
        // 2 - up
        // 3 - down
        if(z = 0){
            board[curX][curY] = x;
            z++;}
        else if(curX < 0)
            leftB =true;
        else if(curX > 5)
            rightB = true;
        else if(curY < 0)
            topB = true;
        else if(curY > 0)
            botB = true;
        else{
            for(int i = 0; i < 4; i++){
                piece m = findMatch(x.getFish(i));
                if(m == null)
                    break;
                if(i==0 && leftB == false)
                    curX-=1;
                if(i==1 && rightB == false)
                    curX+=1;
                if(i==2 && topB == false)
                    curY-=1;
                if(i==3 && botB == false)
                    curY+=1;
                board[curX][curY] = m;
                runIt(m);
            }
        }
        
    }

    public void printIt(){
        for(int row = 0; row < board.length; row ++){
            for(int col = 0; col < board[0].length; col++){
                // need to figure out how to print each side of the piece
                // along with the piece - print blank in all corners??
            }
        }
    }

    
    
}