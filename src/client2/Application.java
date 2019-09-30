package client2;

import java.util.ArrayList;
import java.util.List;

public class Application {

	public static void main(String[] args) {

		//Object je klasa svih klasa, a String je njena podklasa, tako da myObject moze postati myVar
		
		Object myObject = new Object();
		String myVar = "Hello";
		myObject = myVar;
		
		//ista stvar je kod Employee koji je otac od Accountant, tako da emp moze biti acc
		
		Employee emp = new Employee();
		Accountant acc = new Accountant();
		//emp = acc;
		
		SubAccountant sAcc = new SubAccountant();
		
		//ali kod ArrayLista tako ne moze jer su Employee i Accountant u ovom slucaju RAZLICITI TIPOVI ArrayListe
		
		ArrayList<Employee> employees = new ArrayList();
		employees.add(new Employee());
		
		ArrayList<Accountant> accountants = new ArrayList<>();
		accountants.add(new Accountant());
		
		ArrayList<SubAccountant> subaccountants = new ArrayList<>();
		subaccountants.add(new SubAccountant());
		
		//zato se koristimo upitnikom koji je JOKER u Javi, ostavlja tip ArrayListe nedefiranim
		
		ArrayList<?> employees2 = new ArrayList<>();
		
		// moze biti i String, nije vazno:
		// ArrayList<String> accountants2 = new ArrayList<>();
		
		ArrayList<Accountant> accountants2 = new ArrayList<>();
		employees2 = accountants2;
		
		//mozemo isto tako imati ArrayListu koja je ekstenzija, znaci da employees3 prihvaca podatke iz otac-klase Employee ali i ove koja je definirana Jokerom
		
		ArrayList<? extends Employee> employees3 = new ArrayList<>();
		ArrayList<SubAccountant> accountants3 = new ArrayList<>();
		employees3 = accountants3;
		
		//ovo znaci da samo podaci iz klase Employee ili njoj nadredene mogu u ArrayListu, ali podredene npr Accountant ne mogu
		
		ArrayList<? super Employee> employees4 = new ArrayList<>();
		ArrayList<Accountant> accountants4 = new ArrayList<>();
		
		//ovo ne moze jer je Accountant klasa ispod Employee: 
		//employees4 = accountants4;
		
		makeEmployeeWork(employees);
		System.out.println("--------------------------------");
		makeEmployeeWork(accountants);
		System.out.println("--------------------------------");
		makeEmployeeWork(subaccountants);
		

	}
	
	public static void makeEmployeeWork(List<? extends Employee> employees) {
		for(Employee emp : employees) {
			emp.work();
		}
	}
	
	

}
