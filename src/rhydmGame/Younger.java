package rhydmGame;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.event.KeyListener;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JButton;ㄹ
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Younger extends JFrame {
	
}
	private Image screenImage; // 전체화면에 이미지를 넣을 수 있도록 해줌

	private Graphics screenGraphic; // 전체화면에 GUI를 표현할 수 있도록 해줌

	private ImageIcon EnteredImage = new ImageIcon(Main.class.getResource("../rhydmGame.images/Entered.jpg")); // 눌렀을 때
																												// 이미지
																												// 삽입

	private ImageIcon BasicImage = new ImageIcon(Main.class.getResource("../rhydmGame.images/Basic.jpg")); // 기본적인 이미지
																											// 삽입

	private ImageIcon startButtonEnteredImage = new ImageIcon(
			Main.class.getResource("../rhydmGame.images/startButtonEntered.png")); // 시작 버튼 눌렀을 때 이미지 삽입

	private ImageIcon startButtonBasicImage = new ImageIcon(
			Main.class.getResource("../rhydmGame.images/startButtonBasic.png")); // 시작 버튼 이미지 삽입

	private ImageIcon quitButtonEnteredImage = new ImageIcon(
			Main.class.getResource("../rhydmGame.images/quitButtonEntered.png")); // 나가기 버튼 눌렀을 때 이미지 삽입

	private ImageIcon quitButtonBasicImage = new ImageIcon(
			Main.class.getResource("../rhydmGame.images/quitButtonBasic.png")); // 나가기 버튼 이미지 삽입

	private ImageIcon leftButtonEnteredImage = new ImageIcon(
			Main.class.getResource("../rhydmGame.images/leftButtonEntered.png")); // 왼쪽 버튼 눌렀을 때 이미지 삽입

	private ImageIcon leftButtonBasicImage = new ImageIcon(
			Main.class.getResource("../rhydmGame.images/leftButtonBasic.png")); // 왼쪽 버튼 이미지 삽입

	private ImageIcon rightButtonEnteredImage = new ImageIcon(
			Main.class.getResource("../rhydmGame.images/rightButtonEntered.png")); // 오른쪽 버튼 눌렀을 때 이미지 삽입

	private ImageIcon rightButtonBasicImage = new ImageIcon(
			Main.class.getResource("../rhydmGame.images/rightButtonBasic.png")); // 오른쪽 버튼 이미지 삽입

	private ImageIcon hardButtonEnteredImage = new ImageIcon(
			Main.class.getResource("../rhydmGame.images/hardButtonEntered.png")); // 어려움 버튼 눌렀을 때 이미지 삽입

	private ImageIcon hardButtonBasicImage = new ImageIcon(
			Main.class.getResource("../rhydmGame.images/hardButtonBasic.png")); // 어려움 버튼 이미지 삽입

	private ImageIcon backButtonEnteredImage = new ImageIcon(
			Main.class.getResource("../rhydmGame.images/backButtonEntered.png")); // 뒤로가기 버튼 눌렀을 때 이미지 삽입

	private ImageIcon backButtonBasicImage = new ImageIcon(
			Main.class.getResource("../rhydmGame.images/backButtonBasic.png")); // 뒤로가기 이미지 삽입

	private Image koreatitle = (new ImageIcon(Main.class.getResource("../rhydmGame.images/koreatitle.jpg"))).getImage(); // 배경이미지 삽입

	private Image gameInfoImage = new ImageIcon(Main.class.getResource("../rhydmGame.images/gameInfo.png")); // 게임 정보 이미지 삽입

	private Image judgementLineImage = new ImageIcon(Main.class.getResource("../rhydmGame.images/judgementLineImage.png")); // 판정 이미지 삽입

	private JLabel menuBar = new JLabel(new ImageIcon(Main.class.getResource("../rhydmGame.images/menuBar.png"))); // 메뉴바 이미지 삽입
																													

	private JButton exitButton = new JButton(BasicImage); // 종료하기 버튼 초기화

	private JButton startButton = new JButton(startButtonBasicImage); // 시작하기 버튼 초기화

	private JButton quitButton = new JButton(quitButtonBasicImage); // 나가기 버튼 초기화

	private JButton leftButton = new JButton(leftButtonBasicImage); // 왼쪽 버튼 초기화

	private JButton rightButton = new JButton(rightButtonBasicImage); // 오른쪽 버튼 초기화

	private JButton hardButton = new JButton(hardButtonBasicImage); // 어려움 버튼 초기화

	private JButton backButton = new JButton(backButtonBasicImage); // 뒤로가기 버튼 초기화

	private int mouseX; // 마우스 X 좌표

	private int mouseY; // 마우스 Y 좌표

	private boolean isMainScreen = false; // 메인화면으로 넘어왔는지에 대한 변수

	private boolean isGameScreen = false; // 게임화면으로 넘어왔는지에 대한 변수

	ArrayList<Track> trackList = new ArrayList<>(); // 곡 트랙을 담을 수 있는 리스트 생성

	private Image titleImage; // 곡이 선택되는 부분들

	private Image selectedImage; // ""

	private Music selectedMusic; // ""

	private Music intro = new Music("intro.mp3", true);

	private int nowSelected = 0; // 0을 넣어 첫번째 곡임을 알게 함, 현재 선택된 트랙의 곡을 의미

	public static Game game = new Game();	// 이 게임이라는 변수는 게임 전체에서 사용될 수 있는 변수

	public Younger() {																									// Track에서 만들어준 생성자에 맞는 음악과 사진을 넣어줌 (인덱스 0 > 1 > 2)
    trackList.add(new Track("minco.png", "minco Selected.jpg", "minco gameImage.jpg ", 
          "mincho Selected.mp3", "mincho.mp3", "- mc 스나이퍼"));
    trackList.add(new Track("bullhandang.png", "bullhandang StartImage.jpg", "bullhandang gameImage.jpg", 
          "intro Selected.mp3", "intro.mp3", "- 넋업샨, P타입, 나찰, MC 메타"));
    trackList.add(new Track("jackdoo.png", "jackdoo StartImage.jpg", "jackdoo gameImage.jpg ", 
          "jackdoo Selected.mp3", "jackdoo.mp3", "- VMC 크루"));
    setUndecorated(true);																// 게임 실행시 기본적으로 존재하는 메뉴바가 보이지 않게 함
    setTitle("Younger");																// 게임 이름 설정
    setSize(Main.SCREEN_WIDTH, Main.SCREEN_HEIGHT);																	// 게임 창 사이즈 설정
    setResizable(false);																// 게임 창 크기 임의 변경 불가
    setLocationRelativeTo(null);														// 게임 실행시 화면 중앙 배치
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);										// 전체화면에 이미지를 담아줌
    setVisible(true);																	// 게임 창 출력
    setBackground(new Color(0, 0, 0, 0));												// 배경을 흰색으로 바꿔줌
    setLayout(null);																	// JLabel 등 제 위치 그대로 유지하게 함
    
    addKeyListener(new KeyListener());													// 키리스너를 더해준다
    
    intro.start();																	// 인트로 재생
    exitButton.setBounds(1245, 0, 30, 30);											// 종료하기 버튼 위치와 크기 설정
    exitButton.setBorderPainted(false);											// 종료하기 버튼 테두리 설정
    exitButton.setContentAreaFilled(false);										// 종료하기 버튼 배경 영역 표시 설정
    exitButton.setFocusPainted(false);												// 종료하기 버튼 포커스 표시 설정
    exitButton.addMouseListener(new MouseAdapter() {								// 마우스 이벤트 처리
    	@Override
    	public void mouseEntered(MouseEvent e) {
    		exitButton.setIcon(exitButtonEnteredImage);
    	}
    	@Override
    	public void mouseEntered(MouseEvent e) {
    		exitButton.setIcon(exitButtonBasicImage);
    	}
    });
    add(exitButton);																// 종료하기 버튼 추가
    
    startButton.setBounds(900, 200, 400, 100);										// 시작하기 버튼 위치와 크기 설정
    startButton.setBorderPainted(false);											// 시작하기 버튼 테두리 설정
    startButton.setContentAreaFilled(false);										// 시작하기 버튼 배경 영역 표시 설정
    startButton.setFocusPainted(false);											// 시작하기 버튼 포커스 표시 설정
    startButton.addMouseListener(new MouseAdapter() {								// 마우스 이벤트 처리
    	@Override
    	public void mouseEntered(MouseEvent e) {
    		exitButton.setIcon(startButtonEnteredImage);
    	}
    	@Override
    	public void mouseEntered(MouseEvent e) {
    		startButton.setIcon(startButtonBasicImage);
    	}
    });
    add(startButton);																// 시작하기 버튼 추가
    
    quitButton.setBounds(900, 330, 400, 100);										// 나가기 버튼 위치와 크기 설정
    quitButton.setBorderPainted(false);											// 나가기 버튼 테두리 설정
    quitButton.setContentAreaFilled(false);										// 나가기 버튼 배경 영역 표시 설정
    quitButton.setFocusPainted(false);												// 나가기 버튼 포커스 표시 설정
    quitButton.addMouseListener(new MouseAdapter() {								// 마우스 이벤트 처리
    	@Override
    	public void mouseEntered(MouseEvent e) {
    		exitButton.setIcon(quitButtonEnteredImage);
    	}
    	@Override
    	public void mouseEntered(MouseEvent e) {
    		exitButton.setIcon(quitButtonBasicImage);
    	}
    });
    add(quitButton);																// 나가기 버튼 추가
    
    leftButton.setVisible(false);													// 
    leftButton.setBounds(140, 310, 60, 60);										// 왼쪽 버튼 위치와 크기 설정
    leftButton.setBorderPainted(false);											// 왼쪽 버튼 테두리 설정
    leftButton.setContentAreaFilled(false);										// 왼쪽 버튼 배경 영역 표시 설정
    leftButton.setFocusPainted(false);												// 왼쪽 버튼 포커스 표시 설정
    leftButton.addMouseListener(new MouseAdapter() {								// 마우스 이벤트 처리
    	@Override
    	public void mouseEntered(MouseEvent e) {
    		exitButton.setIcon(leftButtonEnteredImage);
    	}
    	@Override
    	public void mouseEntered(MouseEvent e) {
    		exitButton.setIcon(leftButtonBasicImage);
    	}
    });
    add(leftButton);																// 왼쪽 버튼 추가
    
    rightButton.setVisible(false);													//
    rightButton.setBounds(1080, 310, 60, 60);										// 오른쪽 버튼 위치와 크기 설정
    rightButton.setBorderPainted(false);											// 오른쪽 버튼 테두리 설정
    rightButton.setContentAreaFilled(false);										// 오른쪽 버튼 배경 영역 표시 설정
    rightButton.setFocusPainted(false);											// 오른쪽 버튼 포커스 표시 설정
    rightButton.addMouseListener(new MouseAdapter() {								// 마우스 이벤트 처리
    	@Override
    	public void mouseEntered(MouseEvent e) {
    		exitButton.setIcon(rightButtonEnteredImage);
    	}
    	@Override
    	public void mouseEntered(MouseEvent e) {
    		exitButton.setIcon(rightButtonBasicImage);
    	}
    });
    add(rightButton);																// 오른쪽 버튼 추가
    
    hardButton.setVisible(false);													// 
    hardButton.setBounds(525, 580, 250, 67);										// 어려움 버튼 위치와 크기 설정
    hardButton.setBorderPainted(false);											// 어려움 버튼 테두리 설정
    hardButton.setContentAreaFilled(false);										// 어려움 버튼 배경 영역 표시 설정
    hardButton.setFocusPainted(false);												// 어려움 버튼 포커스 표시 설정
    hardButton.addMouseListener(new MouseAdapter() {								// 마우스 이벤트 처리
    	@Override
    	public void mouseEntered(MouseEvent e) {
    		exitButton.setIcon(hardButtonEnteredImage);
    	}
    	@Override
    	public void mouseEntered(MouseEvent e) {
    		exitButton.setIcon(hardButtonBasicImage);
    	}
    });
    add(hardButton);																// 어려움 버튼 추가
    
    backButton.setVisible(false);													// 
    backButton.setBounds(20, 50, 60, 60);											// 뒤로가기 버튼 위치와 크기 설정
    backButton.setBorderPainted(false);											// 뒤로가기 버튼 테두리 설정
    backButton.setContentAreaFilled(false);										// 뒤로가기 버튼 배경 영역 표시 설정
    backButton.setFocusPainted(false);												// 뒤로가기 버튼 포커스 표시 설정
    backButton.addMouseListener(new MouseAdapter() {								// 마우스 이벤트 처리
    	@Override
    	public void mouseEntered(MouseEvent e) {
    		exitButton.setIcon(backButtonEnteredImage);
    	}
    	@Override
    	public void mouseEntered(MouseEvent e) {
    		exitButton.setIcon(backButtonBasicImage);
    	}
    });
    add(backButton);																// 뒤로가기 버튼 추가
    
    menuBar.setBounds(0, 0, 1280, 30);												// 메뉴바 버튼 위치와 크기 설정
    add(menuBar);																	// 메뉴바 버튼 추가

	public void paint(Graphics g) {
		screenImage = createImage(1280, 720);
		screenGraphic = screenImage.getGraphics();
		screenDraw((Graphics2D) screenGraphic);
		g.drawImage(screenImage, 0, 0, null);
	}

	public void screenDraw(Graphics2D g) {
		g.drawImage(koreatitle, 0, 0, null); // 배경화면 위치 설정
		if (isMainScreen) {
			g.drawImage(selectedImage, 340, 100, null); // 선택화면 이미지 위치 설정
			g.drawImage(titleImage, 340, 100, null); // 타이틀 이미지 위치 설정
		}
		if (isGameScreen) {
			g.drawImage(gameInfoImage, 0, 660, null);
			g.drawImage(judgementLineImage, 0, 580, null);
		}
		paintComponents(g); // JLabel을 그려주고 고정된 이미지를 구현할 때 사용
		try {
			Thread.sleep(5L);
		} catch (Exception e) {
			e.printStackTrace();
		}
		repaint();
	}

	public void selectTrack(int nowSelected) { // 선택된 곡의 번호를 넣어 곡이 선택된 것을 알림
		if (selectedMusic != null) // 곡이 실행되고 있을 때 바로 종료 시켜 줌
			selectedMusic.close();
		titleImage = (new ImageIcon(
				Main.class.getResource("../rhydmGame.images/" + ((Track) trackList.get(nowSelected)).getTitleImage())))
						.getImage(); // 현재 선택된 곡이 가지고 있는 타이틀 이미지 값을 가지고 와서 넣어줌
		selectedImage = (new ImageIcon(
				Main.class.getResource("../rhydmGame.images/" + ((Track) trackList.get(nowSelected)).getStartImage())))
						.getImage(); // 위와 같은 원리
		selectedMusic = new Music(((Track) trackList.get(nowSelected)).getStartMusic(), true); // 현재 선택된 곡을 가지고 온 후 true
																								// 값으로 무한 재생을 반복함
		selectedMusic.start();
	}

	public void selectLeft() { // 0번째 곡일 때 tracklist의 사이즈에서 1을 빼준 값 출력(왼쪽으로 이동)
		if (nowSelected == 0) {
			nowSelected = trackList.size() - 1;
		} else {
			nowSelected--;
		}
		selectTrack(nowSelected);
	}

	public void selectRight() { // 위의 상황과 반대
		if (nowSelected == trackList.size() - 1) {
			nowSelected = 0;
		} else {
			nowSelected++;
		}
		selectTrack(nowSelected);
	}

	public void gameStart(int nowSelected, String difficulty) { // 선택한 곡의 난이도 설정
		if (selectedMusic != null) // 어떤 음악이 재생 중일 때 종료 시켜줌
			selectedMusic.close();
		isMainScreen = false; // 메인화면 X
		leftButton.setVisible(false); // 왼쪽 버튼 X
		rightButton.setVisible(false); // 오른쪽 버튼 X
		hardButton.setVisible(false); // 어려움 버튼 X
		koreatitle = (new ImageIcon(
				Main.class.getResource("../rhydmGame.images/" + ((Track) trackList.get(nowSelected)).getGameImage())))
						.getImage(); // 현재 선택된 곡에 대한 이미지를 불러옴
		backButton.setVisible(true);
		isGameScreen = true; // 돌아가기 버튼 O
		game = new Game(((Track) trackList.get(nowSelected)).getTitleName(), difficulty,
				((Track) trackList.get(nowSelected)).getGameMusic());
		game.start();
		setFocusable(true);
		requestFocus();
	}

	public void backMain() {
		isMainScreen = true; // 메인화면 O
		leftButton.setVisible(true); // 왼쪽 버튼 O
		rightButton.setVisible(true); // 오른쪽 버튼 O
		hardButton.setVisible(true); // 어려움 버튼 O
		koreatitle = (new ImageIcon(Main.class.getResource("../rhydmGame.images/mainBackground.jpg"))).getImage(); // 배경화면
																													// 이미지를
																													// 불러옴
		backButton.setVisible(false); // 돌아가기 버튼 X
		selectTrack(nowSelected); // 현재 선택된 트랙을 보여줌
		isGameScreen = false;
		game.close();
	}

	public void enterMain() {
		startButton.setVisible(false); // 시작 버튼 X
		quitButton.setVisible(false); // 나가기 버튼 X
		koreatitle = (new ImageIcon(Main.class.getResource("../rhydmGame.images/mainBackground.jpg"))).getImage(); // 배경화면
																													// 이미지
																													// 불러옴
		isMainScreen = true; // 메인화면 O
		leftButton.setVisible(true); // 왼쪽 버튼 O
		rightButton.setVisible(true); // 오른쪽 버튼 O
		hardButton.setVisible(true); // 어려움 버튼 O
		intro.close(); // 인트로 꺼짐
		selectTrack(0); // 0번째 곡으로 돌아옴
	}
}
