package com.yeg.test.model;

public class Word {

	private String word;
	private String oldword;
	private String strokes;
	private String pinyin;
	private String radicals;
	private String explanation;
	private String more;

	public Word() {
		super();
	}

	public Word(String word, String oldword, String strokes, String pinyin,
			String radicals, String explanation, String more) {
		super();
		this.word = word;
		this.oldword = oldword;
		this.strokes = strokes;
		this.pinyin = pinyin;
		this.radicals = radicals;
		this.explanation = explanation;
		this.more = more;
	}

	public String getWord() {
		return word;
	}

	public void setWord(String word) {
		this.word = word;
	}

	public String getOldword() {
		return oldword;
	}

	public void setOldword(String oldword) {
		this.oldword = oldword;
	}

	public String getStrokes() {
		return strokes;
	}

	public void setStrokes(String strokes) {
		this.strokes = strokes;
	}

	public String getPinyin() {
		return pinyin;
	}

	public void setPinyin(String pinyin) {
		this.pinyin = pinyin;
	}

	public String getRadicals() {
		return radicals;
	}

	public void setRadicals(String radicals) {
		this.radicals = radicals;
	}

	public String getExplanation() {
		return explanation;
	}

	public void setExplanation(String explanation) {
		this.explanation = explanation;
	}

	public String getMore() {
		return more;
	}

	public void setMore(String more) {
		this.more = more;
	}

	@Override
	public String toString() {
		return "Word [ word=" + word + ", oldword=" + oldword + ", pinyin="
				+ pinyin + ", radicals=" + radicals + ", strokes=" + strokes
				+ ", explanation=" + explanation + ", more=" + more +
				"]";
	}

}
