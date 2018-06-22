package sc.htwg.de.termcounter.util;

import retrofit2.Retrofit;
import sc.htwg.de.termcounter.dao.TermCounterService;
import sc.htwg.de.termcounter.rest.RetrofitClient;

/**
 * Created by Sebastian Thümmel on 14.06.2018.
 */

public class ApiUtils {

    private ApiUtils(){}

    public static final String BASE_URL = "https://termcounter.herokuapp.com/";

    public static TermCounterService getApiService(){
        return RetrofitClient.getClient(BASE_URL).create(TermCounterService.class);
    }

}
