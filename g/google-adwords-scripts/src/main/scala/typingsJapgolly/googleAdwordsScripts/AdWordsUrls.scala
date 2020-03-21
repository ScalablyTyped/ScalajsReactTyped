package typingsJapgolly.googleAdwordsScripts

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AdWordsUrls extends js.Object {
  def getCustomParameters(): js.Object
  def getTrackingTemplate(): String
}

object AdWordsUrls {
  @scala.inline
  def apply(getCustomParameters: CallbackTo[js.Object], getTrackingTemplate: CallbackTo[String]): AdWordsUrls = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getCustomParameters")(getCustomParameters.toJsFn)
    __obj.updateDynamic("getTrackingTemplate")(getTrackingTemplate.toJsFn)
    __obj.asInstanceOf[AdWordsUrls]
  }
}

