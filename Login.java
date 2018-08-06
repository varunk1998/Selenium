package testimony.com.test;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Platform;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.UnhandledAlertException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.Select;

public class Login {
	public static WebDriver driver;
	public static Reference ref = new Reference();
	private static final String FILENAME = "C:\\Users\\varun\\codevita\\com.test\\resources\\test\\result.txt";

	public static void main(String args[]) throws InterruptedException {

		DesiredCapabilities capabilities = DesiredCapabilities.internetExplorer();
		capabilities.setBrowserName("internet explorer");
		capabilities.setPlatform(Platform.WINDOWS);
		// capabilities.setVersion("11");
		capabilities.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
		capabilities.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS, true);
		capabilities.setCapability(InternetExplorerDriver.IGNORE_ZOOM_SETTING, true);
		capabilities.setCapability("acceptInsecureCerts", true);
		capabilities.setCapability("acceptSslCerts", true);
		capabilities.setAcceptInsecureCerts(true);
		capabilities.acceptInsecureCerts();
		System.setProperty("webdriver.ie.driver", "resources\\driver\\IEDriverServer.exe");

		driver = new InternetExplorerDriver(capabilities);

		//String TESTCASE_NO = "SC1_TC1";

		//if (TESTCASE_NO.equalsIgnoreCase("SC1_TC1") || TESTCASE_NO.equalsIgnoreCase("SC1_TC1")) {
			testCase1();
		
		//}

