package com.zlgame.wxos.gamestore.dao;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.zlgame.wxos.gamestore.model.Game;

public interface GameMapper {

	@Insert({
			"insert into Game(id,name,author,provider,thumbnail_url,url)",
			"values(#{id},#{categoryId},#{key},#{wordNum},#{otherAnswer},#{tip},#{points},#{lang},#{task})" })
	void insertGame(Game game);

	@Select("SELECT * FROM Game WHERE category_Id = #{category_Id} ORDER BY id limit #{startPos}, #{offset} ")
	List<Game> findGamesByCategoryId(@Param("categoryId") String categoryId,
			@Param("startPos") int startPos, @Param("offset") int offset);
	
	@Select({"SELECT id, name, thumbnail_url AS thumbnailUrl, url, categories, author, provider, description, ",
				"hot, rank, price, unit, publish_date AS publishDate, status",
			 "FROM Game ORDER BY id limit #{startPos}, #{offset} "})
	List<Game> findGames(@Param("startPos") int startPos, @Param("offset") int offset);
	
	@Select("SELECT * FROM Game WHERE id = #{id}")
	Game findGameById(@Param("id") String id);
}
