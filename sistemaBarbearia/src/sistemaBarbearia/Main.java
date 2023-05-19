package sistemaBarbearia;

public class Main {

	public static void main(String[] args) {
		
		Agendamento agendamento1 = new Agendamento();
		agendamento1.setNomeCliente("Luiz");
		agendamento1.setDiaDaSemana("Quarta");
		agendamento1.setHorario("10:30");
		System.out.println("Nome do Cliente: " + agendamento1.getNomeCliente());
		System.out.println("Dia da Semana: " + agendamento1.getDiaDaSemana());
		System.out.println("Horario: " + agendamento1.getHorario());
		System.out.println("---------------------------------------------");
		
		Barbearia barbearia1 = new Barbearia();
		barbearia1.inserirDados();
		barbearia1.atualizarValor(10);
		barbearia1.mostrar();
		
		CorteFeminino corteFem1 = new CorteFeminino();
		corteFem1.setTipoCorteFeminino("Franja");
		corteFem1.setTintaCabelo("Preto");
		corteFem1.setCustoTotal(25);
		int taxa = 10;
		corteFem1.atualizarValor(taxa);
		System.out.println("Tipo de Corte Feminino: " + corteFem1.getTipoCorteFeminino());
		System.out.println("Cor da Tinta: " + corteFem1.getTintaCabelo());
		System.out.println("Valor Total: " + corteFem1.getCustoTotal());
		System.out.println("---------------------------------------------");
		
		Manicure manicure1 = new Manicure();
		manicure1.setCortarUnha("Quadrada");
		manicure1.setPintarUnha("Vermelho");
		System.out.println("Formato da Unha: " + manicure1.getCortarUnha());
		System.out.println("Cor do Esmalte: " + manicure1.getPintarUnha());
		System.out.println("---------------------------------------------");
		
		Depilacao depilacao1 = new Depilacao();
		depilacao1.setTiposDepilacao("Laser");
		depilacao1.setLocalDepilacao("Perna");
		depilacao1.setSecoesDepilacao(3);
		System.out.println("Tipo de Depilacao: " + depilacao1.getTiposDepilacao());
		System.out.println("Local da Depilacao: " + depilacao1.getLocalDepilacao());
		System.out.println("Quantidade de Secoes: " + depilacao1.getSecoesDepilacao());
	}
}
