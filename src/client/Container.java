package client;


//definiramo container kao Generic tako da u njemu moze biti bilo koji parametar
//umjesto npr String item1 i String item2 upisemo i1 item1 i i2 item2 da uopcimo

//ovo je opcenita verzija cija pravila ce se odnositi na bilo koji oblik klase kreiran u main metodi
//stedimo vrijeme za bilo koju sljedecu vrstu koju kreiramo (<Integer, String>, ili <Double, Integer>)

public class Container<i1, i2> {
	
	i1 item1;
	i2 item2;
	
	//...tako da i constructor bude uopcen sa i1 i i2, kao i getters i setters
	
	public Container(i1 item1, i2 item2) {
		super();
		this.item1 = item1;
		this.item2 = item2;
	}
	
	public void printItems() {
		System.out.println("Printing contents of container: ");
		System.out.println("Item 1: " + item1);
		System.out.println("Item 2: " + item2);
		
	}

	public i1 getItem1() {
		return item1;
	}

	public void setItem1(i1 item1) {
		this.item1 = item1;
	}

	public i2 getItem2() {
		return item2;
	}

	public void setItem2(i2 item2) {
		this.item2 = item2;
	}
	

}
