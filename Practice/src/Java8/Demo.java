package Java8;
import java.util.function.Predicate;

public class Demo {
public static void main(String[] args) {
	Predicate<Integer> p=i-> i>10;
	System.out.println(p.test(54));
	System.out.println(p.test(2));
}
}
