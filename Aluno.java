import java.util.Objects;

public class Aluno{
    private String nome;
	private int numeroDeMatricula;

    public Aluno(String nome, int numeroDeMatricula) {
	    this.nome = nome;
	    this.numeroDeMatricula = numeroDeMatricula;
	    if(this.nome == null) {
	    throw new java.lang.NullPointerException("Nome não pode ser nulo");
			
	    }
    }

    public String getNome() {
	    return this.nome;
    }
	
    public int getNumeroDeMatricula() {
	    return this.numeroDeMatricula;
    }

    @Override
    public String toString() {
	    return "[" + "O nome do aluno: " + this.nome + ", e o numero de matricula e: " + this.numeroDeMatricula + "]";
    }

    @Override
    public boolean equals(Object obj) {
	    if (this == obj)
		    return true;
	    if (obj == null)
		    return false;
	    if (getClass() != obj.getClass())
		    return false;
	    Aluno other = (Aluno) obj;
	    return Objects.equals(nome, other.nome) && numeroDeMatricula == other.numeroDeMatricula;
    }

    @Override
    public int hashCode() {
	    return Objects.hash(nome, numeroDeMatricula);
    }
}
