CREATE DATABASE  IF NOT EXISTS `employee_directory`;
USE `employee_directory`;

--
-- Table structure for table `employee`
--

DROP TABLE IF EXISTS `employeedb`;

CREATE TABLE `employeedb` (
                            `id` int(11) NOT NULL AUTO_INCREMENT,
                            `name` varchar(45) DEFAULT NULL,
                            `wage` double DEFAULT NULL,
                            PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=latin1;

--
-- Data for table `employee`
--

INSERT INTO `employeedb` VALUES (1,'Thi',1000),
                              (2,'Nhat',2000),
                              (3,'Chau',3000),
                              (4,'Ngoc',4000),
                              (5,'Hong',5000);