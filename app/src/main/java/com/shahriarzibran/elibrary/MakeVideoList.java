
package com.shahriarzibran.elibrary;

import java.util.ArrayList;
import java.util.HashMap;

public class MakeVideoList {


	public static ArrayList< ArrayList<HashMap<String,String>> > rootArrayList;
	public static ArrayList< HashMap<String, String> > catArrayList;
	public static ArrayList< HashMap<String, String> > videoArrayList;
	public static HashMap<String, String> hashMap;


	//--------------------------------------------------------------------------------------------
	//===============================Some automation by Juba
	public static void addVideoItem(String video_id, String title, String desciption){
		hashMap = new HashMap<>();
		hashMap.put("vdo_id", video_id);
		hashMap.put("vdo_title", title);
		hashMap.put("vdo_desciption", desciption);
		videoArrayList.add(hashMap);
	}
	//========================================================================
	//===============================Some automation by Juba
	public static void createPlayListForVideo(String category_name, Integer drawable){
		rootArrayList.add(videoArrayList);
		hashMap = new HashMap<>();
		hashMap.put("category_name", category_name);
		hashMap.put("img", String.valueOf(drawable));
		catArrayList.add(hashMap);
		videoArrayList = new ArrayList<>();
	}
	//========================================================================

	//===============================Some automation by Juba
	public static void createCategoryForWebsite(String category_name, Integer drawable, String url){
		rootArrayList.add(videoArrayList);
		hashMap = new HashMap<>();
		hashMap.put("category_name", category_name);
		hashMap.put("img", String.valueOf(drawable));
		hashMap.put("url", url);
		catArrayList.add(hashMap);
		videoArrayList = new ArrayList<>();
	}
	//========================================================================

	//===============================Some automation by Juba
	public static void createCategoryForPDF(String category_name, Integer drawable, String pdfAssetName){
		rootArrayList.add(videoArrayList);
		hashMap = new HashMap<>();
		hashMap.put("category_name", category_name);
		hashMap.put("img", String.valueOf(drawable));
		hashMap.put("pdfAssetName", pdfAssetName);
		catArrayList.add(hashMap);
		videoArrayList = new ArrayList<>();
	}
	//========================================================================





