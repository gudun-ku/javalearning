//test usage of new version of Vehicle class
class AddMeth {

	public static void main(String[] args) {

		Vehicle minivan = new Vehicle();
		Vehicle sportcar = new Vehicle();
		int range1, range2;

		//set the object minivan fields
		minivan.passengers = 7;
		minivan.fuelcap = 16;
		minivan.mpg = 21;

		sportcar.passengers = 2;
		sportcar.fuelcap = 14;
		sportcar.mpg = 12;

		System.out.print("Minivan can carry " + 
		minivan.passengers + ". ");

		minivan.range();

		System.out.print("Sportcar can carry " + 
		sportcar.passengers + ". ");

		sportcar.range();
	
 
	}

}