	package Vue;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.WindowConstants;

// Attention Taille du tableau ˆ donner

public class Fenetre extends JFrame{
	
	ControleurFenetrePrincipale controlleur;
	JMenuItem itemQuitter;
	PanelTerrainJeu panelTerrainJeu;
	PanelControl control;

	
	public Fenetre(){
		 super("Projet Java Adrien");
		 setSize(1000, 670);
		 setResizable(false);
	     setLocationRelativeTo(null);
		 controlleur= new ControleurFenetrePrincipale();
		 setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
	     setJMenuBar(buildMenu());
	     setContentPane(buildFenetre());
	     //pack();	
	}
	
	public JPanel buildFenetre(){
		buildPanelTerrainJeu();
		buildPanelControl();
		JPanel panelPrincipal= new JPanel();
		panelPrincipal.setBounds(0, 0, 900, 600);
		//panelPrincipal.setBackground(Color.blue);
		panelPrincipal.setLayout(new BorderLayout());
		panelPrincipal.add(panelTerrainJeu, BorderLayout.WEST);
		panelPrincipal.add(control, BorderLayout.EAST);
		return panelPrincipal;
	}
	
	 private JMenuBar buildMenu() {
		 JMenuBar menuBar = new JMenuBar();
	     JMenu menuFichier = new JMenu("Fichier");
	     itemQuitter = new JMenuItem("Quitter");
	     itemQuitter.addActionListener(controlleur);
	     menuFichier.add(itemQuitter);
	     menuBar.add(menuFichier);
	     return menuBar;
	  }
	 
	 public void buildPanelControl(){
		 control= new PanelControl();
	 }
	 
	 public void buildPanelTerrainJeu(){
		 panelTerrainJeu= new PanelTerrainJeu();
	 }
	 
	 public class ControleurFenetrePrincipale implements ActionListener {

	        @Override
	        public void actionPerformed(ActionEvent e) {
	            Object source = e.getSource();

	            if (source == itemQuitter) {
	               dispose();
	            } 
	        }

	    }
	
}
