package com.franciscoghignone.input;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.InputStreamReader;

import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

public class ReadFile extends com.franciscoghignone.lottery.Main {
	public ReadFile() {
		cadena = "";
		String line;
		JFileChooser fileChooser = new JFileChooser();
		FileNameExtensionFilter filter = new FileNameExtensionFilter("*.TXT", "txt");
		fileChooser.setFileFilter(filter);
		fileChooser.showOpenDialog(fileChooser);
		String filePath = "";
		try {
			filePath = fileChooser.getSelectedFile().getAbsolutePath();
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Exiting");
			System.exit(0);
		}

		try {
			FileInputStream file = new FileInputStream(filePath);
			DataInputStream data = new DataInputStream(file);
			try (BufferedReader br = new BufferedReader(new InputStreamReader(data))) {
				while ((line = br.readLine()) != null) {
					cadena = cadena + line;
				}
			}
			nameTemp = cadena.split(",");
			for (String newName : nameTemp) {
				if (newName != "") {
					names.add(newName);
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
