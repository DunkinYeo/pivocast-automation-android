package views;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class CameraView extends BaseView {
    public CameraView (AndroidDriver driver){
        super(driver);
    }

    @AndroidFindBy(id = "app.pivo.android.meet:id/leave_room_view")
    AndroidElement leaveRoomBtn;


    public void leaveRoom(){
        click(leaveRoomBtn);
    }


}
