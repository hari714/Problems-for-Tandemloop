package week2;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class MultipleNumberListed {
  public static Map<Integer, Integer> MultipleNumberList(List<Integer> numbers){
	  Map<Integer,Integer> count = new LinkedHashMap<>();
	  for(int i=1;i<=9;i++) {
		  count.put(i, 0);
	  }
	  for(int num:numbers) {
		  for(int i=1;i<=9;i++) {
			  if(num%i==0) {
				  count.put(i, count.get(i)+1);
			  }
		  }
	  }
	  return count;
  }
  public static void main(String[]args) {
	  List<Integer> input = Arrays.asList(1,2,8,9,12,46,76,82,15,20,30);
	  Map<Integer,Integer> result = MultipleNumberList(input);
	  
	  System.out.println(result);
	  
  }
}
