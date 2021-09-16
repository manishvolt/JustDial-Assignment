package StepDefs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import junit.framework.Assert;

public class test1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Manish\\New folder\\E-commerce\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://firstcry.ae");
		Thread.sleep(2000);
		WebElement login=driver.findElement(By.xpath("//a[@class='anch poplogin_main poplogin R12_61']"));
		login.click();
		
		Thread.sleep(3000);
		//driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id='main-con1']")));
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@onload='reloadParent();']")));
		//driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='hide-iframe']")));
		
		Thread.sleep(2000);
		
		WebElement username=driver.findElement(By.id("loginPhoneFlag"));
		username.sendKeys("bhausaheb.kharade@firstcry.com");
		Thread.sleep(3000);
		
		
		WebElement passworclick=driver.findElement(By.xpath("//div[@id='loginWithPassBtn']"));
		passworclick.click();
		
		Thread.sleep(3000);
		
		WebElement password=driver.findElement(By.xpath("//input[@id='txtLPass']"));
		password.sendKeys("Firstcry@123");
		Thread.sleep(2000);
		
		WebElement login1=driver.findElement(By.id("loginBtnNew"));
		login1.click();
		
		Thread.sleep(2000);
	
	   Actions go=new Actions(driver);
	   go.moveToElement(driver.findElement(By.xpath("//span[@class='anch myacc_2']"))).build().perform();
	   driver.findElement(By.xpath("//a[contains(text(),'My Profile')]")).click();
	   
	  
		
		

		
		int c=0;
		
		for(int i=1; i<=100; i++){    //egs if we take 3 
		
			for(int k=1; k<=i; k++){  // this loop will rotate 3 times
				
				if(i%k==0){
					c++;
				}
          
			}
			if(c<=2){
	        	   System.out.println("number is prime " + i);
	        	   c=0;
	           }
				
	           else{
	        	   c=0;
	           }

		}
		
		
		
		
		
		
		String a="abc";
		String b= "xyzujhyj";
		String Temp="";
		
		char[] arry1=a.toCharArray();
		char[] arry2=b.toCharArray();
		
		for(int i=0; i<arry1.length; i++){
			for(int x=0; x<arry2.length; x++){
				if(arry1[i]==arry2[x]){
					//System.out.println(arry1[i] + " is present in b ");
					Temp=Temp+arry1[i];
				}
			}
		}
		
		if(Temp.equals(a)){
			System.out.println("String b contains a");
		}
		
		else{
			System.out.println("String b does not contain a");
		}
		
		
		
		
	}

}
