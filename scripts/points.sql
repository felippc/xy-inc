DROP SCHEMA IF EXISTS `POI` ;
CREATE SCHEMA IF NOT EXISTS `POI` DEFAULT CHARACTER SET utf8 COLLATE utf8_general_ci ;
USE `POI` ;

-- -----------------------------------------------------
-- Table `POI`.`POI_POINT`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `POI`.`poi_point` (
  `X` BIGINT NOT NULL,
  `Y` BIGINT NOT NULL,
  `NAME` VARCHAR(200) NOT NULL,
  PRIMARY KEY (`X`, `Y`));


INSERT INTO POI.poi_point (x, y, name)
	VALUES ( 27, 12, 'Lanchonete' );

INSERT INTO POI.poi_point (x, y, name)
	VALUES ( 31, 18, 'Posto' );

INSERT INTO POI.poi_point (x, y, name)
	VALUES ( 15, 12, 'Joalheria' );

INSERT INTO POI.poi_point (x, y, name)
	VALUES ( 19, 21, 'Floricultura' );

INSERT INTO POI.poi_point (x, y, name)
	VALUES ( 12, 8, 'Pub' );

INSERT INTO POI.poi_point (x, y, name)
	VALUES ( 23, 6, 'Supermercado' );

INSERT INTO POI.poi_point (x, y, name)
	VALUES ( 28, 2, 'Churrascaria' );