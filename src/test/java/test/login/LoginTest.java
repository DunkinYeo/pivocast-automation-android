package test.login;

import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.By;
import org.testng.annotations.Test;
import org.testng.Assert;
import test.BaseTest;
import views.ConnectPodView;
import views.LoginView;
import views.MainView;

public class LoginTest extends BaseTest {

    LoginView loginView;
    ConnectPodView connectPodView;
    MainView mainView;

    @Test
    public void loginPivoAccount(){
        loginView = new LoginView(driver);
        connectPodView = new ConnectPodView(driver);
        mainView = new MainView(driver);

        loginView.enterId("automated.test@3i.ai");
        loginView.enterPw("3iDev8593");
        loginView.clickLoginBtn();
        connectPodView.clickConnectBtn();
        mainView.signOut();

        //AndroidElement actualResult = (AndroidElement) driver.findElement(By.id("app.pivo.android.meet:id/input_email_view"));
        String actualResult = loginView.getEmailTxt();
        Assert.assertEquals(actualResult, "E-mail", "Fail to redirect to Login view");
    }
}
