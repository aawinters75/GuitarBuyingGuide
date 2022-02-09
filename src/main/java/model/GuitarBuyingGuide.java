/**
 * ajwinters@dmacc.edu - ajwinters
 * CIS175 - Spring 2022
 * Feb 9, 2022
 */
package model;


public class GuitarBuyingGuide {
	
	private int budget;
	private String guitarSelection;
	
	
	/**
	 * @return the budget
	 */
	public int getBudget() {
		return budget;
	}
	/**
	 * @param budget the budget to set
	 */
	public void setBudget(int budget) {
		this.budget = budget;
	}
	/**
	 * @return the guitarSelection
	 */
	public String getGuitarSelection() {
		return guitarSelection;
	}
	/**
	 * @param guitarSelection the guitarSelection to set
	 */
	public void setGuitarSelection(String guitarSelection) {
		this.guitarSelection = guitarSelection;
	}
	
	// No-Args - AW
	public GuitarBuyingGuide() {
		super();
	}
	/**
	 * @param budget
	 * @param guitarSelection
	 */
	public GuitarBuyingGuide(int budget) {
		super();
		this.budget = budget;
		String guitarSelection = "Squier, Epiphone, and First Act";
		if(budget > 500 && budget <= 999) {
			guitarSelection = "Gretsch, Fender, and Epiphone";
		}
		if(budget >= 1000) {
			guitarSelection = "Gibson, Fender, and Martin";
		}
		this.guitarSelection = guitarSelection;
	}
	@Override
	public String toString() {
		return "GuitarBuyingGuide [budget=" + budget + ", guitarSelection=" + guitarSelection + "]";
	}
	
	

}
