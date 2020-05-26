package com.akiko.model.dao;

import java.util.List;

/**
 * @author dat18
 * @Date: 23-05-2020
 * 
 * Modification Logs
 * DATE   		AUTHOR 		DESCRIPTION
 * -----------------------------------------
 * 23-05-2020	DatNQ24		
 */
public interface ICategoryTypeDAO<T> {
	
public List<T> getAll() throws Exception;
	
	public T getAllById(long object) throws Exception;
	
	public void update(T object) throws Exception;
	
	public void insert(T object) throws Exception;
	
	public void delete(long id) throws Exception;
	
	public List<T> getNameById() throws Exception;
	
}
