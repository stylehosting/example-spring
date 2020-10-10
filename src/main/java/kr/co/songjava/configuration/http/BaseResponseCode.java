package kr.co.songjava.configuration.http;

public enum BaseResponseCode {

	SUCCESS(200), // 성공
	ERROR(500), // 실패
	;
	
	private int status;
	
	BaseResponseCode(int status) {
		this.status = status;
	}
	
	public int status() {
		return status;
	}
	
}
