package com.franciscoghignone.input;

import javax.swing.JOptionPane;

public class ReadList extends com.franciscoghignone.lottery.Main {
	public ReadList() {
		JOptionPane.showMessageDialog(null, "Remember names should be separated with a comma (,)");
		String nameList = JOptionPane.showInputDialog("Please paste the names here");
		if (nameList == null || nameList.length() == 0) {
			JOptionPane.showMessageDialog(null, "Exiting");
			System.exit(0);
		}
		try {
			nameTemp = nameList.split(",");
			for (String newName : nameTemp) {
				if (newName != "") {
					names.add(newName);
				}
			}
		} catch (Exception e) {

		}

	}
}
