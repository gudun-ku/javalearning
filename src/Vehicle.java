
/*
 simple class Vehicle
*/

class Vehicle {
	int passengers; // ���������� ����������
	int fuelcap;	// ������� ���������� ����
	int mpg;		// ������ ������� - ������� ���� ������� �� ������� 

	//���������� ��������� �������� ������������� ��������
	void range() {
		System.out.println("Range is " + fuelcap * mpg);
	}
}
