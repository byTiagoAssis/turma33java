package exemplos;

public class Terceiro extends Funcionario{
	
	private double  adicional;
		
	public Terceiro(String matricula, String nome, double adicional) {
		super(matricula, nome);
		this.adicional = adicional;
	}
	
	

	public double getAdicional() {
		return adicional;
	}



	public void setAdicional(double adicional) {
		this.adicional = adicional;
	}


	public double salario() {
					
		return (super.getHorasTrabalhadas()*super.getValorHora()) + adicional;
	}  	

	
}
