package kr.co.songjava.mvc.domain;

import java.util.Date;

import lombok.Data;

@Data
public class Board {

	private int boardSeq;
	private String title;
	private String contents;
	private Date regDate;
	
}
