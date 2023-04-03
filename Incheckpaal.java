package ovproject;

public class Incheckpaal
{
//    public void incheckpaal(Ovkaart ovkaart)
//    {
//	ovkaart.setIncheck(true);
//    }
    public void paalcheck(Ovkaart ovkaart)
    {
	 ovkaart.kostencheck();
	if(ovkaart.getkost())
	{
	    if (ovkaart.getIncheck())
		{
		    ovkaart.setIncheck(false);
		    System.out.println("Je hebt uitgecheckt");
//		    System.out.println("20km kost 10$");
//		    System.out.println("jouw saldo is:" + ovkaart.getSaldo());
//		    ovkaart.setSaldo(10);
		    ovkaart.kosten(6);

		    System.out.println("Jouw nieuw slado is:" + ovkaart.getSaldo());
		} else
		{
		    // saldo? incheckkosten

		    ovkaart.setIncheck(true);
		    System.out.println("je hebt ingecheckt");

		}
	}
	else
	{
	    System.out.println("jouw saldo is niet genoeg");
	}
	
    }

}
