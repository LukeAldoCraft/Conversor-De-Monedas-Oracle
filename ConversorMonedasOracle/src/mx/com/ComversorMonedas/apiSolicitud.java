package mx.com.ComversorMonedas;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Scanner;
import com.google.gson.Gson;
import com.google.gson.JsonObject;

public class apiSolicitud {

    private static final String API_URL_BASE = "https://api.fastforex.io/";

    private String apiKey;

    public apiSolicitud(String apiKey) {
        this.apiKey = apiKey;
    }

    public double conversorDivisa(double monto, String monedaBase, String monedaObjetivo) {
        double montoConvertido = 0.0;

        try {
        	String urlStr = API_URL_BASE + "fetch-all?api_key=" + apiKey + "&from=" + monedaBase;; 
            URL url = new URL(urlStr);
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("GET");
            connection.connect();

            int responseCode = connection.getResponseCode();
            if (responseCode == HttpURLConnection.HTTP_OK) {
                Scanner scanner = new Scanner(url.openStream());
                StringBuilder response = new StringBuilder();
                while (scanner.hasNext()) {
                    response.append(scanner.nextLine());
                }
                scanner.close();
 

                double monedaOptenida = getExchangeRateFromJson(response.toString(), monedaObjetivo);
                montoConvertido = monto * monedaOptenida;
            } else {
                System.out.println("Error: Unable to fetch data from the API");
            }

            connection.disconnect();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return montoConvertido;
    }

    private double getExchangeRateFromJson(String jsonResponse, String targetCurrency) {
        double exchangeRate = 0.0;

        try {
            Gson gson = new Gson();
            JsonObject jsonObject = gson.fromJson(jsonResponse, JsonObject.class);

            if (jsonObject.has("results")) {
                JsonObject ratesObject = jsonObject.getAsJsonObject("results");
                if (ratesObject.has(targetCurrency)) {
                    exchangeRate = ratesObject.get(targetCurrency).getAsDouble();
                } else {
                    System.out.println("No se encontró el tipo de cambio para la moneda objetivo: " + targetCurrency);
                }
            } else {
                System.out.println("No se encontró el campo 'rates' en la respuesta JSON");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return exchangeRate;
    }
}
