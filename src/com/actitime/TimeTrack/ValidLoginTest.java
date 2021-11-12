package com.actitime.TimeTrack;

import org.testng.annotations.Test;
import com.actitime.genericLib.BaseTest;
import com.actitime.genericLib.FileLib;
import com.actitime.genericLib.WebDriverCommonLib;
import com.actitime.pages.LoginPage;

public class ValidLoginTest extends BaseTest {

	
	public void LoginToApp() throws Throwable
	{
		LoginPage lp=new LoginPage();
		FileLib flib=new FileLib();
		lp.login(flib.readPropertyData(PROP_PATH, "username"), flib.readPropertyData(PROP_PATH, "password"));
		
		WebDriverCommonLib wlib=new	WebDriverCommonLib();
		wlib.waitForTitle(flib.readPropertyData(PROP_PATH, "homeTitle"));
		wlib.verify(flib.readPropertyData(PROP_PATH, "homeTitle"), wlib.getpageTitle(), "Enter Time Track Page");
	}
	




}

