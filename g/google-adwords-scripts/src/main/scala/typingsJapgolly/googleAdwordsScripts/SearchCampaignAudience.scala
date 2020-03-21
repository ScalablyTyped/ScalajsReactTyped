package typingsJapgolly.googleAdwordsScripts

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SearchCampaignAudience extends SearchCampaignExcludedAudience {
  def bidding(): SearchAudienceBidding
  def isEnabled(): Boolean
  def isPaused(): Boolean
}

object SearchCampaignAudience {
  @scala.inline
  def apply(
    bidding: CallbackTo[SearchAudienceBidding],
    getAudienceId: CallbackTo[Double],
    getCampaign: CallbackTo[Campaign],
    getId: CallbackTo[Double],
    getName: CallbackTo[String],
    isEnabled: CallbackTo[Boolean],
    isPaused: CallbackTo[Boolean],
    remove: Callback
  ): SearchCampaignAudience = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("bidding")(bidding.toJsFn)
    __obj.updateDynamic("getAudienceId")(getAudienceId.toJsFn)
    __obj.updateDynamic("getCampaign")(getCampaign.toJsFn)
    __obj.updateDynamic("getId")(getId.toJsFn)
    __obj.updateDynamic("getName")(getName.toJsFn)
    __obj.updateDynamic("isEnabled")(isEnabled.toJsFn)
    __obj.updateDynamic("isPaused")(isPaused.toJsFn)
    __obj.updateDynamic("remove")(remove.toJsFn)
    __obj.asInstanceOf[SearchCampaignAudience]
  }
}

