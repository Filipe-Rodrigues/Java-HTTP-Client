package filmes.core;

import java.util.HashMap;
import java.util.Map;

public class SearchEntry implements Comparable<SearchEntry> {
    private String Title;
    private int Year;
    private String imdbID;
    private String Type;
    private String Poster;

    public SearchEntry(String Title, int Year, String imdbID, String Type, String Poster) {
        this.Title = Title;
        this.Year = Year;
        this.imdbID = imdbID;
        this.Type = Type;
        this.Poster = Poster;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String Title) {
        this.Title = Title;
    }

    public int getYear() {
        return Year;
    }

    public void setYear(int Year) {
        this.Year = Year;
    }

    public String getImdbID() {
        return imdbID;
    }

    public void setImdbID(String imdbID) {
        this.imdbID = imdbID;
    }

    public String getType() {
        return Type;
    }

    public void setType(String Type) {
        this.Type = Type;
    }

    public String getPoster() {
        return Poster;
    }

    public void setPoster(String Poster) {
        this.Poster = Poster;
    }
    
    public Map<String, String> getMap() {
        Map<String, String> map = new HashMap<>();
        map.put("Title", Title);
        map.put("Year", Year + "");
        map.put("imdbID", imdbID);
        map.put("Type", Type);
        map.put("Poster", Poster);
        return map;
    }
    
    public int compareTo(SearchEntry another) {
        int comparation = this.Year - another.Year;
        if (comparation == 0) {
            return this.Title.compareTo(another.Title);
        }
        return comparation;
    }
}
