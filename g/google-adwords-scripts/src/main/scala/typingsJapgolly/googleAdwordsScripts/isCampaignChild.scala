package typingsJapgolly.googleAdwordsScripts

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait isCampaignChild extends js.Object {
  def getCampaign(): Campaign
}

object isCampaignChild {
  @scala.inline
  def apply(getCampaign: CallbackTo[Campaign]): isCampaignChild = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getCampaign")(getCampaign.toJsFn)
    __obj.asInstanceOf[isCampaignChild]
  }
}

