CREATE TABLE cash_card(
    ID BIGINT GENERATED BY DEFAULT AS IDENTITY PRIMARY KEY,
    AMOUNT NUMERIC NOT NULL DEFAULT 0,
    OWNER VARCHAR(256) NOT NULL
);