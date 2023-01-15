package com.karthik.repo;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.karthik.dao.Player;

@Repository
public class PlayerRepository 
{
	
	public List<Player> getPlayers(){
		return Arrays.asList(new Player("degea","gk","ESP"),new Player("Bruno","cam","POR"),new Player("rashy","st","ENG"));
	}

}
