package com.karthik.service;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import org.mockito.junit.jupiter.MockitoExtension;

import com.karthik.dao.Player;
import com.karthik.repo.PlayerRepository;
import com.karthik.service.PlayerService;

@ExtendWith(MockitoExtension.class)
public class PlayerServiceTest {

	@Mock
	PlayerRepository playerRepo;
	
	@InjectMocks
	PlayerService playerService;
	
	@Test
	public void testGetPlayer() {
		System.out.println("Testing");
		when(playerService.getPlayers()).thenReturn(Arrays.asList(new Player("degea","gk","ESP"),new Player("Bruno","cam","POR"),new Player("rashy","st","ENG")));
		
		List<Player> result =playerService.getPlayers();
		assertEquals("degea",result.get(0).getName());
		
	}
	
	
}
