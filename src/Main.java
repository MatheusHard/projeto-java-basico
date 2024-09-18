import pages.Carro;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        String meuOvo = "MeuOvo";

        ArrayList<Carro> lista = new ArrayList<>();

        Carro c = new Carro();
        c.setId(2);
        c.setDescricao("Vowage");

        Carro c2 = new Carro();
        c2.setId(2);
        c2.setDescricao("Fusca");

        lista.add(c);
        lista.add(c2);

        lista.stream()
                .map(carro -> {
                    return  "Id: "+carro.getId() + "\nCarro: "+carro.getDescricao();
                })  // Mapeia a lista de objetos para a lista de nomes (String)
                .forEach(System.out::println);



        System.out.println();
    }

    void calcular (){

    }
}