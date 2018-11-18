package filmes.core;

import com.google.gson.Gson;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLEncoder;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class ServerRequisitor {

    private static final String KEY = "apikey=5b5be94f";
    private static final String HOSTNAME = "http://www.omdbapi.com/?";
    private static final String TYPE_MOVIE = "type=movie";

    public static JSONResponse getResponse(String searchQuery) {
        try {
            String urlString = HOSTNAME + KEY + "&" + TYPE_MOVIE + "&s=" + URLEncoder.encode(searchQuery, "UTF-8");
            URL url = new URL(urlString);
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("GET");
            connection.connect();
            InputStream stream = connection.getInputStream();
            JSONResponse response = new Gson().fromJson(new InputStreamReader(stream, "UTF-8"), JSONResponse.class);
            return response;
        } catch (MalformedURLException ex) {
            JOptionPane.showMessageDialog(null, "Deu ruim na URL aí men kkkkk", "Oxe", JOptionPane.ERROR_MESSAGE);
        } catch (UnsupportedEncodingException ex) {
            JOptionPane.showMessageDialog(null, "Mano é UTF-8, viaja nn auhaua", "Oxe", JOptionPane.ERROR_MESSAGE);
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "Aos cara, o InputStream ficou mobral auhauahha", "Oxe", JOptionPane.ERROR_MESSAGE);
        }
        return null;
    }
}
