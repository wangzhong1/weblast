
SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for item
-- ----------------------------
DROP TABLE IF EXISTS `item`;
CREATE TABLE `item` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `itemNo` varchar(255) DEFAULT NULL COMMENT '货号',
  `barcode` varchar(255) DEFAULT NULL COMMENT '条形码',
  `chName` varchar(255) DEFAULT NULL COMMENT '中文名称',
  `productionAreaId` int(11) DEFAULT NULL COMMENT '产地id',
  `meteringId` int(11) DEFAULT NULL COMMENT '计量单位id',
  `oneCatalogId` int(11) DEFAULT NULL COMMENT '一级栏目',
  `twoCatalogId` int(11) DEFAULT NULL COMMENT '二级栏目',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of item
-- ----------------------------
INSERT INTO `item` VALUES ('1', '1', '2', '3', '4', '5', '6', '7');
INSERT INTO `item` VALUES ('2', '123', '123124', null, null, null, null, null);
INSERT INTO `item` VALUES ('6', '1234235', '143425', '热与他人', '1', '1', '1', '2');
INSERT INTO `item` VALUES ('7', '123234235', '654363', '大幅度', '1', '1', '1', '2');
INSERT INTO `item` VALUES ('8', '1231444', '231231245', '超级商品', '6', '4', '1', '9');
