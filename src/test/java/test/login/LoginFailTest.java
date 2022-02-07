package test.login;

import io.appium.java_client.android.AndroidElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import test.BaseTest;
import views.ConnectPodView;
import views.LoginView;
import views.MainView;

public class LoginFailTest extends BaseTest {

    LoginView loginView;
    ConnectPodView connectPodView;
    MainView mainView;

    @Test
    public void loginFailWrongPW(){
        loginView = new LoginView(driver);
        connectPodView = new ConnectPodView(driver);
        mainView = new MainView(driver);

        loginView.enterId("automated.test@3i.ai");
        loginView.enterPw("wrongpass");
        loginView.clickLoginBtn();
        Assert.assertEquals(driver.findElementById("app.pivo.android.meet:id/positive_btn").getText(),"Ok","Pop up message was not appear");
        loginView.clickLoginFailOkBtn();
    }

    @Test
    public void loginFailWrongID(){
        loginView = new LoginView(driver);
        connectPodView = new ConnectPodView(driver);
        mainView = new MainView(driver);

        loginView.enterId("wrongID@3i.ai");
        loginView.enterPw("3iDev8593");
        loginView.clickLoginBtn();

        String actualResult = loginView.getWarningTxt();
        Assert.assertEquals(actualResult, "User not found, please verify your E-mail.");
        loginView.clickLoginFailOkBtn();
    }

    @Test
    public void loginFailEmpty(){
        loginView = new LoginView(driver);
        connectPodView = new ConnectPodView(driver);
        mainView = new MainView(driver);

        loginView.enterId("");
        loginView.enterPw("");
        loginView.clickLoginBtn();

        AndroidElement InputFieldError = (AndroidElement) driver.findElementById("app.pivo.android.meet:id/textinput_error");
        Assert.assertTrue(InputFieldError != null, "Error not appeared: The password field is required");
    }

    public void loginFailNotVerified(){

    }
}
