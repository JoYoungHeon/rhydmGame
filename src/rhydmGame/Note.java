package rhydmGame;
import java.awt.Graphics2D;
import java.awt.Image;
import javax.swing.ImageIcon;

public class Note extends Thread {
  private Image noteBasicImage = (new ImageIcon(Main.class.getResource("../rhydmGame/gameBasic.png"))).getImage();			// 노트 기본적인 이미지 삽입
  
  
  private int x, y = 580 - 1000/ Main.SLEEP_TIME * Main.NOTE_SPEED;						// 현재 상수에 따라 시작하는 위치는 120(메인 클래스)
  
  private String noteType;
  
  private boolean proceeded = true; 			// 현재 노트의 진행여부 체크
  
  public String getNoteType() {					// 게터함수 사용
    return noteType;
  }
  
  public boolean isProceeded() {
    return proceeded;
  }
  
  public void close() {							// 노트가 맞아서 움직이지 않으면 동작
    proceeded = false;
  }
  
  public Note(String noteType) {				// 노트타입에 따른 판정
    if (noteType.equals("S")) {
      x = 228;
    } else if (noteType.equals("D")) {
      x = 332;
    } else if (noteType.equals("F")) {
      x = 436;
    } else if (noteType.equals("Space")) {
      x = 540;
    } else if (noteType.equals("J")) {
      x = 744;
    } else if (noteType.equals("K")) {
      x = 848;
    } else if (noteType.equals("L")) {
      x = 952;
    } 
    noteType = noteType;
  }
  
  public void screenDraw(Graphics2D g) {
    if (noteType.equals("Space")) {
      g.drawImage(noteBasicImage, x, y, null);
      g.drawImage(noteBasicImage, x + 100, y, null);
    } else {
      g.drawImage(noteBasicImage, x, y, null);
    } 
  }
  
  public void drop() {							// 노트 판정 함수
    y += 10;
    if (y > 620) {
      System.out.println("Miss");
      close();
    } 
  }
  
  public void run() {
    try {
      while (true) {
        drop();
        if (proceeded) {
          Thread.sleep(10L);
          continue;
        } 
        break;
      } 
      interrupt();
    } catch (Exception e) {
      System.err.println(e.getMessage());
    } 
  }
  
  public String judge() {
    if (y >= 613) {
      System.out.println("Late");
      close();
      return "Late";
    } 
    if (y >= 600) {
      System.out.println("Good");
      close();
      return "Good";
    } 
    if (y >= 600) {
      System.out.println("Great");
      close();
      return "Great";
    } 
    if (y >= 587) {
      System.out.println("Good");
      close();
      return "Good";
    } 
    if (y >= 573) {
      System.out.println("Perfect");
      close();
      return "Perfect";
    } 
    if (y >= 565) {
      System.out.println("Great");
      close();
      return "Great";
    } 
    if (y >= 550) {
      System.out.println("Good");
      close();
      return "Good";
    } 
    if (y >= 535) {
      System.out.println("Early");
      close();
      return "Early";
    } 
    return "None";
  }
  
  public int getY() {
    return y;
  }
}