		driver.quit();
	}

	public static void testCase1() {

		InputStream XlsxFileToRead = null;
		XSSFWorkbook workbook = null;
		try {
			XlsxFileToRead = new FileInputStream("resources\\input\\TestCases.xlsx");
			workbook = new XSSFWorkbook(XlsxFileToRead);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		XSSFSheet sheet = workbook.getSheet("register");

		driver.navigate().to("http://newtours.demoaut.com/");
		try {
			Thread.sleep(1000);

			WebElement elementToBeAccessed = null;
			Select comboToBeAccessed = null;
			List radioToBeAccessed = null;
			String rfirstname = null;
			String rlastname = null;
			String rphone = null;
			String remail = null;
			String raddress1 = null;
			String raddress2 = null;
			String rcity = null;
			String rstate = null;
			String rpcode = null;
			String rcountry = null;
			String ruser = null;
			String rpwd = null;
			String rcpwd = null;

			rfirstname = sheet.getRow(1).getCell(2).toString();
			rlastname = sheet.getRow(1).getCell(3).toString();
			rphone = Long.toString((Float.valueOf(sheet.getRow(1).getCell(4).toString())).longValue());
			remail = sheet.getRow(1).getCell(5).toString();
			raddress1 = sheet.getRow(1).getCell(6).toString();
			raddress2 = sheet.getRow(1).getCell(7).toString();
			rcity = sheet.getRow(1).getCell(8).toString();
			rstate = sheet.getRow(1).getCell(9).toString();
			rpcode = Integer.toString((Float.valueOf(sheet.getRow(1).getCell(10).toString())).intValue());
			rcountry = Integer.toString((Float.valueOf(sheet.getRow(1).getCell(11).toString())).intValue());
			ruser = sheet.getRow(1).getCell(12).toString();
			rpwd = sheet.getRow(1).getCell(13).toString();
			rcpwd = sheet.getRow(1).getCell(14).toString();

			elementToBeAccessed = ref.Elementvalue("register", driver);
			elementToBeAccessed.click();
			//Thread.sleep(1000);
			elementToBeAccessed = ref.Elementvalue("rfname", driver);
			elementToBeAccessed.sendKeys(rfirstname);
			elementToBeAccessed = ref.Elementvalue("rlname", driver);
			elementToBeAccessed.sendKeys(rlastname);
			elementToBeAccessed = ref.Elementvalue("rphone", driver);
			elementToBeAccessed.sendKeys(rphone);
			elementToBeAccessed = ref.Elementvalue("remail", driver);
			elementToBeAccessed.sendKeys(remail);
			elementToBeAccessed = ref.Elementvalue("raddress1", driver);
			elementToBeAccessed.sendKeys(raddress1);
			elementToBeAccessed = ref.Elementvalue("raddress2", driver);
			elementToBeAccessed.sendKeys(raddress2);
			elementToBeAccessed = ref.Elementvalue("rcity", driver);
			elementToBeAccessed.sendKeys(rcity);
			elementToBeAccessed = ref.Elementvalue("rstate", driver);
			elementToBeAccessed.sendKeys(rstate);
			elementToBeAccessed = ref.Elementvalue("rpostalcode", driver);
			elementToBeAccessed.sendKeys(rpcode);
			comboToBeAccessed = ref.comboValue("rcountry", driver);
			comboToBeAccessed.selectByValue(rcountry);
			elementToBeAccessed = ref.Elementvalue("ruser", driver);
			elementToBeAccessed.sendKeys(ruser);
			elementToBeAccessed = ref.Elementvalue("rpwd", driver);
			elementToBeAccessed.sendKeys(rpwd);
			elementToBeAccessed = ref.Elementvalue("rcnfrmpwd", driver);
			elementToBeAccessed.sendKeys(rcpwd);

			elementToBeAccessed = ref.Elementvalue("rlogin", driver);
			elementToBeAccessed.click();
			//Thread.sleep(1000);
			elementToBeAccessed = ref.Elementvalue("signoff", driver);
			elementToBeAccessed.click();
			//Thread.sleep(1000);
			writeTestResults("SC1_TC1", "Passed");

			sheet = workbook.getSheet("dispatch");
			String userid = null;
			String pwd = null;
			String passengers = null;
			String departing = null;
			String onmonth = null;
			String onday = null;
			String arriving = null;
			String tomonth = null;
			String today = null;
			String fname = null;
			String lname = null;
			String meal = null;
			String ctype = null;
			String cnumber = null;
			String exyear = null;
			String firstname = null;
			String middlename = null;
			String lastname = null;
			String address1 = null;
			String address2 = null;
			String city = null;
			String state = null;
			String pcode = null;
			String country = null;
			String deladdress1 = null;
			String deladdress2 = null;
			String delcity = null;
			String delstate = null;
			String delpcode = null;
			String delcountry = null;

			userid = sheet.getRow(1).getCell(2).toString();
			pwd = sheet.getRow(1).getCell(3).toString();
			passengers = Integer.toString((Float.valueOf(sheet.getRow(1).getCell(4).toString())).intValue());
			departing = sheet.getRow(1).getCell(5).toString();
			onmonth = Integer.toString((Float.valueOf(sheet.getRow(1).getCell(6).toString())).intValue());
			onday = Integer.toString((Float.valueOf(sheet.getRow(1).getCell(7).toString())).intValue());
			arriving = sheet.getRow(1).getCell(8).toString();
			tomonth = Integer.toString((Float.valueOf(sheet.getRow(1).getCell(9).toString())).intValue());
			today = Integer.toString((Float.valueOf(sheet.getRow(1).getCell(10).toString())).intValue());
			fname = sheet.getRow(1).getCell(11).toString();
			lname = sheet.getRow(1).getCell(12).toString();
			meal = sheet.getRow(1).getCell(13).toString();
			ctype = sheet.getRow(1).getCell(14).toString();
			cnumber = Integer.toString((Float.valueOf(sheet.getRow(1).getCell(15).toString())).intValue());
			exyear = Integer.toString((Float.valueOf(sheet.getRow(1).getCell(16).toString())).intValue());
			firstname = sheet.getRow(1).getCell(17).toString();
			middlename = sheet.getRow(1).getCell(18).toString();
			lastname = sheet.getRow(1).getCell(19).toString();
			address1 = sheet.getRow(1).getCell(20).toString();
			address2 = sheet.getRow(1).getCell(21).toString();
			city = sheet.getRow(1).getCell(22).toString();
			state = sheet.getRow(1).getCell(23).toString();
			pcode = Integer.toString((Float.valueOf(sheet.getRow(1).getCell(24).toString())).intValue());
			country = Integer.toString((Float.valueOf(sheet.getRow(1).getCell(25).toString())).intValue());
			deladdress1 = sheet.getRow(1).getCell(26).toString();
			deladdress2 = sheet.getRow(1).getCell(27).toString();
			delcity = sheet.getRow(1).getCell(28).toString();
			delstate = sheet.getRow(1).getCell(29).toString();
			delpcode = Integer.toString((Float.valueOf(sheet.getRow(1).getCell(30).toString())).intValue());
			delcountry = Integer.toString((Float.valueOf(sheet.getRow(1).getCell(31).toString())).intValue());

			elementToBeAccessed = ref.Elementvalue("userID", driver);
			elementToBeAccessed.sendKeys(userid);
			elementToBeAccessed = ref.Elementvalue("password", driver);
			elementToBeAccessed.sendKeys(pwd);
			elementToBeAccessed = ref.Elementvalue("login", driver);
			elementToBeAccessed.click();
			//Thread.sleep(1000);
			radioToBeAccessed = ref.radioValue("type", driver);
			((WebElement) radioToBeAccessed.get(1)).click();
			comboToBeAccessed = ref.comboValue("passengers", driver);
			comboToBeAccessed.selectByValue(passengers);
			comboToBeAccessed = ref.comboValue("departing", driver);
			comboToBeAccessed.selectByValue(departing);
			comboToBeAccessed = ref.comboValue("onMonth", driver);
			comboToBeAccessed.selectByValue(onmonth);
			comboToBeAccessed = ref.comboValue("onDay", driver);
			comboToBeAccessed.selectByValue(onday);
			comboToBeAccessed = ref.comboValue("arriving", driver);
			comboToBeAccessed.selectByValue(arriving);
			comboToBeAccessed = ref.comboValue("toMonth", driver);
			comboToBeAccessed.selectByValue(tomonth);
			comboToBeAccessed = ref.comboValue("toDay", driver);
			comboToBeAccessed.selectByValue(today);
			radioToBeAccessed = ref.radioValue("service", driver);
			((WebElement) radioToBeAccessed.get(1)).click();
			// comboToBeAccessed = ref.comboValue("airline", driver);
			// comboToBeAccessed.selectByValue("Unified Airlines");
			elementToBeAccessed = ref.Elementvalue("submit", driver);
			elementToBeAccessed.click();
			Thread.sleep(1000);
			elementToBeAccessed = ref.Elementvalue("continue", driver);
			elementToBeAccessed.click();
			Thread.sleep(1000);
			elementToBeAccessed = ref.Elementvalue("fname", driver);
			elementToBeAccessed.sendKeys(fname);
			elementToBeAccessed = ref.Elementvalue("lname", driver);
			elementToBeAccessed.sendKeys(lname);
			comboToBeAccessed = ref.comboValue("meal", driver);
			comboToBeAccessed.selectByValue(meal);
			comboToBeAccessed = ref.comboValue("cardtype", driver);
			comboToBeAccessed.selectByValue(ctype);
			elementToBeAccessed = ref.Elementvalue("cardnumber", driver);
			elementToBeAccessed.sendKeys(cnumber);
			comboToBeAccessed = ref.comboValue("expiryyear", driver);
			comboToBeAccessed.selectByValue(exyear);
			elementToBeAccessed = ref.Elementvalue("firstname", driver);
			elementToBeAccessed.sendKeys(firstname);
			elementToBeAccessed = ref.Elementvalue("middlename", driver);
			elementToBeAccessed.sendKeys(middlename);
			elementToBeAccessed = ref.Elementvalue("lastname", driver);
			elementToBeAccessed.sendKeys(lastname);
			elementToBeAccessed = ref.Elementvalue("address1", driver);
			elementToBeAccessed.clear();
			elementToBeAccessed.sendKeys(address1);
			elementToBeAccessed = ref.Elementvalue("address2", driver);
			elementToBeAccessed.sendKeys(address2);
			elementToBeAccessed = ref.Elementvalue("city", driver);
			elementToBeAccessed.clear();
			elementToBeAccessed.sendKeys(city);
			elementToBeAccessed = ref.Elementvalue("state", driver);
			elementToBeAccessed.clear();
			elementToBeAccessed.sendKeys(state);
			elementToBeAccessed = ref.Elementvalue("postalcode", driver);
			elementToBeAccessed.clear();
			elementToBeAccessed.sendKeys(pcode);
			comboToBeAccessed = ref.comboValue("country", driver);
			comboToBeAccessed.selectByValue(country);

			elementToBeAccessed = ref.Elementvalue("deladdress1", driver);
			elementToBeAccessed.clear();
			elementToBeAccessed.sendKeys(deladdress1);
			elementToBeAccessed = ref.Elementvalue("deladdress2", driver);
			elementToBeAccessed.sendKeys(deladdress2);
			elementToBeAccessed = ref.Elementvalue("delcity", driver);
			elementToBeAccessed.clear();
			elementToBeAccessed.sendKeys(delcity);
			elementToBeAccessed = ref.Elementvalue("delstate", driver);
			elementToBeAccessed.clear();
			elementToBeAccessed.sendKeys(delstate);
			elementToBeAccessed = ref.Elementvalue("delpostalcode", driver);
			elementToBeAccessed.clear();
			elementToBeAccessed.sendKeys(delpcode);
			comboToBeAccessed = ref.comboValue("delcountry", driver);
			comboToBeAccessed.selectByValue(delcountry);
			elementToBeAccessed = ref.Elementvalue("purchs", driver);
			elementToBeAccessed.click();
			//Thread.sleep(1000);
			elementToBeAccessed = ref.Elementvalue("backflight", driver);
			elementToBeAccessed.click();
			//Thread.sleep(1000);

			writeTestResults("SC1_TC2", "Passed");

			sheet = workbook.getSheet("return");
			String passengers1 = null;
			String departing1 = null;
			String onmonth1 = null;
			String onday1 = null;
			String arriving1 = null;
			String tomonth1 = null;
			String today1 = null;
			String fname1 = null;
			String lname1 = null;
			String meal1 = null;
			String ctype1 = null;
			String cnumber1 = null;
			String exyear1 = null;
			String firstname1 = null;
			String middlename1 = null;
			String lastname1 = null;
			String address11 = null;
			String address21 = null;
			String city1 = null;
			String state1 = null;
			String pcode1 = null;
			String country1 = null;
			String deladdress11 = null;
			String deladdress21 = null;
			String delcity1 = null;
			String delstate1 = null;
			String delpcode1 = null;
			String delcountry1 = null;

			passengers1 = Integer.toString((Float.valueOf(sheet.getRow(1).getCell(2).toString())).intValue());
			departing1 = sheet.getRow(1).getCell(3).toString();
			onmonth1 = Integer.toString((Float.valueOf(sheet.getRow(1).getCell(4).toString())).intValue());
			onday1 = Integer.toString((Float.valueOf(sheet.getRow(1).getCell(5).toString())).intValue());
			arriving1 = sheet.getRow(1).getCell(6).toString();
			tomonth1 = Integer.toString((Float.valueOf(sheet.getRow(1).getCell(7).toString())).intValue());
			today1 = Integer.toString((Float.valueOf(sheet.getRow(1).getCell(8).toString())).intValue());
			fname1 = sheet.getRow(1).getCell(9).toString();
			lname1 = sheet.getRow(1).getCell(10).toString();
			meal1 = sheet.getRow(1).getCell(11).toString();
			ctype1 = sheet.getRow(1).getCell(12).toString();
			cnumber1 = Integer.toString((Float.valueOf(sheet.getRow(1).getCell(13).toString())).intValue());
			exyear1 = Integer.toString((Float.valueOf(sheet.getRow(1).getCell(14).toString())).intValue());
			firstname1 = sheet.getRow(1).getCell(15).toString();
			middlename1 = sheet.getRow(1).getCell(16).toString();
			lastname1 = sheet.getRow(1).getCell(17).toString();
			address11 = sheet.getRow(1).getCell(18).toString();
			address21 = sheet.getRow(1).getCell(19).toString();
			city1 = sheet.getRow(1).getCell(20).toString();
			state1 = sheet.getRow(1).getCell(21).toString();
			pcode1 = Integer.toString((Float.valueOf(sheet.getRow(1).getCell(22).toString())).intValue());
			country1 = Integer.toString((Float.valueOf(sheet.getRow(1).getCell(23).toString())).intValue());
			deladdress11 = sheet.getRow(1).getCell(24).toString();
			deladdress21 = sheet.getRow(1).getCell(25).toString();
			delcity1 = sheet.getRow(1).getCell(26).toString();
			delstate1 = sheet.getRow(1).getCell(27).toString();
			delpcode1 = Integer.toString((Float.valueOf(sheet.getRow(1).getCell(28).toString())).intValue());
			delcountry1 = Integer.toString((Float.valueOf(sheet.getRow(1).getCell(29).toString())).intValue());

			radioToBeAccessed = ref.radioValue("type", driver);
			((WebElement) radioToBeAccessed.get(1)).click();
			comboToBeAccessed = ref.comboValue("passengers", driver);
			comboToBeAccessed.selectByValue(passengers1);
			comboToBeAccessed = ref.comboValue("departing", driver);
			comboToBeAccessed.selectByValue(departing1);
			comboToBeAccessed = ref.comboValue("onMonth", driver);
			comboToBeAccessed.selectByValue(onmonth1);
			comboToBeAccessed = ref.comboValue("onDay", driver);
			comboToBeAccessed.selectByValue(onday1);
			comboToBeAccessed = ref.comboValue("arriving", driver);
			comboToBeAccessed.selectByValue(arriving1);
			comboToBeAccessed = ref.comboValue("toMonth", driver);
			comboToBeAccessed.selectByValue(tomonth1);
			comboToBeAccessed = ref.comboValue("toDay", driver);
			comboToBeAccessed.selectByValue(today1);
			radioToBeAccessed = ref.radioValue("service", driver);
			((WebElement) radioToBeAccessed.get(1)).click();
			elementToBeAccessed = ref.Elementvalue("submit", driver);
			elementToBeAccessed.click();
			//Thread.sleep(1000);
			elementToBeAccessed = ref.Elementvalue("continue", driver);
			elementToBeAccessed.click();
			//Thread.sleep(1000);
			elementToBeAccessed = ref.Elementvalue("fname", driver);
			elementToBeAccessed.sendKeys(fname1);
			elementToBeAccessed = ref.Elementvalue("lname", driver);
			elementToBeAccessed.sendKeys(lname1);
			comboToBeAccessed = ref.comboValue("meal", driver);
			comboToBeAccessed.selectByValue(meal1);
			comboToBeAccessed = ref.comboValue("cardtype", driver);
			comboToBeAccessed.selectByValue(ctype1);
			elementToBeAccessed = ref.Elementvalue("cardnumber", driver);
			elementToBeAccessed.sendKeys(cnumber1);
			comboToBeAccessed = ref.comboValue("expiryyear", driver);
			comboToBeAccessed.selectByValue(exyear1);

			try {
				Alert alert = driver.switchTo().alert();
				String alertText = alert.getText();
				System.out.println("Error Message: " + alertText);
				alert.accept();

				// Screenshot for Checkout details
				File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
				try {
					FileUtils.copyFile(src, new File("screenshots\\error_screenshot.png"));
					System.out.println("Screenshot taken for error details");
					System.out.println("Screenshot taken Successfully for error details **");
				} catch (Exception e) {

					System.out.println(e.getMessage());
					System.out.println("Issue with taking screenshot");

				}
			} catch (NoAlertPresentException e) {
				e.printStackTrace();
			}

			elementToBeAccessed = ref.Elementvalue("firstname", driver);
			elementToBeAccessed.sendKeys(firstname1);
			elementToBeAccessed = ref.Elementvalue("middlename", driver);
			elementToBeAccessed.sendKeys(middlename1);
			elementToBeAccessed = ref.Elementvalue("lastname", driver);
			elementToBeAccessed.sendKeys(lastname1);
			elementToBeAccessed = ref.Elementvalue("address1", driver);
			elementToBeAccessed.clear();
			elementToBeAccessed.sendKeys(address11);
			elementToBeAccessed = ref.Elementvalue("address2", driver);
			elementToBeAccessed.sendKeys(address21);
			elementToBeAccessed = ref.Elementvalue("city", driver);
			elementToBeAccessed.clear();
			elementToBeAccessed.sendKeys(city1);
			elementToBeAccessed = ref.Elementvalue("state", driver);
			elementToBeAccessed.clear();
			elementToBeAccessed.sendKeys(state1);
			elementToBeAccessed = ref.Elementvalue("postalcode", driver);
			elementToBeAccessed.clear();
			elementToBeAccessed.sendKeys(pcode1);
			comboToBeAccessed = ref.comboValue("country", driver);
			comboToBeAccessed.selectByValue(country1);

			elementToBeAccessed = ref.Elementvalue("deladdress1", driver);
			elementToBeAccessed.clear();
			elementToBeAccessed.sendKeys(deladdress11);
			elementToBeAccessed = ref.Elementvalue("deladdress2", driver);
			elementToBeAccessed.sendKeys(deladdress21);
			elementToBeAccessed = ref.Elementvalue("delcity", driver);
			elementToBeAccessed.clear();
			elementToBeAccessed.sendKeys(delcity1);
			elementToBeAccessed = ref.Elementvalue("delstate", driver);
			elementToBeAccessed.clear();
			elementToBeAccessed.sendKeys(delstate1);
			elementToBeAccessed = ref.Elementvalue("delpostalcode", driver);
			elementToBeAccessed.clear();
			elementToBeAccessed.sendKeys(delpcode1);
			comboToBeAccessed = ref.comboValue("delcountry", driver);
			comboToBeAccessed.selectByValue(delcountry1);
			elementToBeAccessed = ref.Elementvalue("purchs", driver);
			elementToBeAccessed.click();
			//Thread.sleep(1000);

			elementToBeAccessed = ref.Elementvalue("logout", driver);
			elementToBeAccessed.click();
			//Thread.sleep(1000);
			// elementToBeAccessed = ref.Elementvalue("cruises", driver);
			// elementToBeAccessed.click();
			// elementToBeAccessed = ref.Elementvalue("accepting", driver);
			// elementToBeAccessed.click();

			writeTestResults("SC1_TC3", "Passed");

		} catch (Exception e) {
			// TODO Auto-generated catch block
				System.out.println("Error Message: Terminated Abnormally");
		}

	}

	public static void writeTestResults(String tcName, String results) {

		BufferedWriter bw = null;
		FileWriter fw = null;

		try {

			String testResults = "Test Case : " + tcName + "Status : " + results;

			fw = new FileWriter(FILENAME);
			bw = new BufferedWriter(fw);
			bw.write(testResults);
			bw.close();


			System.out.println("TestCase"+tcName+": Done");

		} catch (IOException e) {

			e.printStackTrace();

		} finally {

			try {

				if (bw != null)
					bw.close();

				if (fw != null)
					fw.close();

			} catch (IOException ex) {

				ex.printStackTrace();

			}

		}
	}

}
