package com.kh.herb.review.model.dao;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.kh.herb.review.model.vo.Review;

@Repository
public class ReviewDAO {
	
	@Autowired
	private SqlSessionTemplate sqlSession;
	
	public int reviewInsert(Review review) {
		int result = sqlSession.insert("Review.reviewInsert", review);
		return result;
	}
}
