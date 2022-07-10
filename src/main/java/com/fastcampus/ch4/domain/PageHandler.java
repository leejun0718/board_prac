package com.fastcampus.ch4.domain;

import java.util.Iterator;

public class PageHandler {
	int totalCnt; // 총 게시물 객수
	int pageSize; // 현 페이지의 크기
	int navSize = 10; // 페이지 내비게이션의 크기
	int totalPage; // 전체 페이지의 갯수
	int page; // 현재 페이지
	public int beginPage; // 내비게이션의 첫번째 페이지
	int endPage; // 내비게이션의 마지막 페이지
	boolean showPrev; // 이전페이지로 이동하는 링크를 보여줄 것인지 여부
	boolean showNext; // 다음페이지로 이동하는 링크를 보여줄 것인지 여부

	public PageHandler(int totalCnt , int page) {
		this.totalCnt =totalCnt;
		this.page = page;
		this.pageSize = 10;
		totalPage = (int)Math.ceil(totalCnt / pageSize);
		beginPage = page / navSize * navSize + 1;
		endPage = Math.min(beginPage + navSize-1, totalPage);
		showPrev = beginPage !=1;
		showNext = endPage !=totalCnt;
	}
	
	public PageHandler(int totalCnt, int page, int pageSize) {
		this.totalCnt = totalCnt;
		this.page = page;
		this.pageSize = pageSize;
		totalPage = (int)Math.ceil(totalCnt / pageSize);
		beginPage = page / navSize * navSize + 1;
		endPage = Math.min(beginPage + navSize-1, totalPage);
		showPrev = beginPage !=1;
		showNext = endPage !=totalCnt;
	}
	
	public void print() {
		System.out.println("page = " + page);
		System.out.print(showPrev ? "[PREV]" : "");
		
		for(int i = beginPage; i <= endPage; i++) {
			System.out.print(i+ " ");
			
		}
		System.out.println(showNext ? "[NEXT]" : " ");
	}

	@Override
	public String toString() {
		return "PageHandler [totalCnt=" + totalCnt + ", pageSize=" + pageSize + ", navSize=" + navSize + ", totalPage="
				+ totalPage + ", page=" + page + ", beginPage=" + beginPage + ", endPage=" + endPage + ", showPrev="
				+ showPrev + ", showNext=" + showNext + "]";
	}

	public int getTotalCnt() {
		return totalCnt;
	}

	public void setTotalCnt(int totalCnt) {
		this.totalCnt = totalCnt;
	}

	public int getPageSize() {
		return pageSize;
	}

	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}

	public int getNavSize() {
		return navSize;
	}

	public void setNavSize(int navSize) {
		this.navSize = navSize;
	}

	public int getTotalPage() {
		return totalPage;
	}

	public void setTotalPage(int totalPage) {
		this.totalPage = totalPage;
	}

	public int getPage() {
		return page;
	}

	public void setPage(int page) {
		this.page = page;
	}

	public int getBeginPage() {
		return beginPage;
	}

	public void setBeginPage(int beginPage) {
		this.beginPage = beginPage;
	}

	public int getEndPage() {
		return endPage;
	}

	public void setEndPage(int endPage) {
		this.endPage = endPage;
	}

	public boolean isShowPrev() {
		return showPrev;
	}

	public void setShowPrev(boolean showPrev) {
		this.showPrev = showPrev;
	}

	public boolean isShowNext() {
		return showNext;
	}

	public void setShowNext(boolean showNext) {
		this.showNext = showNext;
	}
	
	
	
	
}
