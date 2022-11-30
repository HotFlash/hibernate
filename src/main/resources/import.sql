DROP TABLE users IF EXISTS;
CREATE TABLE IF NOT EXISTS users (id bigserial, name VARCHAR(255), PRIMARY KEY (id));
INSERT INTO users (name) VALUES ('Bob'), ('Mike'),('Rob'),('John') ;

DROP TABLE items IF EXISTS;
CREATE TABLE IF NOT EXISTS items (id bigserial, title VARCHAR (255), price INTEGER, PRIMARY KEY (id));
INSERT INTO items (title, price) VALUES ('Box1', 100),('Box2', 200),('Box3', 300) ;
