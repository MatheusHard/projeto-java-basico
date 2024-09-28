import pages.Carro;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

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

        ///Maps
        lista.stream()
                .map(carro -> {
                    return  "Id: "+carro.getId() + "\nCarro: "+carro.getDescricao();
                })  // Mapeia a lista de objetos para a lista de nomes (String)
                .forEach(System.out::println);

        System.out.println();

        ///Consumer
        List<Integer> numeros = Arrays.asList(12, 2, 3, 25, 10, 80, 90, 55);
        System.out.println("Numeros pares:");

        numeros.stream()
                .filter(n -> n % 2 == 0)
                .forEach(System.out::println);

        System.out.println();
        ///Suplier -> expressao lambda com saudacao personalizada

        List<String> listaaSaudacoes = Stream.generate(() -> "Olá, bunda mole")
                .limit(5)
                .toList();

        System.out.println("Supplier: ");
        listaaSaudacoes.forEach(System.out::println);
        System.out.println();

        ///Functions -> recebe um tipo, e retorna outra FUnction<Integer, Integer>

        List<Integer> numerosFunctions = Arrays.asList(1, 20, 50, 60, 80);
        List<Integer> numerosDobrados = numerosFunctions.stream().map(n -> n * 2).toList();
        System.out.println("Numeros Functions: ");

        numerosDobrados.forEach(System.out::println);
        System.out.println();

        ///PRedicate
        System.out.println("Predicates: ");
        List<String> linguagens = Arrays.asList("JAVA", "FLUTTER", "C#", "C++", "GO", "PHP");

        linguagens.stream()
                .filter(l -> l.length() < 3)
                .forEach(System.out::println);

        ///Binary Oparetor (Reduce)
        System.out.println();

        int resultadoSoma = numeros.stream().reduce(0, Integer::sum);
        System.out.println("Soma com reduce: " +resultadoSoma);


   }
}