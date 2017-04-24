package modelo;

import org.uqbar.arena.Application;
import org.uqbar.arena.windows.Window;
import vista.MenuWindow;

public class Aplicacion extends Application {
	
	public static void main(String[] args) {
		new Aplicacion().start();
	}

	@Override
	protected Window<?> createMainWindow() {
		CuentasProceso cuentasProceso = new CuentasProceso();
		cuentasProceso.setCuentasUpload(new CuentasUpload());
		return new MenuWindow(this, cuentasProceso);
	}

}
