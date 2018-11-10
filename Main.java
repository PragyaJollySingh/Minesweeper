
public class Main {
	public View v;
	public Controller c;
	public Model m;
	
	public Main(){
		v= new View();
		m= new Model();
		c= new Controller(v,m);
		c.Initialize();
	}
	
	public static void main(String []  args) {
		Main main= new Main();
	}
	
	
	
}
