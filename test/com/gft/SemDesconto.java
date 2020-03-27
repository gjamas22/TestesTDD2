package com.gft;

public class SemDesconto extends CalculadoraFaixaDesconto {

	public CalculadoraFaixaDesconto proximo;
	
	public SemDesconto(CalculadoraFaixaDesconto proximo) {
		super(proximo);
		
	}

	public double desconto(double valorTotal) {
		double desconto = calcular(valorTotal);
		
		if(desconto == -1)
			proximo.desconto(valorTotal);
		
		
		return desconto;
	}
	public double calcular(double valorTotal) {
		return valorTotal;
		
	}
}
