import javax.swing.JApplet;
import javax.swing.JTextArea;
import java.awt.BorderLayout;
import javax.swing.JScrollPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class IOUtensil extends JApplet {
	
	/**
	 * Create the applet.
	 */
	public IOUtensil() {
		getContentPane().setLayout(null);	
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(372, 72, 31, 217);
		getContentPane().add(scrollPane);
		getContentPane().add(scrollPane);
		JTextArea jargon = new JTextArea();
		jargon.setLineWrap(true);
		jargon.setWrapStyleWord(true);
		jargon.setText(" ");
		jargon.setBounds(31, 62, 341, 238);
		getContentPane().add(jargon);
		
		JButton btnNewButton = new JButton("Open File");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnNewButton.setBounds(31, 10, 106, 38);
		getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Save file");
		btnNewButton_1.setBounds(147, 10, 98, 38);
		getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Clear file");
		btnNewButton_2.setBounds(250, 10, 106, 29);
		getContentPane().add(btnNewButton_2);
	}
}
