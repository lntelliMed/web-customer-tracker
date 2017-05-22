-- Database: web_customer_tracker

-- DROP DATABASE web_customer_tracker;

CREATE DATABASE web_customer_tracker
    WITH 
    OWNER = postgres
    ENCODING = 'UTF8'
    LC_COLLATE = 'C'
    LC_CTYPE = 'C'
    TABLESPACE = pg_default
    CONNECTION LIMIT = -1;


-- Table: public.customer

-- DROP TABLE public.customer;

CREATE TABLE public.customer
(
    id bigint NOT NULL,
    first_name character varying(50) COLLATE pg_catalog."default",
    last_name character varying(50) COLLATE pg_catalog."default",
    email character varying(50) COLLATE pg_catalog."default",
    CONSTRAINT customer_pkey PRIMARY KEY (id)
)
WITH (
    OIDS = FALSE
)
TABLESPACE pg_default;

ALTER TABLE public.customer
    OWNER to postgres;

INSERT INTO customer VALUES (1,'David','Adams','david@intellimedllc.com');
INSERT INTO customer VALUES (2,'John','Doe','john@intellimedllc.com');
INSERT INTO customer VALUES (3,'Ajay','Rao','ajay@intellimedllc.com');
INSERT INTO customer VALUES (4,'Mary','Public','mary@intellimedllc.com');
INSERT INTO customer VALUES (5,'Maxwell','Dixon','max@intellimedllc.com');