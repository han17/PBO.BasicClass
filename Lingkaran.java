public class Lingkaran
{
	int jari;
	int diameter;

	public void CetakKeLayar()
	{
		System.out.println("Jari-Jari Lingkaran: " + jari);
		System.out.println("diameter Lingkaran: " + diameter);

	}

	public  void ubahProperty(int ja, int di)
	{
		jari = ja;
		diameter = di;
	
	}

	public double hitungLuasLingkaran()
	{
		double luas;
		luas = 3.14 * jari * jari;
		return luas;
	}

	public double hitungKelilingLingkaran()
	{
		double keliling;
		keliling = 3.14 * diameter;
		return keliling;
	}
}
