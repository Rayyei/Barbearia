package sistemaBarbearia;

import java.text.DecimalFormat;
import java.text.NumberFormat;

import javax.swing.JOptionPane;

public class Barbearia {

	private String corte;
	private String barba;
	private String sobrancelha;
	private double custoTotal;
	
	public String getCorte() {
		return corte;
	}
	public void setCorte(String corte) {
		this.corte = corte;
	}
	public String getBarba() {
		return barba;
	}
	public void setBarba(String barba) {
		this.barba = barba;
	}
	public String getSobrancelha() {
		return sobrancelha;
	}
	public void setSobrancelha(String sobrancelha) {
		this.sobrancelha = sobrancelha;
	}
	public double getCustoTotal() {
		return custoTotal;
	}
	public void setCustoTotal(double custoTotal) {
		this.custoTotal = custoTotal;
	}
	
	public void inserirDados() {
		this.corte = JOptionPane.showInputDialog("Tipo de Corte");
		this.barba = JOptionPane.showInputDialog("Tipo de Barba");
		this.sobrancelha = JOptionPane.showInputDialog("Tipo de Sobrancelha");
		this.custoTotal = Double.parseDouble(JOptionPane.showInputDialog("Total à pagar"));
	}
	
	public void mostrar() {
		String mensagem = "Serviços e custo criado a partir da Classe Barbearia";
		mensagem += "\nTipo de Corte: " + this.getCorte();
		mensagem += "\nTipo de Barba: " + this.getBarba();
		mensagem += "\nTipo de Sobrancelha: " + this.getSobrancelha();
		
		NumberFormat formatar = DecimalFormat.getCurrencyInstance();
		
		mensagem += "\nTotal à pagar: " + formatar.format(this.getCustoTotal());
		
		JOptionPane.showMessageDialog(null, mensagem);
	}
	
	public double atualizarValor(double taxa) {
		this.custoTotal += this.custoTotal * taxa / 100;
		return this.custoTotal;
	}

}
