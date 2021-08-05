CREATE DATABASE  IF NOT EXISTS `gymanager` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci */ /*!80016 DEFAULT ENCRYPTION='N' */;
USE `gymanager`;
-- MySQL dump 10.13  Distrib 8.0.22, for Win64 (x86_64)
--
-- Host: localhost    Database: gymanager
-- ------------------------------------------------------
-- Server version	8.0.22

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
-- Table structure for table `socios`
--

DROP TABLE IF EXISTS `socios`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `socios` (
  `id_socio` int NOT NULL AUTO_INCREMENT,
  `numeroSocio` varchar(10) NOT NULL,
  `nombre` varchar(45) NOT NULL,
  `apellidoP` varchar(25) NOT NULL,
  `apellidoM` varchar(25) DEFAULT NULL,
  `tipoMembresia` varchar(15) NOT NULL,
  `fechaInscripcion` datetime DEFAULT '0000-00-00 00:00:00',
  `mesesSuscripto` int DEFAULT NULL,
  PRIMARY KEY (`id_socio`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `socios`
--

LOCK TABLES `socios` WRITE;
/*!40000 ALTER TABLE `socios` DISABLE KEYS */;
INSERT INTO `socios` VALUES (1,'caj00','Javier','Carlos','Garcia','Trimestral',NULL,NULL),(2,'rod00','Daniel','Rojas','Gonzales','Cuatrimestral',NULL,NULL),(3,'ele00','Ejemplo','Elemplo','Ejemplo','Cuatrimestral',NULL,NULL),(4,'non00','Nombre','Nombre','Ejemplo','Cuatrimestral',NULL,NULL),(5,'es 00',' abner','Esparza','Araiza','Mensual',NULL,NULL),(6,'all00','Lee','Alexander','McQueen','Bimestral','2021-08-04 07:47:08',NULL),(7,'kaa00','Audrey','Kathleen','Ruston','Cuatrimestral','2021-08-04 07:54:18',NULL),(8,'lec00','Christie','Lee','Hudson','Semestral','2021-08-04 07:58:46',NULL),(9,'caj00','Javier','Carlos','Ruston','Bimestral','2021-08-04 21:56:11',NULL),(10,'roc00','Christie','Rojas','Gonzales','Semestral','2021-08-04 22:02:25',NULL);
/*!40000 ALTER TABLE `socios` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2021-08-05  0:55:33
