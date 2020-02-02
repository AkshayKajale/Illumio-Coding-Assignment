package FireWall;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class FireWallTest {
	
	FireWall firewall = new FireWall("/Users/akshay9/Desktop/IllumioData/pack.csv");

	
	@Test
	public void test1() {
		String testArray[] = {"outbound","tcp","10000-20000","192.168.10.11"};
		assertEquals(true, firewall.accept_packet(new RecordValidity(testArray)));
	}
	
	@Test
	public void test2() {
		String testArray[] = {"outbound","udp","53","192.168.1.1-192.168.2.5"};
		assertEquals(true, firewall.accept_packet(new RecordValidity(testArray)));
	}
	
	@Test
	public void test3() {
		String testArray[] = {"outbound","udp","10000-20000","52.12.48.92"};
		assertEquals(true, firewall.accept_packet(new RecordValidity(testArray)));
	}
	
	@Test
	public void test4() {
		String testArray[] = {"inbound","tcp","670-677","123.45.56.78-123.45.56.84"};
		assertEquals(true, firewall.accept_packet(new RecordValidity(testArray)));
	}
	
	@Test
	public void test5() {
		String testArray[] = {"outbound","tcp","80","192.168.1.2"};
		assertEquals(true, firewall.accept_packet(new RecordValidity(testArray)));
	}
	
	@Test
	public void test6() {
		String testArray[] = {"midbound","tcp","92","192.168.10.11"};
		assertEquals(true, firewall.accept_packet(new RecordValidity(testArray)));
	}
	
	@Test
	public void test7() {
		String testArray[] = {"inbound","ftp","45","192.168.10.11"};
		assertEquals(true, firewall.accept_packet(new RecordValidity(testArray)));
	}
	
	@Test
	public void test8() {
		String testArray[] = {"outbound","udp","700000","192.168.10.11"};
		assertEquals(true, firewall.accept_packet(new RecordValidity(testArray)));
	}
	
	@Test
	public void test9() {
		String testArray[] = {"inbound","udp","-10000","192.168.10.11"};
		assertEquals(true, firewall.accept_packet(new RecordValidity(testArray)));
	}
	
	@Test
	public void test10() {
		String testArray[] = {"outbound","tcp","56","20"};
		assertEquals(true, firewall.accept_packet(new RecordValidity(testArray)));
	}
	
	@Test
	public void test11() {
		String testArray[] = {"inbound","tcp","1000-(-20000)","192.168.10.11"};
		assertEquals(true, firewall.accept_packet(new RecordValidity(testArray)));
	}
}

