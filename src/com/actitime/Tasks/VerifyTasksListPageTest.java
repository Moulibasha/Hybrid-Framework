package com.actitime.Tasks;

import org.testng.annotations.Test;


import com.actitime.TimeTrack.ValidLoginTest;
import com.actitime.genericLib.BaseTest;
import com.actitime.genericLib.FileLib;
import com.actitime.genericLib.WebDriverCommonLib;
import com.actitime.pages.EnterTimeTrackPage;

public class VerifyTasksListPageTest extends BaseTest{	
	
	@Test
	public void verifyTasks() throws Throwable
	{
	ValidLoginTest vl=new ValidLoginTest();
	vl.LoginToApp();
	
	EnterTimeTrackPage et=new EnterTimeTrackPage();
	et.clickTasksTab();
	
	WebDriverCommonLib wlib=new WebDriverCommonLib();
	FileLib flib=new FileLib();
	wlib.verify(flib.readPropertyData(PROP_PATH, "tasksTitle"), wlib.getpageTitle(), "Task Page");
}
}