
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

public class TesteCadastro {
	public static void main(String[] args) {
		Curso curso = new Curso("Dominando as coleções do Java", "Nivaldo");
		 
	    curso.adiciona(new Aula("Trabalhando com ArrayList", 21));
        curso.adiciona(new Aula("Criando uma Aula", 20));
        curso.adiciona(new Aula("Modelando com coleções", 22));
        
        Aluno a1 = new Aluno("Matheus", 55);
        Aluno a2 = new Aluno("Xavier" , 23);
        Aluno a3 = new Aluno("Silva" , 14);
        
        System.out.println(curso.getAulas());
        
        List<Aula> aulasImutaveis = curso.getAulas();
        List<Aula> aulas = new ArrayList<>(aulasImutaveis);
        Collections.sort(aulas);
        
        curso.matricula(a1);
        curso.matricula(a2);
        curso.matricula(a3);
        Set<Aluno> alunos = curso.getAlunos();
//        alunos.add(a3); não funciona, da uma exceção pois o certo é pedir pro curso matricular, assim nao fica "mexendo no motor"
        
        System.out.println(aulas);
        System.out.println(curso);
        System.out.println();
        System.out.println(alunos);
        System.out.println();
        System.out.println();
//        javaColecoes.getAlunos().forEach(aluno -> { //mesma coisa que o de baixo
//            System.out.println(aluno);
//        });
        for (Aluno aluno : alunos) { //esse aluno é igual falar que para cada coisa que ha em aluno imprima o toString
        	System.out.println(aluno);
		}
            
    }
}