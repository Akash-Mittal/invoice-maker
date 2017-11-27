package com.bill.shell.script.maker;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.util.concurrent.ThreadLocalRandom;

import javax.imageio.ImageIO;

public class UberBill extends Bill {
	public static void main(String[] args) throws MalformedURLException, IOException {
		boolean home2Airport = true;
		boolean Airport2Home = true;
		boolean Airport2Hotel = true;
		boolean Hotel2Airport = true;
		boolean Hotel2Hotel = true;

		String dateTime = "Nagarro";
		String fileName = "Uber-Invoice-" + dateTime + ".png".replaceAll("\\\\", "-");
		String randomDecimal = "." + ThreadLocalRandom.current().nextInt(1, 9 + 1) + "0";

		if (home2Airport) {
			String[] billParamsArray = { "    B 232 Lohiya Nagar Ghaziabad", "    Uttar Pradesh India 201001",
					"    Indira Gandhi International Airport", "     New Delhi, Delhi 110037",
					"\u20B9 1200" + randomDecimal, "home2Airport-" + fileName, "22/10/2017 at 17:30" };
			printBill(billParamsArray);
			home2Airport = false;
		}

		if (Airport2Hotel) {
			randomDecimal = "." + ThreadLocalRandom.current().nextInt(1, 9 + 1) + "0";

			String[] billParamsArray = { "    Kempegowda International Airport", "    Bengaluru, Karnataka 560300",
					"    Keys Select Hotels, ITPL Road, Opp. Graphite India", "     Bengaluru, Karnataka 560048",
					"\u20B9 1100" + randomDecimal, "Airport2Hotel" + fileName, "22/10/2017 at 23:30" };
			printBill(billParamsArray);
			Airport2Hotel = false;
		}

		if (Hotel2Hotel) {
			randomDecimal = "." + ThreadLocalRandom.current().nextInt(1, 9 + 1) + "0";

			String[] billParamsArray = { "    Keys Select Hotels, ITPL Road, Opp. Graphite India",
					"     Bengaluru, Karnataka 560048",
					"    Forum Value Mall, 62, Whitefield Main Road, Prestige Ozone",
					"     Whitefield, Bengaluru, Karnataka 560066", "\u20B9 220" + randomDecimal,
					"Hotel2Hotel-" + fileName, "28/10/2017 at 12:30" };
			printBill(billParamsArray);
			Hotel2Hotel = false;
		}
		if (Hotel2Airport) {
			randomDecimal = "." + ThreadLocalRandom.current().nextInt(1, 9 + 1) + "0";

			String[] billParamsArray = { "    Forum Value Mall, 62, Whitefield Main Road, Prestige Ozone",
					"     Whitefield, Bengaluru, Karnataka 560066", "    Kempegowda International Airport",
					"    Bengaluru, Karnataka 560300", "\u20B9 1210" + randomDecimal, "Hotel2Airport-" + fileName,
					"04/11/2017 at 10:39" };
			printBill(billParamsArray);
			Hotel2Airport = false;
		}
		if (Airport2Home) {
			randomDecimal = "." + ThreadLocalRandom.current().nextInt(1, 9 + 1) + "0";

			String[] billParamsArray = { "    Indira Gandhi International Airport", "     New Delhi, Delhi 110037",
					"    B 232 Lohiya Nagar Ghaziabad", "    Uttar Pradesh India 201001", "\u20B9 1131" + randomDecimal,
					"Airport2Home-" + fileName, "04/11/2017 at 20:43" };
			printBill(billParamsArray);
			Airport2Home = false;
		}

		// H1 to Office to H1
		for (int i = 23; i < 28; i++) {
			randomDecimal = "." + ThreadLocalRandom.current().nextInt(1, 9 + 1) + "0";
			String approxPrice = "\u20B9 " + ThreadLocalRandom.current().nextInt(145, 200 + 1) + "";
			String localDateTime = i + "/10/2017 at 10:" + ThreadLocalRandom.current().nextInt(1, 5 + 1)
					+ ThreadLocalRandom.current().nextInt(0, 9 + 1);
			String localDateTimeFN = i + "-10-2017-Hotel-2-Office ";
			String[] billParamsArray = { "    Keys Select Hotels, ITPL Road, Opp. Graphite India",
					"     Bengaluru, Karnataka 560048", "     Mckinsey Whitefield Rd, Nalapad Brigade Centre",
					"     Mahadevapura, Bengaluru, Karnataka 560048", approxPrice + randomDecimal,
					localDateTimeFN + ".png", localDateTime };
			printBill(billParamsArray);
			{
				randomDecimal = "." + ThreadLocalRandom.current().nextInt(1, 9 + 1) + "0";
				approxPrice = "\u20B9 " + ThreadLocalRandom.current().nextInt(145, 200 + 1) + "";
				localDateTime = i + "/10/2017 at 20:" + ThreadLocalRandom.current().nextInt(1, 5 + 1)
						+ ThreadLocalRandom.current().nextInt(0, 9 + 1);
				localDateTimeFN = i + "-10-2017-Office-2-Hotel";
				String[] billParamsArray2 = { "     Mckinsey Whitefield Rd, Nalapad Brigade Centre",
						"     Mahadevapura, Bengaluru, Karnataka 560048",
						"    Keys Select Hotels, ITPL Road, Opp. Graphite India", "     Bengaluru, Karnataka 560048",
						approxPrice + randomDecimal, localDateTimeFN + ".png", localDateTime };
				printBill(billParamsArray2);

			}
		}

		boolean once = true;
		// H2 to Office to H2
		for (int i = 1; i < 5; i++) {
			if (once) {
				String localDateTime = 31 + "/10/2017 at 10:" + ThreadLocalRandom.current().nextInt(1, 5 + 1)
						+ ThreadLocalRandom.current().nextInt(0, 9 + 1);
				String approxPrice = "\u20B9 " + ThreadLocalRandom.current().nextInt(198, 250 + 1) + "";
				String localDateTimeFN = 31 + "-10-2017-Hotel-2-Office ";
				String[] billParamsArray = { "    Forum Value Mall, 62, Whitefield Main Road, Prestige Ozone",
						"     Whitefield, Bengaluru, Karnataka 560066",
						"     Mckinsey Whitefield Rd, Nalapad Brigade Centre",
						"     Mahadevapura, Bengaluru, Karnataka 560048", approxPrice + randomDecimal,
						localDateTimeFN + ".png", localDateTime };
				printBill(billParamsArray);

				localDateTime = 31 + "/10/2017 at 20:" + ThreadLocalRandom.current().nextInt(1, 5 + 1)
						+ ThreadLocalRandom.current().nextInt(0, 9 + 1);
				localDateTimeFN = 31 + "-10-2017-Office-2-Hotel";
				approxPrice = "\u20B9 " + ThreadLocalRandom.current().nextInt(198, 250 + 1) + "";
				String[] billParamsArray2 = { "     Mckinsey Whitefield Rd, Nalapad Brigade Centre",
						"     Mahadevapura, Bengaluru, Karnataka 560048",
						"    Forum Value Mall, 62, Whitefield Main Road, Prestige Ozone",
						"     Whitefield, Bengaluru, Karnataka 560066", approxPrice + randomDecimal,
						localDateTimeFN + ".png", localDateTime };
				printBill(billParamsArray2);
				once = false;
			}

			randomDecimal = "." + ThreadLocalRandom.current().nextInt(1, 9 + 1) + "0";
			String localDateTime = i + "/11/2017 at 10:" + ThreadLocalRandom.current().nextInt(1, 5 + 1)
					+ ThreadLocalRandom.current().nextInt(0, 9 + 1);
			String localDateTimeFN = i + "-11-2017-Hotel-2-Office ";
			String approxPrice = "\u20B9 " + ThreadLocalRandom.current().nextInt(198, 250 + 1) + "";
			String[] billParamsArray = { "    Forum Value Mall, 62, Whitefield Main Road, Prestige Ozone",
					"     Whitefield, Bengaluru, Karnataka 560066",
					"     Mckinsey Whitefield Rd, Nalapad Brigade Centre",
					"     Mahadevapura, Bengaluru, Karnataka 560048", approxPrice + randomDecimal,
					localDateTimeFN + ".png", localDateTime };
			printBill(billParamsArray);
			{
				randomDecimal = "." + ThreadLocalRandom.current().nextInt(1, 9 + 1) + "0";
				approxPrice = "\u20B9 " + ThreadLocalRandom.current().nextInt(198, 250 + 1) + "";
				localDateTime = i + "/10/2017 at 20:" + ThreadLocalRandom.current().nextInt(1, 5 + 1)
						+ ThreadLocalRandom.current().nextInt(0, 9 + 1);
				localDateTimeFN = i + "-10-2017-Office-2-Hotel";
				String[] billParamsArray2 = { "     Mckinsey Whitefield Rd, Nalapad Brigade Centre",
						"     Mahadevapura, Bengaluru, Karnataka 560048",
						"    Forum Value Mall, 62, Whitefield Main Road, Prestige Ozone",
						"     Whitefield, Bengaluru, Karnataka 560066", approxPrice + randomDecimal,
						localDateTimeFN + ".png", localDateTime };
				printBill(billParamsArray2);

			}
		}

	}

