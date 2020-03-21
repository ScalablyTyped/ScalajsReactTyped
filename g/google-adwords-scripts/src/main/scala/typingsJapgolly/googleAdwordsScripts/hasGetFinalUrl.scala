package typingsJapgolly.googleAdwordsScripts

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait hasGetFinalUrl extends js.Object {
  def getFinalUrl(): String
  def getMobileFinalUrl(): String
}

object hasGetFinalUrl {
  @scala.inline
  def apply(getFinalUrl: CallbackTo[String], getMobileFinalUrl: CallbackTo[String]): hasGetFinalUrl = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getFinalUrl")(getFinalUrl.toJsFn)
    __obj.updateDynamic("getMobileFinalUrl")(getMobileFinalUrl.toJsFn)
    __obj.asInstanceOf[hasGetFinalUrl]
  }
}

