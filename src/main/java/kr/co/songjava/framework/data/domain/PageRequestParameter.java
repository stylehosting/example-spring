package kr.co.songjava.framework.data.domain;

import lombok.Data;

/**
 * 페이지 요청정보와 파라메터 정보.
 * @author 송자바
 * @param <T>
 */
@Data
public class PageRequestParameter<T> {

	private MySQLPageRequest pageRequest;
	private T parameter;
	
	public PageRequestParameter(MySQLPageRequest pageRequest, T parameter) {
		this.pageRequest = pageRequest;
		this.parameter = parameter;
	}
	
}
