import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Field {
    private int x;
    private int y;
    private List<Integer> poss;
    private int value;


    public Field(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Field(int x, int y, int value) {
        this.x = x;
        this.y = y;
        List<Integer> Poss = Arrays.asList(1,2,3,4,5,6,7,8,9);

    }

    public int[] getCoords() {
        return new int[] {x, y};
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
