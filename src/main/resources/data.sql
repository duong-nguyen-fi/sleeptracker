DROP TABLE IF EXISTS ENTRY;

CREATE TABLE entry (
  id BIGINT AUTO_INCREMENT  PRIMARY KEY,
  start timestamp NOT NULL,
  end timestamp NOT NULL
);