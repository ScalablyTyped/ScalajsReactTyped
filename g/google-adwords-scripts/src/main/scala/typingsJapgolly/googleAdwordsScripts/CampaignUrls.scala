package typingsJapgolly.googleAdwordsScripts

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CampaignUrls
  extends AdWordsUrls
     with hasSetTrackingTemplate {
  def clearTrackingTemplate(): Unit
}

object CampaignUrls {
  @scala.inline
  def apply(
    clearTrackingTemplate: Callback,
    getCustomParameters: CallbackTo[js.Object],
    getTrackingTemplate: CallbackTo[String],
    setCustomParameters: js.Object => Callback,
    setTrackingTemplate: String => Callback
  ): CampaignUrls = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("clearTrackingTemplate")(clearTrackingTemplate.toJsFn)
    __obj.updateDynamic("getCustomParameters")(getCustomParameters.toJsFn)
    __obj.updateDynamic("getTrackingTemplate")(getTrackingTemplate.toJsFn)
    __obj.updateDynamic("setCustomParameters")(js.Any.fromFunction1((t0: js.Object) => setCustomParameters(t0).runNow()))
    __obj.updateDynamic("setTrackingTemplate")(js.Any.fromFunction1((t0: java.lang.String) => setTrackingTemplate(t0).runNow()))
    __obj.asInstanceOf[CampaignUrls]
  }
}

