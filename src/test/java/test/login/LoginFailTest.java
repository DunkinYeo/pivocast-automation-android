package test.login;

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
}
