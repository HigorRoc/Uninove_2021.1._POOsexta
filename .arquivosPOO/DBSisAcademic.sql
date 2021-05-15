-- JavaDBNome do Banco: SisAcademic
-- JavaDB Usuario: uninove
-- JavaDB Password: Senha123

<!-- TABELA CURSO -->
CREATE TABLE "tb_curso"
(
    "idCurso" INT NOT NULL PRIMARY KEY
        GENERATED ALWAYS AS IDENTITY
        (START WITH 1, INCREMENT BY 1),
    "nome_curso" VARCHAR(90),
    "tipo_curso" VARCHAR(50)
);


<!-- TABELA ALUNO -->
CREATE TABLE "tb_aluno"
(
    "idAluno" INT NOT NULL PRIMARY KEY
        GENERATED ALWAYS AS IDENTITY
        (START WITH 1, INCREMENT BY 1),
    "ra" INT NOT NULL,
    "nome" VARCHAR(100),
    "idCurso" INT, 
    CONSTRAINT fk_aluno_curso FOREIGN KEY ("idCurso")
        REFERENCES "tb_curso"
);
