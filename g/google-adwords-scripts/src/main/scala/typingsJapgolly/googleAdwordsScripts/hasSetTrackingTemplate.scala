package typingsJapgolly.googleAdwordsScripts

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait hasSetTrackingTemplate extends js.Object {
  def setCustomParameters(customParameters: js.Object): Unit
  def setTrackingTemplate(trackingTemplate: String): Unit
}

object hasSetTrackingTemplate {
  @scala.inline
  def apply(setCustomParameters: js.Object => Callback, setTrackingTemplate: String => Callback): hasSetTrackingTemplate = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("setCustomParameters")(js.Any.fromFunction1((t0: js.Object) => setCustomParameters(t0).runNow()))
    __obj.updateDynamic("setTrackingTemplate")(js.Any.fromFunction1((t0: java.lang.String) => setTrackingTemplate(t0).runNow()))
    __obj.asInstanceOf[hasSetTrackingTemplate]
  }
}

