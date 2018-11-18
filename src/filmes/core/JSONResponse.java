package filmes.core;

import java.util.Collections;
import java.util.List;

public class JSONResponse {

    private List<SearchEntry> Search;
    private int totalResults;
    private String Response;

    public JSONResponse(List<SearchEntry> Search, int totalResults, String Response) {
        this.Search = Search;
        this.totalResults = totalResults;
        this.Response = Response;
    }

    public List<SearchEntry> getSearch() {
        return Collections.unmodifiableList(Search);
    }

    public void setSearch(List<SearchEntry> Search) {
        this.Search = Search;
    }

    public int getTotalResults() {
        return totalResults;
    }

    public void setTotalResults(int totalResults) {
        this.totalResults = totalResults;
    }

    public String getResponse() {
        return Response;
    }

    public void setResponse(String Response) {
        this.Response = Response;
    }

    public void sortMovies() {
        Collections.sort(Search);
    }

}
