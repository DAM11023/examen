package examen;
/**
 * 
 * @author Julio José Martínez
 * @version 1.0
 *
 */
public class Fecha {
	/**
	 * Este método hace que al introducir una fecha, te devuelva true, si la fecha es una fecha correcta o te devuelva false, si la fecha no es correcta.
	 * 
	 * @param anio variable que representa a modo int el año de la fecha
	 * @param mes variable que representa a modo int el mes de la fecha
	 * @param dia variable que representa a modo int el dia de la fecha
	 * @return devuelve si la fecha es correcta en metodo booleano | fechaValida true/false; 
	 */
	public static boolean validarFecha(int anio, int mes, int dia) {
		boolean fechaValida = false;
		//si el dia Y mes Y año es mayor a 0, pasa al siguiente if, sino, devuelve false
		if ((dia > 0) && (mes > 0) && (anio > 0)) {
			//si el mes es menor o igual a 12 Y el dia es menor o igual a 31 entra en el siguiente if, sino, devuelve false
			if ((mes <= 12) && (dia <= 31)) {
				//si el mes es febrero, tiene que validar que tenga 28 dias, sino, devuelve false;
				if (mes == 2) {
					fechaValida = dia <= 28;
					// si el mes es par, tiene que tener menos o igual a 30 dias, sino, devuelve false
				} else if (mes % 2 == 0) {
					fechaValida = dia <= 30;
					//si no cumple con ninguno de los anteriores, tiene que tener menos o igual a 31 dias, sino, devuelve false
				} else {
					fechaValida = dia <= 31;
				}
			}
		}
		return fechaValida;
	}
}