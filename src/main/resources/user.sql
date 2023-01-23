create database user;
use user;
 
CREATE TABLE `user` (
   `id` int NOT NULL AUTO_INCREMENT,
   `first_name` varchar(20) DEFAULT NULL,
   `last_name` varchar(20) DEFAULT NULL,
   `username` varchar(250) DEFAULT NULL,
   `password` varchar(20) DEFAULT NULL,
   PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

insert into user (`first_name`, `last_name`, `username`, `password`) values ("Shivam", "Rathi", "shivamrathi1996", "password");

select * from user;

-- delete from registration where id=2;
