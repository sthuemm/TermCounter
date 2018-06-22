package sc.htwg.de.termcounter.dao;


import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;
import sc.htwg.de.termcounter.model.Sentence;

/**
 * Created by Sebastian Thümmel on 14.06.2018.
 */

public interface TermCounterService {

    @POST("/person/1")
    Call<String> checkSentenceForNewTerms(@Body Sentence sentence);
}
