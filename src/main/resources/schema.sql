CREATE TABLE IF NOT EXISTS Student(
    id INTEGER PRIMARY KEY AUTO_INCREMENT,
    firstname varchar(55) NOT NULL,
    lastname varchar(55) NOT NULL,
    birthDate date NOT NULL,
    phoneNumber varchar(12)
);
