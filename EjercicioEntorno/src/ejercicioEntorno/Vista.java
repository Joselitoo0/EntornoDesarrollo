package ejercicioEntorno;

import java.awt.Frame;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextArea;

public class Vista extends Frame {

	private static final long serialVersionUID = 1L;
	
	JTextArea campo = new JTextArea("Campo");
	JLabel etiqueta = new JLabel("Etiqueta");
	JButton aceptar = new JButton("Aceptar");
	
	Vista(){
		
		setTitle("Convertir Palabras");
	
		add(campo);
		add(aceptar);
		add(etiqueta);
		
		setSize(450,250); 
		setResizable(false);
		setVisible(true);
	}
	

}
