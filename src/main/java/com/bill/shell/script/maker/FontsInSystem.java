package com.bill.shell.script.maker;

import java.awt.Font;
import java.awt.GraphicsEnvironment;

public class FontsInSystem {
	public static void main(String[] a) {
		GraphicsEnvironment e = GraphicsEnvironment.getLocalGraphicsEnvironment();
		Font[] fonts = e.getAllFonts(); // Get the fonts
		for (Font f : fonts) {
			// System.out.println(f.getFontName());
		}

		System.out.println("\u20B9");

	}
}