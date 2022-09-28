create schema netology;

USE netology;

create table CUSTOMERS
(
    id           int primary key auto_increment,
    name         varchar(250) not null,
    surname      varchar(250) not null,
    age          int          not null check ( age > 0 ),
    phone_number varchar(25) default null
);

create index customers_index
    on CUSTOMERS (id, name, surname);

create table ORDERS
(
    id           serial primary key      not null,
    date         timestamp default now() not null,
    customer_id  int                     not null,
    product_name varchar(250)            not null,
    amount       int                     not null check ( amount > 0 ),
    foreign key (customer_id) references CUSTOMERS (id)
);

create index orders_index
    on ORDERS (id, customer_id, date);