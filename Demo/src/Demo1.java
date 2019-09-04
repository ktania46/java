import java.util.*;
import java.util.stream.Collectors;
public class Demo1 {

	public static void main(String[] args) {
		List<Seller> s = new ArrayList<Seller>();
		s.add(new Seller("1","A","20",new Buyer("1","40")));
		s.add(new Seller("1","A","40",new Buyer("1","60")));
		s.add(new Seller("2","B","10",new Buyer("1","10")));
		s.add(new Seller("3","C","60",new Buyer("1","50")));
		s.add(new Seller("5","E","90",new Buyer("1","50")));
		s.add(new Seller("5","E","30",new Buyer("1","30")));
		s.add(new Seller("5","E","70",new Buyer("1","50")));
	// highest sold product	
		int counter = 0;
		int max = 0;
		String p = null;
		for(int i=0;i<s.size();i++) {
			String x = s.get(i).getId();
			for(int j = i+1;j<s.size();j++) {
				if(s.get(j).getId().equals(x)) {
					counter++;
				}
				if(counter>max) {
					max = counter;
					p=x;
									}
			
			}
		}
		System.out.println("highest sold product:"+p);
		
		// most costly product
		Collections.sort(s, (a, b) -> {
			return b.getPrice().compareTo(a.getPrice());
					});
		Seller[] st = s.toArray(new Seller[0]);
		System.out.println("Most costly product"+st[0]);
		
		// profitability
		for(int i=0;i<s.size();i++) {
			String a = s.get(i).getPrice();
			String b = s.get(i).getBuyer().getCprice();
			 
			int x = Integer.parseInt(a);
			int y = Integer.parseInt(b);
			if(x==y) {
				System.out.println("when price is equal, it is loss for seller");
			}
			else if(x > y) {
				System.out.println("Loss");
			}
			else
				System.out.println("Profit");
		}
	}
	

}





