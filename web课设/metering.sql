
SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for metering
-- ----------------------------
DROP TABLE IF EXISTS `metering`;
CREATE TABLE `metering` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) DEFAULT NULL COMMENT '计量名称',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of metering
-- ----------------------------
INSERT INTO `metering` VALUES ('1', '个');
INSERT INTO `metering` VALUES ('2', '只');
INSERT INTO `metering` VALUES ('3', '罐');
INSERT INTO `metering` VALUES ('4', '箱');
INSERT INTO `metering` VALUES ('5', '包');
INSERT INTO `metering` VALUES ('6', '盒');
