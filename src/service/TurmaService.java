package service;

import dao.TurmaDao;
import modelo.Aluno;
import modelo.Curso;
import modelo.Turma;

public class TurmaService {
	
	private TurmaDao dao;

	public TurmaService(TurmaDao dao) {
		this.dao = dao;
	}

	public void matricula(Aluno aluno, Curso curso) {
		Turma turma = dao.ultimaTurma(curso);
		
		turma.getAlunos().add(aluno);
		
		dao.atualiza(turma);
	}
	
}
