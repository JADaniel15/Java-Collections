package br.com.alura;

public class TesteBuscaAlunos {
	public static void main(String[] args){
		
		Curso javaColecoes = new Curso("Dominando as coleções do Java", "Paulo Silveira");
		
		
		javaColecoes.adiciona(new Aula("Trabalando com ArrayList", 21));
		javaColecoes.adiciona(new Aula("Criando Aula", 20));
		javaColecoes.adiciona(new Aula("Modelando com Colecoes", 22));
		
		Aluno a1 = new Aluno("Rodrigo Turini", 34672);
		Aluno a2 = new Aluno("Guilherme Silveria", 5617);
		Aluno a3 = new Aluno("Mauricio Aniche", 17645);
		Aluno a4 = new Aluno("Paulo silveira", 5617);
		
		javaColecoes.maticula(a1);
		javaColecoes.maticula(a2);
		javaColecoes.maticula(a3);
		javaColecoes.maticula(a4);
		
		System.out.println(javaColecoes.getAlunos());
		
		System.out.println("Quem e o aluno com matricula 5617?");
		Aluno aluno = javaColecoes.buscaMatriculado(5617);
		System.out.println("aluno:  " + aluno);
	}

}
