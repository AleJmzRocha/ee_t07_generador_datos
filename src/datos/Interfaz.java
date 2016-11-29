package datos;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
/**
 * 
 * @author Jiménez Rocha Alejandra
 *
 */
public class Interfaz extends JFrame implements ActionListener, ChangeListener{
	private static final long serialVersionUID = 1L;
	JCheckBox nombres = new JCheckBox("Nombres"), apellidoPat = new JCheckBox("Apellidos Paternos"), apellidoMat = new JCheckBox("Apellidos Maternos"); 
	JCheckBox id = new JCheckBox("Id"), numControl = new JCheckBox("Números de Control"), email = new JCheckBox("Email");
	JCheckBox telFijos = new JCheckBox("Teléfonos Fijos"), direcciones = new JCheckBox("Direcciones"), cp = new JCheckBox("Códigos Postales");
	JCheckBox cel = new JCheckBox("Celulares");
	JButton aceptar;
	JPanel jpanel = (JPanel) this.getContentPane(), jpanel2 = (JPanel) this.getContentPane(), jpanel3 = (JPanel) this.getContentPane(), jpanel4 = (JPanel) this.getContentPane();
	JLabel jlabel = new JLabel(), jlabel2 = new JLabel();
	Generar g = new Generar();
	String[] nom, ap, iden, ncontrol, correo, tel, dir, codp, celulares, combinacion;
	JTextField jtextfield = new JTextField();
	
	public Interfaz(){
		setTitle("Generador de Datos");
		setLayout(null);
        setBounds(60,100,280,350);
        setResizable(false);
        jpanel.setLayout(null);
		jpanel2.setLayout(null);
		jpanel3.setLayout(null);
		jpanel4.setLayout(null);
        
        jlabel.setBounds(new Rectangle(5, 5, 300, 21));
		jlabel.setText("Seleccione la combinación de datos a generar");
    	jpanel.add(jlabel, null);
    	
//    	jpanel2.setLayout(new GridLayout(9,1));
//    	pack();
//		jpanel.setLayout(new BoxLayout(jpanel, BoxLayout.Y_AXIS));			
        setVisible(true);
        setLayout(null);
        nombres.setBounds(10,30,150,30);
        nombres.addChangeListener((ChangeListener) this);
//        add(check1);
        apellidoPat.setBounds(10,55, 150,30);
        apellidoPat.addChangeListener(this);        
//        add(check2);
        apellidoMat.setBounds(10,80,150,30);
        apellidoMat.addChangeListener(this); 
//      add(check3);   
        
        id.setBounds(10,105,150,30);
        id.addChangeListener(this);
        
        numControl.setBounds(10,130,150,30);
        numControl.addChangeListener(this);
        
        email.setBounds(10,155,150,30);
        email.addChangeListener(this);
       
        telFijos.setBounds(10,180,150,30);
        telFijos.addChangeListener(this);
        
        cp.setBounds(10,205,150,30);
        cp.addChangeListener(this);
        
        cel.setBounds(10,230,150,30);
        cel.addChangeListener(this);
        
        jpanel2.add(nombres);
        jpanel2.add(apellidoPat);
        jpanel2.add(apellidoMat);
        jpanel2.add(id);
        jpanel2.add(numControl);
        jpanel2.add(email);
        jpanel2.add(telFijos);
        jpanel2.add(cp);
        jpanel2.add(cel);
        
        jlabel2.setBounds(new Rectangle(5, 265, 300, 21));
		jlabel2.setText("Número de datos a generar:");
		jtextfield.setBounds(new Rectangle(165, 265, 80, 21));
    	jpanel3.add(jlabel2, null);
    	jpanel3.add(jtextfield, null);
    	
        aceptar = new JButton("Aceptar");
        aceptar.addActionListener(this);
        aceptar.setBounds(10,300,80,21);
		jpanel4.add(aceptar,null);
	}
	
	public void actionPerformed(ActionEvent e){
        if(e.getSource() == aceptar){
        	g.generar(Integer.parseInt(jtextfield.getText()));
        	System.exit(0);
        }
    }

	@Override
	public void stateChanged(ChangeEvent change) {
		if(nombres.isSelected() == true)
			nom = g.leerNombres();
		else
			if(apellidoPat.isSelected() == true)
				ap = g.leerApellidos();
			else
				if(apellidoMat.isSelected() == true)
					ap = g.leerApellidos();
				else 
					if(id.isSelected() == true)
						iden = g.leerId();
					else
						if(numControl.isSelected() == true)
							ncontrol = g.leerNumControl();
						else
							if(email.isSelected() == true)
								correo = g.leerEmail();
							else
								if(telFijos.isSelected() == true)
									tel = g.leerTelFijos();
								else
									if(cp.isSelected() == true)
										codp = g.leerCP();
									else
										if(cel.isSelected() == true)
											celulares = g.leerCelulares();
	}
	
	public static void main(String[] args) {
		Interfaz ventana = new Interfaz();
		ventana.setVisible(true);
	}
}
