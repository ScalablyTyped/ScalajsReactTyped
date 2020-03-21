package typingsJapgolly.googleAdwordsScripts

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExcludedPlacement extends isAdGroupChild {
  def getId(): Double
  def getUrl(): String
  def remove(): Unit
}

object ExcludedPlacement {
  @scala.inline
  def apply(
    getAdGroup: CallbackTo[AdGroup],
    getCampaign: CallbackTo[Campaign],
    getId: CallbackTo[Double],
    getUrl: CallbackTo[String],
    remove: Callback
  ): ExcludedPlacement = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getAdGroup")(getAdGroup.toJsFn)
    __obj.updateDynamic("getCampaign")(getCampaign.toJsFn)
    __obj.updateDynamic("getId")(getId.toJsFn)
    __obj.updateDynamic("getUrl")(getUrl.toJsFn)
    __obj.updateDynamic("remove")(remove.toJsFn)
    __obj.asInstanceOf[ExcludedPlacement]
  }
}

