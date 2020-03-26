package com.gft;

public abstract class SemDesconto extends CalculadoraFaixaDesconto {

	private CalculadoraFaixaDesconto proximo;
	
	public SemDesconto(CalculadoraFaixaDesconto proximo) {
		super(proximo);
		
	}

	public double desconto(double valorTotal) {
		double desconto = calcular(valorTotal);
		
		if(desconto == -1)
			proximo.desconto(valorTotal);
		
		
		return desconto;
	}
	protected abstract double calcular(double valorTotal);
}
