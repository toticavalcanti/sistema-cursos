package dao;

import java.util.List;

import infra.Database;
import modelo.Curso;
import modelo.Turma;

public class TurmaDao {
	
	private Database database;

	public TurmaDao(Database database) {
		this.database = database;
	}

	public Turma ultimaTurma(Curso curso) {
		List<Turma> turmas = database.query("select * from Turma where curso = curso, curso");
		return turmas.get(0);
	}

	public void atualiza(Turma turma) {
		database.update(turma);
	}
	
}
