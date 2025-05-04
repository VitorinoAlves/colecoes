package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nomeInformado, sexo, contExec="S";
        List<String> nomesMasculinos = new ArrayList<>();
        List<String> nomesFemininos = new ArrayList<>();

        while (contExec.equalsIgnoreCase("S")){
            System.out.print("Informe o nome: ");
            nomeInformado = scanner.nextLine();
            System.out.print("Informe o sexo (F/M): ");
            sexo = scanner.next();
            scanner.nextLine();

            if (sexo.equalsIgnoreCase("F")){
                nomesFemininos.add(nomeInformado);
            } else if (sexo.equalsIgnoreCase("M")){
                nomesMasculinos.add(nomeInformado);
            } else {
                System.out.println("Não foi possível identificar o sexo informado.");
            }

            System.out.print("Deseja informar um novo nome? (S/N)");
            contExec = scanner.next();
            scanner.nextLine();
            System.out.println();
        }

        System.out.println("Nomes masculinos: " + nomesMasculinos);
        System.out.println("Nomes Femininos: " + nomesFemininos);
    }
}