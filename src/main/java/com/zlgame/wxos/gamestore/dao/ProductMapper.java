package com.zlgame.wxos.gamestore.dao;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.zlgame.wxos.gamestore.model.Product;

public interface ProductMapper {

	@Insert({ "insert into Product(id,categoryId,key,wordNum,otherAnswer,tip,points,lang,task)",
			"values(#{id},#{categoryId},#{key},#{wordNum},#{otherAnswer},#{tip},#{points},#{lang},#{task})" })
	void insertProduct(Product prodcut);

	@Select("SELECT * FROM Product WHERE categoryId = #{categoryId} ORDER BY id limit #{startPos}, #{offset} ")
	List<Product> findQuestionByCategoryId(@Param("categoryId") int categoryId ,@Param("startPos") int startPos, @Param("offset") int offset);

	@Select("SELECT * FROM Product")
	List<Product> getAllProduct();

	@Select("SELECT * FROM Product WHERE id = #{id}")
	Product findProductById(@Param("id") int id);	
}
