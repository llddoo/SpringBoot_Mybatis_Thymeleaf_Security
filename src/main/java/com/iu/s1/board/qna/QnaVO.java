package com.iu.s1.board.qna;

import java.util.List;

import com.iu.s1.board.BoardFileVO;
import com.iu.s1.board.BoardVO;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class QnaVO extends BoardVO {

	private long ref;
	private long step;
	private long depth;
	
	private List<BoardFileVO> files;

	public long getRef() {
		return ref;
	}

	public void setRef(long ref) {
		this.ref = ref;
	}

	public long getStep() {
		return step;
	}

	public void setStep(long step) {
		this.step = step;
	}

	public long getDepth() {
		return depth;
	}

	public void setDepth(long depth) {
		this.depth = depth;
	}

	public List<BoardFileVO> getFiles() {
		return files;
	}

	public void setFiles(List<BoardFileVO> files) {
		this.files = files;
	}
	
	
}
