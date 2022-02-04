package views;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.testng.reporters.jq.Main;

public class MainView extends BaseView{
    public MainView(AndroidDriver driver){
        super(driver);
    }
    @AndroidFindBy(id = "app.pivo.android.meet:id/switch_account_btn")
    AndroidElement switchAccountBtn;

    @AndroidFindBy(accessibility = "Call")
    AndroidElement callModeBtn;

    @AndroidFindBy(accessibility = "Cast")
    AndroidElement castModeBtn;

    @AndroidFindBy(accessibility = "Connet")
    AndroidElement connectModeBtn;

    @AndroidFindBy(id = "app.pivo.android.meet:id/btn_start_now")
    AndroidElement startCallBtn;


    public void startCall(){
        click(startCallBtn);
    }

    public void signOut(){
        click(switchAccountBtn);
    }
}
