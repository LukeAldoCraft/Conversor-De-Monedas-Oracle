package mx.com.ComversorMonedas;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Scanner;


public class ApiSolicitud {

	private static final String API_URL_BASE = "http://api.exchangeratesapi.io/v1/latest/";
	
	private String apiKey;
	
	public ApiSolicitud(String apiKey) {
		this.apiKey = apiKey;
	}
	
	public double conversorDivisa(double monto, String monedaBase, String monedaObjetivo) {
		double montoConvertido = 0.0;
	}
	
	
	
	
	
}
