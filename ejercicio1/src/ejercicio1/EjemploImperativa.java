package ejercicio1;

import java.util.Iterator;
import java.util.List;

public class EjemploImperativa {
	
	public static void main(String[] args) {

		List<Integer> numbers = List.of(18,6,4,15,78,12,9,8);
		
		int count = 0;
		for(int number: numbers) {
			if(number > 10) count++;			
		
		}

		System.out.println(count);

	}

}
