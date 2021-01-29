public class Board {

    private Field[][] fields;

    public Board(Field[][] fields){
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
}
