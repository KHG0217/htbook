package com.ht.mapper;

import java.util.List;

import com.ht.book.domain.AttachImageVO;
import com.ht.book.domain.BookVO;
import com.ht.book.domain.CateVO;
import com.ht.common.Criteria;

public interface BookMapper {
	
	// 상품 등록
	public void bookEnroll(BookVO book);
	
	// 카테고리 리스트
	public List<CateVO> cateList();
	
	// 상품 리스트
	public List<BookVO> goodsGetList(Criteria cri);
	
	// 상품 총 개수
	public int goodsGetTotal(Criteria cri);
	
	// 상품 조회 페이지
	public BookVO goodsGetDetail(int bookId);
	
	// 상품 수정
	public int goodsModify(BookVO vo);
	
	// 상품 정보 삭제
	public int goodsDelete(int bookId);
	
	// 이미지 등록
	public void imageEnroll(AttachImageVO vo);
	
	// 지정 상품 이미지 전체 삭제
	public void deleteImageAll(int bookId);
	
	// 어제자 날짜 이미지 리스트
	public List<AttachImageVO> checkFileList();
	
	// 지정 상품 이미지 정보 얻기
	public List<AttachImageVO> getAttachInfo(int bookId);
	
}