package com.bill.shell.script.maker;

import java.util.ArrayList;
import java.util.List;

public class Bill {
	public static final int START_DAY = 22;
	public static final int START_MONTH = 9;
	public static final int START_YEAR = 2017;
	public static final int END_DAY = 5;
	public static final int END_MONTH = 10;
	public static final int END_YEAR = 2017;

	public static List<String> mainCourseMap = new ArrayList<String>();
	public static List<String> breadMap = new ArrayList<String>();
	public static List<String> riceMap = new ArrayList<String>();
	public static List<String> curdMap = new ArrayList<String>();
	public static List<String> desertMap = new ArrayList<String>();
	public static List<String> breakFastMapMainCourse = new ArrayList<String>();
	public static List<String> breakFastMapShake = new ArrayList<String>();
	public static List<String> driverNames = new ArrayList<String>();
	public static List<String> carTypes = new ArrayList<String>();

	static {
		mainCourseMap.add(" Handi Chicken  Quantity: 1 ");
		mainCourseMap.add(" Chicken Khurchan  Quantity: 1 ");
		mainCourseMap.add(" Motan Rogan Josh Special  Quantity: 1 ");
		mainCourseMap.add(" Paneer Makhni  Quantity: 1 ");
		mainCourseMap.add(" Paneer Lababdar  Quantity: 1 ");
		mainCourseMap.add(" Paneer Do Pyaja  Quantity: 1 ");
		mainCourseMap.add(" Mapu Tofu Chilli Bean  Quantity: 1 ");
		mainCourseMap.add(" Kung Paulu Dofu  Quantity: 1 ");
		mainCourseMap.add(" Real Arabic And Chineese Foodgasm  Quantity: 1 ");
		mainCourseMap.add(" Dhaniya Adraki Chicken  Quantity: 1 ");
		mainCourseMap.add(" Keema Curry with Steamed Chicken Breasts  Quantity: 1 ");
		mainCourseMap.add(" Soya Chap Masala  Quantity: 1 ");

		breadMap.add(" Assorted Besan Roti  Quantity: 3 ");
		breadMap.add(" Lacha Paratha  Quantity: 3 ");
		breadMap.add(" Butter Nan  Quantity: 3 ");
		breadMap.add(" Stuffed Kulcha  Quantity: 3 ");
		breadMap.add(" Chur Chur Nan  Quantity: 3 ");

		riceMap.add(" Thai Prawn Rice  Quantity: 1 ");
		riceMap.add(" Chicken Fried Rice  Quantity: 1 ");
		riceMap.add(" Shauchwan Chilli Rice  Quantity: 1 ");
		riceMap.add(" Dum Biryani  Quantity: 1 ");
		riceMap.add(" Rogan Hara Bhara  Quantity: 1 ");

		curdMap.add(" Plain Curd  Quantity: 1 ");
		curdMap.add(" Sweet Curd  Quantity: 1 ");
		curdMap.add(" Sweet Curd  Quantity: 1 ");
		curdMap.add(" Vegetable Curd  Quantity: 1 ");
		curdMap.add(" Pineapple Curd  Quantity: 1 ");

		desertMap.add(" Butter Caramel Cupcake  Quantity: 3 ");
		desertMap.add(" Special Delight Choco Lava  Quantity: 2  ");
		desertMap.add(" Butterfinger Cheesecake  Quantity: 2  ");
		desertMap.add(" Gooey Brownie  Quantity: 2  ");
		desertMap.add(" Kalakand Strawberry Mousse  Quantity: 2  ");

		breakFastMapMainCourse.add(" Honey Chilli Potato  Quantity: 1 ");
		breakFastMapMainCourse.add(" Hakka Noodles  Quantity: 1 ");
		breakFastMapMainCourse.add(" Mix Veg Combo  Quantity: 1 ");
		breakFastMapMainCourse.add(" Dal Tadka Combo  Quantity: 1 ");
		breakFastMapMainCourse.add(" Paneer Rava Masala Dosa  Quantity: 1 ");
		breakFastMapMainCourse.add(" Rassam Papad With Roasted Fish Chips  Quantity: 1 ");
		breakFastMapMainCourse.add(" Mexican Grill Pizza - Cheese Burst  Quantity: 1 ");
		breakFastMapMainCourse.add(" FarmHouse Bell Pepper Pizza - Cheese Burst  Quantity: 1 ");
		breakFastMapMainCourse.add(" Pav Bhaji Combo  Quantity: 1 ");

		breakFastMapShake.add("Extra Virgin Choclate Shake  Quantity: 1 ");
		breakFastMapShake.add("Almond Cashew Shake  Quantity: 1 ");
		breakFastMapShake.add("Banana Shake With Ice Cream  Quantity: 1 ");
		breakFastMapShake.add("Cold Coffe With Ice Cream Qauntity: 1 ");

		driverNames.add("Rajendar ");
		driverNames.add("Hem ");
		driverNames.add("Darshan ");
		driverNames.add("Shama ");
		driverNames.add("Vijay ");
		driverNames.add("Mhd ");
		driverNames.add("Vijay ");
		driverNames.add("Gawdekar ");
		driverNames.add("Chinnaapa ");
		driverNames.add("Swami Nath ");
		driverNames.add("Sheel ");
		driverNames.add("Sanjay ");

		carTypes.add("Maruti Suzuki Swift Desire");
		carTypes.add("Maruti Suzuki Wagon R");
		carTypes.add("Maruti Suzuki swift");
		carTypes.add("Hyundai Santro");
		carTypes.add("Toyota Etios");

	}
}
