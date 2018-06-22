package sc.htwg.de.termcounter.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by Sebastian Thümmel on 14.06.2018.
 */

public class Sentence {

    @SerializedName("sentence")
    @Expose
    private String sentence;


    public Sentence(String sentence){
        this.sentence = sentence;
    }

    public String getSentence() {
        return sentence;
    }

    public void setSentence(String sentence) {
        this.sentence = sentence;
    }
}
