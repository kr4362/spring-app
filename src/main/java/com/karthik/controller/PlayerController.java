package com.karthik.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.karthik.dao.Player;
import com.karthik.service.PlayerService;

@CrossOrigin(origins="*")
@RestController
public class PlayerController {
	
	@Autowired
	PlayerService playerService;

	@GetMapping("/listPlayer")
	public List<Player> getPlayers() 
	{
		
		return playerService.getPlayers();
		
		

	}
	
	
}
