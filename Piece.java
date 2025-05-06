//https://docs.google.com/spreadsheets/d/1sYJhZASc2KDrLrFWiBrPPzLkpcfu7QVXWz_ZP2ofYEs/edit?gid=0#gid=0

public class Piece {

    public double[] fishes = new double[5];

    public Piece(int left, int right, int up, int down, int mid){
        fishes[0] = left +0.4;
        fishes[1] = right +0.6;
        fishes[2] = up +0.9;
        fishes[3] = down +0.1;
        fishes[4] = mid +0.5;
    }

    public double getFish(int pos){
        return fishes[pos];
    }

}