	private static void printBill(String... billParams) throws IOException {
		final BufferedImage image = ImageIO
				.read(new File("D:\\ECLIPSE-WORKSPACE\\STS3.9\\maker\\src\\main\\resources\\uber-template-V1.png"));
		Graphics uberTemplateImage = image.getGraphics();
		Font font = new Font("Calibri", Font.PLAIN, 48);
		uberTemplateImage.setFont(font);
		uberTemplateImage.setColor(Color.BLACK);

		uberTemplateImage.drawString(billParams[6], 42, 312);
		uberTemplateImage.drawString(billParams[4], 800, 312);
		font = new Font("Calibri Light", Font.PLAIN, 40);
		uberTemplateImage.setFont(font);
		uberTemplateImage.setColor(Color.GRAY);

		uberTemplateImage.drawString(carTypes.get(ThreadLocalRandom.current().nextInt(0, 4 + 1)), 42, 395);
		uberTemplateImage.drawString(billParams[0], 42, 530);
		uberTemplateImage.drawString(billParams[1], 42, 587);
		uberTemplateImage.drawString(billParams[2], 42, 700);
		uberTemplateImage.drawString(billParams[3], 42, 757);

		font = new Font("Calibri Light", Font.PLAIN, 52);
		uberTemplateImage.setFont(font);
		uberTemplateImage.setColor(Color.BLACK);

		uberTemplateImage.drawString(
				"    Your Ride With " + driverNames.get(ThreadLocalRandom.current().nextInt(0, 11 + 1)), 130, 945);

		uberTemplateImage.drawString("  uberGO Reciept", 43, 1311);
		uberTemplateImage.drawString("  Trip Fare", 43, 1433);
		uberTemplateImage.drawString(billParams[4], 800, 1433);
		uberTemplateImage.drawString("  Sub Total", 43, 1533);
		uberTemplateImage.drawString(billParams[4], 800, 1433);
		uberTemplateImage.drawString("  Total", 43, 1633);
		uberTemplateImage.drawString(billParams[4], 800, 1633);
		uberTemplateImage.drawString("     Cash   ", 43, 1733);
		uberTemplateImage.drawString(billParams[4], 800, 1733);

		uberTemplateImage.dispose();
		ImageIO.write(image, "png", new File(billParams[5]));
		System.out.println(billParams[5] + ":" + billParams[4]);

	}
}
