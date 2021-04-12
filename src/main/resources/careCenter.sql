CREATE DATABASE careCenter;
USE careCenter;

-- 客户表 clients
-- 客户id，用户姓名，陪护等级，电话号，紧急联系人电话号，状态
CREATE TABLE IF NOT EXISTS clients(
	id INT AUTO_INCREMENT,
	clientid INT NOT NULL,
	clientname VARCHAR(255) NOT NULL,
	clientrank INT NOT NULL,
	phonenumber VARCHAR(255),
	emergentnumber VARCHAR(255),
	status VARCHAR(255),
	PRIMARY KEY(id)
	)ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- 入住表 clientIn
-- 床id，客户id，护工id，入住时间，状态
CREATE TABLE IF NOT EXISTS clientIn(
	id INT AUTO_INCREMENT,
	bedid INT NOT NULL,
	clientid INT NOT NULL,
	nurseid INT NOT NULL,
	timein TIMESTAMP NOT NULL,
	status VARCHAR(255),
	PRIMARY KEY(id)
	)ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- 床位表 bedLocation
-- 位置，状态
CREATE TABLE IF NOT EXISTS bedLocation(
	id INT Auto_INCREMENT,
	bedid INT NOT NULL,
	location VARCHAR(255) NOT NULL,
	status VARCHAR(255) NOT NULL,
	PRIMARY KEY(id)
	)ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- 护工表 nurses
-- 护工id，护工姓名，护工级别，联系方式
CREATE TABLE IF NOT EXISTS nurses(
	id INT AUTO_INCREMENT,
	nurseid INT NOT NULL,
	nursename VARCHAR(255) NOT NULL,
	nurserank INT NOT NULL,
	phonenumber VARCHAR(255) NOT NULL,
	PRIMARY KEY(id)
	)ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- 护理记录表 nurseRecord
-- 护工id，客户id，开始时间，护理项目，结束时间
CREATE TABLE IF NOT EXISTS nurseRecord(
	id INT AUTO_INCREMENT,
	nurseid INT NOT NULL,
	clientid INT NOT NULL,
	starttime TIMESTAMP,
	project VARCHAR(255),
	endtime TIMESTAMP,
	PRIMARY KEY(id)
	)ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- 考勤表 nurseAttendence
-- 日期，护工id，上班打卡时间，下班打卡时间
CREATE TABLE IF NOT EXISTS nurseAttendence(
	id INT AUTO_INCREMENT,
	workdate DATETIME,
	nurseid INT NOT NULL,
	starttime TIMESTAMP,
	endtime TIMESTAMP,
	PRIMARY KEY(id)
	)ENGINE=InnoDB DEFAULT CHARSET=utf8;
	

-- 请假表 nurseLeave
-- 护工id，请假时间，请假原因，请假时长，状态
CREATE TABLE IF NOT EXISTS nurseLeave(
	id INT AUTO_INCREMENT,
	nurseid INT NOT NULL,
	leavetime TIMESTAMP,
	reason VARCHAR(255),
	returntime TIMESTAMP,
	PRIMARY KEY(id)
	)ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- 用户表 users
-- 客户id，用户名，密码
CREATE TABLE IF NOT EXISTS users(
	id INT AUTO_INCREMENT,
	clientid INT NOT NULL,
	username VARCHAR(255) NOT NULL,
	userpassword VARCHAR(255) NOT NULL,
	PRIMARY KEY(id)
	)ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- 用户评价表 userEvaluate
-- 护工id，客户id，评分，备注
CREATE TABLE IF NOT EXISTS userEvaluate(
	id INT AUTO_INCREMENT,
	nurseid INT NOT NULL,
	clientid INT NOT NULL,
	mark INT NOT NULL,
	remark VARCHAR(255),
	PRIMARY KEY(id)
	)ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- 用户暂离表 userLeave
-- 客户id，离开时间，原因，陪同人员，陪同人员紧急联系方式，返院时间
CREATE TABLE IF NOT EXISTS userLeave(
	id INT AUTO_INCREMENT,
	clientid INT NOT NULL,
	leavetime TIMESTAMP,
	reason VARCHAR(255),
	escortman VARCHAR(255),
	escortphone VARCHAR(255),
	returntime TIMESTAMP,
	PRIMARY KEY(id)
	)ENGINE=InnoDB DEFAULT CHARSET=utf8;
	

-- 管理员表 admins
-- 管理员登录名，管理员登陆密码
CREATE TABLE IF NOT EXISTS admins(
	id INT AUTO_INCREMENT,
	adminname VARCHAR(255) NOT NULL,
	adminpassword VARCHAR(255) NOT NULL,
	PRIMARY KEY(id)
	)ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- 菜单表 menu
-- 热量，蛋白质，脂肪，胆固醇，碳水化合物，膳食纤维，钠，备注
CREATE TABLE IF NOT EXISTS menu(
	id INT AUTO_INCREMENT,
	calories DOUBLE NOT NULL,
	protein DOUBLE,
	fat DOUBLE,
	cholesterol DOUBLE,
	carbohydrate DOUBLE,
	DT DOUBLE,
	na DOUBLE,
	remark DOUBLE,
	PRIMARY KEY(id)
	)ENGINE=InnoDB DEFAULT CHARSET=utf8;
	

-- 体检表 healthExam 
-- 血糖，血脂，血压，血常规，尿常规，骨密度，心电图，眼底，肝功，肾功，备注，时期
CREATE TABLE IF NOT EXISTS healthExam(
	id INT AUTO_INCREMENT,
	clientid INT NOT NULL,
	bloodglucose VARCHAR(255),
	bloodfat VARCHAR(255),
	bloodpressure VARCHAR(255),
	bloodroutine VARCHAR(255),
	urineroutine VARCHAR(255),
	BMD VARCHAR(255),
	ECG VARCHAR(255),
	eyeground VARCHAR(255),
	liverfunction VARCHAR(255),
	renalfunction VARCHAR(255),
	remark VARCHAR(255),
	examdate TIMESTAMP NOT NULL,
	PRIMARY KEY(id)
	)ENGINE=InnoDB DEFAULT CHARSET=utf8;








