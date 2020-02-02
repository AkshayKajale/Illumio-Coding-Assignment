package FireWall;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FireWall implements FireWallUtility {

	String filePath;
	
	public FireWall(String filePath)
	{
		this.filePath = filePath;
	}
	@Override
	public void readFile() throws FileNotFoundException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new FileReader(filePath));
		String validEntry = "";
		
		try {
			while((validEntry = br.readLine()) != null)
			{
				String[] splitEntry = validEntry.split(",");
				if(accept_packet(new RecordValidity(splitEntry)))
					{
						System.out.println("Valid");
					}
				else
				{
					System.out.println("Invalid");
				}
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		finally
		{
			br.close();
		}
	}
	
	public boolean accept_packet(RecordValidity validEntry)
	{
		if(validEntry.direction.equals("inbound") || validEntry.direction.equals("outbound"))
		{
			if(validEntry.checkPortValidity(validEntry.port))
			{
				if(validEntry.checkProtocol(validEntry.protocol))
				{
					if(validEntry.checkIpAddress(validEntry.protocol))
					{
						return true;
					}				
				}
			}
		}
		return false;
	}
	
	
	
	
	
	

}
