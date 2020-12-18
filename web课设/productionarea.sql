
SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for productionarea
-- ----------------------------
DROP TABLE IF EXISTS `productionarea`;
CREATE TABLE `productionarea` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) DEFAULT NULL COMMENT '产地名称',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of productionarea
-- ----------------------------
INSERT INTO `productionarea` VALUES ('1', '中国');
INSERT INTO `productionarea` VALUES ('2', '美国');
INSERT INTO `productionarea` VALUES ('3', '英国');
INSERT INTO `productionarea` VALUES ('4', '荷兰');
INSERT INTO `productionarea` VALUES ('5', '德国');
INSERT INTO `productionarea` VALUES ('6', '西班牙');
INSERT INTO `productionarea` VALUES ('7', '新西兰');
INSERT INTO `productionarea` VALUES ('8', '澳大利亚');
INSERT INTO `productionarea` VALUES ('9', '意大利');
