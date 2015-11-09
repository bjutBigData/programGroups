/**
 * Created by mohaowen on 11/9/15.
 */

import java.awt.*;
import javax.swing.*;
import javax.swing.text.*;
import java.awt.event.*;
import javax.swing.event.*;
import javax.swing.border.*;
import javax.swing.filechooser.FileFilter;
import javax.swing.filechooser.FileView;
import java.io.*;
import java.net.*;
import java.util.*;

public class WebBrowser extends JFrame implements HyperlinkListener,ActionListener {

    //建立工具栏来显示地址栏
    JToolBar bar = new JToolBar();

    //建立网页显示界面
    JTextField jurl = new JTextField(60);
    JEditorPane jEditorPane1 = new JEditorPane();
    JScrollPane scrollPane = new JScrollPane(jEditorPane1);

    JFileChooser chooser = new JFileChooser();
    JFileChooser chooser1 = new JFileChooser();
    String htmlSource;
    JWindow window = new JWindow(WebBrowser.this);

    JButton button2 = new JButton("窗口还原");
    Toolkit toolkit = Toolkit.getDefaultToolkit();

    //建立菜单栏
    JMenuBar jMenuBar1 = new JMenuBar();
    //建立菜单组
    JMenu fileMenu = new JMenu("文件(F)");
    //建立菜单项
    JMenuItem saveAsItem = new JMenuItem("另存为(A)...");
    JMenuItem exitItem = new JMenuItem("退出(I)");

    JMenu editMenu = new JMenu("编辑(E)");
    JMenuItem backItem = new JMenuItem("后退");
    JMenuItem forwardItem = new JMenuItem("前进");

    JMenu viewMenu = new JMenu("视图(V)");
    JMenuItem fullscreenItem = new JMenuItem("全屏(U)");
    JMenuItem sourceItem = new JMenuItem("查看源码(C)");
    JMenuItem reloadItem = new JMenuItem("刷新(R)");

}

































































