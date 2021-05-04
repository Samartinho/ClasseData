
public class Aplicacao {
	public static void main(String[] args) throws ExcecaoDataInvalida {
		try
		{
			Data datinha = new Data(2,13,2001);
			System.out.println(datinha.getDia());
		}
		catch(ExcecaoDataInvalida e)
		{
			e.printStackTrace();
		}
	}
}
