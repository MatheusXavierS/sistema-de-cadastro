import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class Curso {
	private String nome;
    private String instrutor;
    private List<Aula> listadeaulas = new LinkedList<Aula>();
    private Set<Aluno> alunos = new HashSet<>();
    
    public Curso(String nome, String instrutor) {
    	this.nome= nome;
    	this.instrutor = instrutor;
    }
    public String getNome() {
    	return this.nome;
    }
    public String getIntrutor() {
    	return this.instrutor;
    }
	public List<Aula> getAulas() {
		return Collections.unmodifiableList(listadeaulas);
	}
	public void adiciona(Aula aula) {
		this.listadeaulas.add(aula);
		
	}
	public int getTempoTotal() {
		int tempoTotal = 0;
		for (Aula aula : listadeaulas) {
			tempoTotal += aula.getTempo();
		}
		return tempoTotal;
	}
	
	@Override
	public String toString() {
		return "[Curso:"+ this.getNome()+",tempo total:"+ this.getTempoTotal()+ ", aulas: ["+ this.listadeaulas+"] ]";
	}
	
	public String matricula (Aluno aluno) {
		this.alunos.add(aluno);
		return "Aluno matriculado com sucesso!!";
	}
	public Set<Aluno> getAlunos() {
	    return Collections.unmodifiableSet(alunos);
	}
	public boolean estaMatriculado(Aluno aluno){
		return this.alunos.contains(aluno);
	}
}
