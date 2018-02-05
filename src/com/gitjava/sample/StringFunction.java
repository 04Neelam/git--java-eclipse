package com.gitjava.sample;


public class StringFunction {
	
	static String str=" ";
	
// find the matched string
	public static String getMatchString(String str1, String str2) {
		for(int i=0; i<str1.length(); i++) {
			for(int j=0;j<str2.length(); j++) {
				if(str1.charAt(i)==str2.charAt(j)) {
					str= str + str1.charAt(i);
					break;

				}
			}
		}  str = removeDuplicateChar(str);
		return str;
	}


	public static String removeDuplicateChar(String str) {
		String s= " ";
		for(int i=0; i<str.length();i++) {
			if(!s.contains(String.valueOf(str.charAt(i)))) {

				s = s+ String.valueOf(str.charAt(i));
			}

		}
		return s;
	}
	// find sum of digits
	public static int getStringDigitSum(String st) {
		int j=0;
		for(int i=0; i<st.length(); i++) {
			char c= st.charAt(i);
			if(Character.isDigit(st.charAt(i))) {
				j=j+Character.getNumericValue(c);
			}
		}


		return j;

	}
  public static void main(String[] args) {

		StringFunction s = new StringFunction();
		s.getMatchString("sushma", "sushmita");
		System.out.println("matched string str is : "+ str);
		int k = s.getStringDigitSum("abc123ef34gh");
		System.out.println("sum of digits is: "+k);
		
	}

}

