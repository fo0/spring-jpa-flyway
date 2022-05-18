create sequence hibernate_sequence start with 1 increment by 1;
CREATE TABLE person
(
    id   INT NOT NULL,
    name VARCHAR(255),
    age  INT,
    CONSTRAINT pk_person PRIMARY KEY (id)
);
