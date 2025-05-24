import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class IptDay1 {

	public static void main(String[] args) {
		
//		String a[]= {"10","20","30","40","50"};
//		List<String> l=new ArrayList<>(Arrays.asList(a));
//		System.out.println(l);
//		Object[] array = l.toArray();
//		for(int i=0;i<array.length;i++) {
//			System.out.println(array[i]);
			int b[]=new int[2];
			b[0]=10;
			b[1]=20;
			
			List<Object> l1=new ArrayList<>();
			for(int c:b) {
				l1.add(c);
				System.out.println(l1);
			}
	}
	}

