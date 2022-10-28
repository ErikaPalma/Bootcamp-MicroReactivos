package ejercicio1;

import java.util.List;

public class EjemploFuncional {
	
	public static void main(String[] args) {

		List<Integer> numbers = List.of(18,6,4,15,78,12,9,8);

		long count = numbers.stream().filter(num -> num > 10).count();
		
		System.out.println(count);

	}

}