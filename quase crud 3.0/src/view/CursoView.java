package view;

import controller.CursoController;
import controller.IdCursoController;
import model.Curso;

import java.util.Scanner;

public class CursoView {

    IdCursoController id = new IdCursoController();
    CursoController x = new CursoController();

    public void cadastrarCurso() {
        Scanner scan = new Scanner(System.in);
        System.out.print("[nome do curso: ");
        String tmp1 = scan.nextLine();
        String tmp2 = id.determinarID();
        Curso aux = new Curso(tmp1,tmp2);
        x.cadastrar(aux);
    }
    public void visualizar() {
        x.visualizar();
    }
    public void carregarDados() {
        x.carregar();
    }

}