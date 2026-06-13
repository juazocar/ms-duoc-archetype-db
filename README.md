


### Script base de datos

create database productos;
use productos;

create table producto(
id_producto int AUTO_INCREMENT,
nombre varchar(100) NOT NULL,
descripcion varchar(200),
primary key (id_producto)
)