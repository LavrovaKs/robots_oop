package gui;

import javax.swing.*;
import java.awt.*;

public class ExitMenu extends JInternalFrame {
    private TextArea m_logContent;

    public ExitMenu(String title) {
        super(title, true, true, false, false);
        m_logContent = new TextArea("");
        pack();
    }
}
