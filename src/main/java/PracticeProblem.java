import java.util.*;

public class PracticeProblem {

	public static void main(String args[]) {

	}

	public static ArrayList<String> swap(ArrayList<String> list, int x, int y){
		//buffer value at y, set value at x to y, set x to temp y
		String temp = list.get(y);
		list.set(y, list.get(x));
		list.set(x, temp);
		return list;
	}

	public static ArrayList<Double> createArrayList(double[] arr){
		ArrayList<Double> out = new ArrayList<Double>();

		//iterate through array, add every value to blank arraylist and return
		for(int i = 0; i < arr.length; i++){
			out.add(arr[i]);
		}
		return out;
	}

	public static HashMap<String, Integer> combineParallelArrays(String[] strArr, int[] intArr){
		//Initiate new blank hashmap, iterate through parallel arrays and put value intArr[i] to key strArr[i]
		HashMap<String, Integer> out = new HashMap<String, Integer>();
		for(int i = 0; i < strArr.length; i++){
			out.put(strArr[i], intArr[i]);
		}

		return out;
	}

	public static HashMap<String, Integer> increaseAge(HashMap<String, Integer> inputMap, String name){
		//increment value at name by 1
		inputMap.replace(name, inputMap.get(name)+1);
		return inputMap;
	}
}
