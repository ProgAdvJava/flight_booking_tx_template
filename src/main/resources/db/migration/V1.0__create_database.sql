CREATE TABLE airport (
    iata varchar(3) NOT NULL,
    name varchar(100) NOT NULL,
    PRIMARY KEY (iata)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;


CREATE TABLE flights (
    id int NOT NULL AUTO_INCREMENT,
    origin varchar(3) NOT NULL,
    destination varchar(3) NOT NULL,
    departure timestamp NOT NULL,
    arrival timestamp NOT NUll,
    fare DECIMAL(6,2),
    available_seats int,
    PRIMARY KEY (id),
    FOREIGN KEY (origin) REFERENCES airport(iata),
    FOREIGN KEY (destination) REFERENCES airport(iata)
)ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE booking(
    ref varchar(120) NOT NULL,
    firstname varchar(120) NOT NULL,
    lastname varchar(120) NOT NULL,
    email varchar(120) NOT NULL,
    flight_id int NOT NULL,
    PRIMARY KEY (ref),
    FOREIGN KEY (flight_id) REFERENCES flights(id)
)ENGINE=InnoDB DEFAULT CHARSET=utf8;