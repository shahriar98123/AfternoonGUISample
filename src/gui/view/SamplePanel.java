package gui.view;

import javax.swing.*;
import gui.controller.GUIController;

public class SamplePanel extends JPanel
{
	private GUIController appController;
	
	public SamplePanel(GUIController appController)
	{
		super();
		
		this.appController = appController;
	}

}
