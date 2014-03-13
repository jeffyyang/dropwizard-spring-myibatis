package com.zlgame.wxos.gamestore.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.zlgame.wxos.gamestore.dao.CategoryMapper;
import com.zlgame.wxos.gamestore.dao.CommentMapper;
import com.zlgame.wxos.gamestore.dao.GameImageMapper;
import com.zlgame.wxos.gamestore.dao.GameMapper;
import com.zlgame.wxos.gamestore.model.Category;
import com.zlgame.wxos.gamestore.model.Comment;
import com.zlgame.wxos.gamestore.model.Game;
import com.zlgame.wxos.gamestore.model.GameImage;


@Service
@Transactional
public class GameService {

	// private static Log log = LogFactory.getLog(QuestionService.class);
	@Autowired
	private GameMapper gameMapper;
	
	@Autowired
	private CategoryMapper gameCategoryMapper;
	
	@Autowired
	private CommentMapper gameCommentMapper;
	
	@Autowired
	private GameImageMapper gameImageMapper;	

	public List<Game> getGames(int start, int pageSize) {
		return gameMapper.findGames(start, pageSize);
	}
	
	public List<Game> getGamesByTypeId(int categoryId, int start, int pageSize) {
		
		return gameMapper.findGamesByCategoryId(String.valueOf(categoryId), start, pageSize);
	}
	
	@Cacheable(value = "Game_cache", key = "'Game_Id' + #gameId")
	public Game getGameByGameId(String gameId) {
		Game game = gameMapper.findGameById(gameId);
		if(game!=null){
			List<GameImage> images = gameImageMapper.findGameImageByGameId(gameId);
			game.setImages(images);
			List<Comment> comments = gameCommentMapper.findGameByGameId(gameId,0,50);
			game.setComments(comments);
		}
		return game;
	}		
	
	@Cacheable(value = "Game_cache", key = "'Game_Category_All'")
	public List<Category> getAllCategories() {
		List<Category> categories = gameCategoryMapper.findAllCategory();
		return categories;
	}	
}
