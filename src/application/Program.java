package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class Program {
 
	/* criar  um programa para saber o salario liquido de um funcionario 
	 * e depois faça um aumento de 10% no seu salario e mostre na tela 
	 * os resultados */
	 
	public static void main(String[] args) {
		
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Employee emplo = new Employee();
		
		System.out.println("entre com os dados do funcionario: ");
		System.out.println("Name:");
		emplo.name = sc.nextLine();
		System.out.println("Gross Salary: ");
		emplo.grossSalario = sc.nextDouble();
		System.out.println("Tax");
		emplo.tax = sc.nextDouble();
		
		System.out.println("");
		System.out.println(emplo.netSalary());
		
		System.out.println("");
		System.out.println("Enter the number of porcentage: ");
		double porcentage = sc.nextDouble();
		emplo.increaseSalario(porcentage);

		
		System.out.println("");
		System.out.println("updated data: " + emplo.toString());
	
		
		
	
		sc.close();
	}

}
