-- phpMyAdmin SQL Dump
-- version 4.8.5
-- https://www.phpmyadmin.net/
--
-- Hôte : 127.0.0.1:3307
-- Généré le :  mar. 07 avr. 2020 à 22:16
-- Version du serveur :  10.3.14-MariaDB
-- Version de PHP :  7.3.5

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de données :  `miniprojet_jdbc`
--

-- --------------------------------------------------------

--
-- Structure de la table `rendez_vous`
--

DROP TABLE IF EXISTS `rendez_vous`;
CREATE TABLE IF NOT EXISTS `rendez_vous` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `date_rdv` date NOT NULL,
  `periode_journee` varchar(20) NOT NULL,
  `nom_client` varchar(50) NOT NULL,
  `lieu_rdv` varchar(50) NOT NULL,
  `tel_client` varchar(50) NOT NULL,
  `mail_client` varchar(50) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

--
-- Déchargement des données de la table `rendez_vous`
--

INSERT INTO `rendez_vous` (`id`, `date_rdv`, `periode_journee`, `nom_client`, `lieu_rdv`, `tel_client`, `mail_client`) VALUES
(1, '2020-04-08', 'matin', 'bob', 'toulouse', '07000123', 'bob@mail.fr'),
(2, '2020-04-09', 'midi', 'zoe', 'perpignan', '06002242', 'zoe@mail.fr'),
(3, '2020-04-12', 'après-midi', 'john', 'paris', '01018899', 'john@mail.com');
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
