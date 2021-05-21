import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Field {
    private int x;
    private int y;
    private List<Integer> poss;
    private int value;
    private int square;

    public Field(int x, int y, int square) {
        this.x = x;
        this.y = y;
        this.square = square;
    }


    public int getY() {
        return y;
    }

    public int getX() {
        return x;
    }

    public void setSquare(int square) { this.square = square; }

    public int getSquare() {
        return square;
    }

    public void setValue(int value){
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public List<Integer> getPoss() {
        return poss;
    }

    public void removePoss(int item) {
        poss.remove(item);
    }

    public String toString(){
        return Integer.toString(value);
    }
}
