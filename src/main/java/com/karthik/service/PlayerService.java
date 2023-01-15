package com.karthik.service;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.karthik.dao.Player;
import com.karthik.repo.PlayerRepository;

@Service
public class PlayerService {
	
	@Autowired
	PlayerRepository playerRepo;
	
	public List<Player> getPlayers()
	{
		return playerRepo.getPlayers();
	}

}
