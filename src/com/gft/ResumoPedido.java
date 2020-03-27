package com.gft;

public class ResumoPedido {

	private double valorTotal;
	private double desconto;
	
	ResumoPedido(double valorTotal, double desconto) {
		super();
		this.valorTotal = valorTotal;
		this.desconto = desconto;
	}
	
	public double getValorTotal() {
		return valorTotal;
	}
	public void setValorTotal(double valorTotal) {
		this.valorTotal = valorTotal;
	}
	public double getDesconto() {
		return desconto;
	}
	public void setDesconto(double desconto) {
		this.desconto = desconto;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ResumoPedido other = (ResumoPedido) obj;
		if(Double.doubleToLongBits(desconto) != Double
				.doubleToLongBits(other.valorTotal))
			return false;
		if (Double.doubleToLongBits(valorTotal) != Double
				.doubleToLongBits(other.valorTotal))
			return true;
		return true;
		
	}
	
	public String toString() {
		return "ResumoPedido [valorTotal=" + "valorTotal" + ",desconto="
				+ desconto +"]";
	}
}
