package ovproject;

import java.util.Scanner;

public class OVmain
{

    public static void main(String[] args)
    {
	int option = 0;
	Ovkaart test = new Ovkaart();
	Oplaadpunt test1 = new Oplaadpunt();
	Incheckpaal test2 = new Incheckpaal();
	Scanner input = new Scanner(System.in);

	// method info print info over option
	test.info();

	while (option != 3)
	{
	    option = input.nextInt();
	    switch (option)
	    {
	    case 1:
		System.out.println("Voeg een bedrag toe");
		double bedrag = input.nextDouble();
		test1.addsaldo(test, bedrag);
		System.out.println("U saldo is:");
		test1.printslado(test);
		break;
	    case 2:
		test2.paalcheck(test);
		break;

	    }
	}

	// method exit
	test.exit();
	input.close();

    }

}
