package buffer;
import java.util.ArrayDeque;


import java.util.Queue;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.ArrayDeque;
import java.util.Queue;

import org.junit.jupiter.api.Assertions.*;


class Buffer<T> {
	
	private int capacidad;
	private Queue<T> elements;


	public Buffer(int capacidad) {
		capacidad = this.capacidad;
		if (capacidad <= 0) {
			throw new IllegalArgumentException("ERROR. Ese dato no es posible.");
		}
		elements=new ArrayDeque<T>();
	}
	
	public void put(T element) {
		if (element == null) {
			throw new NullPointerException("Error. The Buffer is null.");
		}
		if (elements.size() == capacidad) {
			throw new IllegalStateException("Error. The Buffer is full. You cant put anything else.");
		}
		elements.add(element);
	}

	public T get() {
		if(elements.size() == 0 ) {
			throw new IllegalStateException("Error. You cant get anything from a empty buffer");
		}
		
		return elements.remove();
	}

	public int size() {
		return elements.size();
	}

	public boolean isFull() {
		if (elements.size() == capacidad) {
			return true;
		}
		return false;
	}
	
	public boolean isEmpty() {
		if (elements.size()== 0) {
			return true;
		}
		return false;
	}
}


public class StepDefinitions {
	
	@Given("I have a <buffer>")
	
	@When("I want to add <elements>")
	
	@Then("The buffer would be <full>")

}
