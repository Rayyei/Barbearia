package sistemaBarbearia;

public class Manicure extends Barbearia {
	
	private String cortarUnha;
	private String pintarUnha;
	
	public String getPintarUnha() {
		return pintarUnha;
	}
	public void setPintarUnha(String pintarUnha) {
		this.pintarUnha = pintarUnha;
	}
	public String getCortarUnha() {
		return cortarUnha;
	}
	public void setCortarUnha(String cortarUnha) {
		this.cortarUnha = cortarUnha;
	}
}