
public class Triangulo implements FiguraGeometrica {

	private float ladoA;
	private float ladoB;
	private float ladoC;
	private String tipoTriangulo;

	public Triangulo(float ladoA, float ladoB, float ladoC) {
		this.ladoA = ladoA;
		this.ladoB = ladoB;
		this.ladoC = ladoC;
	}

	public String getTipoTriangulo() {
		return tipoTriangulo;
	}

	public void setTipoTriangulo(String tipoTriangulo) {
		this.tipoTriangulo = tipoTriangulo;
	}

	public float getLadoA() {
		return ladoA;
	}

	public void setLadoA(float ladoA) {
		this.ladoA = ladoA;
	}

	public float getLadoB() {
		return ladoB;
	}

	public void setLadoB(float ladoB) {
		this.ladoB = ladoB;
	}

	public float getLadoC() {
		return ladoC;
	}

	public void setLadoC(float ladoC) {
		this.ladoC = ladoC;
	}

	@Override
	public String getTipoFigura() {

		String resultado = "";

		if ((getLadoA() + getLadoB()) < getLadoC() || (getLadoA() + getLadoC()) < getLadoB()
				|| (getLadoB() + getLadoC()) < getLadoA()) {

			resultado = "INEXISTENTE";
			/* setTipoTriangulo("INEXISTENTE"); */

		} else if (ladoA == ladoB && ladoA == ladoC) {

			resultado = "Equilátero";
			/* setTipoTriangulo("Equilátero"); */

		} else if (ladoA == ladoB || ladoB == ladoC || ladoA == ladoC) {

			resultado = "Isósceles";
			/* setTipoTriangulo("Isósceles"); */

		} else {

			resultado = "Escaleno";
			/* setTipoTriangulo("Escaleno"); */

		}

		return resultado;
	}

	@Override
	public String toString() {
		return "Triangulo [ladoA=" + ladoA + ", ladoB=" + ladoB + ", ladoC=" + ladoC + "] \nTriângulo: "
				+ getTipoFigura();
	}

}
