package gene.windows;

import org.eclipse.swt.widgets.Display;
import gene.humano.*;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Text;

import gene.creacion.Creacion;
import gene.humano.Humano;

import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;

public class principal {

	protected Shell shell;
	private Text txtNombre;
	private Text txtapellido;
	private Text txtEdad;
	private Text txtetapa;

	/**
	 * Launch the application.
	 * @param args
	 */
	/*
	 * public static void main(String[] args) { try { principal window = new
	 * principal(); window.open(); } catch (Exception e) { e.printStackTrace(); } }
	 */

	/**
	 * Open the window.
	 */
	public void open(Humano humano) {
		Display display = Display.getDefault();
		createContents(humano);
		shell.open();
		shell.layout();
		while (!shell.isDisposed()) {
			if (!display.readAndDispatch()) {
				display.sleep();
			}
		}
	}

	/**
	 * Create contents of the window.
	 */
	public void createContents(Humano humano) {
		shell = new Shell();
		shell.setSize(450, 300);
		shell.setText("SWT Application");
		
		Label lblNewLabel = new Label(shell, SWT.NONE);
		lblNewLabel.setBounds(10, 10, 55, 15);
		lblNewLabel.setText("nombre");
		
		Label lblNewLabel_1 = new Label(shell, SWT.NONE);
		lblNewLabel_1.setBounds(10, 31, 55, 15);
		lblNewLabel_1.setText("apellido");
		
		Label lblNewLabel_2 = new Label(shell, SWT.NONE);
		lblNewLabel_2.setBounds(10, 52, 55, 15);
		lblNewLabel_2.setText("edad");
		
		Label lblNewLabel_3 = new Label(shell, SWT.NONE);
		lblNewLabel_3.setBounds(10, 73, 55, 15);
		lblNewLabel_3.setText("etapa");
		
		Button btnNewButton = new Button(shell, SWT.NONE);
		btnNewButton.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				rellenarCampos(humano);
				
			}
		});
		btnNewButton.setBounds(10, 118, 89, 25);
		btnNewButton.setText("siguiente a\u00F1o");
		
		txtNombre = new Text(shell, SWT.BORDER);
		txtNombre.setBounds(85, 10, 120, 21);
		
		txtapellido = new Text(shell, SWT.BORDER);
		txtapellido.setBounds(85, 31, 120, 21);
		
		txtEdad = new Text(shell, SWT.BORDER);
		txtEdad.setBounds(85, 52, 120, 21);
		
		txtetapa = new Text(shell, SWT.BORDER);
		txtetapa.setBounds(85, 73, 120, 21);

	}
	
	public void rellenarCampos(Humano humano) {
		txtNombre.setText(humano.getNombre());
		txtapellido.setText(humano.getApellido());
		txtEdad.setText(Integer.toString(humano.getEdad()));
		txtetapa.setText(humano.getCategoria());
	}
}
