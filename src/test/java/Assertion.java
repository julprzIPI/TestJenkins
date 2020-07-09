import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class Assertion {

	@Test
	public void testAssertion() {
		String str1 = new String("abc");
		String str2 = new String("abc");
		String str3 = null;
		String str4 = "abc";
		String str5 = "abc";
		
		int val1 = 5;
		int val2 = 6;
		
		String[] expectedArray = {"one","two","three"};
		String[] obtainedArray = {"one","two","three"};
		
		assertEquals(str1,str2);
		System.out.println("assert equals");
	}
}
