package utils;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import modelo.Cuenta;
import org.uqbar.commons.model.UserException;

public class CuentasUpload implements CuentasUploader{
	private String ruta = "C:\\test.json";

	// TODO: Manejar la excepcion, si la arrojo se me quejaba alguien (ahora no
	// recuerdo)
	public List<Cuenta> procesarArchivo(){
		List<Cuenta> listaDeCuentas = new ArrayList<Cuenta>();
		// El parser es quien se encarga de cargar el archivo desde la ruta
		// especificada
		JSONParser parser = new JSONParser();

		// El jsonParser va ser quien se encarga de transformar el json cargado
		// a una cuenta,
		// que va a ser devuelta al viewModel
		 JsonParser jsonParser = new JsonParser();

		Object obj;
		try {
			obj = parser.parse(new FileReader(ruta));
		}catch (IOException e) {
			throw new UserException("No se encontró el archivo");
		}catch (org.json.simple.parser.ParseException e) {
			throw new UserException("El archivo no se pudo cargar, por favor verifique que el formato sea el correcto");
		}
		// Creo un array porque mi archivo tiene una lista de cuentas a
		// cargar
		JSONArray jsonArray = (JSONArray) obj;

		// TODO: Armar algo como if(!jsonArray.isEmpty()){}, para controlar
		// que no recorramos una lista vacia
		jsonArray.forEach(item -> {
			JSONObject json = (JSONObject) item;
			listaDeCuentas.add(jsonParser.jsonACuenta(json));
		});
		// TODO: aca queremos avisarle al usuario que se carg� mal y que lo
		// debe
		// volver a intentar.

		//ventanilla

		return listaDeCuentas;
	}

	public String getRuta() {
		return ruta;
	}

	public void setRuta(String ruta) {
		this.ruta = ruta;
	}
}