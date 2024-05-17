CREATE TABLE notes(
  id BIGINT PRIMARY KEY,
  title VARCHAR(250) NOT NULL CHECK (LENGTH(title) >= 3),
  content VARCHAR(500) NOT NULL CHECK (LENGTH(content) >= 3)
);

CREATE SEQUENCE note_seq START 1;

ALTER TABLE notes ALTER COLUMN id SET DEFAULT nextval('note_seq');
