/*
 uses our class vehicle to create vehicle objects
*/

class VehicleDemo {

	public static void main (String[] args) {
	
		Vehicle minivan = new Vehicle();
		int range;

		//��������� �������� ����� � ������� minivan,
		//�������� �������� �� ���������� ���������-�����
		//��� ������� � ���������� ���������� ������� 
		//�������

		minivan.passengers = 7;
		minivan.fuelcap = 	16;
		minivan.mpg 	=	21;

		//���������� ����. ��������� ������� ������ �� 
		//����, ��� ��������� ��� ��������

		range = minivan.fuelcap * minivan.mpg;
		System.console().printf("\n");
		System.console().printf(" Minivan can carry %5d passengers with a range of %5d miles\n",
																minivan.passengers,range);
		
	}

}