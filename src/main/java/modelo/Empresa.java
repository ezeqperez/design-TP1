package modelo;

import java.util.List;

/**
 * Created by Ezequiel on 24/4/2017.
 */
public class Empresa {
    String nombreEmpresa;

    List<Cuenta> cuentas;

    public String getNombreEmpresa() {
        return nombreEmpresa;
    }

    public void setNombreEmpresa(String nombreEmpresa) {
        this.nombreEmpresa = nombreEmpresa;
    }

    public List<Cuenta> getCuentas() {
        return cuentas;
    }

    public void setCuentas(List<Cuenta> cuentas) {
        this.cuentas = cuentas;
    }
}
