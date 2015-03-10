
/*
 simple class Vehicle
*/

class Vehicle {
	int passengers; // количество пассажиров
	int fuelcap;	// емкость топливного бака
	int mpg;		// расход топлива - сколько миль проедет на галлоне 

	//отобразить дальность действия транспортного средства
	void range() {
		System.out.println("Range is " + fuelcap * mpg);
	}
}
