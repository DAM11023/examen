package examen;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class FechaTest {
	@Test
	void test1() {
		boolean a = Fecha.validarFecha(2023, 2, -1);
		boolean b = false;
		assertEquals(a,b);
	}
	@Test
	void test2() {
		boolean a = Fecha.validarFecha(2023, 2, 1);
		boolean b = true;
		assertEquals(a,b);
	}
	@Test
	void test3() {
		boolean a = Fecha.validarFecha(2023, 4, 1);
		boolean b = true;
		assertEquals(a,b);
	}
	@Test
	void test4() {
		boolean a = Fecha.validarFecha(2023, 5, 1);
		boolean b = true;
		assertEquals(a,b);
	}

}
