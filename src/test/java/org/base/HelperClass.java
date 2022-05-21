package org.base;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HelperClass {
	public static WebDriver driver;

	public static void launchChromeBrowser() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

	}

	public static void launchEdgeBrowser() {
		WebDriverManager.edgedriver().setup();
		driver = new EdgeDriver();

	}

	public static void maxi() {
		driver.manage().window().maximize();

	}

	public static void geturl(String url) {
		driver.get(url);

	}
	
	public static String getcurl() {
		String currentUrl = driver.getCurrentUrl();
		return currentUrl;

	}
	
	public static boolean Title() {
		driver.getTitle();
		return false;

	}
	public void waiting() {
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
	}

	public static void btnclick(WebElement element) {
		element.click();
	}

	public static void fillText(WebElement element, String value) {
		element.sendKeys(value);
	}

	// public static void ScreenShot(String name) {
	// TakesScreenshot t= (TakesScreenshot)driver;
	// File a =t.getScreenshotAs(OutputType.FILE);
	// File b=new File("");
	// FileUtils.copyFile(a, b);
	// }
	public static void rightclck(WebElement element) {
		Actions a = new Actions(driver);
		a.contextClick(element).perform();

	}

public static String readExcel(String sheetName, int rowNum, int cellNum) throws IOException {
		
		File f=new File("C:\\Users\\lenovo\\eclipse-workspace\\Mavenproj\\Externalfile\\login.xlsx");
		FileInputStream fin=new FileInputStream(f);
		Workbook w=new XSSFWorkbook(fin);
		Sheet s=w.getSheet(sheetName);
		Row r = s.getRow(rowNum);
		Cell c = r.getCell(cellNum);
		
		int cellType = c.getCellType();
		String name;
		
		if (cellType==1) {
			name = c.getStringCellValue();
		}
		else if (DateUtil.isCellDateFormatted(c)) {
			Date d = c.getDateCellValue();
			
			SimpleDateFormat sdf=new SimpleDateFormat("MM,dd,yyyy");
			name = sdf.format(d);
		}else {
			double d=c.getNumericCellValue();
			long l=(long)d;
			name=String.valueOf(l);
		}
		
		return name;
	}
	public static void closeBrowser() {
		driver.quit();

	}

}
