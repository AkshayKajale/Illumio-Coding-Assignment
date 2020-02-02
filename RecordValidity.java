package FireWall;

public class RecordValidity {
	
	String direction,protocol,ipaddress;
	String port;
	
	public RecordValidity(String[] arr)
	{
		this.direction = arr[0].trim();
		this.ipaddress = arr[3].trim();
		this.protocol = arr[1].trim();
		this.port = arr[2].trim();
	}
	
	public boolean checkPortValidity(String port)
	{
		int start = 0;
		boolean flag = false;
		int end = 0;
		port = port.trim();
		
		
		if(port.indexOf('-') != port.lastIndexOf('-'))
		{
			return false;
		}
		
		if(port.indexOf('-') == 0)
		{
			return false;
		}
		
		if(port.contains("-"))
		{
			start = Integer.parseInt(port.substring(0, port.indexOf('-')));
			end = Integer.parseInt(port.substring(port.indexOf('-')+1, port.length()));
		}
		else
		{
			start = Integer.parseInt(port);
		}
		
			if(start > 65535 || start < 1)
			{
				flag = false;
			}
			else
			{
				flag = true;
			}
		
		
		if(end!=0 && flag == true)
		{
			if((end > 65535 || end < 1))
			{
				flag = false;
			}
		}
		return flag;
	}


	public boolean checkProtocol(String protocol)
	{
		try
		{
			if(Check.valueOf(protocol) != null)
			{
				return true;
			}
		}
		catch(Exception e)
		{
			return false;
		}
		return false;	
	}
	
	public boolean checkIpAddress(String ipaddress)
	{
		String[] ipSplit = new String[4];
		ipSplit = ipaddress.split(".");
		
		for (String string : ipSplit) {
			int number = Integer.parseInt(string);
			if(number<0 || number>255)
			{
				return false;
			}
		}
		return true;
	}
	
	public boolean checkDirection(String direction)
	{
		try
		{
			if(Check.valueOf(direction) != null)
			{
				return true;
			}
		}
		catch(Exception e)
		{
			return false;
		}
		return false;	
	}


}
