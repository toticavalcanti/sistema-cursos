package controller;

import modelo.Aluno;
import modelo.Curso;
import service.TurmaService;

public class TurmaController {

	private TurmaService service;
	
	public TurmaController(TurmaService service) {
		this.service = service;
	}
	
	private void matricula(Aluno aluno, Curso curso) {
		service.matricula(aluno, curso);
	}
	
}
