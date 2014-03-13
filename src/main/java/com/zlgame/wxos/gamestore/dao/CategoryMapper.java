package com.zlgame.wxos.gamestore.dao;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.zlgame.wxos.gamestore.model.Game;
import com.zlgame.wxos.gamestore.model.Category;

public interface CategoryMapper {

	@Insert({
			"insert into Category(id,categoryId,key,wordNum,otherAnswer,tip,points,lang,task)",
			"values(#{id},#{categoryId},#{key},#{wordNum},#{otherAnswer},#{tip},#{points},#{lang},#{task})" })
	void insertGameType(Category gameType);

	@Select("SELECT * FROM Game WHERE categoryId = #{categoryId} ORDER BY id limit #{startPos}, #{offset} ")
	List<Game> findGameByCategoryId(@Param("categoryId") int categoryId,
			@Param("startPos") int startPos, @Param("offset") int offset);

	@Select("SELECT * FROM Category")
	List<Category> findAllCategory();
}
