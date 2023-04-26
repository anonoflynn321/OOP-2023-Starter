package ie.tudublin;

public class Follow {
    
    public String word;
    public int count; 

    public Follow(String word, int count) {

        this.word = word;
        this.count = count;
    }

    public String getWord() {
        return word;
    }

    public int getCount() {
        return count; 
    }

    @Override
    public String toString() {
        return "Follow [word=]" + word + ", count=" + count + "]";
    }
}

