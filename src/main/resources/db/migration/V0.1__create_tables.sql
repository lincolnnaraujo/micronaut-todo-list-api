DROP TABLE IF EXISTS TAREFAS;

CREATE TABLE TAREFAS (
    id   UUID PRIMARY KEY NOT NULL,
    titulo VARCHAR(50) NOT NULL,
    descricao VARCHAR(255) NULL,
    data_criacao TIMESTAMP NOT NULL,
    data_alteracao TIMESTAMP NULL,
    flagSituacao char(1) NOT NULL default 'N'
);