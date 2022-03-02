package com.franciscoghignone.lottery;

import java.io.BufferedReader;
import java.util.ArrayList;
import java.util.Random;
import javax.swing.JOptionPane;
import com.franciscoghignone.input.Manual;
import com.franciscoghignone.input.ReadFile;
import com.franciscoghignone.input.ReadList;

public class Main {

	public static ArrayList<String> names;
	public static BufferedReader buf;
	public static Random random;
	public static String[] nameTemp;
	public static String name;
	public static String cadena;

	public static void GetNameList() {
		names = new ArrayList<>();
		String MainMenuSelection;

		JOptionPane.showMessageDialog(null, "Hi, welcome to the Lottery app");
		MainMenuSelection = JOptionPane.showInputDialog("How would you like to enter the names? \n 1- Manually \n 2- Paste list \n 3- Read file");

		if (MainMenuSelection == null) {
			JOptionPane.showMessageDialog(null, "Thank you for using The Name Lottery");
			System.exit(0);
		}
		switch (MainMenuSelection.toLowerCase()) {
		case "1", "manually":
			new Manual();
			break;

		case "2", "paste list":
			new ReadList();
			break;

		case "3", "read file":
			new ReadFile();
			break;
			
		default:
			JOptionPane.showMessageDialog(null, "You have entered an invalid option");
			System.exit(0);
		}
	}


	public static void GetRandomName(ArrayList<String> names) {
		JOptionPane.showMessageDialog(null, "Selecting a random name");
		random = new Random();
		String RandomName = names.get(random.nextInt(names.size()));
		JOptionPane.showMessageDialog(null, "And the selected name was: " + RandomName);
	}

	public static void main(String[] args) {
		GetNameList();
		GetRandomName(names);
	}
}
