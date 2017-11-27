package com.bill.shell.script.maker;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.concurrent.ThreadLocalRandom;

/**
 * Hello world!
 *
 */
public class LunchBill extends Bill {

	public static void main(String[] args) throws IOException {

		Date start = new Date(START_YEAR, START_MONTH, START_DAY);
		Date end = new Date(END_YEAR, END_MONTH, END_DAY);

		Calendar cStart = Calendar.getInstance();
		cStart.setTime(start);
		Calendar cEnd = Calendar.getInstance();
		cEnd.setTime(end);
		int totalSpent = 0;
		int totalDays = 0;
		while (cStart.before(cEnd)) {
			String templateFile = new String(Files.readAllBytes(
					Paths.get("D:\\ECLIPSE-WORKSPACE\\STS3.9\\maker\\src\\main\\resources\\invoice-template")));
			DateFormat df = new SimpleDateFormat("dd-MM-yyyy");
			String dateTime = df.format(cStart.getTime()).replaceAll("3917", "2017");
			String invoiceNumber = ThreadLocalRandom.current().nextInt(89234242, 99234242) + "";
			String fileName = "Lunch-Invoice-" + dateTime + "-" + invoiceNumber + ".sh";
			templateFile = templateFile.replace("XXXINVOICE", invoiceNumber);
			templateFile = templateFile.replace("XXXDATETIME", dateTime);

			// templateFile = templateFile.replace("XXXDATETIME
			int main1 = ThreadLocalRandom.current().nextInt(450, 550 + 1);

			int bread = ThreadLocalRandom.current().nextInt(180, 250 + 1);
			int rice = ThreadLocalRandom.current().nextInt(100, 150 + 1);
			int curd = ThreadLocalRandom.current().nextInt(100, 150 + 1);
			int deserts = ThreadLocalRandom.current().nextInt(200, 500 + 1);

			templateFile = templateFile.replace("XXXMAINCOURSE1",
					mainCourseMap.get(ThreadLocalRandom.current().nextInt(0, 11 + 1)) + " Rs:" + main1);
			templateFile = templateFile.replace("XXXMAINCOURSE2", "");

			templateFile = templateFile.replace("XXXBREAD",
					breadMap.get(ThreadLocalRandom.current().nextInt(0, 4 + 1)) + " Rs:" + bread);
			templateFile = templateFile.replace("XXXRICE",
					riceMap.get(ThreadLocalRandom.current().nextInt(0, 4 + 1)) + " Rs:" + rice);
			templateFile = templateFile.replace("XXXCURD",
					curdMap.get(ThreadLocalRandom.current().nextInt(0, 4 + 1)) + " Rs:" + curd);
			templateFile = templateFile.replace("XXXDESERT",
					desertMap.get(ThreadLocalRandom.current().nextInt(0, 4 + 1)) + " Rs:" + deserts);
			int lunch = main1 + rice + bread + curd + deserts;
			templateFile = templateFile.replace("XXXTOTALCOST", lunch + "");
			templateFile = templateFile.replace("XXXPDFFILE", fileName);
			totalSpent = lunch + totalSpent;
			Files.write(Paths.get(fileName), templateFile.getBytes(), StandardOpenOption.CREATE_NEW);
			System.out.println(fileName + ":" + lunch);

			cStart.add(Calendar.DAY_OF_MONTH, 1);

		}
		System.out.println("Total Spent on Lunch: " + totalSpent);

	}
}
