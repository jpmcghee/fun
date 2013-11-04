import java.util.TreeMap;

public class TreeMappin{
	public static void main(String args[]){
		TreeMap<String,Integer> map = new TreeMap<String,Integer>();
		
		String str1 = new String("hi");
		String str2 = new String("hi");
		Integer i = new Integer(22);
	
		map.put(str1,i);
		System.out.println(map.get(str2));
	}
}
