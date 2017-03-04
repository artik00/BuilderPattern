package com.art.pattern.design.builder;

public class CocaCola extends Beverage {

	

	public int gramsOfSugar;
	public int gramsOfSalt;
	public int gramsOfCaramel;
	public boolean containsArtificialColor;
	
	public CocaCola(int sugar,int salt,int caramel,boolean containsColor){
		super("Coca Cola");
		this.gramsOfSugar = sugar;
		this.gramsOfSalt = salt;
		this.gramsOfCaramel = caramel;
		this.containsArtificialColor = containsColor;
	}
	
	public static class CocaColaBuilder {
		int nestedGramsOfSugar;
		int nestedGramsOfSalt;
		int nestedGramsOfCaramel;
		boolean nestedContainsArtificialColor;
		
		public CocaColaBuilder GramsOfSugar(int grams){
			nestedGramsOfSugar = grams;
			return this;
		}
		
		public CocaColaBuilder GramsOfSalt(int grams){
			nestedGramsOfSalt = grams;
			return this;
		}
		
		public CocaColaBuilder GramsOfCaramel(int grams){
			nestedGramsOfCaramel = grams;
			return this;
		}
		
		public CocaColaBuilder ContainsArtificailColor(boolean contains){
			nestedContainsArtificialColor = contains;
			return this;
		}
		
		public CocaCola createCocaCola(){
			return new CocaCola(nestedGramsOfSugar,nestedGramsOfSalt,
					nestedGramsOfCaramel,nestedContainsArtificialColor);
					
		}
	}
	@Override
	public String toString(){
		return "Beverage name : " + this.getName() + "\nGrams of Sugar : " + this.getGramsOfSugar() +
				"\nGrams of Salt : " + this.getGramsOfSalt() + "\nGrams of Caramel : " + this.getGramsOfCaramel() +
				"\nContains Artificial Coloring : " + this.isContainsArtificialColor();
	}

	
	public int getGramsOfSugar() {
		return gramsOfSugar;
	}
	public void setGramsOfSugar(int gramsOfSugar) {
		this.gramsOfSugar = gramsOfSugar;
	}
	public int getGramsOfSalt() {
		return gramsOfSalt;
	}
	public void setGramsOfSalt(int gramsOfSalt) {
		this.gramsOfSalt = gramsOfSalt;
	}
	public int getGramsOfCaramel() {
		return gramsOfCaramel;
	}
	public void setGramsOfCaramel(int gramsOfCaramel) {
		this.gramsOfCaramel = gramsOfCaramel;
	}
	public boolean isContainsArtificialColor() {
		return containsArtificialColor;
	}
	public void setContainsArtificialColor(boolean containsArtificialColor) {
		this.containsArtificialColor = containsArtificialColor;
	}
}
