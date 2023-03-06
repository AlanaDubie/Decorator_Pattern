public class StarbuzzCoffee {
 
	public static void main(String args[]) {
		Beverage beverage = new Espresso();
		System.out.println(beverage.getDescription() 
				+ " $" + beverage.cost());
 
		Beverage beverage2 = new DarkRoast();
		beverage2 = new Mocha(beverage2);
		beverage2 = new Mocha(beverage2);
		beverage2 = new Whip(beverage2);
		System.out.println(beverage2.getDescription() 
				+ " $" + beverage2.cost());
 
		Beverage beverage3 = new HouseBlend();
		beverage3 = new Soy(beverage3);
		beverage3 = new Mocha(beverage3);
		beverage3 = new Whip(beverage3);
		System.out.println(beverage3.getDescription() 
				+ " $" + beverage3.cost());

		//created a new beverage for a Pumpkin Spice Latte
		Beverage beverage4 = new Espresso();
		beverage4 = new Milk(beverage4); 				//added milk
		beverage4 = new PumpkinSpice(beverage4);		//added pumpkin spice
		beverage4 = new Whip(beverage4);				//added whip
		System.out.println(beverage4.getDescription()	//prints order + condiments
				+ " $" + beverage4.cost());

	}
}
