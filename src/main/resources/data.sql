

CREATE TABLE IF NOT EXISTS entry (
  id BIGINT AUTO_INCREMENT  PRIMARY KEY,
  startTime timestamp NOT NULL,
  endTime timestamp NOT NULL
);