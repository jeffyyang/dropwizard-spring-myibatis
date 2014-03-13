package com.zlgame.wxos.gamestore.dao;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.zlgame.wxos.gamestore.model.Comment;
import com.zlgame.wxos.gamestore.model.Product;

public interface CommentMapper {

	@Insert({
			"insert into Comment(gameId,text,author)",
			"values(#{gameId},#{text},#{text},#{author})" })
	void insertGame(Comment comment);

	@Select("SELECT * FROM Comment WHERE gameId = #{gameId} ORDER BY id limit #{startPos}, #{offset} ")
	List<Comment> findGameByGameId(@Param("gameId") String gameId,
			@Param("startPos") int startPos, @Param("offset") int offset);
	
	@Select("SELECT * FROM Comment WHERE id = #{id}")
	Product findCommentById(@Param("id") int id);
}
