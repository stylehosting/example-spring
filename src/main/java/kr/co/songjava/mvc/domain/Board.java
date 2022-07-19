package kr.co.songjava.mvc.domain;

import java.util.Date;

import lombok.Data;

/**
 * 게시물
 * @author 송자바
 */
@Data
public class Board {

	private int boardSeq;
	private BoardType boardType;
	private String title;
	private String contents;
	private Date regDate;
	
}
