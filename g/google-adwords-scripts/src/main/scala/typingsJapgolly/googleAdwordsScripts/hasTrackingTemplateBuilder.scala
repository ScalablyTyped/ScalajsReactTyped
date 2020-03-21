package typingsJapgolly.googleAdwordsScripts

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait hasTrackingTemplateBuilder[B] extends js.Object {
  def withCustomParameters(customParameters: js.Object): B
  def withTrackingTemplate(trackingTemplate: String): B
}

object hasTrackingTemplateBuilder {
  @scala.inline
  def apply[B](withCustomParameters: js.Object => CallbackTo[B], withTrackingTemplate: String => CallbackTo[B]): hasTrackingTemplateBuilder[B] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("withCustomParameters")(js.Any.fromFunction1((t0: js.Object) => withCustomParameters(t0).runNow()))
    __obj.updateDynamic("withTrackingTemplate")(js.Any.fromFunction1((t0: java.lang.String) => withTrackingTemplate(t0).runNow()))
    __obj.asInstanceOf[hasTrackingTemplateBuilder[B]]
  }
}

