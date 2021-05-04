import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class test {

	@Test
	void DiaInvalido() throws ExcecaoDataInvalida {
		Data datinha = new Data(1,2,2000);
		Exception exception = assertThrows(ExcecaoDataInvalida.class, () -> {datinha.setDia(0);});
	}

	@Test
	void MesInvalido() throws ExcecaoDataInvalida {
		Data datinha = new Data(1,2,2000);
		Exception exception = assertThrows(ExcecaoDataInvalida.class, () -> {datinha.setMes(0);});
	}
	
	@Test
	void AnoInvalido() throws ExcecaoDataInvalida {
		Data datinha = new Data(1,2,2000);
		Exception exception = assertThrows(ExcecaoDataInvalida.class, () -> {datinha.setAno(0);});
	}
	
	@Test
	void DiaInvalidoConstrutor() throws ExcecaoDataInvalida {
		Exception exception = assertThrows(ExcecaoDataInvalida.class, () -> {Data datinha = new Data(0,2,2000);});
	}
	
	@Test
	void MesInvalidoConstrutor() throws ExcecaoDataInvalida {
		Exception exception = assertThrows(ExcecaoDataInvalida.class, () -> {Data datinha = new Data(1,0,2000);});
	}
	
	@Test
	void AnoInvalidoConstrutor() throws ExcecaoDataInvalida {
		Exception exception = assertThrows(ExcecaoDataInvalida.class, () -> {Data datinha = new Data(3,2,0);});
	}
	
}
