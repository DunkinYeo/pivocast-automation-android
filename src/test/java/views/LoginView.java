package views;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class LoginView extends BaseView{
    public LoginView(AndroidDriver androidDriver){
        super (androidDriver);
    }

    @AndroidFindBy(id = "app.pivo.android.meet:id/input_email_view")
    AndroidElement emailInput;

    @AndroidFindBy(id = "app.pivo.android.meet:id/input_password_view")
    AndroidElement pwInput;

    @AndroidFindBy(id = "app.pivo.android.meet:id/loginButton")
    AndroidElement loginBtn;

    @AndroidFindBy(id = "app.pivo.android.meet:id/resetButton")
    AndroidElement resetBtn;

    @AndroidFindBy(id = "app.pivo.android.meet:id/btn_google_sign_in")
    AndroidElement googleBtn;

    @AndroidFindBy(id = "app.pivo.android.meet:id/btn_facebook_sign_in")
    AndroidElement facebookBtn;

    @AndroidFindBy(id = "app.pivo.android.meet:id/signUpButton")
    AndroidElement signupBtn;

    @AndroidFindBy(id = "app.pivo.android.meet:id/positive_btn")
    AndroidElement loginFailOkBtn;

    /*****TEST METHOD*****/

    public void clickGoogleBtn(){
        click(googleBtn);
    }

    public void clickFacebookBtn(){
        click(facebookBtn);
    }

    public void enterId(String text){
        clear(emailInput);
        sendText(emailInput, text);
    }

    public void enterPw(String text){
        clear(pwInput);
        sendText(pwInput, text);
    }

    public void clickLoginBtn(){
        click(loginBtn);
    }

    public void clickForgotPwBtn(){
        click(resetBtn);
    }

    public void clickLoginFailOkBtn(){
        click(loginFailOkBtn);
    }

    public String getEmailTxt(){
        String text = getAttribute(emailInput,"text" );
        return text;
    }

}
