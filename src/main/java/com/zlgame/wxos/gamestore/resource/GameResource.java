package com.zlgame.wxos.gamestore.resource;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import org.springframework.beans.factory.annotation.Autowired;

import com.hmsonline.dropwizard.http.ResponseResult;
import com.zlgame.wxos.gamestore.model.Category;
import com.zlgame.wxos.gamestore.model.Game;
import com.zlgame.wxos.gamestore.service.GameService;

@Path("/games")
public class GameResource {

	@Autowired
	private GameService gameService;
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public ResponseResult getGames() {
		List<Game> games = gameService.getGames(0,50);
		ResponseResult respResult = ResponseResult.createResult(ResponseResult.RESULT_OK);
		respResult.setData(games);
		return respResult;
	}
	
/*	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Game> getPageGames(@QueryParam("startPage") int start,@QueryParam("pageSize") int size) {
		// Game game = gameService.
		List<Game> games = gameService.getGames(start,size);
		return games;
	}*/

	@Path("{id}")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Game getGame(@PathParam("id") String gameId) {
		// Game game = gameService.
		Game game = gameService.getGameByGameId(gameId);
		return game;
	}
	
	@Path("category")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public ResponseResult getGameCategroies(){
		List<Category> categroies = gameService.getAllCategories();
		ResponseResult respResult = ResponseResult.createResult(ResponseResult.RESULT_OK);
		respResult.setData(categroies);
		return respResult;
	}
	
	@Path("category/{categoryId}")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Game> getGameByCategroyId(@PathParam("categoryId") int categroyId, 
			@QueryParam("startPage") int start, @QueryParam("pageSize") int size){
		List<Game> games = gameService.getGamesByTypeId(categroyId, start, size);
		return games;
	}
	
}
