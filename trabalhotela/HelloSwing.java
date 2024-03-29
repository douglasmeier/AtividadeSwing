package trabalhotela;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class HelloSwing extends JFrame {
	
	public HelloSwing() {
		
		setTitle("Interface Java Swing Pontos Cardeais");
		setSize(600,600);
		setLocation(1366/2 - 800/2,768/2 - 600/2);
		setResizable(false);
		setLayout();
	}
	
	private void setLayout() {
		
	JPanel norte = criarPanel(Color.BLACK,"Norte");
        JPanel leste = criarPanel(Color.ORANGE,"Leste");
        JPanel oeste = criarPanel(Color.WHITE,"Oeste");
        JPanel sul = criarPanel(Color.YELLOW,"Sul");
        JPanel centro = criarPanel(Color.BLUE,"Centro");
		
		JPanel panelesq = new JPanel();
		panelesq.setBorder(BorderFactory.createEmptyBorder(150,220,0,100));
		panelesq.setPreferredSize(new Dimension(350,550));
		
		JCheckBox checknorte = new JCheckBox();
		checknorte.setText(" Norte");
		checknorte.setFont(new Font("Arial", Font.PLAIN, 38));
		checknorte.setPreferredSize(new Dimension(300,50));
		checknorte.setSelected(true);
		
		JCheckBox checksul = new JCheckBox();
		checksul.setText(" Sul");
		checksul.setFont(new Font("Arial", Font.PLAIN, 38));
		checksul.setPreferredSize(new Dimension(300,50));
		checksul.setSelected(true);
		
		JCheckBox checkcentro = new JCheckBox();
		checkcentro.setText(" Centro");
		checkcentro.setFont(new Font("Arial", Font.PLAIN, 38));
		checkcentro.setPreferredSize(new Dimension(300,50));
		checkcentro.setSelected(true);
		
		JCheckBox checkleste = new JCheckBox();
		checkleste.setText(" Leste");
		checkleste.setFont(new Font("Arial", Font.PLAIN, 38));
		checkleste.setPreferredSize(new Dimension(300,50));
		checkleste.setSelected(true);
		
		JCheckBox checkoeste = new JCheckBox();
		checkoeste.setText(" Oeste");
		checkoeste.setFont(new Font("Arial", Font.PLAIN, 38));
		checkoeste.setPreferredSize(new Dimension(300,50));
		checkoeste.setSelected(true);
		checknorte.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				norte.setVisible(checknorte.isSelected());	
			}
		});
		checksul.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				sul.setVisible(checksul.isSelected());	
			}
		});
		checkcentro.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				centro.setVisible(checkcentro.isSelected());	
			}
		});
		checkleste.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				leste.setVisible(checkleste.isSelected());	
			}
		});
		checkoeste.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				oeste.setVisible(checkoeste.isSelected());	
			}
		});
		JPanel paneldir = new JPanel();
		paneldir.setPreferredSize(new Dimension(350,550));
		paneldir.setLayout(new BorderLayout());			
		paneldir.add(norte, BorderLayout.NORTH);
		paneldir.add(sul, BorderLayout.SOUTH);
		paneldir.add(leste, BorderLayout.EAST);
		paneldir.add(oeste, BorderLayout.WEST);
		paneldir.add(centro, BorderLayout.CENTER);
		
	JPanel root = new JPanel(new GridLayout(1, 2));
	root.add(panelesq);
	root.add(paneldir);
	add(root);
	panelesq.add(checknorte);
	panelesq.add(checksul);
	panelesq.add(checkcentro);
	panelesq.add(checkleste);
	panelesq.add(checkoeste);	
	}
	
	private JPanel criarPanel(Color color, String texto) {
    	JPanel panel = new JPanel();
    	panel.setBackground(color);
    	panel.add(new JLabel(texto));

    	return panel;
    }
		
		
}
