package week1.day2.assignements;

public class CharOccurence {

	public static void main(String[] args) {
		String str = "Suresh Kumar R";
		int count=0;
		char[] charArray = str.toCharArray();
		for (int i = 0; i < charArray.length; i++) {
			if(charArray[i]=='r') {
			count++;
		}
		
	}
System.out.println(count);
}
}
