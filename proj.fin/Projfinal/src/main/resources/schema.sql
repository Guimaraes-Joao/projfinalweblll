DROP TABLE IF EXISTS funcionario;

CREATE TABLE funcionario (
    id BIGINT AUTO_INCREMENT NOT NULL,
    nome VARCHAR(255) NULL,
    cargo varchar(100) NUll,
    renda DOUBLE NULL,
    PRIMARY KEY(id)
    );
