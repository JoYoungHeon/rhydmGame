package rhydmGame;

import java.io.BufferedInputStream;			// 파일을 버퍼에 담아 가져오게 해주는 라이브러리 사용
import java.io.File;						// 파일을 불러오는 라이브러리 사용
import java.io.FileInputStream;				
import javazoom.jl.player.Player;			// 음원 재생을 위한 외부 라이브러리 사용
import rhydmGame.Main;
import rhydmGame.Music;

public class Music extends Thread {
  private Player player;
  
  private boolean isLoop;
  
  private File file;
  
  private FileInputStream fis;
  
  private BufferedInputStream bis;
  
  public Music(String name, boolean isLoop) {	// 곡의 제목과 그 곡이 무한 반복인지 여부를 확인
    try {
      this.isLoop = isLoop;
      this.file = new File(Main.class.getResource("../rhydmGame.music/" + name).toURI()); // toURI를 통해 해당 파일의 위치를 가져올 수 있게 해줌
      this.fis = new FileInputStream(this.file);
      this.bis = new BufferedInputStream(this.fis);
      this.player = new Player(this.bis);
    } catch (Exception e) {
      System.out.println(e.getMessage());
    } 
  }
  
  public int getTime() {					// 현재 실행되는 음악이 어디 위치인지를 알려줌
    if (this.player == null)
      return 0; 
    return this.player.getPosition();
  }
  
  public void close() {						// 사용자가 게임이나 음악이 맘에 들지 않는다면 음악을 종료할 수 있도록 해줌
    this.isLoop = false;
    this.player.close();
    interrupt();
  }
  
  public void run() {						//isLoop == true이면 무한 반복
    try {
      do {
        this.player.play();
        this.fis = new FileInputStream(this.file);
        this.bis = new BufferedInputStream(this.fis);
        this.player = new Player(this.bis);
      } while (this.isLoop);
    } catch (Exception e) {
      System.out.println(e.getMessage());
    } 
  }
}
