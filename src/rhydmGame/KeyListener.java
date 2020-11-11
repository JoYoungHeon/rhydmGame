package rhydmGame;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class KeyListener extends KeyAdapter {
    @Override
    public void keyPressed(KeyEvent e) {						// 키가 눌렸을 때 이벤트 처리 S,D,F,SPACE,J,K,L
    	if(Younger.game == null) {								// 게임이 진행되고 있지 않을 경우 리턴 시켜줌
    		return;
    	}
    	if(e.getKeyCode() == KeyEvent.VK_S) {
    		
    	}
    	else if(e.getKeyCode() == KeyEvent.VK_D) {
    		
    	}
    	else if(e.getKeyCode() == KeyEvent.VK_F) {
    		
    	}
    	else if(e.getKeyCode() == KeyEvent.VK_SPACE) {
    		
    	}
    	else if(e.getKeyCode() == KeyEvent.VK_J) {
    		
    	}
    	else if(e.getKeyCode() == KeyEvent.VK_K) {
    		
    	}
    	else if(e.getKeyCode() == KeyEvent.VK_L) {
    		
    	}
    }
    
    @Override
    public void keyReleased(KeyEvent e) {					// 위와 반대되는 상황
    	if(Younger.game == null) {								// 게임이 진행되고 있지 않을 경우 리턴 시켜줌
    		return;
    	}
    	if(e.getKeyCode() == KeyEvent.VK_S) {
    		
    	}
    	else if(e.getKeyCode() == KeyEvent.VK_D) {
    		
    	}
    	else if(e.getKeyCode() == KeyEvent.VK_F) {
    		
    	}
    	else if(e.getKeyCode() == KeyEvent.VK_SPACE) {
    		
    	}
    	else if(e.getKeyCode() == KeyEvent.VK_J) {
    		
    	}
    	else if(e.getKeyCode() == KeyEvent.VK_K) {
    		
    	}
    	else if(e.getKeyCode() == KeyEvent.VK_L) {
    		
    	}
    }
      
}
