package typingsJapgolly.googleAppsScript.GoogleAppsScript.Script

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Allows scripts to create state tokens that can be used in callback APIs (like OAuth flows).
  *
  *     // Reusable function to generate a callback URL, assuming the script has been published as a
  *     // web app (necessary to obtain the URL programmatically). If the script has not been published
  *     // as a web app, set `var url` in the first line to the URL of your script project (which
  *     // cannot be obtained programmatically).
  *     function getCallbackURL(callbackFunction){
  *       var url = ScriptApp.getService().getUrl();      // Ends in /exec (for a web app)
  *       url = url.slice(0, -4) + 'usercallback?state='; // Change /exec to /usercallback
  *       var stateToken = ScriptApp.newStateToken()
  *           .withMethod(callbackFunction)
  *           .withTimeout(120)
  *           .createToken();
  *       return url + stateToken;
  *     }
  */
trait StateTokenBuilder extends js.Object {
  def createToken(): String
  def withArgument(name: String, value: String): StateTokenBuilder
  def withMethod(method: String): StateTokenBuilder
  def withTimeout(seconds: Integer): StateTokenBuilder
}

object StateTokenBuilder {
  @scala.inline
  def apply(
    createToken: CallbackTo[String],
    withArgument: (String, String) => CallbackTo[StateTokenBuilder],
    withMethod: String => CallbackTo[StateTokenBuilder],
    withTimeout: Integer => CallbackTo[StateTokenBuilder]
  ): StateTokenBuilder = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("createToken")(createToken.toJsFn)
    __obj.updateDynamic("withArgument")(js.Any.fromFunction2((t0: java.lang.String, t1: java.lang.String) => withArgument(t0, t1).runNow()))
    __obj.updateDynamic("withMethod")(js.Any.fromFunction1((t0: java.lang.String) => withMethod(t0).runNow()))
    __obj.updateDynamic("withTimeout")(js.Any.fromFunction1((t0: typingsJapgolly.googleAppsScript.GoogleAppsScript.Integer) => withTimeout(t0).runNow()))
    __obj.asInstanceOf[StateTokenBuilder]
  }
}

