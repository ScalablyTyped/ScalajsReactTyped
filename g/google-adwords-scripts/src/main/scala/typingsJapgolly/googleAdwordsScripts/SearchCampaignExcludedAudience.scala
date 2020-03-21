package typingsJapgolly.googleAdwordsScripts

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SearchCampaignExcludedAudience extends isCampaignChild {
  def getAudienceId(): Double
  def getId(): Double
  def getName(): String
  def remove(): Unit
}

object SearchCampaignExcludedAudience {
  @scala.inline
  def apply(
    getAudienceId: CallbackTo[Double],
    getCampaign: CallbackTo[Campaign],
    getId: CallbackTo[Double],
    getName: CallbackTo[String],
    remove: Callback
  ): SearchCampaignExcludedAudience = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getAudienceId")(getAudienceId.toJsFn)
    __obj.updateDynamic("getCampaign")(getCampaign.toJsFn)
    __obj.updateDynamic("getId")(getId.toJsFn)
    __obj.updateDynamic("getName")(getName.toJsFn)
    __obj.updateDynamic("remove")(remove.toJsFn)
    __obj.asInstanceOf[SearchCampaignExcludedAudience]
  }
}

