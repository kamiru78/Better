CREATE TABLE IF NOT EXISTS posts (
    id BIGINT NOT NULL PRIMARY KEY AUTO_INCREMENT,
    title VARCHAR(256) NOT NULL,
    content VARCHAR(256) NOT NULL
);

CREATE TABLE IF NOT EXISTS choices (
    id BIGINT NOT NULL PRIMARY KEY AUTO_INCREMENT,
    choice VARCHAR(256) NOT NULL
);

CREATE TABLE IF NOT EXISTS users (
    id BIGINT NOT NULL PRIMARY KEY AUTO_INCREMENT,
    username VARCHAR(256) NOT NULL UNIQUE,
    password VARCHAR(256) NOT NULL
);
