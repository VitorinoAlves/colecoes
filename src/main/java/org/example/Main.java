package org.example;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String listaDeNomesString;
        List<String> nomesMasculinos = new ArrayList<>();
        List<String> nomesFemininos = new ArrayList<>();

        System.out.print("Informe a lista de nomes e seus gêneros (Ex: Nome1 - M, Nome2 - F): ");
        listaDeNomesString = scanner.nextLine();

        String[] listaDeNomes = listaDeNomesString.split(",");

        for(String nome: listaDeNomes){
            String[] nomeGenero = nome.split("-");

            if (nomeGenero[1].trim().equalsIgnoreCase("F")){
                nomesFemininos.add(nomeGenero[0].trim());
            } else if (nomeGenero[1].trim().equalsIgnoreCase("M")){
                nomesMasculinos.add(nomeGenero[0].trim());
            } else {
                System.out.println("Não foi possível identificar o sexo informado.");
            }
        }

        Collections.sort(nomesFemininos);
        Collections.sort(nomesMasculinos);

        System.out.println("Nomes Masculinos: " + nomesMasculinos);
        System.out.println("Nomes Femininos: " + nomesFemininos);
    }
}