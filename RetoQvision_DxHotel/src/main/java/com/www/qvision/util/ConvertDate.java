package com.www.qvision.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ConvertDate {

	public ConvertDate() {
	}

	private static final Logger LOGGER = Logger.getLogger("");

	private static Date ParseDate(String date) {
		SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
		Date dateOut = null;
		try {
			dateOut = format.parse(date);
		} catch (ParseException ex) {
			LOGGER.log(Level.INFO, ex.toString());
		}
		return dateOut;
	}

	public static int returnTotalDays(String checkIn, String checkOut) {

		int totalDays = 0;

		try {
			Date dateBefore = ConvertDate.ParseDate(checkIn);
			Date dateAfter = ConvertDate.ParseDate(checkOut);
			long difference = dateAfter.getTime() - dateBefore.getTime();
			float daysBetween = (difference / (1000 * 60 * 60 * 24));
			float daysBetween2 = TimeUnit.DAYS.convert(difference, TimeUnit.MILLISECONDS);

		} catch (Exception e) {
			e.printStackTrace();
		}

		return totalDays;
	}

}
