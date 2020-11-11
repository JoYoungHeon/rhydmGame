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
import javax.swing.JButton;��
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Younger extends JFrame {
	
}
	private Image screenImage; // ��üȭ�鿡 �̹����� ���� �� �ֵ��� ����

	private Graphics screenGraphic; // ��üȭ�鿡 GUI�� ǥ���� �� �ֵ��� ����

	private ImageIcon EnteredImage = new ImageIcon(Main.class.getResource("../rhydmGame.images/Entered.jpg")); // ������ ��
																												// �̹���
																												// ����

	private ImageIcon BasicImage = new ImageIcon(Main.class.getResource("../rhydmGame.images/Basic.jpg")); // �⺻���� �̹���
																											// ����

	private ImageIcon startButtonEnteredImage = new ImageIcon(
			Main.class.getResource("../rhydmGame.images/startButtonEntered.png")); // ���� ��ư ������ �� �̹��� ����

	private ImageIcon startButtonBasicImage = new ImageIcon(
			Main.class.getResource("../rhydmGame.images/startButtonBasic.png")); // ���� ��ư �̹��� ����

	private ImageIcon quitButtonEnteredImage = new ImageIcon(
			Main.class.getResource("../rhydmGame.images/quitButtonEntered.png")); // ������ ��ư ������ �� �̹��� ����

	private ImageIcon quitButtonBasicImage = new ImageIcon(
			Main.class.getResource("../rhydmGame.images/quitButtonBasic.png")); // ������ ��ư �̹��� ����

	private ImageIcon leftButtonEnteredImage = new ImageIcon(
			Main.class.getResource("../rhydmGame.images/leftButtonEntered.png")); // ���� ��ư ������ �� �̹��� ����

	private ImageIcon leftButtonBasicImage = new ImageIcon(
			Main.class.getResource("../rhydmGame.images/leftButtonBasic.png")); // ���� ��ư �̹��� ����

	private ImageIcon rightButtonEnteredImage = new ImageIcon(
			Main.class.getResource("../rhydmGame.images/rightButtonEntered.png")); // ������ ��ư ������ �� �̹��� ����

	private ImageIcon rightButtonBasicImage = new ImageIcon(
			Main.class.getResource("../rhydmGame.images/rightButtonBasic.png")); // ������ ��ư �̹��� ����

	private ImageIcon hardButtonEnteredImage = new ImageIcon(
			Main.class.getResource("../rhydmGame.images/hardButtonEntered.png")); // ����� ��ư ������ �� �̹��� ����

	private ImageIcon hardButtonBasicImage = new ImageIcon(
			Main.class.getResource("../rhydmGame.images/hardButtonBasic.png")); // ����� ��ư �̹��� ����

	private ImageIcon backButtonEnteredImage = new ImageIcon(
			Main.class.getResource("../rhydmGame.images/backButtonEntered.png")); // �ڷΰ��� ��ư ������ �� �̹��� ����

	private ImageIcon backButtonBasicImage = new ImageIcon(
			Main.class.getResource("../rhydmGame.images/backButtonBasic.png")); // �ڷΰ��� �̹��� ����

	private Image koreatitle = (new ImageIcon(Main.class.getResource("../rhydmGame.images/koreatitle.jpg"))).getImage(); // ����̹��� ����

	private Image gameInfoImage = new ImageIcon(Main.class.getResource("../rhydmGame.images/gameInfo.png")); // ���� ���� �̹��� ����

	private Image judgementLineImage = new ImageIcon(Main.class.getResource("../rhydmGame.images/judgementLineImage.png")); // ���� �̹��� ����

	private JLabel menuBar = new JLabel(new ImageIcon(Main.class.getResource("../rhydmGame.images/menuBar.png"))); // �޴��� �̹��� ����
																													

	private JButton exitButton = new JButton(BasicImage); // �����ϱ� ��ư �ʱ�ȭ

	private JButton startButton = new JButton(startButtonBasicImage); // �����ϱ� ��ư �ʱ�ȭ

	private JButton quitButton = new JButton(quitButtonBasicImage); // ������ ��ư �ʱ�ȭ

	private JButton leftButton = new JButton(leftButtonBasicImage); // ���� ��ư �ʱ�ȭ

	private JButton rightButton = new JButton(rightButtonBasicImage); // ������ ��ư �ʱ�ȭ

	private JButton hardButton = new JButton(hardButtonBasicImage); // ����� ��ư �ʱ�ȭ

	private JButton backButton = new JButton(backButtonBasicImage); // �ڷΰ��� ��ư �ʱ�ȭ

	private int mouseX; // ���콺 X ��ǥ

	private int mouseY; // ���콺 Y ��ǥ

	private boolean isMainScreen = false; // ����ȭ������ �Ѿ�Դ����� ���� ����

	private boolean isGameScreen = false; // ����ȭ������ �Ѿ�Դ����� ���� ����

	ArrayList<Track> trackList = new ArrayList<>(); // �� Ʈ���� ���� �� �ִ� ����Ʈ ����

	private Image titleImage; // ���� ���õǴ� �κе�

	private Image selectedImage; // ""

	private Music selectedMusic; // ""

	private Music intro = new Music("intro.mp3", true);

	private int nowSelected = 0; // 0�� �־� ù��° ������ �˰� ��, ���� ���õ� Ʈ���� ���� �ǹ�

	public static Game game = new Game();	// �� �����̶�� ������ ���� ��ü���� ���� �� �ִ� ����

	public Younger() {																									// Track���� ������� �����ڿ� �´� ���ǰ� ������ �־��� (�ε��� 0 > 1 > 2)
    trackList.add(new Track("minco.png", "minco Selected.jpg", "minco gameImage.jpg ", 
          "mincho Selected.mp3", "mincho.mp3", "- mc ��������"));
    trackList.add(new Track("bullhandang.png", "bullhandang StartImage.jpg", "bullhandang gameImage.jpg", 
          "intro Selected.mp3", "intro.mp3", "- �̾���, PŸ��, ����, MC ��Ÿ"));
    trackList.add(new Track("jackdoo.png", "jackdoo StartImage.jpg", "jackdoo gameImage.jpg ", 
          "jackdoo Selected.mp3", "jackdoo.mp3", "- VMC ũ��"));
    setUndecorated(true);																// ���� ����� �⺻������ �����ϴ� �޴��ٰ� ������ �ʰ� ��
    setTitle("Younger");																// ���� �̸� ����
    setSize(Main.SCREEN_WIDTH, Main.SCREEN_HEIGHT);																	// ���� â ������ ����
    setResizable(false);																// ���� â ũ�� ���� ���� �Ұ�
    setLocationRelativeTo(null);														// ���� ����� ȭ�� �߾� ��ġ
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);										// ��üȭ�鿡 �̹����� �����
    setVisible(true);																	// ���� â ���
    setBackground(new Color(0, 0, 0, 0));												// ����� ������� �ٲ���
    setLayout(null);																	// JLabel �� �� ��ġ �״�� �����ϰ� ��
    
    addKeyListener(new KeyListener());													// Ű�����ʸ� �����ش�
    
    intro.start();																	// ��Ʈ�� ���
    exitButton.setBounds(1245, 0, 30, 30);											// �����ϱ� ��ư ��ġ�� ũ�� ����
    exitButton.setBorderPainted(false);											// �����ϱ� ��ư �׵θ� ����
    exitButton.setContentAreaFilled(false);										// �����ϱ� ��ư ��� ���� ǥ�� ����
    exitButton.setFocusPainted(false);												// �����ϱ� ��ư ��Ŀ�� ǥ�� ����
    exitButton.addMouseListener(new MouseAdapter() {								// ���콺 �̺�Ʈ ó��
    	@Override
    	public void mouseEntered(MouseEvent e) {
    		exitButton.setIcon(exitButtonEnteredImage);
    	}
    	@Override
    	public void mouseEntered(MouseEvent e) {
    		exitButton.setIcon(exitButtonBasicImage);
    	}
    });
    add(exitButton);																// �����ϱ� ��ư �߰�
    
    startButton.setBounds(900, 200, 400, 100);										// �����ϱ� ��ư ��ġ�� ũ�� ����
    startButton.setBorderPainted(false);											// �����ϱ� ��ư �׵θ� ����
    startButton.setContentAreaFilled(false);										// �����ϱ� ��ư ��� ���� ǥ�� ����
    startButton.setFocusPainted(false);											// �����ϱ� ��ư ��Ŀ�� ǥ�� ����
    startButton.addMouseListener(new MouseAdapter() {								// ���콺 �̺�Ʈ ó��
    	@Override
    	public void mouseEntered(MouseEvent e) {
    		exitButton.setIcon(startButtonEnteredImage);
    	}
    	@Override
    	public void mouseEntered(MouseEvent e) {
    		startButton.setIcon(startButtonBasicImage);
    	}
    });
    add(startButton);																// �����ϱ� ��ư �߰�
    
    quitButton.setBounds(900, 330, 400, 100);										// ������ ��ư ��ġ�� ũ�� ����
    quitButton.setBorderPainted(false);											// ������ ��ư �׵θ� ����
    quitButton.setContentAreaFilled(false);										// ������ ��ư ��� ���� ǥ�� ����
    quitButton.setFocusPainted(false);												// ������ ��ư ��Ŀ�� ǥ�� ����
    quitButton.addMouseListener(new MouseAdapter() {								// ���콺 �̺�Ʈ ó��
    	@Override
    	public void mouseEntered(MouseEvent e) {
    		exitButton.setIcon(quitButtonEnteredImage);
    	}
    	@Override
    	public void mouseEntered(MouseEvent e) {
    		exitButton.setIcon(quitButtonBasicImage);
    	}
    });
    add(quitButton);																// ������ ��ư �߰�
    
    leftButton.setVisible(false);													// 
    leftButton.setBounds(140, 310, 60, 60);										// ���� ��ư ��ġ�� ũ�� ����
    leftButton.setBorderPainted(false);											// ���� ��ư �׵θ� ����
    leftButton.setContentAreaFilled(false);										// ���� ��ư ��� ���� ǥ�� ����
    leftButton.setFocusPainted(false);												// ���� ��ư ��Ŀ�� ǥ�� ����
    leftButton.addMouseListener(new MouseAdapter() {								// ���콺 �̺�Ʈ ó��
    	@Override
    	public void mouseEntered(MouseEvent e) {
    		exitButton.setIcon(leftButtonEnteredImage);
    	}
    	@Override
    	public void mouseEntered(MouseEvent e) {
    		exitButton.setIcon(leftButtonBasicImage);
    	}
    });
    add(leftButton);																// ���� ��ư �߰�
    
    rightButton.setVisible(false);													//
    rightButton.setBounds(1080, 310, 60, 60);										// ������ ��ư ��ġ�� ũ�� ����
    rightButton.setBorderPainted(false);											// ������ ��ư �׵θ� ����
    rightButton.setContentAreaFilled(false);										// ������ ��ư ��� ���� ǥ�� ����
    rightButton.setFocusPainted(false);											// ������ ��ư ��Ŀ�� ǥ�� ����
    rightButton.addMouseListener(new MouseAdapter() {								// ���콺 �̺�Ʈ ó��
    	@Override
    	public void mouseEntered(MouseEvent e) {
    		exitButton.setIcon(rightButtonEnteredImage);
    	}
    	@Override
    	public void mouseEntered(MouseEvent e) {
    		exitButton.setIcon(rightButtonBasicImage);
    	}
    });
    add(rightButton);																// ������ ��ư �߰�
    
    hardButton.setVisible(false);													// 
    hardButton.setBounds(525, 580, 250, 67);										// ����� ��ư ��ġ�� ũ�� ����
    hardButton.setBorderPainted(false);											// ����� ��ư �׵θ� ����
    hardButton.setContentAreaFilled(false);										// ����� ��ư ��� ���� ǥ�� ����
    hardButton.setFocusPainted(false);												// ����� ��ư ��Ŀ�� ǥ�� ����
    hardButton.addMouseListener(new MouseAdapter() {								// ���콺 �̺�Ʈ ó��
    	@Override
    	public void mouseEntered(MouseEvent e) {
    		exitButton.setIcon(hardButtonEnteredImage);
    	}
    	@Override
    	public void mouseEntered(MouseEvent e) {
    		exitButton.setIcon(hardButtonBasicImage);
    	}
    });
    add(hardButton);																// ����� ��ư �߰�
    
    backButton.setVisible(false);													// 
    backButton.setBounds(20, 50, 60, 60);											// �ڷΰ��� ��ư ��ġ�� ũ�� ����
    backButton.setBorderPainted(false);											// �ڷΰ��� ��ư �׵θ� ����
    backButton.setContentAreaFilled(false);										// �ڷΰ��� ��ư ��� ���� ǥ�� ����
    backButton.setFocusPainted(false);												// �ڷΰ��� ��ư ��Ŀ�� ǥ�� ����
    backButton.addMouseListener(new MouseAdapter() {								// ���콺 �̺�Ʈ ó��
    	@Override
    	public void mouseEntered(MouseEvent e) {
    		exitButton.setIcon(backButtonEnteredImage);
    	}
    	@Override
    	public void mouseEntered(MouseEvent e) {
    		exitButton.setIcon(backButtonBasicImage);
    	}
    });
    add(backButton);																// �ڷΰ��� ��ư �߰�
    
    menuBar.setBounds(0, 0, 1280, 30);												// �޴��� ��ư ��ġ�� ũ�� ����
    add(menuBar);																	// �޴��� ��ư �߰�

	public void paint(Graphics g) {
		screenImage = createImage(1280, 720);
		screenGraphic = screenImage.getGraphics();
		screenDraw((Graphics2D) screenGraphic);
		g.drawImage(screenImage, 0, 0, null);
	}

	public void screenDraw(Graphics2D g) {
		g.drawImage(koreatitle, 0, 0, null); // ���ȭ�� ��ġ ����
		if (isMainScreen) {
			g.drawImage(selectedImage, 340, 100, null); // ����ȭ�� �̹��� ��ġ ����
			g.drawImage(titleImage, 340, 100, null); // Ÿ��Ʋ �̹��� ��ġ ����
		}
		if (isGameScreen) {
			g.drawImage(gameInfoImage, 0, 660, null);
			g.drawImage(judgementLineImage, 0, 580, null);
		}
		paintComponents(g); // JLabel�� �׷��ְ� ������ �̹����� ������ �� ���
		try {
			Thread.sleep(5L);
		} catch (Exception e) {
			e.printStackTrace();
		}
		repaint();
	}

	public void selectTrack(int nowSelected) { // ���õ� ���� ��ȣ�� �־� ���� ���õ� ���� �˸�
		if (selectedMusic != null) // ���� ����ǰ� ���� �� �ٷ� ���� ���� ��
			selectedMusic.close();
		titleImage = (new ImageIcon(
				Main.class.getResource("../rhydmGame.images/" + ((Track) trackList.get(nowSelected)).getTitleImage())))
						.getImage(); // ���� ���õ� ���� ������ �ִ� Ÿ��Ʋ �̹��� ���� ������ �ͼ� �־���
		selectedImage = (new ImageIcon(
				Main.class.getResource("../rhydmGame.images/" + ((Track) trackList.get(nowSelected)).getStartImage())))
						.getImage(); // ���� ���� ����
		selectedMusic = new Music(((Track) trackList.get(nowSelected)).getStartMusic(), true); // ���� ���õ� ���� ������ �� �� true
																								// ������ ���� ����� �ݺ���
		selectedMusic.start();
	}

	public void selectLeft() { // 0��° ���� �� tracklist�� ������� 1�� ���� �� ���(�������� �̵�)
		if (nowSelected == 0) {
			nowSelected = trackList.size() - 1;
		} else {
			nowSelected--;
		}
		selectTrack(nowSelected);
	}

	public void selectRight() { // ���� ��Ȳ�� �ݴ�
		if (nowSelected == trackList.size() - 1) {
			nowSelected = 0;
		} else {
			nowSelected++;
		}
		selectTrack(nowSelected);
	}

	public void gameStart(int nowSelected, String difficulty) { // ������ ���� ���̵� ����
		if (selectedMusic != null) // � ������ ��� ���� �� ���� ������
			selectedMusic.close();
		isMainScreen = false; // ����ȭ�� X
		leftButton.setVisible(false); // ���� ��ư X
		rightButton.setVisible(false); // ������ ��ư X
		hardButton.setVisible(false); // ����� ��ư X
		koreatitle = (new ImageIcon(
				Main.class.getResource("../rhydmGame.images/" + ((Track) trackList.get(nowSelected)).getGameImage())))
						.getImage(); // ���� ���õ� � ���� �̹����� �ҷ���
		backButton.setVisible(true);
		isGameScreen = true; // ���ư��� ��ư O
		game = new Game(((Track) trackList.get(nowSelected)).getTitleName(), difficulty,
				((Track) trackList.get(nowSelected)).getGameMusic());
		game.start();
		setFocusable(true);
		requestFocus();
	}

	public void backMain() {
		isMainScreen = true; // ����ȭ�� O
		leftButton.setVisible(true); // ���� ��ư O
		rightButton.setVisible(true); // ������ ��ư O
		hardButton.setVisible(true); // ����� ��ư O
		koreatitle = (new ImageIcon(Main.class.getResource("../rhydmGame.images/mainBackground.jpg"))).getImage(); // ���ȭ��
																													// �̹�����
																													// �ҷ���
		backButton.setVisible(false); // ���ư��� ��ư X
		selectTrack(nowSelected); // ���� ���õ� Ʈ���� ������
		isGameScreen = false;
		game.close();
	}

	public void enterMain() {
		startButton.setVisible(false); // ���� ��ư X
		quitButton.setVisible(false); // ������ ��ư X
		koreatitle = (new ImageIcon(Main.class.getResource("../rhydmGame.images/mainBackground.jpg"))).getImage(); // ���ȭ��
																													// �̹���
																													// �ҷ���
		isMainScreen = true; // ����ȭ�� O
		leftButton.setVisible(true); // ���� ��ư O
		rightButton.setVisible(true); // ������ ��ư O
		hardButton.setVisible(true); // ����� ��ư O
		intro.close(); // ��Ʈ�� ����
		selectTrack(0); // 0��° ������ ���ƿ�
	}
}
