public class Data {
	private int dia;
	private int mes;
	private int ano;
	public Data()
	{
		
	}
	public Data(int x, int y, int z) throws ExcecaoDataInvalida
	{
		if(x > 0 && x < 31) {
			this.dia = x;
		}
		else
		{
			throw new ExcecaoDataInvalida("Valor Dia Invalido");
		}
		
		if(y > 0 && y <= 12) {
			this.mes = y;
		}
		else
		{
			throw new ExcecaoDataInvalida("Valor Mes Invalido");
		}	
		
		if(z > 0) {
			this.ano = z;
		}
		else
		{
			throw new ExcecaoDataInvalida("Valor Ano Invalido");
		}		
	}
	public void setDia(int dia) throws ExcecaoDataInvalida{
		if(dia > 0 && dia < diasNoMes()) {
			this.dia = dia;
		}
		else
		{
			throw new ExcecaoDataInvalida("Valor Dia Invalido");
		}
	}
	public void setMes(int mes) throws ExcecaoDataInvalida{
		if(mes > 0 && mes <= 12) {
			this.mes = mes;
		}
		else
		{
			throw new ExcecaoDataInvalida("Valor Mes Invalido");
		}	
	}
	public void setAno(int ano) throws ExcecaoDataInvalida{
		if(ano > 0) {
			this.ano = ano;
		}
		else
		{
			throw new ExcecaoDataInvalida("Valor Ano Invalido");
		}		
	}
	public int getDia() {
		return dia;
	}
	public int getMes() {
		return mes;
	}
	public int getAno() {
		return ano;
	}
	public void adicionaDias(int x) {
		dia = dia + x;
		int m = diasNoMes();
		if(m < dia)
		{
			int G = dia - m;
			mes = mes + 1;
			dia = G;
		}
		if(mes == 13)
		{
			ano = ano + 1;
			mes = 1;
		}
	}
	public int diasNoMes()
	{
		if(mes == 1||mes == 3||mes == 5||mes == 7||mes == 8||mes == 10||mes == 12)
		{
			return 31;
		}
		else
		{
			if(mes == 4||mes == 6||mes == 9||mes == 11)
			{
				return 30;
			}
			else
			{
				if(eAnoBisexto() == false)
				{
					return 28;
				}
				else
				{
					return 29;
				}
			}
		}
	}
	public boolean eAnoBisexto()
	{
		if((ano % 400 == 0) || ((ano % 4 == 0) && (ano % 100 != 0)))
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	public void proximoDia()
	{
		dia = dia + 1;
		if(diasNoMes() < dia)
		{
			mes = mes + 1;
			dia = 1;
		}
		if(mes == 13)
		{
			ano = ano + 1;
			mes = 1;
		}
	}
	

}