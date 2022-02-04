package views;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class ConnectPodView extends BaseView {
    public ConnectPodView (AndroidDriver driver){
        super(driver);
    }

    @AndroidFindBy(id = "app.pivo.android.meet:id/connectButton")
    AndroidElement connectBtn;

    @AndroidFindBy(id = "app.pivo.android.meet:id/cancelNotFound")
    AndroidElement cancelBtn;

    @AndroidFindBy(id = "app.pivo.android.meet:id/tryAgainButton")
    AndroidElement tryAgainBtn;

    @AndroidFindBy(id = "app.pivo.android.meet:id/save_view")
    AndroidElement newPivoSaveBtn;

    @AndroidFindBy(id = "app.pivo.android.meet:id/connect_only_view")
    AndroidElement newPivoConnectOnlyBtn;

    @AndroidFindBy(id = "app.pivo.android.meet:id/cancel_view")
    AndroidElement newPivoCancelBtn;



    public void clickConnectBtn(){
        click(connectBtn);
    }
    public void clickCancelBtn(){
        click(cancelBtn);
    }
    public void clickTryAgainBtn(){
        click(tryAgainBtn);
    }
    public void clickSaveNewPivoBtn(){
        click(newPivoSaveBtn);
    }


}
