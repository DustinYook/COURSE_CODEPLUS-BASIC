//package practice;
//
//import java.util.ArrayList;
//import java.util.HashMap;
//import java.util.LinkedList;
//import java.util.Map;
//
//public class Main_06 
//{
//	public static void main(String[] args) 
//	{
//		Map<String, Integer> dict = new HashMap<String, Integer>();
//		ArrayList<String> keys = new ArrayList<String>();
//		ArrayList<Integer> values = new ArrayList<Integer>();
//		LinkedList<HashMap<String, Integer>> list = new LinkedList<HashMap<String, Integer>>() ;
//		
//		dict.put("yook", 100);
//		dict.put("lee", 99);
//		
//		System.out.println(dict);
//		
//		for(String key : dict.keySet())
//		{
//			keys.add(key);
//			values.add(dict.get(key));
//		}
//		System.out.println(keys);
//		System.out.println(values);
//		
//		list.add(dict);
//	}
//}