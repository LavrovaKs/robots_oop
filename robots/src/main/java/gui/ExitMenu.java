package gui;

import log.LogWindowSource;

import javax.swing.*;
import java.awt.*;

public class ExitMenu extends JInternalFrame {
    private LogWindowSource m_logSource;
    private TextArea m_logContent;

    public ExitMenu(String title) {
        super(title, true, true, false, false);
        //m_logSource = logSource;
        //m_logSource.registerListener(this);
        m_logContent = new TextArea("");
        m_logContent.setSize(200, 500);

        JPanel panel = new JPanel(new BorderLayout());
        panel.add(m_logContent, BorderLayout.CENTER);
        getContentPane().add(panel);
        pack();
    }
}
