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
public class DinnerBill extends Bill {

	public static void main(String[] args) throws IOException {

		Date start = new Date(START_YEAR, START_MONTH, START_DAY);
		Date end = new Date(END_YEAR, END_MONTH, END_DAY);

		Calendar cStart = Calendar.getInstance();
		cStart.setTime(start);
		Calendar cEnd = Calendar.getInstance();
		cEnd.setTime(end);

		while (cStart.before(cEnd)) {
			String templateFile = new String(Files.readAllBytes(
					Paths.get("D:\\ECLIPSE-WORKSPACE\\STS3.9\\maker\\src\\main\\resources\\invoice-template")));
			DateFormat df = new SimpleDateFormat("dd-MM-yyyy");
			String dateTime = df.format(cStart.getTime()).replaceAll("3917", "2017");
			String invoiceNumber = ThreadLocalRandom.current().nextInt(89234242, 99234242) + "";
			String fileName = "Dinner-Invoice-" + dateTime + "-" + invoiceNumber + ".sh";
			templateFile = templateFile.replace("XXXINVOICE", invoiceNumber);
			templateFile = templateFile.replace("XXXDATETIME", dateTime);

			// add one day to date
			cStart.add(Calendar.DAY_OF_MONTH, 1);

			// templateFile = templateFile.replace("XXXDATETIME
			int main1 = ThreadLocalRandom.current().nextInt(450, 550 + 1);
			int main2 = ThreadLocalRandom.current().nextInt(450, 550 + 1);

			int bread = ThreadLocalRandom.current().nextInt(180, 250 + 1);
			int rice = ThreadLocalRandom.current().nextInt(100, 150 + 1);
			int curd = ThreadLocalRandom.current().nextInt(100, 150 + 1);
			int deserts = ThreadLocalRandom.current().nextInt(200, 500 + 1);

			templateFile = templateFile.replace("XXXMAINCOURSE1",
					mainCourseMap.get(ThreadLocalRandom.current().nextInt(0, 4 + 1)) + "" + main1);
			templateFile = templateFile.replace("XXXMAINCOURSE2",
					mainCourseMap.get(ThreadLocalRandom.current().nextInt(5, 11 + 1)) + "" + main2);

			templateFile = templateFile.replace("XXXBREAD",
					breadMap.get(ThreadLocalRandom.current().nextInt(0, 4 + 1)) + "" + bread);
			templateFile = templateFile.replace("XXXRICE",
					riceMap.get(ThreadLocalRandom.current().nextInt(0, 4 + 1)) + "" + rice);
			templateFile = templateFile.replace("XXXCURD",
					curdMap.get(ThreadLocalRandom.current().nextInt(0, 4 + 1)) + "" + curd);
			templateFile = templateFile.replace("XXXDESERT",
					desertMap.get(ThreadLocalRandom.current().nextInt(0, 4 + 1)) + "" + deserts);
			templateFile = templateFile.replace("XXXTOTALCOST", main1 + main2 + rice + bread + curd + deserts + "");
			templateFile = templateFile.replace("XXXPDFFILE", fileName);

			Files.write(Paths.get(fileName), templateFile.getBytes(), StandardOpenOption.CREATE_NEW);
			System.out.println(templateFile);
		}

	}
}
