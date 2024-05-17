CREATE TABLE users(
  id BIGINT PRIMARY KEY,
  username VARCHAR(45) NOT NULL,
  password VARCHAR(64) NOT NULL,
  role VARCHAR(45) NOT NULL,
  enabled INT NOT NULL
);

INSERT INTO users (id, username, password, role, enabled)
VALUES
    (1, 'namhm', 'userpass', 'ROLE_USER', 1),
    (2, 'admin', 'adminpass', 'ROLE_ADMIN', 1);
