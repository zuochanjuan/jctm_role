/*
Navicat MySQL Data Transfer

Source Server         : 10.0.18.121
Source Server Version : 50527
Source Host           : 10.0.18.121:3306
Source Database       : jctm_role

Target Server Type    : MYSQL
Target Server Version : 50527
File Encoding         : 65001

Date: 2014-08-11 18:32:04
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `jctm_role`
-- ----------------------------
DROP TABLE IF EXISTS `jctm_role`;
CREATE TABLE `jctm_role` (
`id`  int(11) NOT NULL AUTO_INCREMENT ,
`lastUpdateTime`  timestamp NOT NULL DEFAULT '0000-00-00 00:00:00' ON UPDATE CURRENT_TIMESTAMP ,
`secNum`  varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL ,
`theme`  varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL ,
`meetingTime`  varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL ,
`host`  varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL ,
`tableTopicHost`  varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL ,
`generalE`  varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL ,
`tableTopicE`  varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL ,
`ahCounter`  varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL ,
`timer`  varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL ,
`grammer`  varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL ,
`momentOfTruth`  varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL ,
`opening`  varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL ,
`ending`  varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL ,
`speech1`  varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL ,
`evaluator1`  varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL ,
`speech2`  varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL ,
`evaluator2`  varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL ,
`speech3`  varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL ,
`evaluator3`  varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL ,
PRIMARY KEY (`id`)
)
ENGINE=InnoDB
DEFAULT CHARACTER SET=utf8 COLLATE=utf8_general_ci
AUTO_INCREMENT=9

;

-- ----------------------------
-- Records of jctm_role
-- ----------------------------
BEGIN;
INSERT INTO `jctm_role` VALUES ('5', '2014-08-11 18:05:37', '22期 英文', '', '2014-08-14', 'Nancy Huang', '', '', 'Christina Zuo', '', '', '', 'Nancy', '', '', '陈景浩CC1', '', '陈湘鹏CC1', '', '夏青青CC2', ''), ('6', '0000-00-00 00:00:00', '23期 英文', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', ''), ('7', '0000-00-00 00:00:00', '24期 中文', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', ''), ('8', '2014-08-11 17:56:23', '25期 中文', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '陈湘鹏CC2', '', '', '');
COMMIT;

-- ----------------------------
-- Auto increment value for `jctm_role`
-- ----------------------------
ALTER TABLE `jctm_role` AUTO_INCREMENT=9;
