create database employeedb;
use employeedb;

create table employee(
                         id int auto_increment primary key ,
                         name varchar(50),
                         age int,
                         salary double
);

insert into employee(1, "Hung", 25, 3000 );
insert into employee(2, "Thai", 20, 1000 );
insert into employee(3, "Nam", 23, 2000 );

