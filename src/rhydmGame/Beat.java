package rhydmGame;

import rhydmGame.Beat;

public class Beat {
  private int time;											// 타이밍
  
  private String noteName;									// 노트의 종류
  
  public int getTime() {									//get, set 메소드 사용
    return this.time;
  }
  
  public void setTime(int time) {
    this.time = time;
  }
  
  public String getNoteName() {
    return this.noteName;
  }
  
  public void setNoteName(String noteName) {
    this.noteName = noteName;
  }
  
  public Beat(int time, String noteName) {					// 생성자 생성
    this.time = time;
    this.noteName = noteName;
  }
}