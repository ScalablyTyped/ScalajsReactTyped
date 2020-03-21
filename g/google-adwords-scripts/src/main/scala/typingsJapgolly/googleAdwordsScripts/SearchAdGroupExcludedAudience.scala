package typingsJapgolly.googleAdwordsScripts

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SearchAdGroupExcludedAudience extends isAdGroupChild {
  def getAudienceId(): Double
  def getId(): Double
  def getName(): String
  def remove(): Unit
}

object SearchAdGroupExcludedAudience {
  @scala.inline
  def apply(
    getAdGroup: CallbackTo[AdGroup],
    getAudienceId: CallbackTo[Double],
    getCampaign: CallbackTo[Campaign],
    getId: CallbackTo[Double],
    getName: CallbackTo[String],
    remove: Callback
  ): SearchAdGroupExcludedAudience = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getAdGroup")(getAdGroup.toJsFn)
    __obj.updateDynamic("getAudienceId")(getAudienceId.toJsFn)
    __obj.updateDynamic("getCampaign")(getCampaign.toJsFn)
    __obj.updateDynamic("getId")(getId.toJsFn)
    __obj.updateDynamic("getName")(getName.toJsFn)
    __obj.updateDynamic("remove")(remove.toJsFn)
    __obj.asInstanceOf[SearchAdGroupExcludedAudience]
  }
}

