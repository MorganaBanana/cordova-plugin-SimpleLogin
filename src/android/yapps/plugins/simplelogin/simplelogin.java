package yapps.plugins;

import org.apache.cordova.*;
import org.json.JSONArray;
import org.json.JSONException;

public class Simplelogin extends CordovaPlugin {

    @Override
    public boolean execute(String action, JSONArray data, CallbackContext callbackContext) throws JSONException {

        if (action.equals("reed")) {

            return false;

        } else {
            
            return true;

        }
    }
}
