package br.siscademic.dao;

import br.sisacamic.model.Curso;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;

public class CursoDAO {
    
    public Map<Curso, Integer> getTodosCursosCountAlunos() throws SQLException{
        Map<Curso, Integer> relatorio = new HashMap<Curso, Integer>();
        
        return relatorio;
    }
}
