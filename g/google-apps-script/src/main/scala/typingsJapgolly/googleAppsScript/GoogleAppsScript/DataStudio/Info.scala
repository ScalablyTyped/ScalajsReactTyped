package typingsJapgolly.googleAppsScript.GoogleAppsScript.DataStudio

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Contains info data for the config. Its properties determine how the info is displayed in Data
  * Studio.
  *
  *     var cc = DataStudioApp.createCommunityConnector();
  *     var config = cc.getConfig();
  *
  *     var info1 = config.newInfo()
  *       .setId("info1")
  *       .setText("This text gives some context on the configuration.");
  */
trait Info extends js.Object {
  def setId(id: String): Info
  def setText(text: String): Info
}

object Info {
  @scala.inline
  def apply(setId: String => CallbackTo[Info], setText: String => CallbackTo[Info]): Info = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("setId")(js.Any.fromFunction1((t0: java.lang.String) => setId(t0).runNow()))
    __obj.updateDynamic("setText")(js.Any.fromFunction1((t0: java.lang.String) => setText(t0).runNow()))
    __obj.asInstanceOf[Info]
  }
}

