set search_path to postgres, public;

DROP TABLE IF EXISTS user_table;
CREATE TABLE user_table (
  id BIGINT PRIMARY KEY GENERATED BY DEFAULT AS IDENTITY,
  first_name VARCHAR(255),
  last_name VARCHAR(255),
  birth_date VARCHAR(255)
);