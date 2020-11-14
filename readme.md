# (Back end) Spring Boot 쉽게 동영상 보면서 배우기
- E01 서버개발 프로젝트 생성 + Mybatis + MariaDB 연동 : https://youtu.be/AcbzhJoQ-OY
- E02 lombok설치 + Mybatis 설정 + 간단한 게시판 Api 구현 : https://youtu.be/YYlXmkpjRrU
- E03 Swagger 설치 + 게시판 API 문서화 : https://youtu.be/groXYLpRndI
- E04 공통 Response class, enum 사용하기 : https://youtu.be/kSII5YLTX2o
- E05 Spring Message(다국어) 설정 + ControllerAdvice 사용법 + 간편한 데이터 검증/예외처리 : https://youtu.be/UOUTNs_86o8
- E06 Interceptor, Logback 사용법
- E07 Mybatis + MariaDB 활용하여 10000건 이상의 데이터 초스피드로 INSERT
# 게시판 테이블 DDL

CREATE TABLE `T_BOARD` (
  `BOARD_SEQ` int(11) NOT NULL AUTO_INCREMENT,
  `TITLE` varchar(100) NOT NULL,
  `CONTENTS` text NOT NULL,
  `REG_DATE` datetime NOT NULL,
  PRIMARY KEY (`BOARD_SEQ`)
) ENGINE=InnoDB AUTO_INCREMENT=23 DEFAULT CHARSET=utf8 COMMENT='게시판';

# 게시판 테이블 샘플 QUERY

INSERT INTO T_BOARD (TITLE,CONTENTS,REG_DATE) VALUES
  ('테스트','테스트 컨텐츠','2020-10-06 23:17:38.0');