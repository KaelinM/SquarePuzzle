public class TheSim{
    public static void main(String[] args) {
        
        Solver t1 = new Solver();
        t1.initialize();
        Piece r = t1.getPiece((int)(Math.random()*36));
        t1.runIt(r);
        t1.printIt();
    }

}