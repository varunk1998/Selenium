package testimony.com.test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Reference {

	public WebElement Elementvalue(String element, WebDriver driver) {

		WebElement webEle = null;
		//WebElement webEle1 = null;
		// Select webEle2 = null;
		switch (element) {
		
		case "register":
			webEle = driver.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[2]/td/table/tbody/tr/td[2]/a"));
			break;
			
		case "rfname":
			webEle = driver.findElement(By.name("firstName"));
			break;
			
		case "rlname":
			webEle = driver.findElement(By.name("lastName"));
			break;
			
		case "rphone":
			webEle = driver.findElement(By.name("phone"));
			break;
			
		case "remail":
			webEle = driver.findElement(By.xpath("//*[@id=\"userName\"]"));
			break;

		case "raddress1":
			webEle = driver.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[7]/td[2]/input"));
			break;
			
		case "raddress2":
			webEle = driver.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[8]/td[2]/input"));
			break;
			
		case "rcity":
			webEle = driver.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[9]/td[2]/input"));
			break;
			
		case "rstate":
			webEle = driver.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[10]/td[2]/input"));
			break;
			
		case "rpostalcode":
			webEle = driver.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[11]/td[2]/input"));
			break;
		
		case "ruser":
			webEle = driver.findElement(By.name("email"));
			break;
		case "rpwd":
			webEle = driver.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[15]/td[2]/input"));
			break;
		case "rcnfrmpwd":
			webEle = driver.findElement(By.name("confirmPassword"));
			break;
			
		case "rlogin":
			webEle = driver.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[18]/td/input"));
			break;
					
		case "signoff":
			webEle = driver.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[2]/td/table/tbody/tr/td[1]"));
			break;
			
			
			
		case "userID":
			webEle = driver.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[1]/td[2]/input"));
			break;

		case "password":
			webEle = driver.findElement(By.name("password"));
			break;

		case "login":
			webEle = driver.findElement(By.name("login"));
			break;
			
		case "submit":
			webEle = driver.findElement(By.name("findFlights"));
			break;
			
		case "continue":
			webEle = driver.findElement(By.name("reserveFlights"));
			break;
			
		case "fname":
			webEle = driver.findElement(By.name("passFirst0"));
			break;
			
		case "lname":
			webEle = driver.findElement(By.name("passLast0"));
			break;
			
		case "cardnumber":
			webEle = driver.findElement(By.name("creditnumber"));
			break;

		case "firstname":
			webEle = driver.findElement(By.name("cc_frst_name"));
			break;
			
		case "middlename":
			webEle = driver.findElement(By.name("cc_mid_name"));
			break;
			
		case "lastname":
			webEle = driver.findElement(By.name("cc_last_name"));
			break;
		
		case "address1":
			webEle = driver.findElement(By.name("billAddress1"));
			break;
			
		case "address2":
			webEle = driver.findElement(By.name("billAddress2"));
			break;
			
		case "city":
			webEle = driver.findElement(By.name("billCity"));
			break;
			
		case "state":
			webEle = driver.findElement(By.name("billState"));
			break;
			
		case "postalcode":
			webEle = driver.findElement(By.name("billZip"));
			break;
			
		case "deladdress1":
			webEle = driver.findElement(By.name("delAddress1"));
			break;
			
		case "deladdress2":
			webEle = driver.findElement(By.name("delAddress2"));
			break;
			
		case "delcity":
			webEle = driver.findElement(By.name("delCity"));
			break;
			
		case "delstate":
			webEle = driver.findElement(By.name("delState"));
			break;
			
		case "delpostalcode":
			webEle = driver.findElement(By.name("delZip"));
			break;
			
		case "purchs":
			webEle = driver.findElement(By.name("buyFlights"));
			break;
						
		case "backflight":
			webEle = driver.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr[1]/td[2]/table/tbody/tr[7]/td/table/tbody/tr/td[1]/a/img"));
			break;
			
		case "logout":
			webEle = driver.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr[1]/td[2]/table/tbody/tr[7]/td/table/tbody/tr/td[3]/a/img"));
			break;
			
		/*case "cruises":
			webEle = driver.findElement(By.xpath("/html/body/div/table/tbody/tr/td[1]/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr[5]/td[2]/a"));
			break;
			

			
		case "accepting":
			webEle = driver.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[2]/td/table/tbody/tr[1]/td/p[3]/a/img"));
			break;
			*/
		}

		return webEle;
	}

	public Select comboValue(String element, WebDriver driver) {

		Select webEle = null;
		switch (element) {

		case "passengers":
			webEle = new Select(driver.findElement(By.name("passCount")));
			break;

		case "departing":
			webEle = new Select(driver.findElement(By.name("fromPort")));
			break;
			
		case "onMonth":
			webEle = new Select(driver.findElement(By.name("fromMonth")));
			break;
			
		case "onDay":
			webEle = new Select(driver.findElement(By.name("fromDay")));
			break;	
		case "arriving":
			webEle = new Select(driver.findElement(By.name("toPort")));
			break;
		case "toMonth":
			webEle = new Select(driver.findElement(By.name("toMonth")));
			break;
		case "toDay":
			webEle = new Select(driver.findElement(By.name("toDay")));
			break;
		/*case "airline":
			webEle = new Select(driver.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[10]/td[2]/select/option[3]")));
			break;
			*/
			
		case "meal":
			webEle = new Select(driver.findElement(By.name("pass.0.meal")));
			break;
			
		case "cardtype":
			webEle = new Select(driver.findElement(By.name("creditCard")));
			break;
			
		/*case "expirymonth":
			webEle = new Select(driver.findElement(By.name("cc_exp_dt_mn")));
			break;
			*/
		case "expiryyear":
			webEle = new Select(driver.findElement(By.name("cc_exp_dt_yr")));
			break;
			
		case "country":
			webEle = new Select(driver.findElement(By.name("billCountry")));
			break;
			
		case "delcountry":
			webEle = new Select(driver.findElement(By.name("delCountry")));
			break;
	
			
		case "rcountry":
			webEle = new Select(driver.findElement(By.name("country")));
			break;
			
		}

		return webEle;
	}

	public List radioValue(String element, WebDriver driver) {

		List webEle = null;
		switch (element) {

		case "type":
			webEle = driver.findElements(By.name("tripType"));
			break;

		case "service":
			webEle = driver.findElements(By.name("servClass"));
			break;
			
		}

		return webEle;
	}

}
