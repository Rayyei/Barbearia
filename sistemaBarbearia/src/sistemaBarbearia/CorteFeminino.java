package sistemaBarbearia;

public class CorteFeminino extends Barbearia{
	
	private String tipoCorteFeminino;
	private String tintaCabelo;
	private Double precoCorteFeminino;
	
	public String getTipoCorteFeminino() {
		return tipoCorteFeminino;
	}
	public void setTipoCorteFeminino(String tipoCorteFeminino) {
		this.tipoCorteFeminino = tipoCorteFeminino;
	}
	public String getTintaCabelo() {
		return tintaCabelo;
	}
	public void setTintaCabelo(String tintaCabelo) {
		this.tintaCabelo = tintaCabelo;
	}
	public Double getPrecoCorteFeminino() {
		return precoCorteFeminino;
	}
	public void setPrecoCorteFeminino(Double precoCorteFeminino) {
		this.precoCorteFeminino = precoCorteFeminino;
	}
	
	@Override
	public double atualizarValor(double taxa) {
		
		return super.atualizarValor(2 * taxa);
	}
}
