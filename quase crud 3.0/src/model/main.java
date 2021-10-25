package model;

import view.BairroView;
import view.CursoView;
import view.UsuarioView;
import view.CorridaView;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        //Objetos
        UsuarioView vuser = new UsuarioView();
        BairroView vbairro = new BairroView();
        CorridaView vCorrida = new CorridaView();
        CursoView vCurso = new CursoView();

        //Inicialização
        vbairro.carregarDados();
        vuser.carregarDados();
        vCorrida.carregarDados();
        vCurso.carregarDados();

        while(true) {
            Scanner scan = new Scanner(System.in);
            System.out.println("==============================================");
            System.out.println("          [Escolha uma opção] \n");
            System.out.println("     [1]- Realizar Login ");
            System.out.println("     [2]- Cadastrar novo Usuario\n");
            System.out.println("==============================================");
            System.out.print(" Opção: ");
            int escolha = Integer.parseInt(scan.nextLine());
            switch (escolha) {
                case 1:
                    vuser.realizarlogin();
                    break;
                case 2:
                    vuser.cadastroUsuario();
                    break;
            }
        }
    }
}