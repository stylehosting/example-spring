package test.common.lang3;

import org.apache.commons.lang3.BooleanUtils;
import org.apache.commons.lang3.ObjectUtils;
import org.apache.commons.lang3.RandomStringUtils;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.math.NumberUtils;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TestCommonLang3 {

	Logger logger = LoggerFactory.getLogger(getClass());
	
	@Test
	public void test() {
		
		/**
		 * StringUtils 클래스
		 * null, 공백체크 조건절이 사라짐. (불필요 코드가 줄어들고 직관적인 효과)
		 */
		logger.debug("isEmpty1 : {}", StringUtils.isEmpty(""));
		logger.debug("isEmpty2 : {}", StringUtils.isEmpty(null));
		logger.debug("isEmpty3 : {}", StringUtils.isEmpty("test"));
		logger.debug("isNotEmpty1 : {}", StringUtils.isNotEmpty(""));
		logger.debug("isNotEmpty2 : {}", StringUtils.isNotEmpty(null));
		logger.debug("isNotEmpty3 : {}", StringUtils.isNotEmpty("test"));
		
		/**
		 * NumberUtils 클래스
		 * String으로 넘어오는 데이터를 int, long, float, double로 변경시 유용
		 * null, 공백체크, 숫자 체크 등 (불필요 코드가 줄어들고 직관적인 효과)
		 */
		logger.debug("toInt1 : {}", NumberUtils.toInt(""));
		logger.debug("toInt2 : {}", NumberUtils.toInt("11b"));
		logger.debug("toInt3 : {}", NumberUtils.toInt("1"));
		logger.debug("toInt4 : {}", NumberUtils.toInt("12321312"));
		logger.debug("toLong : {}", NumberUtils.toLong("10000"));
		logger.debug("toFloat : {}", NumberUtils.toFloat("11.1"));
		logger.debug("toDouble : {}", NumberUtils.toDouble("233.23"));
		
		/**
		 * BooleanUtils 클래스
		 * 서비스단에서 repository 조회데이터 중복체크, 카운트 관련 데이터들을 boolean으로 리턴되게 사용하면 유용
		 * 쓸 때 없는 조건절이 모두 사라짐. (불필요 코드가 줄어들고 직관적인 효과)
		 */
		logger.debug("toBoolean1 : {}", BooleanUtils.toBoolean(0));
		logger.debug("toBoolean2 : {}", BooleanUtils.toBoolean(1));
		logger.debug("toBoolean3 : {}", BooleanUtils.toBoolean(2));
		
		/**
		 * form에서 넘어오는 radio, checkbox, select 등 (Y, N) 형태의 값을 boolean으로 체크시 유용
		 * 공백체크 등 쓸 때 없는 조건절이 모두 사라짐. (불필요 코드가 줄어들고 직관적인 효과)
		 */
		logger.debug("toBoolean4 : {}", BooleanUtils.toBoolean(""));
		logger.debug("toBoolean5 : {}", BooleanUtils.toBoolean("N"));
		logger.debug("toBoolean6 : {}", BooleanUtils.toBoolean("n"));
		logger.debug("toBoolean7 : {}", BooleanUtils.toBoolean("y"));
		logger.debug("toBoolean8 : {}", BooleanUtils.toBoolean("Y"));
		
		/**
		 * 비밀번호 초기화, 임시비밀번호, 휴대폰 인증코드, 휴면계정 해지 등에 임시값으로 유용한 유틸 클래스.
		 */
		logger.debug("randomAlphabetic : {}", RandomStringUtils.randomAlphabetic(10));
		logger.debug("randomAlphanumeric : {}", RandomStringUtils.randomAlphanumeric(10));
		logger.debug("randomNumeric : {}", RandomStringUtils.randomNumeric(5));
		
		logger.debug("isNotempty1 :{}", ObjectUtils.isNotEmpty(null));
	}
}
