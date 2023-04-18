package com.myboot01.domain;

import java.util.Date;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

//@Data : @Getter, @Setter, @ToString, @RequiredArgsConstructor(모든 맴버 변수를 초기화하는 생성자를 만들어준다), @EqualsAndHashCode(equals(), hashCode()메서드를 만들어준다.)모두를 포함한다

@Getter //getter메소드를 만들어줌
@Setter //setter메소드를 만들어줌
@ToString //모든 맴버변수의 값을 문자열로 연결해 리턴하는 ToString 메소드를 만들어줌
public class BoardVO {
	
	private int seq;
	private String title;
	private String writer;
	private String content;
	private Date createDate=new Date();
	private int cnt=0;
	
	
//	public int getSeq() {
//		return seq;
//	}
//	public void setSeq(int seq) {
//		this.seq = seq;
//	}
//	public String getTitle() {
//		return title;
//	}
//	public void setTitle(String title) {
//		this.title = title;
//	}
//	public String getWriter() {
//		return writer;
//	}
//	public void setWriter(String writer) {
//		this.writer = writer;
//	}
//	public String getContent() {
//		return content;
//	}
//	public void setContent(String content) {
//		this.content = content;
//	}
//	public Date getCreateDate() {
//		return createDate;
//	}
//	public void setCreateDate(Date createDate) {
//		this.createDate = createDate;
//	}
//	public int getCnt() {
//		return cnt;
//	}
//	public void setCnt(int cnt) {
//		this.cnt = cnt;
//	}
	
	
	

}
