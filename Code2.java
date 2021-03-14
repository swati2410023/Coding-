import java.util.*;
public class Code2 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Your budget : ");
		float budget=sc.nextFloat();
		int choice,price;
		float quantity;
		String name;
		List<String> products = new ArrayList<String>();
		List<Float> quantities = new ArrayList<Float>();
		List<Integer> prices = new ArrayList<Integer>();
		
		while(true){
			System.out.println("1.Add an item\n2.Exit");
			System.out.print("Enter your choice : ");
			choice=sc.nextInt();
			
			
			if(choice==1) {
				System.out.print("Enter Product : ");
				sc.nextLine();
				name=sc.nextLine();
				if(products.contains(name)) {
					
					int index=products.indexOf(name);
					
					System.out.print("Enter quantity : ");//only numbers
					quantity=sc.nextFloat();
					System.out.print("kg");
					quantities.set(index,quantities.get(index)+quantity);
					
					System.out.print("Enter Price : ");
					price=sc.nextInt();
					prices.set(index,prices.get(index)+price);
					
					if(budget<=0) {
						System.out.println("No more items could be bought");
						break;
					}
					else if(budget<price) {
						System.out.println("over price");
					}
					else {
						budget=budget-price;
						System.out.println("Amount left : "+budget);
						
					}
		    	}
				
			  else {
				 
				products.add(name);
				System.out.print("Enter quantity : ");
				quantity=sc.nextFloat();
				quantities.add(quantity);
				
				System.out.print("Enter Price : ");
				price=sc.nextInt();
				prices.add(price);
				
				if(budget<=0) {
					System.out.println("No more items could be bought");
					break;
				}
				else if(budget<price) {
					System.out.println("over price");
				}
				else {
					budget=budget-price;
					System.out.println("Amount left : "+budget);
				}
			 }
		}
		else
		{
			break;
		}
		}
		  System.out.println("GROCERY LIST is:");
		  System.out.println("Product name  Quantity  Price");
		  for(int i=0;i<products.size();i++) {
			System.out.print(products.get(i)+"   ");
			System.out.print(quantities.get(i)+"   ");
			System.out.print(prices.get(i));
			System.out.print("\n");
			
			
			
		
	      }
		  
		}
	  }
   




