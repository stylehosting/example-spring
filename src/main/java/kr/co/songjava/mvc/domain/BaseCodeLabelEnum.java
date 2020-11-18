package kr.co.songjava.mvc.domain;

/**
 * 기본 CodeLabelEnum.
 * @author 송자바
 */
public interface BaseCodeLabelEnum {

	/**
	 * 코드를 리턴.
	 * @return
	 */
	String code();
	
	/**
	 * 라벨(코드명)을 리턴.
	 * @return
	 */
	String label();
	
}
