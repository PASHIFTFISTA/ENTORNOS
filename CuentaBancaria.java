class TestCuentaBancaria
{
	public static void main(String args[])
	{

		double TipoIntereses;
		CuentaBancaria cuenta = new CuentaBancaria("1234521","Director Banco",TipoIntereses);
		System.out.println("Saldo = " + cuenta.getSaldo());
		cuenta.reintegro(50);
		cuenta.ingreso(100);
		System.out.println("Saldo: " + cuenta.getSaldo());
	}
}
