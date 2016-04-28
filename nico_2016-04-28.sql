-- MySQL dump 10.13  Distrib 5.6.24, for Win64 (x86_64)
--
-- Host: localhost    Database: nico
-- ------------------------------------------------------
-- Server version	5.6.24-log

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `an_account`
--

DROP TABLE IF EXISTS `an_account`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `an_account` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `user_id` bigint(20) DEFAULT NULL,
  `integral` double DEFAULT NULL,
  `level` int(11) DEFAULT NULL,
  `status` int(11) DEFAULT NULL,
  `is_vip` char(1) DEFAULT '0',
  `created_at` datetime DEFAULT NULL,
  `sn` varchar(25) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `an_account_indx_user_id` (`user_id`),
  KEY `an_account_vip` (`is_vip`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8 COMMENT='账号表';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `an_account`
--

LOCK TABLES `an_account` WRITE;
/*!40000 ALTER TABLE `an_account` DISABLE KEYS */;
INSERT INTO `an_account` VALUES (1,1,2080,2,1,'1','2016-04-20 16:56:00','43010319880222352x');
/*!40000 ALTER TABLE `an_account` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `an_user`
--

DROP TABLE IF EXISTS `an_user`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `an_user` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '用户ID',
  `username` varchar(50) NOT NULL COMMENT '用户名',
  `password` varchar(128) NOT NULL COMMENT '密码',
  `full_name` varchar(60) DEFAULT NULL COMMENT '全名',
  `address` varchar(255) DEFAULT NULL COMMENT '地址',
  `mobile` varchar(20) DEFAULT NULL COMMENT '手机号',
  `age` int(4) DEFAULT NULL COMMENT '年龄',
  `gender` varchar(10) DEFAULT NULL COMMENT '性别',
  `email` varchar(255) DEFAULT NULL COMMENT '邮箱',
  `education` varchar(50) DEFAULT NULL COMMENT '教育程度',
  `birthday` datetime DEFAULT NULL COMMENT '生日',
  `postal_code` varchar(15) DEFAULT NULL COMMENT '邮编',
  `reg_ip` varchar(40) DEFAULT NULL COMMENT '注册IP',
  `account_enabled` bit(1) DEFAULT b'1' COMMENT '是否可用',
  `account_expired` bit(1) NOT NULL DEFAULT b'0' COMMENT '是否过期',
  `account_locked` bit(1) NOT NULL DEFAULT b'0' COMMENT '是否锁定',
  KEY `AK_Key_1` (`id`),
  KEY `an_user_mobile_index` (`mobile`),
  KEY `an_user_password_index` (`password`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='用户表';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `an_user`
--

LOCK TABLES `an_user` WRITE;
/*!40000 ALTER TABLE `an_user` DISABLE KEYS */;
/*!40000 ALTER TABLE `an_user` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2016-04-28 14:19:24
