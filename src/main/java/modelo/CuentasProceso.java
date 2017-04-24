package modelo;


import java.io.IOException;

public class CuentasProceso {
    //Esta clase procesa las cuentas levantadas desde el archivo.

    public CuentasUpload getCuentasUpload() {
        return cuentasUpload;
    }

    public void setCuentasUpload(CuentasUpload cuentasUpload) {
        this.cuentasUpload = cuentasUpload;
    }

    CuentasUpload cuentasUpload;


    public void cargarCuenta(){
        Empresa empresa = new Empresa();
        try{
            empresa = cuentasUpload.procesarArchivo();
        }catch (Exception e){
            System.out.println("Salió mal, hay que logearlo, "+e);
        }
    }
}
