package typingsJapgolly.googleAdwordsScripts

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait isAdGroupChild extends isCampaignChild {
  def getAdGroup(): AdGroup
}

object isAdGroupChild {
  @scala.inline
  def apply(getAdGroup: CallbackTo[AdGroup], getCampaign: CallbackTo[Campaign]): isAdGroupChild = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getAdGroup")(getAdGroup.toJsFn)
    __obj.updateDynamic("getCampaign")(getCampaign.toJsFn)
    __obj.asInstanceOf[isAdGroupChild]
  }
}

