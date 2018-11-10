
import java.awt.GridLayout;
import java.util.ArrayList;
import javax.swing.*;

public class View {
	public JFrame main;
	public ArrayList<JButton>buttons; 
	public int index;
	

	public View() {
		main= new JFrame("Minesweeper");
		main.setSize(500, 500);
		main.setLayout(new GridLayout(3,3));
		buttons=new ArrayList<JButton>();
			for(int i=0;i<9;i++) {
				JButton button= new JButton();
				button.setActionCommand(Integer.toString(i));
				main.add(button);
				buttons.add(button);
			}
		main.setVisible(true);
		
		}


	public int getIndex() {
		return index;
	}


	public void setIndex(int index) {
		this.index = index;
	}


	public ArrayList<JButton> getButtons() {
		return buttons;
	}





	public void setButtons(ArrayList<JButton> buttons) {
		this.buttons = buttons;
	}


	
	

}
