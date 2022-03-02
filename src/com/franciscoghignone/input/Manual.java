package com.franciscoghignone.input;

import javax.swing.JOptionPane;

public class Manual extends com.franciscoghignone.lottery.Main {
	public Manual() {
		JOptionPane.showMessageDialog(null, "Please enter 'Done' when you want to stop the list");
		name = JOptionPane.showInputDialog("Please type in the name");
		if (name == null || name.length() == 0) {
			JOptionPane.showMessageDialog(null, "Exiting");
			System.exit(0);
		}
		while (name != null) {
			if (!name.equalsIgnoreCase("done") && (name != "")) {
				names.add(name);
			}
			name = JOptionPane.showInputDialog("Please type in the name");
			if (name == null) {
				JOptionPane.showMessageDialog(null, "Exiting");
				System.exit(0);
			}
			if (name.length() == 0) {
				do {
					JOptionPane.showMessageDialog(null, "You have entered an invalid name");
					name = JOptionPane.showInputDialog("Please type in the name");
					if (name == null) {
						JOptionPane.showMessageDialog(null, "Exiting");
						System.exit(0);
					}
				} while (name.length() == 0);
			}
		}
	}
}
