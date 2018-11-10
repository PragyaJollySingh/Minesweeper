
public class Model {

	public int[]tracker;
	public int index;
	
	
	public Model() {
		tracker= new int [9];
		
	}

	public int checkReference(int cool) {
		if(cool==0) {
			tracker[0]=7;
			return 7;
		}
			
		if(cool==1|| cool==3|| cool==4) {
			tracker[cool]=1;
			return 1;
		}
		else {
			tracker[cool]=8;
			return 0;
		}
	}
	public boolean Won() {
		int number = 0;
		for(int i=1;i<9;i++) {
			if(tracker[i]!=0) {
					number=number+1;
					System.out.println(number);
					}	
				}	
		if (number==8){
			return true;
		}
		else {
			return false;
		}
	}
	public int[] getTracker() {
		return tracker;
	}
	public void setTracker(int[] tracker) {
		this.tracker = tracker;
	}
		
	
}
