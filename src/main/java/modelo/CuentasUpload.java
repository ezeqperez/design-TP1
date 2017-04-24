package modelo;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import java.io.FileReader;

public class CuentasUpload {

    public Empresa procesarArchivo() {
        JSONParser parser = new JSONParser();

        try {
            Object obj = parser.parse(new FileReader("C:\\test.json"));

            JSONObject jsonObject = (JSONObject) obj;
            return new JsonParser().jsonAEmpresa(jsonObject);

        } catch (Exception e) {
            System.out.println("eeee");
        }
        return null;
    }
}