void main(){
	Scanner scanner = new Scanner(System.in);
	String id = "33003642";

	double vanilla = Double.parseDouble(id.substring(2, 4));	// 00
	double chocolate = Double.parseDouble(id.substring(4, 6));	// 36
	double strawberry = Double.parseDouble(id.substring(6, 8));	// 42
	double price = 0;

	System.out.println("Would you like (v)anilla, (c)hocolate or (s)trawberry?");
	String input = scanner.next();

	if (input.equals("v")) {
		price = vanilla;
	} else if (input.equals("c")) {
		price = chocolate;
	} else if (input.equals("s")) {
		price = strawberry;
	} else {
		System.out.println("We don't have that flavour.");
		return;
	}

	System.out.println("How many scoops would you like?");
	int scoops = scanner.nextInt();

	if (scoops < 1) {
		System.out.println("We don't sell just a cone.");
	} else if (scoops > 3) {
		System.out.println("That's too many scoops to fit in a cone.");
	} else {
		price = (price / 100 * scoops) + 1;	// 1 is for the price of the cone
		System.out.printf("That will be %.2f please.%n", price);
	}	
}
main()