package com.art.pattern.runner;

import com.art.pattern.design.builder.CocaCola;

public class builderExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CocaCola cola = new CocaCola.CocaColaBuilder().GramsOfSugar(5).GramsOfSalt(10)
						.GramsOfCaramel(4).ContainsArtificailColor(true).createCocaCola();
		System.out.println(cola);
	}

}
