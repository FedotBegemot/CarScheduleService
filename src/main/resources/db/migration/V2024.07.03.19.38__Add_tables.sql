CREATE TABLE autoservice
(
    id SERIAL NOT NULL,
    name VARCHAR NOT NULL,
    city VARCHAR NOT NULL,
    CONSTRAINT autoservice_pk PRIMARY KEY (id)
);

CREATE TABLE client
(
    id SERIAL NOT NULL,
    name VARCHAR NOT NULL,
    email VARCHAR NOT NULL,
    phone VARCHAR NOT NULL,
    CONSTRAINT client_pk PRIMARY KEY (id)
);

CREATE TABLE car
(
    id SERIAL NOT NULL,
    vin VARCHAR NOT NULL,
    plate VARCHAR NOT NULL,
    colour VARCHAR NOT NULL,
    engine_number INT NOT NULL,
    body_number INT NOT NULL,
    engine_model VARCHAR NOT NULL,
    CONSTRAINT car_pk PRIMARY KEY (id)
);

CREATE TABLE request
(
    id SERIAL NOT NULL,
    date DATE NOT NULL,
    status VARCHAR NOT NULL,
    CONSTRAINT request_pk PRIMARY KEY (id)
);

CREATE TABLE work_type
(
    id SERIAL NOT NULL,
    name VARCHAR NOT NULL,
    CONSTRAINT work_type_pk PRIMARY KEY (id)
);

CREATE TABLE worker
(
    id SERIAL NOT NULL,
    name VARCHAR NOT NULL,
    email VARCHAR NOT NULL,
    phone VARCHAR NOT NULL,
    productivity VARCHAR NOT NULL,
    CONSTRAINT worker_pk PRIMARY KEY (id)
);