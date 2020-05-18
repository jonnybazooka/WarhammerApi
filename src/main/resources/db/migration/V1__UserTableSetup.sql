create table users(
        id serial not null primary key,
	username varchar(60) not null,
	password varchar(60) not null
);