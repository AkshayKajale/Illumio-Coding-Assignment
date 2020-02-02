package FireWall;

import java.io.FileNotFoundException;
import java.io.IOException;

public interface FireWallUtility {
	
	public void readFile() throws FileNotFoundException, IOException;
	public boolean accept_packet(RecordValidity validEntry);
}
