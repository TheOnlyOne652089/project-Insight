package gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JToolBar;
import java.awt.BorderLayout;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JSeparator;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import java.awt.Color;
import javax.swing.JSplitPane;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Toolkit;
import java.awt.Dimension;
import javax.swing.JTree;
import javax.swing.JDesktopPane;

public class MainGui {

	private JFrame frmProjectinsight;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainGui window = new MainGui();
					window.frmProjectinsight.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public MainGui() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmProjectinsight = new JFrame();
		frmProjectinsight.setIconImage(Toolkit.getDefaultToolkit().getImage(MainGui.class.getResource("/icons/onebit/onebit_18.png")));
		frmProjectinsight.setTitle("Project-Insight");
		frmProjectinsight.setBounds(100, 100, 700, 700);
		frmProjectinsight.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);

		JMenuBar menuBar = new JMenuBar();
		frmProjectinsight.setJMenuBar(menuBar);

		JMenu mnFileMenu = new JMenu("File");
		menuBar.add(mnFileMenu);

		JMenuItem mntmNew = new JMenuItem("New");
		mntmNew.setIcon(new ImageIcon(MainGui.class.getResource("/icons/onebit/onebit_31.png")));
		mnFileMenu.add(mntmNew);

		JSeparator separator = new JSeparator();
		mnFileMenu.add(separator);

		JMenuItem mntmExit = new JMenuItem("Exit");
		mntmExit.setIcon(new ImageIcon(MainGui.class.getResource("/icons/onebit/onebit_33.png")));
		mnFileMenu.add(mntmExit);

		JMenu mnHelp = new JMenu("Help");
		menuBar.add(mnHelp);

		JMenuItem mntmWelcome = new JMenuItem("Welcome");
		mntmWelcome.setIcon(new ImageIcon(MainGui.class.getResource("/icons/onebit/bonus48x48_21.png")));
		mnHelp.add(mntmWelcome);

		JSeparator separator_1 = new JSeparator();
		mnHelp.add(separator_1);

		JMenuItem mntmSearch = new JMenuItem("Search");
		mntmSearch.setIcon(new ImageIcon(MainGui.class.getResource("/icons/onebit/onebit_02 (2).png")));
		mnHelp.add(mntmSearch);

		JSeparator separator_2 = new JSeparator();
		mnHelp.add(separator_2);

		JMenuItem mntmAbout = new JMenuItem("About");
		mntmAbout.setIcon(new ImageIcon(MainGui.class.getResource("/icons/onebit/onebit_39.png")));
		mnHelp.add(mntmAbout);

		JToolBar toolBarMain = new JToolBar();
		frmProjectinsight.getContentPane().add(toolBarMain, BorderLayout.NORTH);

		JButton btnOpenConsole = new JButton("");
		btnOpenConsole.setActionCommand("openConsole");
		btnOpenConsole.setIcon(new ImageIcon(MainGui.class.getResource("/icons/onebit/onebit_22.png")));
		toolBarMain.add(btnOpenConsole);

		JButton btnOpenSettings = new JButton("");
		btnOpenSettings.setToolTipText("Settings");
		btnOpenSettings.setIcon(new ImageIcon(MainGui.class.getResource("/icons/onebit/onebit_09.png")));
		btnOpenSettings.setActionCommand("openSettings");
		toolBarMain.add(btnOpenSettings);

		JPanel panelMain = new JPanel();
		frmProjectinsight.getContentPane().add(panelMain, BorderLayout.CENTER);
		panelMain.setLayout(new BorderLayout(0, 0));

		JSplitPane splitPaneMain = new JSplitPane();
		splitPaneMain.setDividerSize(10);
		splitPaneMain.setOneTouchExpandable(true);
		panelMain.add(splitPaneMain, BorderLayout.CENTER);

		JTree tree = new JTree();
		splitPaneMain.setLeftComponent(tree);

		JDesktopPane desktopPane = new JDesktopPane();
		desktopPane.setBackground(new Color(255, 255, 255));
		desktopPane.setDragMode(1);
		splitPaneMain.setRightComponent(desktopPane);
	}

}
