package Vue;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class PanelControl extends JPanel implements ActionListener{
	
	private JLabel titre;
	private Font font = new Font("Arial", Font.BOLD, 40);
	private JButton buttonRotate;
	private JPanel emplacementPiece;
	
	public PanelControl() {
		builPanelControl();
		titre.setBounds(700, 25, 100, 100);
		buttonRotate.setBounds(700, 400, 100, 100);
		emplacementPiece.setBounds(650, 75, 152, 152);
		add(titre);
		add(buttonRotate);
		add(emplacementPiece);
		setBackground(Color.white);
		setPreferredSize(new Dimension(400, 600));
	}
	
	private void builPanelControl(){
		titre= new JLabel("Let's play!");
		titre.setFont(font);
		buttonRotate = new JButton("Rotation");
		buttonRotate.setForeground(Color.GREEN);
		buttonRotate.addActionListener(this);
		emplacementPiece= new JPanel();
		emplacementPiece.setBackground(Color.DARK_GRAY);
		emplacementPiece.setBorder(BorderFactory.createLineBorder(Color.YELLOW));
		emplacementPiece.setPreferredSize(new Dimension(150, 150));
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==buttonRotate){
			//TODO
		}
		
	}
	
	
}
