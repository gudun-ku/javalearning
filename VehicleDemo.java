/*
 uses our class vehicle to create vehicle objects
*/

class VehicleDemo {

	public static void main (String[] args) {
	
		Vehicle minivan = new Vehicle();
		int range;

		//присвоить значени€ пол€м в объекте minivan,
		//ќбратите внимание на применение оператора-точки
		//дл€ доступа к переменным экземпл€ра данного 
		//объекта

		minivan.passengers = 7;
		minivan.fuelcap = 	16;
		minivan.mpg 	=	21;

		//рассчитать макс. дальность поездки исход€ из 
		//того, что топливный бак заполнен

		range = minivan.fuelcap * minivan.mpg;
		System.console().printf("\n");
		System.console().printf(" Minivan can carry %5d passengers with a range of %5d miles\n",
																minivan.passengers,range);
		
	}

}