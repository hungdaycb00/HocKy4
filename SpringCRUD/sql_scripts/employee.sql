CREATE DATABASE  IF NOT EXISTS `employee_directory`;
USE `employee_directory`;

--
-- Table structure for table `employee`
--

DROP TABLE IF EXISTS `employee`;

CREATE TABLE `employee` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `first_name` varchar(45) DEFAULT NULL,
  `last_name` varchar(45) DEFAULT NULL,
  `email` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=latin1;

--
-- Data for table `employee`
--

INSERT INTO `employee` VALUES (1,'Thi','Kim','kimthi@codelean.vn'),
                              (2,'Nhat','Minh','nhatminh@codelean.vn'),
                              (3,'Chau','Anh','chauanh@codelean.vn'),
                              (4,'Ngoc','Diep','ngocdiep@codelean.vn'),
                              (5,'Hong','Tham','hongtham@codelean.vn');

