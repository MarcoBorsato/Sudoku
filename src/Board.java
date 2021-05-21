import java.util.*;

public class Board {

    private Field[][] fields;

    private HashMap<Integer, ArrayList<Field>> map = new HashMap<Integer, ArrayList<Field>>();

    public Board(){

        Field[][] fields = new Field[9][9];
        for(int i = 0; i < 9; i++) {
            for(int j = 0; j < 9; j++) {
                int square = Math.floorDiv(i, 3) + Math.floorDiv(j, 3)*3;
                fields[i][j] = new Field(i,j, square);
                ArrayList<Field> fieldList = map.get(square);
                if(fieldList == null) {
                    fieldList = new ArrayList<Field>();
                    fieldList.add(fields[i][j]);
                    map.put(square, fieldList);
                } else {
                    fieldList.add(fields[i][j]);
                }
            }
        }

        fields[0][2].setValue(3);
        fields[0][4].setValue(4);
        fields[0][5].setValue(5);
        fields[0][7].setValue(7);
        fields[1][1].setValue(9);
        fields[1][4].setValue(6);
        fields[1][6].setValue(5);
        fields[2][0].setValue(5);
        fields[2][7].setValue(1);
        fields[3][2].setValue(1);
        fields[3][3].setValue(7);
        fields[3][6].setValue(2);
        fields[3][7].setValue(8);
        fields[3][8].setValue(5);
        fields[4][2].setValue(8);
        fields[4][6].setValue(1);
        fields[5][0].setValue(3);
        fields[5][1].setValue(2);
        fields[5][2].setValue(9);
        fields[5][5].setValue(8);
        fields[5][6].setValue(7);
        fields[6][1].setValue(3);
        fields[6][8].setValue(1);
        fields[7][2].setValue(5);
        fields[7][4].setValue(9);
        fields[7][7].setValue(2);
        fields[8][1].setValue(8);
        fields[8][3].setValue(2);
        fields[8][4].setValue(1);
        fields[8][6].setValue(6);

        this.fields = fields;
    }

    public String toString(){
        String text = "";

        for(int i = 0; i < 9; i++) {
            for(int j = 0; j < 9; j++) {
                if(j == 0){
                    text = text + "|";
                }
                if(fields != null && fields[i][j] != null && fields[i][j].getValue() != 0) {
                    text = text + fields[i][j].toString() + "|";
                } else {
                    text = text + " |";
                }
            }
            text = text + "\n";

        }

        return text;
    }

    public void updateSquare(Field field) {
        System.out.println(field.getSquare());
        updateRow(field.getY(), field.getValue());
        updateColumn(field.getX(), field.getValue());
        //updateSquare(field.getSquare(), field.getValue());
    }

    public void updateRow(int y, int value){
        for(int i = 0; i<9; i++) {
            fields[i][y].removePoss(value);
        }
    }

    public void updateColumn(int x, int value) {
        for(int i = 0; i<9; i++) {
            fields[x][i].removePoss(value);
        }
    }

    public Field[][] setBoard() {
        return null;
    }

    public void updateSquare(int square) {

    }
}
