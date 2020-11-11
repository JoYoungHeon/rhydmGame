import rhydmGame.Track;

public class Track {
  private String titleImage;			// ���� �κ� �̹���
  
  private String startImage;			// ���� ���� â ǥ�� �̹���
  
  private String gameImage;				// �ش� ���� �������� �� �̹���
  
  private String startMusic;			// ���� ���� â ����
  
  private String gameMusic;				// �ش� ���� ���� ���� �� ����
  
  private String titleName;				// ���� �̸� �̹���
  
  public String getTitleImage() {								// get, set �޼ҵ� ���
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
  
  public Track(String titleImage, String startImage, String gameImage, String startMusic, String gameMusic, String titleName) {		// Younger�� ���� �����ڸ� �������
    this.titleImage = titleImage;
    this.startImage = startImage;
    this.gameImage = gameImage;
    this.startMusic = startMusic;
    this.gameMusic = gameMusic;
    this.titleName = titleName;
  }
}