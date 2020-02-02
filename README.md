# Illumio-Coding-Assignment
Coding Repository for Illumio


Using JUnit I tested Various inputs which contains negative port number, Invalid range of port numbers and IP Addresses and invalid directions.

Following are the test cases I tested
outbound	tcp	10000-20000	192.168.10.11
inbound	udp	53	192.168.1.1-192.168.2.5
outbound	udp	1000-2000	52.12.48.92
inbound	tcp	670-677	123.45.56.78-123.45.56.85
outbound	tcp	80	192.168.1.2
midbound	tcp	92	192.168.1.1-192.168.2.5
inbound	ftp	45	192.168.1.2
outbound	udp	700000	192.168.1.1-192.168.2.5
inbound	udp	-10000	52.12.48.92
outbound	tcp	56	20
inbound	tcp	100-(-2000)	52.12.48.92

Code Explaination:
I created Firewall.java file to in which I have defined two methods, "readfile(String path)" and "accept_packet(RecordValidity validity)" methods. Read file method accepts a String argument which contains file path and  "accept_packet(RecordValidity validity)" method accepts the object of new class "RecordValidity" in which I am assigning the direction, protocol, port and ipaddress values to string. In this class, I also defined four different methods to validate the above parameters according to rules. i.e. port should be between 0-255 and IP address should be between 0.0.0.0 to 255.255.255.255. I defined other rules on protocols and direction. I created "enum class named Check" to make my code more concise. There, I declared strings such as inbound, outbound, tcp and udp to make the code more concise. So if anytime I have to add any string, I can add it in my enum. I created different class for main method and lastly interface named "FireWallUtility" to declare two methods 1. "readfile(String path)" and accept_packet(RecordValidity validity).  I used JUnit to test 11 different test cases.   

I used enum class to declare declare the strings such as inbound, outbound, tcp and udp to make the code more concise. So if anytime I have to add any string, I can add it in my enum.

If I would have had more flexibility and time wrt Interface, I could have declared a single validator method and used to validate each attribute would have its own implwmwntation of validator method i.e method overloading, which would promote code reusability and modularity. 

Please ingore the print statements, It was used for validation purposes.

So I would like to work in the team by following preference:
1. Platform Team
2. Data Team
3. Policy Team


