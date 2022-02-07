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

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.support.v7.widget.RecyclerView/android.widget.LinearLayout[1]/android.widget.LinearLayout/android.widget.TextView[1]")
    AndroidElement googleFirstBtn;

    @AndroidFindBy(id = "app.pivo.android.meet:id/btn_facebook_sign_in")
    AndroidElement facebookBtn;

    @AndroidFindBy(id = "app.pivo.android.meet:id/signUpButton")
    AndroidElement signupBtn;

    @AndroidFindBy(id = "app.pivo.android.meet:id/title_text")
    AndroidElement warningTxt;

    @AndroidFindBy(id = "app.pivo.android.meet:id/positive_btn")
    AndroidElement loginFailOkBtn;

    @AndroidFindBy(id = "app.pivo.android.meet:id/textinput_error")
    AndroidElement inputErrorTxt;

    /*****TEST METHOD*****/

    public void clickGoogleBtn(){
        click(googleBtn);
    }

    public void clickGoogleFirstBtn(){
        click(googleFirstBtn);
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

    public String getWarningTxt(){
        String text = getAttribute(warningTxt, "text");
        return text;
    }

}
