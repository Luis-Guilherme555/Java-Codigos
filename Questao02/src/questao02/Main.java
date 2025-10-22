package questao02;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<ItemBiblioteca> itens = new ArrayList<>();
        
        Livro L1 = new Livro("Banco de Dados", "L220", "Luis");
        Livro L2 = new Livro("Engenharia de Software", "L221", "Guilherme");
        
        Revista R1 = new Revista("Batman Volume 1", "B001", 1);
        Revista R2 = new Revista("Batman Volume 7", "B007", 7);
        
        itens.add(L1);
        itens.add(L2);
        itens.add(R1);
        itens.add(R2);
        
        for(ItemBiblioteca item : itens){
         item.emprestar();
        }
        
        int[] diasAtraso={3, 5, 2, 5};
        double totalMultas=0;
        
        for(int i = 0; i < itens.size(); i++){
            double multa = itens.get(i).calcularMultaAtraso(diasAtraso[i]);
            totalMultas+= multa;
            itens.get(i).devolver();
            System.out.println(itens.get(i).getTitulo()+ ": multa R$ " +multa);
        }
        
        System.out.println("Total de multas arrecadadas: R$ " +totalMultas);
    }
}
