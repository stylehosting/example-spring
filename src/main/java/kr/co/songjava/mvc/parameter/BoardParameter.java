package kr.co.songjava.mvc.parameter;

import kr.co.songjava.mvc.domain.BoardType;
import lombok.Data;

/**
 * 게시물 파라메터
 * @author 송자바
 */
@Data
public class BoardParameter {

	private int boardSeq;
	private BoardType boardType;
	private String title;
	private String contents;
	
	public BoardParameter() {
		
	}
	
	public BoardParameter(String title, String contents) {
		this.title = title;
		this.contents = contents;
	}

}
