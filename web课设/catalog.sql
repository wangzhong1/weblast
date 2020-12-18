
SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for catalog
-- ----------------------------
DROP TABLE IF EXISTS `catalog`;
CREATE TABLE `catalog` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `pId` int(11) DEFAULT NULL,
  `name` varchar(255) DEFAULT '' COMMENT '商品目录名称',
  `type` int(255) DEFAULT NULL COMMENT '目录类型1或者2',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=14 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of catalog
-- ----------------------------
INSERT INTO `catalog` VALUES ('1', null, '美妆清洁', '1');
INSERT INTO `catalog` VALUES ('2', null, '母婴', '1');
INSERT INTO `catalog` VALUES ('3', null, '营养保健', '1');
INSERT INTO `catalog` VALUES ('4', null, '家用电器', '1');
INSERT INTO `catalog` VALUES ('5', null, '食品特产', '1');
INSERT INTO `catalog` VALUES ('6', null, '厨具', '1');
INSERT INTO `catalog` VALUES ('7', '1', '面部护肤', '2');
INSERT INTO `catalog` VALUES ('8', '1', '洗发护发', '2');
INSERT INTO `catalog` VALUES ('9', '1', '身体护肤', '2');
INSERT INTO `catalog` VALUES ('10', '1', '口腔护理', '2');
INSERT INTO `catalog` VALUES ('11', '1', '女性护理', '2');
INSERT INTO `catalog` VALUES ('13', '2', 'aa', '2');
