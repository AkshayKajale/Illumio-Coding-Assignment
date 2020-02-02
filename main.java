package FireWall;
public class main {
	
	public static void main(String[] args){
		
		String filePath = "/Users/akshay9/Desktop/IllumioData/pack.csv";
		FireWall fireWall = new FireWall(filePath);
		try {
			fireWall.readFile();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
