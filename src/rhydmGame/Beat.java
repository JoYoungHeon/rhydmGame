package rhydmGame;

import rhydmGame.Beat;

public class Beat {
  private int time;											// Ÿ�̹�
  
  private String noteName;									// ��Ʈ�� ����
  
  public int getTime() {									//get, set �޼ҵ� ���
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
  
  public Beat(int time, String noteName) {					// ������ ����
    this.time = time;
    this.noteName = noteName;
  }
}