package typingsJapgolly.googleAdwordsScripts

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExcludedDisplayKeyword extends isAdGroupChild {
  def getId(): Double
  def getText(): String
  def remove(): Unit
}

object ExcludedDisplayKeyword {
  @scala.inline
  def apply(
    getAdGroup: CallbackTo[AdGroup],
    getCampaign: CallbackTo[Campaign],
    getId: CallbackTo[Double],
    getText: CallbackTo[String],
    remove: Callback
  ): ExcludedDisplayKeyword = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getAdGroup")(getAdGroup.toJsFn)
    __obj.updateDynamic("getCampaign")(getCampaign.toJsFn)
    __obj.updateDynamic("getId")(getId.toJsFn)
    __obj.updateDynamic("getText")(getText.toJsFn)
    __obj.updateDynamic("remove")(remove.toJsFn)
    __obj.asInstanceOf[ExcludedDisplayKeyword]
  }
}

