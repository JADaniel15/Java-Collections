package br.com.alura;

import java.util.Iterator;
import java.util.Set;

public class TestaCursoComAluno {
		public static void main(String[] args) {
			Curso javaColecoes = new Curso("Dominando as coleções do Java", "Paulo Silveira");
			
			
			javaColecoes.adiciona(new Aula("Trabalando com ArrayList", 21));
			javaColecoes.adiciona(new Aula("Criando Aula", 20));
			javaColecoes.adiciona(new Aula("Modelando com Colecoes", 22));
			
			Aluno a1 = new Aluno("Rodrigo Turini", 34672);
			Aluno a2 = new Aluno("Guilherme Silveria", 5617);
			Aluno a3 = new Aluno("Mauricio Aniche", 17645);
			
			javaColecoes.maticula(a1);
			javaColecoes.maticula(a2);
			javaColecoes.maticula(a3);
			
			System.out.println("Todos os alunos matriculados:  ");
			
			Set<Aluno> alunos = javaColecoes.getAlunos();
			Iterator<Aluno> iterador =alunos.iterator();
			while(iterador.hasNext()) {
				Aluno proximo = iterador.next();
				System.out.println(proximo);
			}
			
			
			javaColecoes.getAlunos().forEach(a->{
				System.out.println(a);
			});
			
			System.out.println("o aluno " + a1 + " esta matriculado?");
			System.out.println(javaColecoes.estaMatriculado(a1));
			
			Aluno turini = new Aluno("Rodrigo Turini", 34672);
			System.out.println("E esse Turini, esta matriculado?");
			System.out.println(javaColecoes.estaMatriculado(turini));
			
			System.out.println("o a1 e equals ao Turini?");
			System.out.println(a1.equals(turini));
			
			System.out.println(a1.hashCode()== turini.hashCode());
		}
}
