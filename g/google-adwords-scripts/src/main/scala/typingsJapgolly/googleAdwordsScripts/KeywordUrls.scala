package typingsJapgolly.googleAdwordsScripts

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KeywordUrls
  extends AdWordsUrls
     with hasGetFinalUrl
     with hasSetTrackingTemplate
     with hasSetFinalUrl {
  def clearFinalUrl(): Unit
  def clearMobileFinalUrl(): Unit
  def clearTrackingTemplate(): Unit
}

object KeywordUrls {
  @scala.inline
  def apply(
    clearFinalUrl: Callback,
    clearMobileFinalUrl: Callback,
    clearTrackingTemplate: Callback,
    getCustomParameters: CallbackTo[js.Object],
    getFinalUrl: CallbackTo[String],
    getMobileFinalUrl: CallbackTo[String],
    getTrackingTemplate: CallbackTo[String],
    setCustomParameters: js.Object => Callback,
    setFinalUrl: String => Callback,
    setMobileFinalUrl: String => Callback,
    setTrackingTemplate: String => Callback
  ): KeywordUrls = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("clearFinalUrl")(clearFinalUrl.toJsFn)
    __obj.updateDynamic("clearMobileFinalUrl")(clearMobileFinalUrl.toJsFn)
    __obj.updateDynamic("clearTrackingTemplate")(clearTrackingTemplate.toJsFn)
    __obj.updateDynamic("getCustomParameters")(getCustomParameters.toJsFn)
    __obj.updateDynamic("getFinalUrl")(getFinalUrl.toJsFn)
    __obj.updateDynamic("getMobileFinalUrl")(getMobileFinalUrl.toJsFn)
    __obj.updateDynamic("getTrackingTemplate")(getTrackingTemplate.toJsFn)
    __obj.updateDynamic("setCustomParameters")(js.Any.fromFunction1((t0: js.Object) => setCustomParameters(t0).runNow()))
    __obj.updateDynamic("setFinalUrl")(js.Any.fromFunction1((t0: java.lang.String) => setFinalUrl(t0).runNow()))
    __obj.updateDynamic("setMobileFinalUrl")(js.Any.fromFunction1((t0: java.lang.String) => setMobileFinalUrl(t0).runNow()))
    __obj.updateDynamic("setTrackingTemplate")(js.Any.fromFunction1((t0: java.lang.String) => setTrackingTemplate(t0).runNow()))
    __obj.asInstanceOf[KeywordUrls]
  }
}

