
import javax.swing.JOptionPane;

/**
 *
 * @author Oscar
 */
public class AppletBusqueda extends javax.swing.JApplet {

	public static int[] leer_int(String array2) {
		int[] array = null;
		try {
			String[] input = array2.split(" ");
			array = new int[input.length];
			for (int i = 0; i < input.length; i++) {
				array[i] = Integer.parseInt(input[i]);
			}
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		return array;
	}

	@Override
	public void init() {
		try {
			for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
				if ("Nimbus".equals(info.getName())) {
					javax.swing.UIManager.setLookAndFeel(info.getClassName());
					break;
				}
			}
		} catch (ClassNotFoundException ex) {
			java.util.logging.Logger.getLogger(AppletBusqueda.class.getName()).log(java.util.logging.Level.SEVERE, null,
					ex);
		} catch (InstantiationException ex) {
			java.util.logging.Logger.getLogger(AppletBusqueda.class.getName()).log(java.util.logging.Level.SEVERE, null,
					ex);
		} catch (IllegalAccessException ex) {
			java.util.logging.Logger.getLogger(AppletBusqueda.class.getName()).log(java.util.logging.Level.SEVERE, null,
					ex);
		} catch (javax.swing.UnsupportedLookAndFeelException ex) {
			java.util.logging.Logger.getLogger(AppletBusqueda.class.getName()).log(java.util.logging.Level.SEVERE, null,
					ex);
		}

		try {
			java.awt.EventQueue.invokeAndWait(new Runnable() {
				public void run() {
					initComponents();
				}
			});
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

	@SuppressWarnings("unchecked")
	private void initComponents() {

		titulo = new javax.swing.JLabel();
		menu = new javax.swing.JComboBox();
		Binary = new javax.swing.JButton();
		Lineal = new javax.swing.JButton();
		Interpolation = new javax.swing.JButton();
		Entrada = new javax.swing.JTextField();
		jScrollPane1 = new javax.swing.JScrollPane();
		ordenar = new javax.swing.JTextArea();
		Busqueda = new javax.swing.JTextField();
		salida = new javax.swing.JTextField();
		
		setPreferredSize(new java.awt.Dimension(600, 250));
		setSize(450, 250);

		setStub(null);

		titulo.setText("BUSQUEDA");

		menu.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Menu", "Nuevo Conjunto","Numero a buscar", "Salir" }));
		menu.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				menuActionPerformed(evt);
			}
		});

