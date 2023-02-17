public class java_first {

	public static void main(String[] args) {
		HashMap<String,String>statesCapitals = new HashMap<>();
		statesCapitals.put("Russia", "Moscow");
		statesCapitals.put("France", "Paris");
		statesCapitals.put("Italia", "Rim");
		
		System.out.println(statesCapitals.containsKey("Italia"));
		System.out.println(statesCapitals.containsKey("Germany"));
		
		System.out.println(statesCapitals.containsValue("Paris"));
		System.out.println(statesCapitals.values());
	}	
}
