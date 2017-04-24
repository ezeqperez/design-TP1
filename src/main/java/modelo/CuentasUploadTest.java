package modelo;

/**
 * Created by Ezequiel on 24/4/2017.
 */
public class CuentasUploadTest {
    String jsonString = "";


    public Empresa procesarArchivo() {
        return new JsonParser().construirEmpresa(jsonString);
    }

    public String getJsonString() {
        return jsonString;
    }

    public void setJsonString(String jsonString) {
        this.jsonString = jsonString;
    }

}