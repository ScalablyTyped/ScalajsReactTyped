package typingsJapgolly.googleAdwordsScripts

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AdUrls
  extends AdWordsUrls
     with hasGetFinalUrl

object AdUrls {
  @scala.inline
  def apply(
    getCustomParameters: CallbackTo[js.Object],
    getFinalUrl: CallbackTo[String],
    getMobileFinalUrl: CallbackTo[String],
    getTrackingTemplate: CallbackTo[String]
  ): AdUrls = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getCustomParameters")(getCustomParameters.toJsFn)
    __obj.updateDynamic("getFinalUrl")(getFinalUrl.toJsFn)
    __obj.updateDynamic("getMobileFinalUrl")(getMobileFinalUrl.toJsFn)
    __obj.updateDynamic("getTrackingTemplate")(getTrackingTemplate.toJsFn)
    __obj.asInstanceOf[AdUrls]
  }
}

