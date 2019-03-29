package ejercicioEntorno;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;




public class Controlador implements ActionListener, WindowListener {

	Vista objVista = null; 
	Modelo objModelo = null;
	
	public Controlador(Vista objVista, Modelo objModelo) {
		
		this.objVista = objVista;
		this.objModelo = objModelo; 
		objVista.aceptar.addActionListener(this);
		objVista.addWindowListener(this);
		
	}
	
	
	
	
	@Override
	public void windowActivated(WindowEvent arg0) {
		if(objVista.aceptar.equals(arg0.getSource())) {
			
		}
		
	}

	@Override
	public void windowClosed(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowClosing(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowDeactivated(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowDeiconified(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowIconified(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowOpened(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
	}

}
