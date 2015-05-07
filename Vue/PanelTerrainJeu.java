package Vue;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.BorderFactory;
import javax.swing.JPanel;

public class PanelTerrainJeu extends JPanel{

	JPanel [][]terrain;
	
	public PanelTerrainJeu() {
		//setBackground(Color.white);
		setPreferredSize(new Dimension(625, 625));
		buildTerrain();
		for (int i = 0; i < terrain.length; i++) {
			for (int j = 0; j < terrain.length; j++) {
				add(terrain[i][j]);
			}
		}
	}
	
	private void buildTerrain(){
		terrain= new JPanel [4][4];
		int x=25, y=25;
		for (int i = 0; i < terrain.length; i++) {
			for (int j = 0; j < terrain.length; j++) {
				terrain[i][j]= new JPanel();
				terrain[i][j].setPreferredSize(new Dimension(150, 150));
				terrain[i][j].setBounds(x, y, 150, 150);
				terrain[i][j].setBackground(Color.DARK_GRAY);
				terrain[i][j].setBorder(BorderFactory.createLineBorder(Color.WHITE));
				x+=150;
			}
			y+=150;
		}
	}
}