	//---------------------------------------------------->>>>>>
	//---------------------------------------------------->>>>>>
	//---------------------------------------------------->>>>>>
	//---------------------------------------------------->>>>>>
	//----------------------------------------------------
	public static void createMyAlbums(){

		rootArrayList = new ArrayList();
		catArrayList = new ArrayList<>();
		videoArrayList = new ArrayList<>();

		/*
		//========================Video Item Category
		addVideoItem("GgaxcNmm4UU", "Ei Mom Jochonay | Madhubanti Mukherjee", "Teri har cheez jannat ae -hasna vi jannt ae");
		addVideoItem("qPna1ZlRxTo", "Allah di kasam tu mainu enna pyara ho gaya", "Teri har cheez jannat ae -hasna vi jannt ae");
		addVideoItem("hegsoEcow8Q", "Allah di kasam tu mainu enna pyara ho gaya", "Teri har cheez jannat ae -hasna vi jannt ae");
		addVideoItem("kLHCDZeTVJk", "Allah di kasam tu mainu enna pyara ho gaya", "Teri har cheez jannat ae -hasna vi jannt ae");
		createPlayListForVideo("Funny Dog", R.drawable.category_1);

		//=========================Category for website loader
		createCategoryForWebsite("Prothom Alo", R.drawable.category_2, "https://www.prothomalo.com/");

		//=========================Category for website loader
		createCategoryForWebsite("PDF FromUrl", R.drawable.category_3, "https://drive.google.com/file/d/1vB-oWIwJU6KuIKnIoqWukjZEyNjrd7IJ/view?usp=sharing");

		//===========================Category for PDF Viewer
		createCategoryForPDF("PDF FromAsset", R.drawable.category_4, "my_sample_pdf.pdf");
		//==========================================================================*
		 */



		addVideoItem("hf4k4OWlBfI", "Lec-1", "Java Bangla Tutorials 1 : Introduction to Java\n" +
				"A software system usually consists of a number of separate programs,\n" +
				"configuration files, which are used to set up these programs, system documentation, which describes the structure of the system, and user documentation, which explains how to use the system and web sites for users to download recent product information.");
		addVideoItem("vLeY9fkdWiU", "Lec-2", "Java Bangla Tutorials 2+3 : set up jdk with netbeans together | jdk not found solution");
		addVideoItem("ZBsm7mX4cE4", "Lec-3", "Java Bangla Tutorials 4 : First Java Application");
		addVideoItem("_1N8dKsQ8JE", "Lec-", "Java Bangla Tutorials 5 : Escape sequence");
		addVideoItem("PLgH5QX0i9K3oAZUB2QXR-dZac0c9HNyRa", "Lec-", "Java Bangla Tutorials 5 : Escape sequence");
		addVideoItem("_1N8dKsQ8JE", "Lec-", "Java Bangla Tutorials 5 : Escape sequence");
		addVideoItem("_1N8dKsQ8JE", "Lec-", "Java Bangla Tutorials 5 : Escape sequence");
		addVideoItem("_1N8dKsQ8JE", "Lec-", "Java Bangla Tutorials 5 : Escape sequence");
		addVideoItem("_1N8dKsQ8JE", "Lec-", "Java Bangla Tutorials 5 : Escape sequence");
		createPlayListForVideo("Java Programing", R.drawable.category_1);


		addVideoItem("ODA72490-JE", "Lec-1", "What is software?\n" +
				"A software system usually consists of a number of separate programs,\n" +
				"configuration files, which are used to set up these programs, system documentation, which describes the structure of the system, and user documentation, which explains how to use the system and web sites for users to download recent product information.");
		addVideoItem("GIby5n2ovF0&t", "Lec-2", "Software Development Life Cycle (SDLC)");
		addVideoItem("kSU2MPeptpM", "Lec-3", "Software Development Life Cycle Phases");
		addVideoItem("noE3pnRzQGI", "Lec-", "Waterfall Model ");
		createPlayListForVideo("Educational Video", R.drawable.category_2);


		addVideoItem("ODA72490-JE", "Lec-1", "What is software?\n" +
				"A software system usually consists of a number of separate programs,\n" +
				"configuration files, which are used to set up these programs, system documentation, which describes the structure of the system, and user documentation, which explains how to use the system and web sites for users to download recent product information.");
		addVideoItem("GIby5n2ovF0&t", "Lec-2", "Software Development Life Cycle (SDLC)");
		addVideoItem("kSU2MPeptpM", "Lec-3", "Software Development Life Cycle Phases");
		addVideoItem("noE3pnRzQGI", "Lec-", "Waterfall Model ");
		createPlayListForVideo("Educational Video", R.drawable.category_3);


		addVideoItem("ODA72490-JE", "Lec-1", "What is software?\n" +
				"A software system usually consists of a number of separate programs,\n" +
				"configuration files, which are used to set up these programs, system documentation, which describes the structure of the system, and user documentation, which explains how to use the system and web sites for users to download recent product information.");
		addVideoItem("GIby5n2ovF0&t", "Lec-2", "Software Development Life Cycle (SDLC)");
		addVideoItem("kSU2MPeptpM", "Lec-3", "Software Development Life Cycle Phases");
		addVideoItem("noE3pnRzQGI", "Lec-", "Waterfall Model ");
		createPlayListForVideo("Educational Video", R.drawable.category_4);



		createCategoryForWebsite("Learn Code", R.drawable.category_2, "https://www.javatpoint.com/");

		createCategoryForWebsite("Lear Program", R.drawable.category_2, "https://www.programiz.com/");
		createCategoryForWebsite("Lear Program", R.drawable.category_2, "https://www.programiz.com/");
		createCategoryForWebsite("Lear Program", R.drawable.category_2, "https://www.programiz.com/");

		createCategoryForPDF("PDF FromAsset", R.drawable.category_4, "my_sample_pdf.pdf");
		createCategoryForPDF("PDF FromAsset", R.drawable.category_4, "my_sample_pdf.pdf");
		createCategoryForWebsite("PDF FromUrl", R.drawable.category_3, "https://drive.google.com/file/d/1vB-oWIwJU6KuIKnIoqWukjZEyNjrd7IJ/view?usp=sharing");


		


	}

	//---------------------------------------------------->>>>>>
	//---------------------------------------------------->>>>>>
	//---------------------------------------------------->>>>>>
	//---------------------------------------------------->>>>>>
	//---------------------------------------------------->>>>>>
	//---------------------------------------------------->>>>>>




}

