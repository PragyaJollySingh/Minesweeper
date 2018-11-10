import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;


public class Controller {
	public View v;
	public Model m;
	public int index;
	public boolean wonStatus;
	
	Controller(View v, Model m){
		this.m=m;
		this.v=v;
	}
	public void Initialize() {
		for(int i=0;i<9;i++) {
			v.getButtons().get(i).addActionListener(e ->setValue((JButton)e.getSource()));
			
		}
		
	}
	
	public void setValue(JButton source) {
		String index= source.getActionCommand();
		int index2=Integer.parseInt(index);
		String name; 
		int number= m.checkReference(index2);
		System.out.println("0");
		if(number==1) {
			name= Integer.toString(number);
			source.setText(name);
			source.setEnabled(false);
			won();	
			
		}
		else if(number==7) {
			
			JOptionPane.showMessageDialog(null,"Oops a Bomb went off","Alert",JOptionPane.PLAIN_MESSAGE);
		}
		else if(number==0){
			name= Integer.toString(number);
			source.setText(name);
			source.setEnabled(false);
			won();
		}
		
	}
	
	public void won() {
		boolean status=m.Won();
		if(status==true) {
			JOptionPane.showMessageDialog(null,"You won","Alert",JOptionPane.PLAIN_MESSAGE);
		}
	}

}
