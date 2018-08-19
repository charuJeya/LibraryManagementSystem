-- MySQL dump 10.13  Distrib 8.0.11, for Win64 (x86_64)
--
-- Host: localhost    Database: librarysarvelet
-- ------------------------------------------------------
-- Server version	8.0.11

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
 SET NAMES utf8 ;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `bookclassification`
--

DROP TABLE IF EXISTS `bookclassification`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `bookclassification` (
  `bookClassificationId` int(11) NOT NULL,
  `subClassificationId` varchar(45) DEFAULT NULL,
  `bookId` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`bookClassificationId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `bookclassification`
--

LOCK TABLES `bookclassification` WRITE;
/*!40000 ALTER TABLE `bookclassification` DISABLE KEYS */;
/*!40000 ALTER TABLE `bookclassification` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `bookdetails`
--

DROP TABLE IF EXISTS `bookdetails`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `bookdetails` (
  `bookId` varchar(20) NOT NULL,
  `title` varchar(45) NOT NULL,
  `author` varchar(45) NOT NULL,
  `mainClassification` varchar(45) NOT NULL,
  `subClassification` varchar(45) NOT NULL,
  `yearOfPublishing` int(11) NOT NULL,
  `lastPrintedYear` int(11) NOT NULL,
  `isbnNo` varchar(45) NOT NULL,
  `noOfPages` int(11) NOT NULL,
  PRIMARY KEY (`bookId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `bookdetails`
--

LOCK TABLES `bookdetails` WRITE;
/*!40000 ALTER TABLE `bookdetails` DISABLE KEYS */;
INSERT INTO `bookdetails` VALUES ('B01','kampar','Ramajanam','null','null',1550,2018,'R01',10000),('b4','hrhrh','hr','null','null',43,453,'4r',45),('b5','hrhrh','hr','null','null',43,453,'4r',45),('b6','hrhrh','hr','null','null',43,453,'4r',45),('rretu','teuy','tueue','null','null',765,785,'ccc76',767);
/*!40000 ALTER TABLE `bookdetails` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `mainclassification`
--

DROP TABLE IF EXISTS `mainclassification`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `mainclassification` (
  `mainClassificationId` varchar(11) NOT NULL,
  `mainClassificationName` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`mainClassificationId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `mainclassification`
--

LOCK TABLES `mainclassification` WRITE;
/*!40000 ALTER TABLE `mainclassification` DISABLE KEYS */;
INSERT INTO `mainclassification` VALUES ('1','Science'),('2','Maths'),('3','Tamil'),('4','Engineering');
/*!40000 ALTER TABLE `mainclassification` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `subclassification`
--

DROP TABLE IF EXISTS `subclassification`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `subclassification` (
  `subClassificationId` varchar(45) NOT NULL,
  `subClassificationName` varchar(45) NOT NULL,
  `mainClassificationName` varchar(45) NOT NULL,
  PRIMARY KEY (`subClassificationId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `subclassification`
--

LOCK TABLES `subclassification` WRITE;
/*!40000 ALTER TABLE `subclassification` DISABLE KEYS */;
INSERT INTO `subclassification` VALUES ('01','softwareEngineering','Engineering'),('02','Bio','Science'),('03','ComputerEngineering','Engineering');
/*!40000 ALTER TABLE `subclassification` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2018-08-19 15:31:17
