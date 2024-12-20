-- MySQL dump 10.13  Distrib 8.0.34, for Win64 (x86_64)
--
-- Host: 127.0.0.1    Database: niupi
-- ------------------------------------------------------
-- Server version	8.0.31

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `animal`
--

DROP TABLE IF EXISTS `animal`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `animal` (
  `animal_id` int NOT NULL AUTO_INCREMENT,
  `animal_type` enum('mammal','bird') NOT NULL,
  `animal_name` text NOT NULL,
  `color` text NOT NULL,
  `sex` varchar(1) NOT NULL,
  `animal_dob` date NOT NULL,
  PRIMARY KEY (`animal_id`)
) ENGINE=InnoDB AUTO_INCREMENT=15 DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `animal`
--

LOCK TABLES `animal` WRITE;
/*!40000 ALTER TABLE `animal` DISABLE KEYS */;
INSERT INTO `animal` VALUES (9,'mammal','yyyyyyyy','Blue','M','2024-01-03'),(10,'mammal','ttt','Que lindo','M','2023-01-26'),(11,'bird','sdasd','sdss','F','2024-01-03'),(13,'bird','Nope3','dddddd','F','2024-01-01'),(14,'bird','asds','ssss','F','2024-01-03');
/*!40000 ALTER TABLE `animal` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `bird`
--

DROP TABLE IF EXISTS `bird`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `bird` (
  `bird_id` int NOT NULL AUTO_INCREMENT,
  `animalb_id` int NOT NULL,
  `type_of_beak` text NOT NULL,
  `it_flights` tinyint NOT NULL,
  `size` text NOT NULL,
  PRIMARY KEY (`bird_id`),
  KEY `animalb_id_idx` (`animalb_id`),
  CONSTRAINT `animalb_id` FOREIGN KEY (`animalb_id`) REFERENCES `animal` (`animal_id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `bird`
--

LOCK TABLES `bird` WRITE;
/*!40000 ALTER TABLE `bird` DISABLE KEYS */;
INSERT INTO `bird` VALUES (1,11,'Pico Gancho',1,'Mediano'),(3,13,'Pico Gancho',1,'Muy Grande'),(4,14,'Pico Tubular',0,'Mediano');
/*!40000 ALTER TABLE `bird` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `mammal`
--

DROP TABLE IF EXISTS `mammal`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `mammal` (
  `mammal_id` int NOT NULL AUTO_INCREMENT,
  `animalm_id` int NOT NULL,
  `hair_type` text NOT NULL,
  `number_of_teeth` int unsigned NOT NULL,
  `category` text NOT NULL,
  PRIMARY KEY (`mammal_id`),
  KEY `animalm_id_idx` (`animalm_id`),
  CONSTRAINT `animalm_id` FOREIGN KEY (`animalm_id`) REFERENCES `animal` (`animal_id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `mammal`
--

LOCK TABLES `mammal` WRITE;
/*!40000 ALTER TABLE `mammal` DISABLE KEYS */;
INSERT INTO `mammal` VALUES (3,9,'Corto',111,'Carnívoro'),(4,10,'Largo',3333,'Primate');
/*!40000 ALTER TABLE `mammal` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `revision`
--

DROP TABLE IF EXISTS `revision`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `revision` (
  `revision_id` int NOT NULL AUTO_INCREMENT,
  `animal_id` int NOT NULL,
  `veterinarian_id` int NOT NULL,
  `revision_date` date NOT NULL,
  `remarks` text NOT NULL,
  PRIMARY KEY (`revision_id`),
  KEY `animal_id_idx` (`animal_id`),
  KEY `veterinarian_id_idx` (`veterinarian_id`),
  CONSTRAINT `animal_id` FOREIGN KEY (`animal_id`) REFERENCES `animal` (`animal_id`),
  CONSTRAINT `veterinarian_id` FOREIGN KEY (`veterinarian_id`) REFERENCES `veterinarian` (`veterinarian_id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `revision`
--

LOCK TABLES `revision` WRITE;
/*!40000 ALTER TABLE `revision` DISABLE KEYS */;
INSERT INTO `revision` VALUES (1,9,1,'2024-01-04','eeeeeeeee'),(2,9,1,'2024-01-03','eeee');
/*!40000 ALTER TABLE `revision` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `veterinarian`
--

DROP TABLE IF EXISTS `veterinarian`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `veterinarian` (
  `veterinarian_id` int NOT NULL AUTO_INCREMENT,
  `veterinarian_name` text NOT NULL,
  `specialization` text NOT NULL,
  `phone` text NOT NULL,
  `veterinarian_dob` date NOT NULL,
  `veterinarian_doh` date NOT NULL,
  PRIMARY KEY (`veterinarian_id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `veterinarian`
--

LOCK TABLES `veterinarian` WRITE;
/*!40000 ALTER TABLE `veterinarian` DISABLE KEYS */;
INSERT INTO `veterinarian` VALUES (1,'Sandro Martínez Pérez','Medicina de Animales Exóticos','1111111','1999-09-18','2021-01-07'),(4,'Fernando David Gomez','Cirugía Veterinaria','333','1998-01-02','2024-01-02'),(5,'sddddd','Cirugía Veterinaria','ffffffffffffffffffff','2002-01-05','2023-01-05');
/*!40000 ALTER TABLE `veterinarian` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2024-01-04 18:31:30
