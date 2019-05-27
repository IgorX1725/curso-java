package entities;

public class PessoaJuridica extends Pessoa {
	
	private int quantidadeDeFuncionarios;
	
	public PessoaJuridica() {
		super();
	}

	public PessoaJuridica(String nome, Double rendaAnual, int quantidadeDeFuncionarios) {
		super(nome, rendaAnual);
		this.quantidadeDeFuncionarios = quantidadeDeFuncionarios;
	}
	
	public int getQuantidadeDeFuncionarios() {
		return quantidadeDeFuncionarios;
	}

	public void setQuantidadeDeFuncionarios(int quantidadeDeFuncionarios) {
		this.quantidadeDeFuncionarios = quantidadeDeFuncionarios;
	}

	@Override
	public double calculaImposto() {
		if(quantidadeDeFuncionarios < 10) {
			return (getRendaAnual() * 0.16);
		}else {
			return (getRendaAnual() * 0.14);
		}
	}
	
	@Override
	public String toString() {
		return getNome()+": $ "+String.format("%.2f",calculaImposto());
	}
	
}
