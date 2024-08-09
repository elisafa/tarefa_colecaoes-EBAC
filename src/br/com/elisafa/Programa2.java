package br.com.elisafa;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Programa2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite os nomes com o devido sexo por (-) e cada grupo separado por vírgula");
        String nomes = scanner.nextLine();

        List<String> nomesSeparadosPorVirgula = new ArrayList<>(List.of(nomes.split(",")));

        List<String> masculinos = new ArrayList<>();
        List<String> femininos = new ArrayList<>();

        System.out.println("Nomes separados por vírgula: " + nomesSeparadosPorVirgula);

        for (String nome : nomesSeparadosPorVirgula){
            nome = nome.trim();
            if(nome.endsWith("-m")){
                masculinos.add(nome.substring(0, nome.length() -2).trim());
            }else if (nome.endsWith("-f")){
                femininos.add(nome.substring(0, nome.length() -2).trim());
            }
        }

        System.out.println("Nomes masculinos: " + masculinos);
        System.out.println("Nomes femininos: " + femininos);

        scanner.close();
    }
}
