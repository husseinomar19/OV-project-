package ovproject;

public class Oplaadpunt
{

    public void addsaldo(Ovkaart ovkaart, double bedrag)
    {

	ovkaart.setSaldo(bedrag + ovkaart.getSaldo());

    }

    public void printslado(Ovkaart ovkaart) 
    {
	System.out.println(ovkaart.getSaldo());
    }

}
