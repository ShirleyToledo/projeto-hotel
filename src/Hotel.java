import java.util.ArrayList;

public class Hotel {

    ArrayList<Quarto> quartos = new ArrayList<>();

    public void adicionarQuarto(Quarto quarto) {quartos.add(quarto);}

    public void listarQuartos() {
        System.out.println("==========================");
        System.out.println("     Lista de Quartos     ");
        System.out.println("==========================");

        for (int i = 0; i < quartos.size(); i++) {
            System.out.println("Número: " + quartos.get(i).getNumero());
            System.out.println("Tipo: " + quartos.get(i).getTipo());

            if (quartos.get(i).getDisponibilidade()) {
                System.out.println("Disponibilidade: Vazio");
            } else {
                System.out.println("Disponibilidade: Ocupado");
            }
            System.out.println();
        }}


        public void reservarQuarto(int numeroQuarto){

            for (int i = 0; i < quartos.size(); i++) {
                if (quartos.get(i).getNumero() == numeroQuarto) {
                    if (quartos.get(i).getDisponibilidade()) {

                        quartos.get(i).setDisponibilidade(false);
                        System.out.println("Quarto reservado com sucesso!");
                    } else {

                        System.out.println("Quarto ocupado");
                    }

                    return;
                }
            }


        System.out.println("Quarto inexistente");
    }

        void cancelarReserva(int numeroQuarto){
            for (int i = 0; i<quartos.size(); i++) {
                if (quartos.get(i).getNumero() == numeroQuarto) {
                    if (quartos.get(i).getDisponibilidade()) {
                        System.out.println("Quarto não estava reservado");
                    } else  {
                        quartos.get(i).setDisponibilidade(true);
                        System.out.println("Quarto indisponível");
                    }
                    return;
                }
            }
            System.out.println("Quarto inexistente");
        }}






