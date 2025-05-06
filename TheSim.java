public class TheSim{
    public static void main(String[] args) {
        
        Solver t1 = new Solver();
        t1.initialize();
        piece r = allPieces[(int)(Math.random()*36)];
        t1.runIt(r);

    }

}