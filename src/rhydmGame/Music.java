package rhydmGame;

import java.io.BufferedInputStream;			// ������ ���ۿ� ��� �������� ���ִ� ���̺귯�� ���
import java.io.File;						// ������ �ҷ����� ���̺귯�� ���
import java.io.FileInputStream;				
import javazoom.jl.player.Player;			// ���� ����� ���� �ܺ� ���̺귯�� ���
import rhydmGame.Main;
import rhydmGame.Music;

public class Music extends Thread {
  private Player player;
  
  private boolean isLoop;
  
  private File file;
  
  private FileInputStream fis;
  
  private BufferedInputStream bis;
  
  public Music(String name, boolean isLoop) {	// ���� ����� �� ���� ���� �ݺ����� ���θ� Ȯ��
    try {
      this.isLoop = isLoop;
      this.file = new File(Main.class.getResource("../rhydmGame.music/" + name).toURI()); // toURI�� ���� �ش� ������ ��ġ�� ������ �� �ְ� ����
      this.fis = new FileInputStream(this.file);
      this.bis = new BufferedInputStream(this.fis);
      this.player = new Player(this.bis);
    } catch (Exception e) {
      System.out.println(e.getMessage());
    } 
  }
  
  public int getTime() {					// ���� ����Ǵ� ������ ��� ��ġ������ �˷���
    if (this.player == null)
      return 0; 
    return this.player.getPosition();
  }
  
  public void close() {						// ����ڰ� �����̳� ������ ���� ���� �ʴ´ٸ� ������ ������ �� �ֵ��� ����
    this.isLoop = false;
    this.player.close();
    interrupt();
  }
  
  public void run() {						//isLoop == true�̸� ���� �ݺ�
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
