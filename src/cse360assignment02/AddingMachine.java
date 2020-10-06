package cse360assignment02;


public class AddingMachine {
  private int total;
  private String memory;
  
  public AddingMachine () {
    total = 0;  // not needed - included for clarity
    memory = "0 ";
  }
  
  public int getTotal () {
    return total;
  }
  
  public void add (int value) {
	  total += value;
	  memory += "+ " + value;
  }

  public void subtract (int value) {
	  total -= value;
	  memory += "- " + value;
  }

  public String toString () {
    return memory;
  }

  public void clear() {
	  total = 0;
	  memory = "0 ";
  }
}