package Java8;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Divition {
	public static void main(String[] args) {
		List<Integer> l=new ArrayList<>();
	l.add(30);
	l.add(20);
	l.add(15);
	for(Integer k:l) {
		Predicate<Integer> p=j->j%2==0;
		if (p.test(k)) {
			System.out.println(k);
		}
	}
	}
}
