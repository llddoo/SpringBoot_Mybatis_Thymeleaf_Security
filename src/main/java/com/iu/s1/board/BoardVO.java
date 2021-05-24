package com.iu.s1.board;

import java.sql.Date;

import lombok.Data;

/**
@Getter					//getter 메서드
@Setter					//setter 메서드
@ToString				//toString override
@NoArgsConstructor		//default 생성자
@AllArgsConstructor		//모든 매개변수가 있는 생성자
@RequiredArgsConstructor//필수 매개변수가 있는 생성자 생성
@EqualsAndHashCode		//hash, equals 메서드
*/
@Data					//lombok의 모든 annotation 선언
public class BoardVO {

	private Long num;
	private String title;
	private String writer;
	private String contents;
	private Date regDate;
	private Long hit;
	public Long getNum() {
		return num;
	}
	public void setNum(Long num) {
		this.num = num;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	public String getContents() {
		return contents;
	}
	public void setContents(String contents) {
		this.contents = contents;
	}
	public Date getRegDate() {
		return regDate;
	}
	public void setRegDate(Date regDate) {
		this.regDate = regDate;
	}
	public Long getHit() {
		return hit;
	}
	public void setHit(Long hit) {
		this.hit = hit;
	}
	
	
}
