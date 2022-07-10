package br.com.alura;

public class TestaCurso {

	public static void main(String[] args) {
		Curso javaColecoes = new Curso("Dominando as coleções do Java", "Paulo Silveira");
		
		/*
		 * List<Aula> aulas = javaColecoes.getAulas(); System.out.println(aulas);
		 */
		
		//javaColecoes.getAulas().add(new Aula("Trabalando com ArrayList", 21));
		
		javaColecoes.adiciona(new Aula("Trabalando com ArrayList", 21));
		javaColecoes.adiciona(new Aula("Criando Aula", 20));
		javaColecoes.adiciona(new Aula("Modelando com Colecoes", 22));
		
		
		System.out.println(javaColecoes.getAulas());

	}

}
