package entities;

/* criando classe com os atributos de um funcionario e alguns metodos 
 *  para salario liquido, aumento de salaario atravez de porcentagem
 *  e um toString para mostrar as alteraçoes feitas */
 
public class Employee {
	public String name;
	public double grossSalario;
	public double tax;
	
	public double netSalary(){
		return  this.grossSalario - this.tax;
		
	}
	public void increaseSalario(double porcentage) {
     this.grossSalario += this.grossSalario * porcentage /100;
			
	}
	public String toString() {
		return name + ", $ " + String.format("%.2f", netSalary());
	
	}
	
}
