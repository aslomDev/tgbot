create table TGBOT_USER_TG (
    ID uuid,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    USER_NAME varchar(255),
    FIRST_NAME varchar(255),
    LAST_NAME varchar(255),
    PHONE_NUMBER varchar(255),
    USER_ID integer,
    MESSAGE varchar(255),
    --
    primary key (ID)
);