package PeticionDatos;

import javax.microedition.lcdui.Display;
import javax.microedition.lcdui.Form;

import javax.microedition.lcdui.TextField;
import javax.microedition.midlet.*;


public class PeticionDatos extends MIDlet {

    public Display pantalla;
    public Form frmdatos;
    public TextField txtNombre, txtApe, txtTel;
    /*public button boton;*/
    public void startApp() {
        pantalla = Display.getDisplay(this);
        frmdatos = new Form("Peticion De Datos");
        txtNombre = new TextField("Nombre:", "", 20, TextField.ANY);
        txtApe = new TextField("Apellidos:", "", 20, TextField.ANY);
        txtTel = new TextField("Telefono:", "", 12,TextField.PHONENUMBER );
        
        frmdatos.append(txtNombre);
        frmdatos.append(txtApe);
        frmdatos.append(txtTel);
        
        pantalla.setCurrent(frmdatos);
    }
    
    public void pauseApp() {
    }
    
    public void destroyApp(boolean unconditional) {
    }
}
