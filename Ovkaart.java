package ovproject;

public class Ovkaart
{
    private double saldo;
    private int kaartnummer;
    private boolean inuitcheck;
    private boolean kost;

    public Ovkaart()
    {
	this.kaartnummer = 0;
	this.saldo = 0;
    }

    public double getSaldo()
    {
	return saldo;
    }
    public void kosten(int kosten)
    {
	saldo = saldo - kosten ;
    }
    public boolean getkost()
    {
	return kost;
    }
    public void setKost(boolean checkkosten )
    {
	this.kost= checkkosten; 
    }
    

    public void setSaldo(double kaartslado)
    {
	this.saldo = kaartslado;
    }

    public int getKaartnummer()
    {
	return kaartnummer;
    }

    public void info()
    {
	System.out.println("1 voor opladen");
	System.out.println("2 voor in_uitchecken");
	System.out.println("3 voor exit");
    }
    public void kostencheck()
    {
	if(saldo < 10 )
	{
	    kost = false;
	}
	else
	{
	    kost = true;
	}
	
    }

    public void exit()

    {
	System.out.println("tot ziens");
    }

    public boolean getIncheck()
    {
	return inuitcheck;
    }

    public void setIncheck(boolean inuitcheck)
    {
	this.inuitcheck = inuitcheck;
    }

}
