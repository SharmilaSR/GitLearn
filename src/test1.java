import java.util.ArrayList;


public class test1 {
	
	public void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> names = new ArrayList<String>();
		names.add("Anna");
		names.add("Don");
		names.add("Abigail");
		names.add("Adam");
		names.add("Sharmila");
		int count = 0;
		
		for(int i=0; i<names.size(); i++) {
			
			String actual = names.get(i);
			if(actual.startsWith("A")) {
				count++;
			}
			System.out.println(count);
			System.out.println(count+'2');
			System.out.println("postJira");
			System.out.println("postJira2");
		}
	}

}
