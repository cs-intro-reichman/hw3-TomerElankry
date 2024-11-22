/** Functions for checking if a given string is an anagram. */
public class Anagram {
	public static void main(String args[]) {
		// Tests the isAnagram function.
		/*System.out.println(isAnagram("silent","listen"));  // true
		System.out.println(isAnagram("William Shakespeare","I am a weakish speller")); // true
		System.out.println(isAnagram("Madam Curie","Radium came")); // true
		System.out.println(isAnagram("Tom Marvolo Riddle","I am Lords Voldemort")); // true

		// Tests the preProcess function.
		System.out.println(preProcess("What? No way!!!"));
		System.out.println(preProcess("William Shakespeare"));
		System.out.println(preProcess("I am a weakish speller"));*/
		
		 //Tests the randomAnagram function.
		System.out.println("silentre and " + randomAnagram("silentre") + " are anagrams.");
		
		//Performs a stress test of randomAnagram 
		//String str = "1234567";
	    //Boolean pass = true;
		 //10 can be changed to much larger values, like 1000
		//for (int i = 0; i < 10; i++) {
		//String randomAnagram = randomAnagram(str);
		//	System.out.println(randomAnagram);
		//	pass = pass && isAnagram(str, randomAnagram);
		//	if (!pass) break;
		

		//String sr = "12345";
		
	}  

	// Returns true if the two given strings are anagrams, false otherwise.
	public static boolean isAnagram(String str1, String str2)
	{
		String s1 = preProcess(str1);
		String s2 = preProcess(str2);
		int counter1=0;
		int counter2=0;
		for(int i=0;i<s1.length();i++)
		{
			if(s1.charAt(i)!=32)
			{
				for(int j=0;j<s1.length();j++)
			        {
				        if(s1.charAt(j)==s1.charAt(i)) counter1++;
			        }

			    for(int s = 0; s<s2.length();s++)
			        {
				        if(s2.charAt(s)==s1.charAt(i)) counter2++;
			        }

			    if(counter1!=counter2) return false;
			}
			
		}
		return true;
	}
	   
	// Returns a preprocessed version of the given string: all the letter characters are converted
	// to lower-case, and all the other characters are deleted, except for spaces, which are left
	// as is. For example, the string "What? No way!" becomes "whatnoway"
	public static String preProcess(String str) {
		// Replace the following statement with your code
		String rep="";
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)>=65 && str.charAt(i)<=90) rep+=(char)(str.charAt(i)+32);
			if(str.charAt(i)>=97 && str.charAt(i)<=122) rep+=str.charAt(i);
			if(str.charAt(i)==32)rep+=str.charAt(i);
			
		}
		return rep;
	} 
	   
	// Returns a random anagram of the given string. The random anagram consists of the same
	// characters as the given string, re-arranged in a random order. 
	public static String randomAnagram(String str) {
		String indxOfRandom= "";
		String newIndx="";
		int svr=0;
		String newS="";

		for(int i=0;i<str.length();i++)
		{
			indxOfRandom+=i;
			
		}
		while (newIndx.length()<indxOfRandom.length())
		{
			svr = (int)(Math.random() * indxOfRandom.length());
			String c = "" + svr;
			for(int j = 0;j<indxOfRandom.length();j++)
			{
				if(-1==newIndx.indexOf(c)) newIndx+=c;
			}	
		}

		for(int s= 0 ;s<newIndx.length();s++) 
		{
			int m = newIndx.charAt(s) - '0';
			newS+=str.charAt(m);
		}
		return newS;
	}

	
	
}
