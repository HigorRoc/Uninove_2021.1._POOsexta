package br.uninove.api;

import br.uninove.uniweatlher.Clima;
import java.io.IOException;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;

public class Http {
    
    public static Clima getClima(String cidade){
        
        try{
            String url = "http://api.openweathermap.org/data/2.5/weather?";
            String appid = "xxx"; //COLAR API KEY
            String units = "metric";
            String lang = "pt_br";
            String charset = StandardCharsets.UTF_8.name();

            String query = String.format("q=%s&appid=%s&units=%s&lang=%s", 
                                        URLEncoder.encode(cidade, charset),
                                        URLEncoder.encode(appid, charset),
                                        URLEncoder.encode(units, charset),
                                        URLEncoder.encode(lang, charset)
            );
            
            URLConnection  conn = new URL(url+query).openConnection();
            //PARAMOS AQUI
            
        }catch(IOException e){
            //VAZIO POR ENQUANTO
        }
        
        //PROVISORIO
        return null;
    }
}
