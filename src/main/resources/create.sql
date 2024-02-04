CREATE TABLE VENDOR
(
    id    INT AUTO_INCREMENT PRIMARY KEY,
    name  VARCHAR(255),
    immat VARCHAR(255)
);

CREATE TABLE USER
(
    id        INT AUTO_INCREMENT PRIMARY KEY,
    email     VARCHAR(255),
    firstname VARCHAR(255),
    lastname  VARCHAR(255),
    roles     VARCHAR(255),
    password  VARCHAR(255),
    vendor_id INT,
    CONSTRAINT fk_id_vendor FOREIGN KEY (vendor_id) REFERENCES VENDOR (id)
);

CREATE TABLE PRICE
(
    id        INT AUTO_INCREMENT PRIMARY KEY,
    ttcprice  FLOAT,
    htprice   FLOAT,
    tvarate   FLOAT
);

CREATE TABLE PRODUCT
(
    id          INT AUTO_INCREMENT PRIMARY KEY,
    ref         VARCHAR(255),
    name        VARCHAR(255),
    description VARCHAR(255),
    price_id    INT,
    vendor_id INT,
    CONSTRAINT fk_id_vendor FOREIGN KEY (vendor_id) REFERENCES VENDOR (id),
    CONSTRAINT fk_id_price FOREIGN KEY (price_id) REFERENCES PRICE (id)
);