		Binary.setText("Binary");
		Binary.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				BinaryActionPerformed(evt);
			}
		});

		Lineal.setText("Lineal");
		Lineal.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				LinealActionPerformed(evt);
			}
		});

		Interpolation.setText("Interpolation");
		Interpolation.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				InterpolationActionPerformed(evt);
			}
		});

		Entrada.setText("Ingrese los numeros dando enter");
		Entrada.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				EntradaActionPerformed(evt);
			}
		});

		ordenar.setColumns(20);
		ordenar.setRows(5);
		ordenar.setText("Numeros ordanizados");
		jScrollPane1.setViewportView(ordenar);

		Busqueda.setText("Numero a buscar dando enter");
		Busqueda.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				BusquedaActionPerformed(evt);
			}
		});

		salida.setText("Se encuentra en la posición");

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
						layout.createSequentialGroup().addGap(0, 0, Short.MAX_VALUE)
								.addComponent(titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 85,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addGap(150, 150, 150))
				.addGroup(layout.createSequentialGroup()
						.addComponent(menu, javax.swing.GroupLayout.PREFERRED_SIZE, 105,
								javax.swing.GroupLayout.PREFERRED_SIZE)
						.addGap(18, 18, 18)
						.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
										.addComponent(jScrollPane1).addComponent(Entrada)
										.addGroup(layout.createSequentialGroup()
												.addComponent(Binary, javax.swing.GroupLayout.PREFERRED_SIZE, 80,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
												.addComponent(Lineal, javax.swing.GroupLayout.PREFERRED_SIZE, 81,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
												.addComponent(Interpolation)))
								.addComponent(salida, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(Busqueda, javax.swing.GroupLayout.PREFERRED_SIZE, 190,
										javax.swing.GroupLayout.PREFERRED_SIZE))
						.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));
		layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(layout.createSequentialGroup().addComponent(titulo)
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
						.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(menu, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(Binary).addComponent(Lineal).addComponent(Interpolation))
				.addGap(18, 18, 18)
				.addComponent(Entrada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE,
						javax.swing.GroupLayout.PREFERRED_SIZE)
				.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
				.addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 35,
						javax.swing.GroupLayout.PREFERRED_SIZE)
				.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
				.addComponent(Busqueda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE,
						javax.swing.GroupLayout.PREFERRED_SIZE).addGap(18, 18, 18)
				.addComponent(salida, javax.swing.GroupLayout.PREFERRED_SIZE, 31,
						javax.swing.GroupLayout.PREFERRED_SIZE).addGap(0, 92, Short.MAX_VALUE)));
	}

	private void menuActionPerformed(java.awt.event.ActionEvent evt) {
		if (menu.getSelectedIndex() == 1) {
			String numeros = "";
			numeros = JOptionPane.showInputDialog("Ingrese los numeros");
			Entrada.setText(numeros);
		}
		if (menu.getSelectedIndex() == 2) {
			String buscar="";
			buscar= JOptionPane.showInputDialog("Ingrese el nuevo numero a buscar");
			Busqueda.setText(buscar);
		}
		if (menu.getSelectedIndex()==3){
			System.exit(0);
		}
	}

	private void InterpolationActionPerformed(java.awt.event.ActionEvent evt) {
		QuickSort Q = new QuickSort();
		int array[] = leer_int(Entrada.getText());
		int vec[] = new int[array.length];
		for (int i = 0; i < vec.length; i++) {
			vec[i] = array[i];
		}
		vec = Q.sort(vec);
		String o = "";
		for (int i = 0; i < array.length; i++) {
			o += vec[i] + " - ";
		}
		ordenar.setText(o);
		String numero = Busqueda.getText();
		int l = Integer.parseInt(numero);
		int resul = InterpolationSearch.inter(vec, l);
		if (resul == -1) {
			salida.setText("Elemento no se encuentra");
		} else {
			salida.setText(Integer.toString(resul));
		}
	}

	private void EntradaActionPerformed(java.awt.event.ActionEvent evt) {
		String numeros = "";
		numeros = JOptionPane.showInputDialog("Ingrese los numeros");
		Entrada.setText(numeros);
	}

	private void BusquedaActionPerformed(java.awt.event.ActionEvent evt) {
		String numeros = "";
		numeros = JOptionPane.showInputDialog("Ingrese los numeros");
		Busqueda.setText(numeros);
	}

	private void LinealActionPerformed(java.awt.event.ActionEvent evt) {
		QuickSort Q = new QuickSort();
		int array[] = leer_int(Entrada.getText());
		int vec[] = new int[array.length];
		for (int i = 0; i < vec.length; i++) {
			vec[i] = array[i];
		}
		vec = Q.sort(vec);
		String o = "";
		for (int i = 0; i < array.length; i++) {
			o += vec[i] + " - ";
		}
		ordenar.setText(o);
		String numero = Busqueda.getText();
		int s = Integer.parseInt(numero);
		int resul = LinealSearch.lineal(vec, s);
		if (resul == -1) {
			salida.setText("Elemento no se encuentra");
		} else {
			salida.setText(Integer.toString(resul));
		}
	}

	private void BinaryActionPerformed(java.awt.event.ActionEvent evt) {
		QuickSort Q = new QuickSort();
		int array[] = leer_int(Entrada.getText());
		int vec[] = new int[array.length];
		for (int i = 0; i < vec.length; i++) {
			vec[i] = array[i];
		}
		vec = Q.sort(vec);
		String o = "";
		for (int i = 0; i < array.length; i++) {
			o += vec[i] + " - ";
		}
		ordenar.setText(o);
		String numero = Busqueda.getText();
		int l = Integer.parseInt(numero);
		int resul = BinarySearch.binaria(vec, l);
		if (resul == -1) {
			salida.setText("Elemento no se encuentra");
		} else {
			salida.setText(Integer.toString(resul));
		}
	}

	private javax.swing.JButton Binary;
	private javax.swing.JTextField Busqueda;
	private javax.swing.JTextField Entrada;
	private javax.swing.JButton Interpolation;
	private javax.swing.JButton Lineal;
	private javax.swing.JScrollPane jScrollPane1;
	private javax.swing.JComboBox menu;
	private javax.swing.JTextArea ordenar;
	private javax.swing.JTextField salida;
	private javax.swing.JLabel titulo;
}
