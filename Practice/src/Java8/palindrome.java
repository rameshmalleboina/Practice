package Java8;

import java.util.function.Predicate;

public class palindrome {
	public static void main(String[] args) {
		
		String s="abhba";
		char[] ch=s.toCharArray();
		String rev="";
		for(int i=0;i<s.length();i++){
			rev=ch[i]+rev;
		}
		System.out.println(rev);
		Predicate<String> p=name->name.equals(s);
		System.out.println(p.test(rev));
		
		if(p.test(rev)) {
			System.out.println("palindrome");
		}else {
			System.out.println("not palindrome");
		}
		
	}

}
