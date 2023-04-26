package ie.tudublin;

import java.util.ArrayList;

public class Word {
    
    public String word;
    public ArrayList<Follow> list = new ArrayList<Follow>();

    public Word(String word, ArrayList<Follow> list) {

        this.word = word;
        this.list = list;
    }


    public String getWord() {
        return word; 
    }

    public ArrayList<Follow> getList() {
        return list;
    }

    /*
    public String toString() {
        String bigString; 
        String tempString;

        for (int i = 0; i < list.size(); i++) {
            tempString = list.get(i).toString();

            bigString = bigString + " " + tempString;
        }

        return bigString;

    }
    */




}
