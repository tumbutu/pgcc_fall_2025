import java.util.Scanner;

public class CafeOrderSystem
{
	final static byte MAX_ORDER = 10;
	
	//coffee show menu
	
	enum MenuItem
	{
		COFFEE(3.5, true),
		TEA(2.0, true),
		SANDWICH(5.0, true),
		MUFFIN(2.5, true),
		SMOOTHIE(4.0, false);
		
		//field
		private final double price;
		private final boolean isHot;
		
		//constructor
		MenuItem(double price, boolean isHot)
		{
			this.price = price;
			this.isHot = isHot;
		}
		
		//getter methods
		public double getPrice()
		{
			//auth
			//verifi
			return price;
		}
		
		public boolean getHotItem()
		{
			return isHot;
		}
	}
	
	public static void main(String [] args)
	{
		//create the scanner object
		Scanner scanner = new Scanner(System.in);
		
		// Welcome message and menu
        System.out.println("--- Welcome to PGCC Café ---");
        System.out.printf("%-10s %s %s%n", "Menu:", "Price", "Temp");
        System.out.println("============================");
		
		
		for (MenuItem mItem : MenuItem.values())
		{
			String tempType = mItem.getHotItem() ? "Hot" : "Cold";
			System.out.printf("%-10s: $%.2f %s %n", mItem.name(), mItem.getPrice(), tempType);
		}
		
		//create an array for the order
		MenuItem [] order = new MenuItem[MAX_ORDER];
		
		short i = 0;
		
		while(i < MAX_ORDER)
		{
			System.out.print("Enter Menu item's name: ");
			String input = scanner.nextLine().toUpperCase();

			//skip input handling (Exception: to learn later)
			order[i] = MenuItem.valueOf(input);
			
			System.out.print("Add another order? Yes/No: ");
			input = scanner.nextLine();

            if (input.equalsIgnoreCase("no")) {
                break;
            }
		}
		
		//print the order summary
		
		//check out
		
	}


}