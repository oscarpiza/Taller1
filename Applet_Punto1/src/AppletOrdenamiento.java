import java.io.*;
import javax.swing.JOptionPane;

/**
 *
 */
/**
 * @author Oscar
 *
 */
public class AppletOrdenamiento extends javax.swing.JApplet {

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

	public void init() {
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
		Bubble = new javax.swing.JButton();
		Radix = new javax.swing.JButton();
		Counting = new javax.swing.JButton();
		Quick = new javax.swing.JButton();
		Shell = new javax.swing.JButton();
		Insertion = new javax.swing.JButton();
		Merge = new javax.swing.JButton();
		Entrada = new javax.swing.JTextField();
		jScrollPane1 = new javax.swing.JScrollPane();
		Salida = new javax.swing.JTextArea();

		setPreferredSize(new java.awt.Dimension(600, 250));
		setSize(450, 250);

		setStub(null);

		titulo.setText("ORDENAMIENTO");

		menu.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Menu", "Nuevo conjunto", "Salir" }));
		menu.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				menuActionPerformed(evt);
			}
		});

		Bubble.setText("Bubble");
		Bubble.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				BubbleActionPerformed(evt);
			}
		});

		Radix.setText("Radix");
		Radix.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				RadixActionPerformed(evt);
			}
		});

		Counting.setText("Counting");
		Counting.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				CountingActionPerformed(evt);
			}
		});

		Quick.setText("Quick");
		Quick.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				QuickActionPerformed(evt);
			}
		});

		Shell.setText("Shell");
		Shell.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				ShellActionPerformed(evt);
			}
		});

		Insertion.setText("Insertion");
		Insertion.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				InsertionActionPerformed(evt);
			}
		});

		Merge.setText("Merge");
		Merge.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				MergeActionPerformed(evt);
			}
		});

		Entrada.setText("Ingrese numeros dando enter");
		Entrada.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				EntradaActionPerformed(evt);
			}
		});

		Salida.setColumns(20);
		Salida.setRows(5);
		Salida.setText("Numeros Organizados");
		jScrollPane1.setViewportView(Salida);

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(layout.createSequentialGroup().addGap(205, 205, 205).addComponent(titulo)
						.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
				.addGroup(layout.createSequentialGroup()
						.addComponent(menu, javax.swing.GroupLayout.PREFERRED_SIZE, 92,
								javax.swing.GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
						.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addComponent(Entrada)
								.addGroup(layout.createSequentialGroup().addGroup(layout
										.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
										.addComponent(Bubble, javax.swing.GroupLayout.DEFAULT_SIZE,
												javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
										.addComponent(Merge, javax.swing.GroupLayout.DEFAULT_SIZE,
												javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
										.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addGroup(layout
												.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
												.addGroup(layout.createSequentialGroup().addComponent(Quick)
														.addPreferredGap(
																javax.swing.LayoutStyle.ComponentPlacement.RELATED)
														.addComponent(Shell, javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
												.addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
														layout.createSequentialGroup().addComponent(Radix)
																.addPreferredGap(
																		javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																.addComponent(Counting)))
										.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(Insertion).addGap(0, 0, Short.MAX_VALUE))
								.addComponent(jScrollPane1))));
		layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(layout
				.createSequentialGroup().addComponent(titulo)
				.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
				.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
						.addComponent(menu, javax.swing.GroupLayout.PREFERRED_SIZE,
								javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
						.addComponent(Bubble).addComponent(Radix).addComponent(Counting).addComponent(Insertion))
				.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
				.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(Merge)
						.addComponent(Quick).addComponent(Shell))
				.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
				.addComponent(Entrada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE,
						javax.swing.GroupLayout.PREFERRED_SIZE)
				.addGap(18, 18, 18).addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 55,
						javax.swing.GroupLayout.PREFERRED_SIZE)
				.addGap(21, 21, 21)));
	}

	private void BubbleActionPerformed(java.awt.event.ActionEvent evt) {
		BubbleSort B = new BubbleSort();
		int array[] = leer_int(Entrada.getText());
		array = B.sort(array);
		String g = "";
		for (int i = 0; i < array.length; i++) {
			g += array[i] + " - ";
		}
		Salida.setText(g);
	}

	private void RadixActionPerformed(java.awt.event.ActionEvent evt) {
		RadixSort R = new RadixSort();
		String S = R.radixSort(Entrada.getText());
		Salida.setText(S);
	}

	private void CountingActionPerformed(java.awt.event.ActionEvent evt) {
		CountingSort C = new CountingSort();
		int array[] = leer_int(Entrada.getText());
		array = C.CountingSort(array);
		String j = "";
		for (int i = 0; i < array.length; i++) {
			j += array[i] + " - ";
		}
		Salida.setText(j);
	}

	private void InsertionActionPerformed(java.awt.event.ActionEvent evt) {
		InsertionSort I = new InsertionSort();
		int array[] = leer_int(Entrada.getText());
		array = I.insertionsort(array);
		String j = "";
		for (int i = 0; i < array.length; i++) {
			j += array[i] + " - ";
		}
		Salida.setText(j);
	}

	private void MergeActionPerformed(java.awt.event.ActionEvent evt) {
		MergeSort M = new MergeSort();
		int array[] = leer_int(Entrada.getText());
		array = M.sort(array);
		String s = "";
		for (int i = 0; i < array.length; i++) {
			s += array[i] + " - ";
		}
		Salida.setText(s);
	}

	private void QuickActionPerformed(java.awt.event.ActionEvent evt) {
		QuickSort Q = new QuickSort();
		int array[] = leer_int(Entrada.getText());
		array = Q.sort(array);
		String o = "";
		for (int i = 0; i < array.length; i++) {
			o += array[i] + " - ";
		}
		Salida.setText(o);
	}

	private void ShellActionPerformed(java.awt.event.ActionEvent evt) {
		ShellSort S = new ShellSort();
		int array[] = leer_int(Entrada.getText());
		array = S.shell(array);
		String o = "";
		for (int i = 0; i < array.length; i++) {
			o += array[i] + " - ";
		}
		Salida.setText(o);
	}

	private void EntradaActionPerformed(java.awt.event.ActionEvent evt) {
		String numeros = "";
		numeros = JOptionPane.showInputDialog("Ingrese los numeros");
		Entrada.setText(numeros);
	}

	private void menuActionPerformed(java.awt.event.ActionEvent evt) {
		if (menu.getSelectedIndex() == 1) {
			String numeros = "";
			numeros = JOptionPane.showInputDialog("Ingrese los numeros");
			Entrada.setText(numeros);
		}
		if (menu.getSelectedIndex() == 2) {
			System.exit(0);
		}
	}

	private javax.swing.JButton Bubble;
	private javax.swing.JButton Counting;
	private javax.swing.JTextField Entrada;
	private javax.swing.JButton Insertion;
	private javax.swing.JButton Merge;
	private javax.swing.JButton Quick;
	private javax.swing.JButton Radix;
	private javax.swing.JTextArea Salida;
	private javax.swing.JButton Shell;
	private javax.swing.JScrollPane jScrollPane1;
	private javax.swing.JComboBox menu;
	private javax.swing.JLabel titulo;

}
