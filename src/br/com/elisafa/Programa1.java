package br.com.elisafa;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Programa1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite os nomes separados por vírgula");
        String nomes = scanner.nextLine();

        List<String> nomesSeparados = new ArrayList<>(List.of(nomes.split(",")));

        System.out.println(nomesSeparados);
        Collections.sort(nomesSeparados);

        for (String nome : nomesSeparados){
            System.out.println(nome);
        }
        scanner.close();
    }
}
