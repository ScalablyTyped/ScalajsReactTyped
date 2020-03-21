package typingsJapgolly.googleAdwordsScripts

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExcludedAudience extends isAdGroupChild {
  def getAudienceId(): Double
  def getAudienceType(): AudienceType
  def getId(): Double
  def remove(): Unit
}

object ExcludedAudience {
  @scala.inline
  def apply(
    getAdGroup: CallbackTo[AdGroup],
    getAudienceId: CallbackTo[Double],
    getAudienceType: CallbackTo[AudienceType],
    getCampaign: CallbackTo[Campaign],
    getId: CallbackTo[Double],
    remove: Callback
  ): ExcludedAudience = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getAdGroup")(getAdGroup.toJsFn)
    __obj.updateDynamic("getAudienceId")(getAudienceId.toJsFn)
    __obj.updateDynamic("getAudienceType")(getAudienceType.toJsFn)
    __obj.updateDynamic("getCampaign")(getCampaign.toJsFn)
    __obj.updateDynamic("getId")(getId.toJsFn)
    __obj.updateDynamic("remove")(remove.toJsFn)
    __obj.asInstanceOf[ExcludedAudience]
  }
}

