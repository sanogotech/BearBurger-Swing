DROP TABLE IF EXISTS users;
DROP TABLE IF EXISTS foods;

CREATE TABLE users
(
    id       INT AUTO_INCREMENT PRIMARY KEY,
    username VARCHAR(30) NOT NULL UNIQUE,
    email    VARCHAR(30) NOT NULL UNIQUE,
    pass     VARCHAR(30) NOT NULL,
    phone    VARCHAR(15) NOT NULL,
    gender   VARCHAR(6)  NOT NULL,
    reg_date TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);

CREATE TABLE foods
(
    id          INT AUTO_INCREMENT PRIMARY KEY,
    category    VARCHAR(30) NOT NULL,
    title       VARCHAR(30) NOT NULL UNIQUE,
    description TEXT        NOT NULL,
    price       INT         NOT NULL
);
