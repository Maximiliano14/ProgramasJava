
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class Ventana extends JFrame implements ActionListener {

	public Ventana() {
		pantallaPrograma();
		componentesPantalla();
	}

	public void pantallaPrograma() {
		// creacion de la ventana
		this.setTitle("Programa");
		this.setSize(700, 700);
		this.setLocationRelativeTo(null);
		this.setLayout(null);
		this.setResizable(false);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	protected void componentesPantalla() {
		// llamados
		JButton crearExcel = new JButton();
		JLabel texto = new JLabel();
		JButton mostrarTabla = new JButton();

		// textos
		texto.setText("Crear Excel");
		texto.setBounds(10, 10, 150, 50);

		// botones
		crearExcel.setText("Crear");
		crearExcel.setBounds(30, 50, 100, 25);
		crearExcel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				boolean verdad;
				String fileLocal = new String("src/archivos/base.ods");
				try {
					Runtime.getRuntime().exec("cmd /c start " + fileLocal);
					verdad = true;

				} catch (IOException io) {
					verdad = false;
					io.printStackTrace();
				}

				if (e.getActionCommand().equals("Crear") && verdad == true) {
					JOptionPane.showMessageDialog(null, "Creado exitosamente.");
				} else {
					JOptionPane.showMessageDialog(null, "Error en crear!.");
				}
			}
		});

		mostrarTabla.setText("tabla");
		mostrarTabla.setBounds(50, 100, 100, 25);
		mostrarTabla.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new Tabla();
			}
		});

		// add elementos
		this.add(texto);
		this.add(crearExcel);
		this.add(mostrarTabla);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
	}

}
