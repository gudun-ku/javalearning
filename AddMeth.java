//test usage of new version of Vehicle class
class AddMeth {

	public static void main(String[] args) {

		Vehicle minivan = new Vehicle();
		Vehicle sportcar = new Vehicle();
		int range1, range2;

		//установим поля объекта minivan	
		minivan.passengers = 7;
		minivan.fuelcap = 16;
		minivan.mpg = 21;

		//установим поля объекта sportcar
		sportcar.passengers = 2;
		sportcar.fuelcap = 14;
		sportcar.mpg = 12;

		//используем методы объектов для печати
		System.out.print("Minivan can carry " + 
		minivan.passengers + ". ");

		minivan.range();

		System.out.print("Sportcar can carry " + 
		sportcar.passengers + ". ");

		sportcar.range();
	
 
	}

}