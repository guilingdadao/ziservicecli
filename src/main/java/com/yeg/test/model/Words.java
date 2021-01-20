package com.yeg.test.model;

public class Words {

	private String words;// 词语
	private String explanation;// 解释

	public Words() {
		super();
	}

	public String getWords() {
		return words;
	}

	public void setWords(String words) {
		this.words = words;
	}

	public String getExplanation() {
		return explanation;
	}

	public void setExplanation(String explanation) {
		this.explanation = explanation;
	}

	@Override
	public String toString() {
		return "Words [explanation=" + explanation + ", words=" + words + "]";
	}
}
