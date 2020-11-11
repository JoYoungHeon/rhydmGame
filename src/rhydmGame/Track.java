import rhydmGame.Track;

public class Track {
  private String titleImage;			// 제목 부분 이미지
  
  private String startImage;			// 게임 선택 창 표지 이미지
  
  private String gameImage;				// 해당 곡을 선택했을 때 이미지
  
  private String startMusic;			// 게임 선택 창 음악
  
  private String gameMusic;				// 해당 곡을 실행 헀을 때 음악
  
  private String titleName;				// 제목 이름 이미지
  
  public String getTitleImage() {								// get, set 메소드 사용
    return this.titleImage;
  }
  
  public void setTitleImage(String titleImage) {
    this.titleImage = titleImage;
  }
  
  public String getStartImage() {
    return this.startImage;
  }
  
  public void setStartImage(String startImage) {
    this.startImage = startImage;
  }
  
  public String getGameImage() {
    return this.gameImage;
  }
  
  public void setGameImage(String gameImage) {
    this.gameImage = gameImage;
  }
  
  public String getStartMusic() {
    return this.startMusic;
  }
  
  public void setStartMusic(String startMusic) {
    this.startMusic = startMusic;
  }
  
  public String getGameMusic() {
    return this.gameMusic;
  }
  
  public void setGameMusic(String gameMusic) {
    this.gameMusic = gameMusic;
  }
  
  public String getTitleName() {
    return this.titleName;
  }
  
  public void setTitleName(String titleName) {
    this.titleName = titleName;
  }
  
  public Track(String titleImage, String startImage, String gameImage, String startMusic, String gameMusic, String titleName) {		// Younger에 넣을 생성자를 만들어줌
    this.titleImage = titleImage;
    this.startImage = startImage;
    this.gameImage = gameImage;
    this.startMusic = startMusic;
    this.gameMusic = gameMusic;
    this.titleName = titleName;
  }
}