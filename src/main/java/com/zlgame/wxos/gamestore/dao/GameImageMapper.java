package com.zlgame.wxos.gamestore.dao;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.zlgame.wxos.gamestore.model.GameImage;

public interface GameImageMapper {

	@Insert({
			"insert into GameImage(gameId,width,length,imageUrl,size)",
			"values(#{gameId},#{width},#{length},#{imageUrl},#{size})" })
	void insertGameImage(GameImage game);

	@Select("SELECT * FROM GameImage WHERE gameId = #{gameId} ORDER BY id")
	List<GameImage> findGameImageByGameId(@Param("gameId") String gameId);

	@Select("SELECT * FROM GameImage")
	List<GameImage> findAllGameImage();
}
