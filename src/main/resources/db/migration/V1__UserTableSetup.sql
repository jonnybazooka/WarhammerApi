create table users(
        id bigint not null auto_increment primary key,
	username varchar(60) not null,
	password varchar(60) not null
);