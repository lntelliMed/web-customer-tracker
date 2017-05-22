-- User: springstudent
-- DROP USER springstudent;

CREATE USER springstudent WITH
  PASSWORD 'springstudent'
  LOGIN
  SUPERUSER
  INHERIT
  CREATEDB
  CREATEROLE
  REPLICATION;